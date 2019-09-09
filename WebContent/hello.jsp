
<%@page import="java.util.Date"%>
<%@page import="com.zck.day29.Person"%>
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
    Date date=new Date();
    System.out.print(date);
    String name=request.getParameter("name");
    System.out.println(name);
    
 
    
    System.out.println(response instanceof HttpServletResponse);
    
    ServletRequest req=pageContext.getRequest();
    System.out.println(req==request);
    
    System.out.println(session.getId()); 
    
    System.out.println(application.getInitParameter("password"));
    
    System.out.println(config.getInitParameter("test"));
    
    out.print("adbcsds");
    
    out.println(this);
    out.println(page);
    %>
</body>
</html>