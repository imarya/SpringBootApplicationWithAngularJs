angular.module('dashboard', [ 'ngRoute' ]).config(
		[ '$routeProvider', function($routeProvider) {
			$routeProvider.when('/', {
				controller : 'DashboardController',
				templateUrl : 'dashboard.html'
			})
		} ]).controller('DashboardController',
		function($scope, DashboardService) {
			init();
			function init() {
				DashboardService.getServerDate().success(function(res) {
					$scope.serverDate = res;
				});
			}
		}).service('DashboardService', function($http) {

	this.getServerDate = function() {
		return $http.get("/getCurrentDate");
	}
});
