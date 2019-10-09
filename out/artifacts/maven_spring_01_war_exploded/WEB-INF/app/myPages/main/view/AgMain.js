/**
 * 主页面
 */
agApp.controller("AgMainCtrl", function ($scope, $stateParams, $AgTransportService) {
    $scope.AgMainModel = {};
    $scope.AgMainModel.welcome = "Welcome to my MainPage";
    console.log($stateParams.data);
});