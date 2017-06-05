var myApp = angular.module('myApp', ["ngRoute"]);
myApp.controller('myCtrl', function ($scope) {	
 
});
myApp.config(function($routeProvider) {
    $routeProvider
    .when("/home", {
        templateUrl : "Templates/home.html",
        controller: 'homeController'
    })
    .when("/Product", {
        templateUrl : "product.html"
    })
    .when("/list", {
        templateUrl : "list.html"
    })
    .when("/kart", {
        templateUrl : "kart.html"
    });
});
myApp.controller('homeController', function($scope) {
	$('.carousel.carousel-slider').carousel({fullWidth: true});
	
});
