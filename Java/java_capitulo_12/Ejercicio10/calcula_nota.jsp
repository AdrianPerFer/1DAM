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
        <title>Cuestionario</title>
    </head>
    <body>
        <h1>Euros a pesetas</h1>
        <div class="data-container">
            Ha obtenido
             <%
               int puntos = 0;
               for (Integer i = 1; i < 11; i++) {
                 puntos += Integer.parseInt(request.getParameter("p" + i.toString()));
               }
               out.print(puntos);
             %>
             puntos, haga clic <a href="index.jsp">aquí</a> para repetir el cuestionario.
        </div>
    </body>
</html>
