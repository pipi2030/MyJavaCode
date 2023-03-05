<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>班级列表</title>
    <style>
        #add{
            position: fixed;
            right: 150px;
            top: 150px;
        }
    </style>
</head>
<body>
<table>
    <thead>
        <tr>
            <td hidden>序号</td>
            <td>班级名称</td>
            <td>班级地点</td>
            <td>操作</td>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${clazz}" var="clazz">
            <tr>
                <td>${ clazz.name }</td>
                <td>${ clazz.room }</td>
                <td><a href="./del?id=${clazz.id}">删除</a></td>
                <td><a href="./updatePage?id=${clazz.id}">修改</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
<a href="/ssm2022_12_04_war/clazz/addPage" id="add">增加班级</a>
</body>
</html>
