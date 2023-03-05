<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 11733
  Date: 2022/12/17
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生列表页</title>
</head>
<body>
<table>
    <thead>
        <tr>
            <td>学号</td>
            <td>姓名</td>
            <td>年龄</td>
            <td>班级</td>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${student}" var="student">
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.age}</td>
                <td>${student.clazzId}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
