var idwall = {
    start: function (message) {
        return new Promise(
            function (resolve, reject) {
                cordova.exec(resolve, reject, "IdwallPlugin", "", [{message}]);
            }
        );
    }
};

module.exports = idwall;
