<%-- 
    Document   : index.jsp
    Created on : Feb 14, 2023, 11:36:34 AM
    Author     : Chopito

Realiza una aplicación que pinte una pirámide. La altura se pedirá en un
formulario. La pirámide estará hecha de bolitas, ladrillos o cualquier otra
imagen.

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio9</title>
    </head>
    <body>
        <h1>PIRÁMIDE POR 45320859 VEZ</h1>
        <form method="get" action="piramide.jsp">
            Introduzca la altura: <input type="number" min="1" max="10" name="numero">
            <input type="submit" value="Aceptar">
        </form>
    </body>
</html>
