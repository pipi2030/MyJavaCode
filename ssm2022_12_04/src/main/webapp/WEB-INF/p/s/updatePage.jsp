<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生修改页</title>
</head>
<body>
    <form action="./update" method="post" >
        学号:<input type="text" name="id" value="${student.id}"/><br/>
        姓名:<input type="text" name="name" value="${student.name}"/><br/>
        年龄:<input type="number" name="age" value="${student.age}"/><br/>
        班级:<select name="clazzId">
                <c:forEach items="${clazzList}" var="clazz">
                    <c:if test="${clazz.id == student.clazzId}">
                        <option value="${clazz.id}" selected>${clazz.name}</option>
                    </c:if>
                    <c:if test="${clazz.id != student.clazzId}">
                        <option value="${clazz.id}">${clazz.name}</option>
                    </c:if>
                </c:forEach>
            </select><br/>
        <input type="submit">
    </form>
</body>
</html>
