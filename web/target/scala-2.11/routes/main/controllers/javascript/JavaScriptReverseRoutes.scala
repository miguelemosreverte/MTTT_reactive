
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/migue/Desktop/TTT_web/play-java/conf/routes
// @DATE:Fri May 26 17:40:02 ART 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def CorpusPreparation_target: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.CorpusPreparation_target",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "CorpusPreparation_target"})
        }
      """
    )
  
    // @LINE:9
    def CorpusPreparation_LM: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.CorpusPreparation_LM",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "CorpusPreparation_LM"})
        }
      """
    )
  
    // @LINE:7
    def CorpusPreparation_source: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.CorpusPreparation_source",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "CorpusPreparation_source"})
        }
      """
    )
  
    // @LINE:13
    def CorpusPreparation_LM_upload: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.CorpusPreparation_LM_upload",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "CorpusPreparation_LM_upload"})
        }
      """
    )
  
    // @LINE:11
    def CorpusPreparation_source_upload: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.CorpusPreparation_source_upload",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "CorpusPreparation_source_upload"})
        }
      """
    )
  
    // @LINE:12
    def CorpusPreparation_target_upload: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.CorpusPreparation_target_upload",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "CorpusPreparation_target_upload"})
        }
      """
    )
  
  }

  // @LINE:19
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
