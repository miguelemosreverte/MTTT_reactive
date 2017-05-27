
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/migue/Desktop/TTT_web/play-java/conf/routes
// @DATE:Fri May 26 17:40:02 ART 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_0: controllers.HomeController,
  // @LINE:19
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_0: controllers.HomeController,
    // @LINE:19
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """CorpusPreparation_source""", """controllers.HomeController.CorpusPreparation_source"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """CorpusPreparation_target""", """controllers.HomeController.CorpusPreparation_target"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """CorpusPreparation_LM""", """controllers.HomeController.CorpusPreparation_LM"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """CorpusPreparation_source_upload""", """controllers.HomeController.CorpusPreparation_source_upload"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """CorpusPreparation_target_upload""", """controllers.HomeController.CorpusPreparation_target_upload"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """CorpusPreparation_LM_upload""", """controllers.HomeController.CorpusPreparation_LM_upload"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_CorpusPreparation_source0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("CorpusPreparation_source")))
  )
  private[this] lazy val controllers_HomeController_CorpusPreparation_source0_invoker = createInvoker(
    HomeController_0.CorpusPreparation_source,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "CorpusPreparation_source",
      Nil,
      "GET",
      """""",
      this.prefix + """CorpusPreparation_source"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_CorpusPreparation_target1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("CorpusPreparation_target")))
  )
  private[this] lazy val controllers_HomeController_CorpusPreparation_target1_invoker = createInvoker(
    HomeController_0.CorpusPreparation_target,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "CorpusPreparation_target",
      Nil,
      "GET",
      """""",
      this.prefix + """CorpusPreparation_target"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_CorpusPreparation_LM2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("CorpusPreparation_LM")))
  )
  private[this] lazy val controllers_HomeController_CorpusPreparation_LM2_invoker = createInvoker(
    HomeController_0.CorpusPreparation_LM,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "CorpusPreparation_LM",
      Nil,
      "GET",
      """""",
      this.prefix + """CorpusPreparation_LM"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_CorpusPreparation_source_upload3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("CorpusPreparation_source_upload")))
  )
  private[this] lazy val controllers_HomeController_CorpusPreparation_source_upload3_invoker = createInvoker(
    HomeController_0.CorpusPreparation_source_upload,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "CorpusPreparation_source_upload",
      Nil,
      "POST",
      """""",
      this.prefix + """CorpusPreparation_source_upload"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_CorpusPreparation_target_upload4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("CorpusPreparation_target_upload")))
  )
  private[this] lazy val controllers_HomeController_CorpusPreparation_target_upload4_invoker = createInvoker(
    HomeController_0.CorpusPreparation_target_upload,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "CorpusPreparation_target_upload",
      Nil,
      "POST",
      """""",
      this.prefix + """CorpusPreparation_target_upload"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_CorpusPreparation_LM_upload5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("CorpusPreparation_LM_upload")))
  )
  private[this] lazy val controllers_HomeController_CorpusPreparation_LM_upload5_invoker = createInvoker(
    HomeController_0.CorpusPreparation_LM_upload,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "CorpusPreparation_LM_upload",
      Nil,
      "POST",
      """""",
      this.prefix + """CorpusPreparation_LM_upload"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_CorpusPreparation_source0_route(params) =>
      call { 
        controllers_HomeController_CorpusPreparation_source0_invoker.call(HomeController_0.CorpusPreparation_source)
      }
  
    // @LINE:8
    case controllers_HomeController_CorpusPreparation_target1_route(params) =>
      call { 
        controllers_HomeController_CorpusPreparation_target1_invoker.call(HomeController_0.CorpusPreparation_target)
      }
  
    // @LINE:9
    case controllers_HomeController_CorpusPreparation_LM2_route(params) =>
      call { 
        controllers_HomeController_CorpusPreparation_LM2_invoker.call(HomeController_0.CorpusPreparation_LM)
      }
  
    // @LINE:11
    case controllers_HomeController_CorpusPreparation_source_upload3_route(params) =>
      call { 
        controllers_HomeController_CorpusPreparation_source_upload3_invoker.call(HomeController_0.CorpusPreparation_source_upload)
      }
  
    // @LINE:12
    case controllers_HomeController_CorpusPreparation_target_upload4_route(params) =>
      call { 
        controllers_HomeController_CorpusPreparation_target_upload4_invoker.call(HomeController_0.CorpusPreparation_target_upload)
      }
  
    // @LINE:13
    case controllers_HomeController_CorpusPreparation_LM_upload5_route(params) =>
      call { 
        controllers_HomeController_CorpusPreparation_LM_upload5_invoker.call(HomeController_0.CorpusPreparation_LM_upload)
      }
  
    // @LINE:19
    case controllers_Assets_versioned6_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
