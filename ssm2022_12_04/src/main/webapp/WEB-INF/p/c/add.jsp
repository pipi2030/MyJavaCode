<%--
  Created by IntelliJ IDEA.
  User: 11733
  Date: 2022/12/12
  Time: 22:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>班级增加页</title>
</head>
<body>
<form action="./add" method="post">
  班级名称：<input type="text" name="name"><br/>
  上课地点：<input type="text" name="room"><br/>
  <button type="submit">提交</button>
</form>
</body>
</html>
