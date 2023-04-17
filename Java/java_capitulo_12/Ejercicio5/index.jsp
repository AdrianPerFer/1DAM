<%-- 
    Document   : index
    Created on : Feb 13, 2023, 5:28:29 PM
    Author     : Chopito

Realiza un conversor de euros a pesetas.

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./assets/css/styles.css"/>
        <title>Ejercicio5</title>
    </head>
    <body>
        <h1>Euros a pesetas</h1>
        <div class="data-container">
            <form method="POST" action="calculoPesetas.jsp">
                <div class="form-container">
                    <label for="euros">
                        Euros: 
                    </label>
                    <input type="text" name="euros">
                </div>
                <div class="form-footer">
                    <input type="submit">
                </div>
            </form>
        </div>
    </body>
</html>
