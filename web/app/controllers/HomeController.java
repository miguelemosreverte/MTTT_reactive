package controllers;

import play.data.Form;
import play.mvc.*;
import views.html.index;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * This class uses a custom body parser to change the upload type.
 */
@Singleton
public class HomeController extends Controller {

    private final play.data.FormFactory formFactory;

    @Inject
    public HomeController(play.data.FormFactory formFactory) {
        this.formFactory = formFactory;
    }


    public Result CorpusPreparation_source() {
        Form<FormData> form = formFactory.form(FormData.class);
        return ok(index.render(form, "CorpusPreparation_source_upload"));
    }
    @BodyParser.Of(MyMultipartFormDataBodyParser.class)
    public Result CorpusPreparation_target_upload() throws IOException {
        return uploadFile ("./pepe/","CorpusPreparation_target",request().body().asMultipartFormData());
    }



    public Result CorpusPreparation_target() {
        Form<FormData> form = formFactory.form(FormData.class);
        return ok(index.render(form, "CorpusPreparation_target_upload"));
    }
    @BodyParser.Of(MyMultipartFormDataBodyParser.class)
    public Result CorpusPreparation_source_upload() throws IOException {
        return uploadFile ("./pepe/", "CorpusPreparation_source", request().body().asMultipartFormData());
    }



    public Result CorpusPreparation_LM() {
        Form<FormData> form = formFactory.form(FormData.class);
        return ok(index.render(form, "CorpusPreparation_LM_upload"));
    }
    @BodyParser.Of(MyMultipartFormDataBodyParser.class)
    public Result CorpusPreparation_LM_upload() throws IOException {
       System.out.println("CorpusPreparation_LM");
        return uploadFile ("./pepe/","CorpusPreparation_LM",request().body().asMultipartFormData());
    }


    private Result uploadFile(String final_dir, String final_name, Http.MultipartFormData<File> form_Data) throws IOException {
        final Http.MultipartFormData<File> formData = form_Data;
        final Http.MultipartFormData.FilePart<File> filePart = formData.getFile("name");
        final File file = filePart.getFile();
        final long data = operateOnTempFile(final_dir, final_name, file);
        return ok("file size = " + data + "");
    }

    private long operateOnTempFile(String final_dir, String final_name, File file) throws IOException {
       System.out.println(final_name);
        final long size = Files.size(file.toPath());
        Files.deleteIfExists(Paths.get(final_dir+final_name));
        File theDir = new File(final_dir);
        if (!theDir.exists()) {
            theDir.mkdir();
        }
        if(file.renameTo(new File(final_dir + final_name))){
           System.out.println("File is moved successful!");
        }else{
           System.out.println("File is failed to move!" + final_dir + file.getName() );
        }
        return size;
    }

}
