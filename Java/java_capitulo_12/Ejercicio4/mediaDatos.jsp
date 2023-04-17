<%-- 
    Document   : mediaDatos.jsp
    Created on : Feb 13, 2023, 5:14:43 PM
    Author     : Chopito
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./assets/css/styles.css"/>
        <title>Ejercicio4</title>
    </head>
    <body>
        <h1>MEDIA</h1>
        <div class="data-container">
            <% 
                double n1 = Double.valueOf(request.getParameter("nota1"));
                double n2 = Double.valueOf(request.getParameter("nota2"));
                double n3 = Double.valueOf(request.getParameter("nota3"));
                double resultado = ((n1 + n2 + n3) / 3);
                out.print("Nota media: " + resultado);
            %>
        </div>
    </body>
</html>
