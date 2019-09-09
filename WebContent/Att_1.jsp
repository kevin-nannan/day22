<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <%
    pageContext.setAttribute("pagecontextattr","pagecontextvalue");
    request.setAttribute("requestattr","requestvalue");
    session.setAttribute("sessionattr","sessionvalue");
    application.setAttribute("applicationattr","applicationvalue");
    %>
    pageContext:<%= pageContext.getAttribute("pagecontextattr") %>
    <br>
    request:<%= request.getAttribute("requestattr") %>
    <br>
    session:<%=session.getAttribute("sessionattr") %>
    <br>
    application:<%=application.getAttribute("applicationattr") %>
</body>
</html>