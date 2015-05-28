'use strict';

angular.module('angularApp').directive('asNavHeader', function() {
  return {
    replace: true,
    restrict: 'E',
    templateUrl: 'templates/asNavHeader.html',
    controller: 'HeaderController'
  };
});
