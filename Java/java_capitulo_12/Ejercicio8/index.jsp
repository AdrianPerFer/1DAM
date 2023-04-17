<%-- 
    Document   : index.jsp
    Created on : Feb 14, 2023, 11:36:34 AM
    Author     : Chopito
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./assets/css/styles.css"/>
        <title>Ejercicio8</title>
    </head>
    <body>
        <h1>Tabla de multiplicar</h1>
        <div>
            <form method="post" action="tabla.jsp">
                Introduce un número: <input type="number" name="numero">
                <input type="submit" value="Aceptar">
            </form>
        </div>
    </body>
</html>
