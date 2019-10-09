/**
 * 登录页面
 */
agApp.controller("AgLoginCtrl", function ($scope, $state, $AgTransportService) {
    $scope.AgLoginModel = {};
    $scope.AgLoginModel.welcome = "Welcome to my APP";
    $scope.AgLoginModel.userName = "";
    $scope.AgLoginModel.password = "";

    $scope.signIn = function () {
        var call = function(info){
            $state.go("AgMain", {data: info});
        };
        $AgTransportService.transportData("/login/signIn/", {userName: $scope.AgLoginModel.userName, password: $scope.AgLoginModel.password}, call);
    };
});