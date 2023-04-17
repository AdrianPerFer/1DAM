<%-- 
    Document   : index.jsp
    Created on : Feb 13, 2023, 5:11:31 PM
    Author     : Chopito

Realiza una aplicación que calcule la media de tres notas.
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
            <div>
                <form method="POST" action="mediaDatos.jsp">
                    <div class="item-input">
                        <label for="nota1">
                            Primera nota:
                        </label>
                        <input type="text" name="nota1">
                    </div>
                    <div class="item-input">
                        <label for="nota2">
                            Segunda nota:
                        </label>
                        <input type="text" name="nota2">
                    </div>
                    <div class="item-input">
                        <label for="nota3">
                            Tercera nota:
                        </label>
                        <input type="text" name="nota3">
                    </div>
                    <div class="form-footer">
                        <input type="submit">
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
