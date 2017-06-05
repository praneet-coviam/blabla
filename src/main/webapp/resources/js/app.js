var myApp = angular.module('myApp', ["ngRoute"]);
myApp.controller('myCtrl', function ($scope) {	
 
});
myApp.config(function($routeProvider) {
    $routeProvider
    .when("/home", {
        templateUrl : "Templates/home.html",
        controller: 'homeController'
    })
    .when("/product", {
        templateUrl : "Templates/product.html",
        controller: 'productController'
    })
    .when("/list", {
        templateUrl : "Templates/list.html",
        controller: 'listController'
        
    })
    .when("/kart", {
        templateUrl : "Templates/kart.html",
        controller: 'kartController'
    });
});
myApp.controller('homeController', function($scope) {
	$('.carousel.carousel-slider').carousel({fullWidth: true});
	
});
myApp.controller('productController', function($scope) {
    
	$scope.name="ankit";

});
myApp.controller('listController', function($scope,userRepository) {
    $scope.myMovie=function(){
          userRepository.getByCategory().success(function(data) {
           $scope.data = data;
        });
      }
});
myApp.controller('kartController', function($scope) {
	$scope.name="kart";
});