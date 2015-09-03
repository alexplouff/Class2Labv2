<%-- 
    Document   : welcome
    Created on : Sep 3, 2015, 9:33:35 AM
    Author     : alex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Object greeting = request.getAttribute("ws"); %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Please enter your name</h3>
        
        <form id="welcomeForm" method="POST" action="greeter" >
            
            <input id="name" name="name" type="text" />
            <input type="submit" />
            
        </form>
        <% if(greeting != null){
            
            out.print(greeting);
        }%>
        
    </body>
</html>
