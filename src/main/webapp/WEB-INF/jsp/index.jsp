<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>hello, ${name}</h2>
<ul>
    <c:forEach var="i" begin="1" end="5">
    Item <c:out value="${i}"/>
    </c:forEach>
</ul>
</body>
</html>
