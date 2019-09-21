<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:forEach items="${requestScope.get('users')}" var="map">
    <div style="float: left;border: 1px solid #dadada;width: calc(100% - 30px);margin: 10px;padding: 10px;">
        <p>id：${map.user_id}</p>
        <p>姓名：${map.user_name}</p>
        <p>密码：${map.password}</p>
        <p>登录名：${map.user_show_id}</p>
    </div>
</c:forEach>
