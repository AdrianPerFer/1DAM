<%-- 
    Document   : piramide.jsp
    Created on : Feb 19, 2023, 4:52:20 PM
    Author     : Chopito
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int n = Integer.parseInt(request.getParameter("numero"));
            for (int i = 1 ; i <= n ; i++){
                for (int j = 1 ; j <= n - i ; j++){
                    out.print("<img src='./assets/img/blanco.jpg'>");
                }
                for (int k = 1 ; k <= ((i * 2) - 1) ; k++) {
                    out.print("<img src='./assets/img/gatoloco.jpg'>");
                }
                out.println("</br>");
            }
        %>
    </body>
</html>
