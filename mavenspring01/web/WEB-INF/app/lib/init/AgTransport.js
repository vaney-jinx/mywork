agApp.service("$AgTransportService", function ($http) {

    /**
     * 获取数据
     */
    this.transportData = function (url, dataJson, call) {
        $http({
            method: "POST",
            data: JSON.stringify(dataJson),
            url: url,
            headers: {
                'Content-Type': 'application/json;charset=UTF-8 ',
                'Cache-Control': 'no-cache',
                'Pragma': 'no-cache'
            }
        }).then(function (resp) {
            var respObj = resp.data;
            if (respObj.type === 1) {
                call(respObj.data);
            } else {
                alert(respObj.data);
            }
        }).finally(function () {

        });
    };
});