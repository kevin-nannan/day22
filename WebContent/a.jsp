
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    <%@ page errorPage="/error.jsp"  %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h4>AAA page</h4>
    <%@ include file="b.jsp" %> <%-- 包含源代码 静态包含  只有一个java文件 --%>
    <jsp:include page="b.jsp"></jsp:include> <%-- 动态包含 含两个java --%>
    <jsp:forward page="b.jsp"></jsp:forward>
       
</body>
</html>