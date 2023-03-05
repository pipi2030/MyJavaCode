<%--
  Created by IntelliJ IDEA.
  User: 11733
  Date: 2022/12/13
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页</title>
</head>
<body>
<form action="./register" method="post" enctype="multipart/form-data">
  用户名：<input type="text" name="username"><br/>
  密码：<input type="text" name="password"><br/>
  头像：<input type="file" name="headImage"><br/>
  <button type="submit">注册</button>
</form>
</body>
</html>
