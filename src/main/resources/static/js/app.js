var myApp = angular.module('myApp', ["ngRoute"]);
myApp.controller('myCtrl', function ($scope,$location) {	
  $('.modal').modal();
  $scope.go = function ( path ) {
  $location.path( path );
}; 
 
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
    .when("/cart", {
        templateUrl : "Templates/cart.html",
        controller: 'cartController'
    });
});
myApp.controller('homeController', function($scope,$rootScope) {
	$('.carousel.carousel-slider').carousel({fullWidth: true});
            $rootScope.cartCount = 0;
            $rootScope.addToCart = function() {
        $rootScope.cartCount++;
    console.log('cart',$rootScope.cartCount)
    };
});
myApp.controller('productController', function($scope) {

    $('ul.tabs').tabs();
    $('ul.tabs').tabs('select_tab', 'tab_id');
	$scope.name="ankit";

});
myApp.controller('listController', function($scope,userRepository) {
    var data = "";
    $scope.getViaCategory=function($scope){
          userRepository.getByCategory().success(function(data) {
           $scope.data = data;
        });
      }

    
});
myApp.controller('cartController', function($scope) {
	$scope.quantity=['1','2','3']
});