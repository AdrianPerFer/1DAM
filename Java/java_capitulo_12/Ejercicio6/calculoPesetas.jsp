<%-- 
    Document   : calculoPesetas
    Created on : Feb 13, 2023, 5:29:01 PM
    Author     : Chopito
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./assets/css/styles.css"/>
        <title>Ejercicio6</title>
    </head>
    <body>
        <h1>Euros a pesetas</h1>
        <div class="data-container">
            <% 
                request.setCharacterEncoding("UTF-8");
                double euros = Double.valueOf(request.getParameter("euros"));
                double resultado = euros / 166.386;
                out.print("Pesetas totales: " + resultado);
            %>
        </div>
    </body>
</html>
