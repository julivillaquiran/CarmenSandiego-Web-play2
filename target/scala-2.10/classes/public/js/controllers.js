'use strict';

var app = angular.module('CarmenSandiegoWeb', []);

app.controller('AllVillainsCtrl', function ($scope, $http) {
	
	$scope.noplacemsg = function(){
    	$scope.message = "Seleccione un lugar para recibir mensaje"
    }
	
	$scope.inicio = function(){
		$http.get('/inciar');
		$scope.noplacemsg();
	}
	$scope.inicio();
	
	$scope.currentCountry = function() {
    	$http.get('/paisActual')
		.success(function(data) {
			$scope.country = data;
			})
		.error(function(data){
			$scope.country = [{'name':'error en la carga del pais'}]
		})
	}
	
	$scope.currentCountry();
	
	$scope.places = function() {
    	$http.get('/lugar1')
		.success(function(data) {
			$scope.place1 = data;
			})
		.error(function(data){
			$scope.place1 = [{'name':'Error en la carga del lugar 1'}]
		});
		$http.get('/lugar2')
		.success(function(data) {
			$scope.place2 = data;
			})
		.error(function(data){
			$scope.place2 = [{'name':'Error en la carga del lugar 2'}]
		});
		$http.get('/lugar3')
		.success(function(data) {
			$scope.place3 = data;
			})
		.error(function(data){
			$scope.place3 = [{'name':'Error en la carga del lugar 3'}]
		})
	}
	
	$scope.places();
	
	$scope.descriptor = function() {
    	$http.get('/descripcion')
		.success(function(data) {
			$scope.description = data;
			})
		.error(function(data){
			$scope.description = [{'name':'error en la carga de la descripcion'}]
		})
	}
	
	$scope.descriptor();	
	
	$scope.villains = function() {
    	$http.get('/villanos')
		.success(function(data) {
			$scope.villano = data;
			})
		.error(function(data){
			$scope.villano = [{'name':'error en la carga de villanos'}]
		})
	}
	
	$scope.villains();
	
	$scope.connectionsUdpate = function() {
    	$http.get('/conecciones')
		.success(function(data) {
			$scope.connections = data;
			})
		.error(function(data){
			$scope.connections = "error en la carga de conecciones"
		})
	}
	
    $scope.connectionsUdpate();
    
    $scope.place1msg = function(){
    	$http.get('/lugar1msj')
		.success(function(data) {
			$scope.message = data;
			})
		.error(function(data){
			$scope.message = "error en la carga del mensaje"
		})
    }
    
    $scope.place2msg = function(){
    	$http.get('/lugar2msj')
		.success(function(data) {
			$scope.message = data;
			})
		.error(function(data){
			$scope.message = "error en la carga del mensaje"
		})
    }
    
    $scope.place3msg = function(){
    	$http.get('/lugar3msj')
		.success(function(data) {
			$scope.message = data;
			})
		.error(function(data){
			$scope.message = "error en la carga del mensaje"
		})
    }
    
    $scope.captureOrder = function(){
    	$http.put('/ordenCaptura', $scope.selectedVillain)
		.success(function(data) {
			$scope.warrant = data;
			})
		.error(function(data){
			$scope.warrant = {'name':'Error en la emision de la orden'}
		})
    }
    
    $scope.travel = function(){
    	$http.put('/viajar', $scope.selectedConnections)
		.success(function() {
			$scope.currentCountry();
	    	$scope.connectionsUdpate();
	    	$scope.places();
	    	$scope.noplacemsg();
			})
		.error(function(data){
			$scope.message = "Error en su intento de viajar"
		})
    }
    
    $scope.travelBack = function(){
    	$http.get('/regresar')
		.success(function() {
			$scope.currentCountry();
	    	$scope.connectionsUdpate();
	    	$scope.places();
	    	$scope.noplacemsg();
			})
		.error(function(data){
			$scope.message = "Error en su intento de regresar"
		})
    }
    
    $scope.noTravel = function(){
    	$scope.selectedConnections = {'name':''}
    }
    
    $scope.newCase = function(){
    	$http.get('/nuevoCaso')
    	$scope.descriptor();
    	$scope.currentCountry();
    	$scope.connectionsUdpate();
    	$scope.places();
    	$scope.noplacemsg();
    	$scope.noTravel();
    }
    
    
	
	

});