// @SOURCE:C:/Users/JulianV/Documents/GitHub/CarmenSandiego-Web-play2/conf/routes
// @HASH:2402f01ff2b70a823f4853d137aa7a1762aeabab
// @DATE:Fri Nov 07 01:41:55 ART 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:25
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:25
// @LINE:21
class ReverseAssets {
    

// @LINE:25
// @LINE:21
def at(file:String): Call = {
   (file: @unchecked) match {
// @LINE:21
case (file) if true => Call("GET", _prefix + { _defaultPrefix } + implicitly[PathBindable[String]].unbind("file", file))
                                                        
// @LINE:25
case (file) if true => Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
                                                        
   }
}
                                                
    
}
                          

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:17
def travelBack(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "regresar")
}
                                                

// @LINE:9
def places3(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "lugar3")
}
                                                

// @LINE:18
def currentCountry(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "paisActual")
}
                                                

// @LINE:15
def captureOrder(): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "ordenCaptura")
}
                                                

// @LINE:8
def places2(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "lugar2")
}
                                                

// @LINE:12
def place1msg(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "lugar1msj")
}
                                                

// @LINE:20
def conecciones(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "conecciones")
}
                                                

// @LINE:11
def newCase(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "nuevoCaso")
}
                                                

// @LINE:19
def villanos(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "villanos")
}
                                                

// @LINE:14
def place3msg(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "lugar3msj")
}
                                                

// @LINE:10
def descriptor(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "descripcion")
}
                                                

// @LINE:6
def incio(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "inciar")
}
                                                

// @LINE:13
def place2msg(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "lugar2msj")
}
                                                

// @LINE:16
def travel(): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "viajar")
}
                                                

// @LINE:7
def places1(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "lugar1")
}
                                                
    
}
                          
}
                  


// @LINE:25
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:25
// @LINE:21
class ReverseAssets {
    

// @LINE:25
// @LINE:21
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
              

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:17
def travelBack : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.travelBack",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "regresar"})
      }
   """
)
                        

// @LINE:9
def places3 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.places3",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lugar3"})
      }
   """
)
                        

// @LINE:18
def currentCountry : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.currentCountry",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paisActual"})
      }
   """
)
                        

// @LINE:15
def captureOrder : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.captureOrder",
   """
      function() {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "ordenCaptura"})
      }
   """
)
                        

// @LINE:8
def places2 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.places2",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lugar2"})
      }
   """
)
                        

// @LINE:12
def place1msg : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.place1msg",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lugar1msj"})
      }
   """
)
                        

// @LINE:20
def conecciones : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.conecciones",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "conecciones"})
      }
   """
)
                        

// @LINE:11
def newCase : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.newCase",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "nuevoCaso"})
      }
   """
)
                        

// @LINE:19
def villanos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.villanos",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "villanos"})
      }
   """
)
                        

// @LINE:14
def place3msg : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.place3msg",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lugar3msj"})
      }
   """
)
                        

// @LINE:10
def descriptor : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.descriptor",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "descripcion"})
      }
   """
)
                        

// @LINE:6
def incio : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.incio",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "inciar"})
      }
   """
)
                        

// @LINE:13
def place2msg : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.place2msg",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lugar2msj"})
      }
   """
)
                        

// @LINE:16
def travel : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.travel",
   """
      function() {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "viajar"})
      }
   """
)
                        

// @LINE:7
def places1 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.places1",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lugar1"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:25
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:25
// @LINE:21
class ReverseAssets {
    

// @LINE:21
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """$file<.+>""")
)
                      
    
}
                          

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:17
def travelBack(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.travelBack(), HandlerDef(this, "controllers.Application", "travelBack", Seq(), "GET", """""", _prefix + """regresar""")
)
                      

// @LINE:9
def places3(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.places3(), HandlerDef(this, "controllers.Application", "places3", Seq(), "GET", """""", _prefix + """lugar3""")
)
                      

// @LINE:18
def currentCountry(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.currentCountry(), HandlerDef(this, "controllers.Application", "currentCountry", Seq(), "GET", """""", _prefix + """paisActual""")
)
                      

// @LINE:15
def captureOrder(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.captureOrder(), HandlerDef(this, "controllers.Application", "captureOrder", Seq(), "PUT", """""", _prefix + """ordenCaptura""")
)
                      

// @LINE:8
def places2(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.places2(), HandlerDef(this, "controllers.Application", "places2", Seq(), "GET", """""", _prefix + """lugar2""")
)
                      

// @LINE:12
def place1msg(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.place1msg(), HandlerDef(this, "controllers.Application", "place1msg", Seq(), "GET", """""", _prefix + """lugar1msj""")
)
                      

// @LINE:20
def conecciones(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.conecciones(), HandlerDef(this, "controllers.Application", "conecciones", Seq(), "GET", """""", _prefix + """conecciones""")
)
                      

// @LINE:11
def newCase(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.newCase(), HandlerDef(this, "controllers.Application", "newCase", Seq(), "GET", """""", _prefix + """nuevoCaso""")
)
                      

// @LINE:19
def villanos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.villanos(), HandlerDef(this, "controllers.Application", "villanos", Seq(), "GET", """""", _prefix + """villanos""")
)
                      

// @LINE:14
def place3msg(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.place3msg(), HandlerDef(this, "controllers.Application", "place3msg", Seq(), "GET", """""", _prefix + """lugar3msj""")
)
                      

// @LINE:10
def descriptor(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.descriptor(), HandlerDef(this, "controllers.Application", "descriptor", Seq(), "GET", """""", _prefix + """descripcion""")
)
                      

// @LINE:6
def incio(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.incio(), HandlerDef(this, "controllers.Application", "incio", Seq(), "GET", """""", _prefix + """inciar""")
)
                      

// @LINE:13
def place2msg(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.place2msg(), HandlerDef(this, "controllers.Application", "place2msg", Seq(), "GET", """""", _prefix + """lugar2msj""")
)
                      

// @LINE:16
def travel(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.travel(), HandlerDef(this, "controllers.Application", "travel", Seq(), "PUT", """""", _prefix + """viajar""")
)
                      

// @LINE:7
def places1(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.places1(), HandlerDef(this, "controllers.Application", "places1", Seq(), "GET", """""", _prefix + """lugar1""")
)
                      
    
}
                          
}
        
    