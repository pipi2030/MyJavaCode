<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生增加页</title>
</head>
<body>
    <form action="./add" method="post" >
        学号:<input type="text" name="id"/><br/>
        姓名:<input type="text" name="name"/><br/>
        年龄:<input type="number" name="age"/><br/>
        班级:<select name="clazzId">
                <c:forEach items="${clazzList}" var="clazz">
                    <option value="${clazz.id}">${clazz.name}</option>
                </c:forEach>
            </select><br/>
        <input type="submit">
    </form>
</body>
</html>
