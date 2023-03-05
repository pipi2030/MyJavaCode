<%--
  Created by IntelliJ IDEA.
  User: 11733
  Date: 2022/12/12
  Time: 22:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>班级修改页</title>
</head>
<body>
<form action="./update" method="post">
  <input  type="hidden" name="id" value="${clazz.id}">
  班级名称：<input type="text" name="name" value="${clazz.name}"><br/>
  上课地点：<input type="text" name="room" value="${clazz.room}"><br/>
  <button type="submit">提交</button>
</form>
</body>
</html>
