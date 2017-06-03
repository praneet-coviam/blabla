//services for api  call
var myApp = angular.module('myApp');
myApp.factory('userRepository',function ($http){
   return {
       // getMyMovie:function(){
       //   var url="https://jsonplaceholder.typicode.com/comments";
       //   return $http.get(url);
       }
   };
});
