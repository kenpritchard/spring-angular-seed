'use strict';

/**
 * @ngdoc function
 * @name angularApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the angularApp
 */
angular.module('angularApp')
  .controller('MainCtrl', function($scope, $http) {
    $scope.greeting = null;
    $scope.getGreeting = function() {
      $http.get('http://localhost:8080/greetings/' + $scope.newGetGreeting.salutation + '/' + $scope.newGetGreeting.name).
      success(function(data) {
        $scope.greeting = data;
      }).
      error(function() {
        $scope.greeting = null;
      });
      $scope.newGetGreeting = {};
    };
    $scope.postGreeting = function() {
      $http.post('http://localhost:8080/greetings', $scope.newPostGreeting).
      success(function(data) {
        $scope.greeting = data;
      }).
      error(function() {
        $scope.greeting = null;
      });
      $scope.newPostGreeting = {};
    };
    $scope.hasGreeting = function() {
      return $scope.greeting !== null;
    };
  });
