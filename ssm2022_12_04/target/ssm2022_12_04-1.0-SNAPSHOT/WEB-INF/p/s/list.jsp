<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生列表页</title>
    <style>
        #add{
            position: fixed;
            right: 150px;
            top: 150px;
        }
        #add2{
            position: fixed;
            right: 150px;
            top: 190px;
        }
    </style>
</head>
<body>
<img src="/ssm2022_12_04_war${sessionScope.user.headImage}" width="100px" height="100px">
<table>
    <thead>
    <tr>
        <td>序号</td>
        <td>学号</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>班级</td>
        <td>操作</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach  items="${studentList}" var="student" varStatus="i">
        <tr>
            <td>${i.index}</td>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.age}</td>
            <td>${student.clazz.name}</td>
            <td>
                <a href="del?id=${student.id}">删除</a>
                <a href="updatePage?id=${student.id}">修改</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="/ssm2022_12_04_war/student/addPage" id="add">增加学生</a>
<a href="/ssm2022_12_04_war/clazz/list" id="add2">班级列表</a>
</body>
</html>
