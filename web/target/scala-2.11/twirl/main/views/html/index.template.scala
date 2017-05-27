
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[controllers.FormData],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[controllers.FormData],postRoute:String=""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.56*/("""

"""),_display_(/*3.2*/main("Welcaadasdome to Play")/*3.31*/ {_display_(Seq[Any](format.raw/*3.33*/("""

  """),format.raw/*5.3*/("""<form action= """),_display_(/*5.18*/postRoute),format.raw/*5.27*/("""  """),format.raw/*5.29*/("""method="post" enctype="multipart/form-data">
  <input type="file" name="name" style="float:left" >
    <input  type="submit" value="Submit" style="float:left">
  </form>
""")))}),format.raw/*9.2*/("""
"""))
      }
    }
  }

  def render(form:Form[controllers.FormData],postRoute:String): play.twirl.api.HtmlFormat.Appendable = apply(form,postRoute)

  def f:((Form[controllers.FormData],String) => play.twirl.api.HtmlFormat.Appendable) = (form,postRoute) => apply(form,postRoute)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Fri May 26 19:44:17 ART 2017
                  SOURCE: /home/migue/Desktop/TTT_web/play-java/app/views/index.scala.html
                  HASH: db68d911c54ac32d2a45f7acb33595579adc19ab
                  MATRIX: 772->1|921->55|949->58|986->87|1025->89|1055->93|1096->108|1125->117|1154->119|1354->290
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|36->5|36->5|36->5|40->9
                  -- GENERATED --
              */
          