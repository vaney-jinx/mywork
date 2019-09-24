<%--
  Created by IntelliJ IDEA.
  User: win7
  Date: 2019-9-21
  Time: 13:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎访问我的spring-angular</title>
    <%
        String appLibPathPrefix = "../app/lib/";
    %>
    <script type="text/javascript" src="<%=appLibPathPrefix%>angular/angular.min.js"></script>
    <script type="text/javascript" src="<%=appLibPathPrefix%>angular/angular-route.min.js"></script>
    <script type="text/javascript" src="<%=appLibPathPrefix%>angular/angular-ui-router.min.js"></script>
    <script type="text/javascript" src="<%=appLibPathPrefix%>angular/ocLazyLoad.min.js"></script>
    <script type="text/javascript" src="<%=appLibPathPrefix%>jquery/jquery.min.js"></script>
    <script type="text/javascript" src="<%=appLibPathPrefix%>init/AgAppInit.js"></script>
    <script type="text/javascript" src="<%=appLibPathPrefix%>init/AgTransport.js"></script>
    <script type="text/javascript" src="<%=appLibPathPrefix%>router/AgRouter.js"></script>
</head>
<body ng-app="agApp">
<div data-ui-view="">

</div>
</body>
</html>
