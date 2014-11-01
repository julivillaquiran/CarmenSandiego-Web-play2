package controllers;

import java.util.Arrays;
import java.util.Collection;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import com.fasterxml.jackson.databind.JsonNode;


public class Application extends Controller {
  
    public static Result villanos(){
    	response().setContentType("application/json");
    	Collection<String> texto = Arrays.asList("Norman Bates","Johnny 6","Apocalipto");
    	JsonNode json = Json.toJson(texto);    	
    	return ok(json);
    }
    
    public static Result conecciones(){
    	response().setContentType("application/json");
    	Collection<String> texto = Arrays.asList("Irak","Tatooine","Serbia");
    	JsonNode json = Json.toJson(texto);    	
    	return ok(json);
    }	
}