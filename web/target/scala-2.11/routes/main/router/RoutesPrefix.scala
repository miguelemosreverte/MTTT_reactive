
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/migue/Desktop/TTT_web/play-java/conf/routes
// @DATE:Fri May 26 17:40:02 ART 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
