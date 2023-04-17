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
        <title>Ejercicio7</title>
    </head>
    <body>
        <h1>Euros a pesetas</h1>
        <div class="data-container">
            <% 
                request.setCharacterEncoding("UTF-8");
                double resultado;
                double cantidad = Double.valueOf(request.getParameter("cantidad"));
                if (request.getParameter("opcion").equals("pe")) {
                    resultado = cantidad / 166.386;
                } else {
                    resultado = cantidad * 166.386;
                }
                out.print("Total: " + resultado);
            %>
        </div>
    </body>
</html>
