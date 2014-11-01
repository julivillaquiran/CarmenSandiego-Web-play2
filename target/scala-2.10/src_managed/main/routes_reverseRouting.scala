// @SOURCE:C:/Users/JulianV/Documents/GitHub/carmenSandiego-Web-play2/conf/routes
// @HASH:770e5f2a9e213d36b393e72dc6504e10120c44d5
// @DATE:Sat Nov 01 18:16:54 ART 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:12
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:12
// @LINE:8
class ReverseAssets {
    

// @LINE:12
// @LINE:8
def at(file:String): Call = {
   (file: @unchecked) match {
// @LINE:8
case (file) if true => Call("GET", _prefix + { _defaultPrefix } + implicitly[PathBindable[String]].unbind("file", file))
                                                        
// @LINE:12
case (file) if true => Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
                                                        
   }
}
                                                
    
}
                          

// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:6
def villanos(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "villanos")
}
                                                

// @LINE:7
def conecciones(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "conecciones")
}
                                                
    
}
                          
}
                  


// @LINE:12
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:12
// @LINE:8
class ReverseAssets {
    

// @LINE:12
// @LINE:8
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      }
   """
)
                        
    
}
              

// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:6
def villanos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.villanos",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "villanos"})
      }
   """
)
                        

// @LINE:7
def conecciones : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.conecciones",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "conecciones"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:12
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:12
// @LINE:8
class ReverseAssets {
    

// @LINE:8
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """$file<.+>""")
)
                      
    
}
                          

// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:6
def villanos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.villanos(), HandlerDef(this, "controllers.Application", "villanos", Seq(), "GET", """""", _prefix + """villanos""")
)
                      

// @LINE:7
def conecciones(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.conecciones(), HandlerDef(this, "controllers.Application", "conecciones", Seq(), "GET", """""", _prefix + """conecciones""")
)
                      
    
}
                          
}
        
    