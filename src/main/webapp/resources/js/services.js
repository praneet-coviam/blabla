//services for api  call
var myApp = angular.module('myApp');
myApp.factory('userRepository',function ($http){
   return {
        getByCategory:function(){
           var url="http://localhost:8080/category/phone";
           return $http.get(url);
       }
   };
});
