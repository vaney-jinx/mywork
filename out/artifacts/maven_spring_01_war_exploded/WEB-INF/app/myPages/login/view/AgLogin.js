/**
 * 登录页面
 */
agApp.controller("AgLoginCtrl", function ($scope, $AgTransportService) {
    $scope.AgLoginModel = {};
    $scope.AgLoginModel.welcome = "Welcome to my APP";
    $scope.AgLoginModel.userName = "";
    $scope.AgLoginModel.password = "";

    $scope.signIn = function () {
        var call = function(info){
            console.log(info);
        };
        $AgTransportService.transportData("/login/signIn", {userName: $scope.AgLoginModel.userName, password: $scope.AgLoginModel.password}, call);
    };
});