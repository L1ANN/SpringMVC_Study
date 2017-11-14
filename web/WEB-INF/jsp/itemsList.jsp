<%--
  Created by IntelliJ IDEA.
  User: L1ANN
  Date: 2017/11/14
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>姓名</th>
        <th>价格</th>
        <th>详情</th>
    </tr>
    <c:forEach items="${itemsList}" var="it">

        <tr>
            <th>${it.name}</th>
            <th>${it.price}</th>
            <th>${it.detail}</th>
        </tr>

    </c:forEach>
</table>
</body>
</html>
