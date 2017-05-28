
with open('app/views/MTTT_views/home.html', 'r') as myfile:
    data = myfile.read()
    with open("app/views/index.scala.html", "w") as f:
        f.write('\
                @(form: Form[controllers.FormData])(implicit messages: play.i18n.Messages)\n\
                @main("MTTT - Machine Translation Training Tool") {\n'
                + data[data.index("<body>") + len("<body>"):data.index("</body>")].replace("http://10.5.0.6:9000/","http://10.6.0.6:9000/")
                + '\n}')
        #print data[data.index("<body>") + len("<body>"):data.index("</body>")]
