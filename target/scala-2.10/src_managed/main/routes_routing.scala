// @SOURCE:C:/Users/JulianV/Documents/GitHub/CarmenSandiego-Web-play2/conf/routes
// @HASH:2402f01ff2b70a823f4853d137aa7a1762aeabab
// @DATE:Fri Nov 07 01:41:55 ART 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_incio0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("inciar"))))
        

// @LINE:7
private[this] lazy val controllers_Application_places11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("lugar1"))))
        

// @LINE:8
private[this] lazy val controllers_Application_places22 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("lugar2"))))
        

// @LINE:9
private[this] lazy val controllers_Application_places33 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("lugar3"))))
        

// @LINE:10
private[this] lazy val controllers_Application_descriptor4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("descripcion"))))
        

// @LINE:11
private[this] lazy val controllers_Application_newCase5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("nuevoCaso"))))
        

// @LINE:12
private[this] lazy val controllers_Application_place1msg6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("lugar1msj"))))
        

// @LINE:13
private[this] lazy val controllers_Application_place2msg7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("lugar2msj"))))
        

// @LINE:14
private[this] lazy val controllers_Application_place3msg8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("lugar3msj"))))
        

// @LINE:15
private[this] lazy val controllers_Application_captureOrder9 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ordenCaptura"))))
        

// @LINE:16
private[this] lazy val controllers_Application_travel10 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("viajar"))))
        

// @LINE:17
private[this] lazy val controllers_Application_travelBack11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("regresar"))))
        

// @LINE:18
private[this] lazy val controllers_Application_currentCountry12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("paisActual"))))
        

// @LINE:19
private[this] lazy val controllers_Application_villanos13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("villanos"))))
        

// @LINE:20
private[this] lazy val controllers_Application_conecciones14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("conecciones"))))
        

// @LINE:21
private[this] lazy val controllers_Assets_at15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("file", """.+""",false))))
        

// @LINE:25
private[this] lazy val controllers_Assets_at16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """inciar""","""controllers.Application.incio()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """lugar1""","""controllers.Application.places1()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """lugar2""","""controllers.Application.places2()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """lugar3""","""controllers.Application.places3()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """descripcion""","""controllers.Application.descriptor()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """nuevoCaso""","""controllers.Application.newCase()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """lugar1msj""","""controllers.Application.place1msg()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """lugar2msj""","""controllers.Application.place2msg()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """lugar3msj""","""controllers.Application.place3msg()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ordenCaptura""","""controllers.Application.captureOrder()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """viajar""","""controllers.Application.travel()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """regresar""","""controllers.Application.travelBack()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """paisActual""","""controllers.Application.currentCountry()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """villanos""","""controllers.Application.villanos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """conecciones""","""controllers.Application.conecciones()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_incio0(params) => {
   call { 
        invokeHandler(controllers.Application.incio(), HandlerDef(this, "controllers.Application", "incio", Nil,"GET", """""", Routes.prefix + """inciar"""))
   }
}
        

// @LINE:7
case controllers_Application_places11(params) => {
   call { 
        invokeHandler(controllers.Application.places1(), HandlerDef(this, "controllers.Application", "places1", Nil,"GET", """""", Routes.prefix + """lugar1"""))
   }
}
        

// @LINE:8
case controllers_Application_places22(params) => {
   call { 
        invokeHandler(controllers.Application.places2(), HandlerDef(this, "controllers.Application", "places2", Nil,"GET", """""", Routes.prefix + """lugar2"""))
   }
}
        

// @LINE:9
case controllers_Application_places33(params) => {
   call { 
        invokeHandler(controllers.Application.places3(), HandlerDef(this, "controllers.Application", "places3", Nil,"GET", """""", Routes.prefix + """lugar3"""))
   }
}
        

// @LINE:10
case controllers_Application_descriptor4(params) => {
   call { 
        invokeHandler(controllers.Application.descriptor(), HandlerDef(this, "controllers.Application", "descriptor", Nil,"GET", """""", Routes.prefix + """descripcion"""))
   }
}
        

// @LINE:11
case controllers_Application_newCase5(params) => {
   call { 
        invokeHandler(controllers.Application.newCase(), HandlerDef(this, "controllers.Application", "newCase", Nil,"GET", """""", Routes.prefix + """nuevoCaso"""))
   }
}
        

// @LINE:12
case controllers_Application_place1msg6(params) => {
   call { 
        invokeHandler(controllers.Application.place1msg(), HandlerDef(this, "controllers.Application", "place1msg", Nil,"GET", """""", Routes.prefix + """lugar1msj"""))
   }
}
        

// @LINE:13
case controllers_Application_place2msg7(params) => {
   call { 
        invokeHandler(controllers.Application.place2msg(), HandlerDef(this, "controllers.Application", "place2msg", Nil,"GET", """""", Routes.prefix + """lugar2msj"""))
   }
}
        

// @LINE:14
case controllers_Application_place3msg8(params) => {
   call { 
        invokeHandler(controllers.Application.place3msg(), HandlerDef(this, "controllers.Application", "place3msg", Nil,"GET", """""", Routes.prefix + """lugar3msj"""))
   }
}
        

// @LINE:15
case controllers_Application_captureOrder9(params) => {
   call { 
        invokeHandler(controllers.Application.captureOrder(), HandlerDef(this, "controllers.Application", "captureOrder", Nil,"PUT", """""", Routes.prefix + """ordenCaptura"""))
   }
}
        

// @LINE:16
case controllers_Application_travel10(params) => {
   call { 
        invokeHandler(controllers.Application.travel(), HandlerDef(this, "controllers.Application", "travel", Nil,"PUT", """""", Routes.prefix + """viajar"""))
   }
}
        

// @LINE:17
case controllers_Application_travelBack11(params) => {
   call { 
        invokeHandler(controllers.Application.travelBack(), HandlerDef(this, "controllers.Application", "travelBack", Nil,"GET", """""", Routes.prefix + """regresar"""))
   }
}
        

// @LINE:18
case controllers_Application_currentCountry12(params) => {
   call { 
        invokeHandler(controllers.Application.currentCountry(), HandlerDef(this, "controllers.Application", "currentCountry", Nil,"GET", """""", Routes.prefix + """paisActual"""))
   }
}
        

// @LINE:19
case controllers_Application_villanos13(params) => {
   call { 
        invokeHandler(controllers.Application.villanos(), HandlerDef(this, "controllers.Application", "villanos", Nil,"GET", """""", Routes.prefix + """villanos"""))
   }
}
        

// @LINE:20
case controllers_Application_conecciones14(params) => {
   call { 
        invokeHandler(controllers.Application.conecciones(), HandlerDef(this, "controllers.Application", "conecciones", Nil,"GET", """""", Routes.prefix + """conecciones"""))
   }
}
        

// @LINE:21
case controllers_Assets_at15(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """$file<.+>"""))
   }
}
        

// @LINE:25
case controllers_Assets_at16(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     