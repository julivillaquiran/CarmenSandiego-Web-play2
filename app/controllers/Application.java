package controllers;

import java.util.Collection;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import testingData.TestingData;
import villain.Villain;
import model.GameSystem;
import appmodel.NewCaseWindowAppModel;
import appmodel.SolveCaseWindowAppModel;
import appmodel.TravelWindowAppModel;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import country.Country;
import country.InterestPlace;

public class Application extends Controller {
	
	static GameSystem gameSystem;
	static NewCaseWindowAppModel caseAppModel;
	static SolveCaseWindowAppModel mainAppModel;
	
    public static Result villanos(){
    	response().setContentType("application/json");
    	Collection<Villain> texto = mainAppModel.getGameSystem().getFiles();
    	JsonNode json = Json.toJson(texto);    	
    	return ok(json);
    }
    
    public static Result conecciones(){
    	response().setContentType("application/json");
    	Collection<Country> texto = mainAppModel.getCurrentCountry().getConnections();
    	JsonNode json = Json.toJson(texto);    	
    	return ok(json);
    }
    
    public static Result currentCountry(){
    	response().setContentType("application/json");
    	Country texto = mainAppModel.getCurrentCountry();
    	JsonNode json = Json.toJson(texto);    	
    	return ok(json);
    }
    
    public static Result places1(){
    	response().setContentType("application/json");
    	InterestPlace texto = mainAppModel.getThosePlaces0();
    	JsonNode json = Json.toJson(texto);    	
    	return ok(json);
    }
    
    public static Result places2(){
    	response().setContentType("application/json");
    	InterestPlace texto = mainAppModel.getThosePlaces1();
    	JsonNode json = Json.toJson(texto);    	
    	return ok(json);
    }
    
    public static Result places3(){
    	response().setContentType("application/json");
    	InterestPlace texto = mainAppModel.getThosePlaces2();
    	JsonNode json = Json.toJson(texto);    	
    	return ok(json);
    }
    
    public static Result descriptor(){
    	response().setContentType("application/json");
    	String texto = mainAppModel.getThisCase().getDescription();
    	JsonNode json = Json.toJson(texto);    	
    	return ok(json);
    }
    
    public static Result place1msg(){
    	response().setContentType("application/json");
    	mainAppModel.throwMessageThosePlaces0();
    	String texto = mainAppModel.getMessage();
    	JsonNode json = Json.toJson(texto);    	
    	return ok(json);
    }
    
    public static Result place2msg(){
    	response().setContentType("application/json");
    	mainAppModel.throwMessageThosePlaces1();
    	String texto = mainAppModel.getMessage();
    	JsonNode json = Json.toJson(texto);    	
    	return ok(json);
    }
    
    public static Result place3msg(){
    	response().setContentType("application/json");
    	mainAppModel.throwMessageThosePlaces2();
    	String texto = mainAppModel.getMessage();
    	JsonNode json = Json.toJson(texto);    	
    	return ok(json);
    }
    
    public static Result captureOrder(){
    	response().setContentType("application/json");
    	Villain ordenCaptura = Json.fromJson(request().body().asJson(), Villain.class);
    	mainAppModel.setCaptureOrder(ordenCaptura);
    	Villain texto = mainAppModel.getCaptureOrder();
    	JsonNode json = Json.toJson(texto);    	
    	return ok(json);
    }
    
    public static Result travel(){
    	response().setContentType("application/json");
    	Country countryToTravel = Json.fromJson(request().body().asJson(), Country.class);
    	
    	TravelWindowAppModel travelAppModel = new TravelWindowAppModel(mainAppModel);
    	travelAppModel.setCountryToTravel(countryToTravel);
    	travelAppModel.travel();
    	
    	mainAppModel = travelAppModel.getSolveCaseWindowAppModel();
    	
    	Country texto = mainAppModel.getCurrentCountry();
    	JsonNode json = Json.toJson(texto);    	
    	return ok(json);
    }
    
    public static Result travelBack(){
    	response().setContentType("application/json");
    	int index =  mainAppModel.getCurrentPath().size()-2;
    	Country countryToTravel = mainAppModel.getCurrentPath().get(index);
//    	
    	TravelWindowAppModel travelAppModel = new TravelWindowAppModel(mainAppModel);
    	travelAppModel.setCountryToTravel(countryToTravel);
    	travelAppModel.travel();
    	
    	mainAppModel = travelAppModel.getSolveCaseWindowAppModel();
    	
    	Country texto = mainAppModel.getCurrentCountry();
    	JsonNode json = Json.toJson(texto);    	
    	return ok(json);
    }
    
    
    
    public static Result incio(){
    	gameSystem = new GameSystem();
    	gameSystem = new TestingData().createGameSystem();
    	caseAppModel = new NewCaseWindowAppModel(gameSystem);
    	
    	mainAppModel =  new SolveCaseWindowAppModel(gameSystem, caseAppModel.getThisCase());
		return ok(crearJsonOk());
    }
    
    public static Result newCase(){
    	caseAppModel = new NewCaseWindowAppModel(gameSystem);
    	mainAppModel =  new SolveCaseWindowAppModel(gameSystem, caseAppModel.getThisCase());
		return ok(crearJsonOk());
    }
    
    protected static ObjectNode crearJsonError(String message) {
    	ObjectNode result = Json.newObject();
		result.put("error", message);
		return result;
	}
    
    protected static ObjectNode crearJsonOk() {
    	ObjectNode result = Json.newObject();
		result.put("status", "OK");
		return result;
	}
}