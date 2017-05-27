
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/migue/Desktop/TTT_web/play-java/conf/routes
// @DATE:Fri May 26 17:40:02 ART 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def CorpusPreparation_target(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "CorpusPreparation_target")
    }
  
    // @LINE:9
    def CorpusPreparation_LM(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "CorpusPreparation_LM")
    }
  
    // @LINE:7
    def CorpusPreparation_source(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "CorpusPreparation_source")
    }
  
    // @LINE:13
    def CorpusPreparation_LM_upload(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "CorpusPreparation_LM_upload")
    }
  
    // @LINE:11
    def CorpusPreparation_source_upload(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "CorpusPreparation_source_upload")
    }
  
    // @LINE:12
    def CorpusPreparation_target_upload(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "CorpusPreparation_target_upload")
    }
  
  }

  // @LINE:19
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
