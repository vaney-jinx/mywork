/**
 * 初始化整个angular app应用
 */
const agApp = angular.module("agApp", ['ui.router', 'oc.lazyLoad', 'ngDraggable']);
agApp.config(["$provide", "$compileProvider", "$controllerProvider", "$filterProvider",
    function ($provide, $compileProvider, $controllerProvider, $filterProvider) {
        agApp.controller = $controllerProvider.register;
        agApp.directive = $compileProvider.directive;
        agApp.filter = $filterProvider.register;
        agApp.factory = $provide.factory;
        agApp.service = $provide.service;
        agApp.constant = $provide.constant;
        agApp.value = $provide.value;
    }]);