'use strict';

var app = angular.module('CarmenSandiegoWeb', []);

app.controller('AllVillainsCtrl', function ($scope, $http) {
	
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
			$scope.villano = [{'name':'error en la carga de conecciones'}]
		})
	}
	
    $scope.connectionsUdpate();    

});