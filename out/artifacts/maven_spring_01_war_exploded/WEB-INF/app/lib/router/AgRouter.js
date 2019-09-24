/**
 * 配置路由
 */
agApp.run(['$rootScope', '$state', '$stateParams', function ($rootScope, $state, $stateParams) {
    $rootScope.$state = $state;
    $rootScope.$stateParams = $stateParams
}
]).config(function ($stateProvider, $urlRouterProvider, $locationProvider, $uiViewScrollProvider) {
    //用于改变state时跳至顶部
    $uiViewScrollProvider.useAnchorScroll();
    const appPathPrefix = "../app/myPages/";
    // 默认进入先重定向
    $urlRouterProvider.otherwise('AgLogin');
    $stateProvider.state("AgLogin", {
        url: "/AgLogin",
        params: {},
        templateUrl: appPathPrefix + "login/view/AgLogin.html",
        resolve: {
            loadMyCtrl: ['$ocLazyLoad', function ($ocLazyLoad) {
                return $ocLazyLoad.load([appPathPrefix + "login/view/AgLogin.js"]);
            }]
        }
    })
});


