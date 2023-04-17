<%-- 
    Document   : index.jsp
    Created on : Feb 13, 2023, 4:52:20 PM
    Author     : Chopito

Escribe una aplicación que pida tu nombre. A continuación mostrará “Hola”
seguido del nombre introducido. El nombre se deberá recoger mediante un
formulario.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="./assets/css/styles.css" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio3</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <div class="data-container">
            <div>
                <form method="POST" action="./mostrarDatos.jsp">
                    <div class="item-input">
                        <label for="nombre">Nombre: </label>
                        <input type"text" name="nombre">
                    </div>
                    <div class="form-footer">
                        <input type="submit">
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
