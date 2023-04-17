<%-- 
    Document   : mostrarDatos.jsp
    Created on : Feb 13, 2023, 5:01:20 PM
    Author     : Chopito
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="assets/css/styles.css" type="text/css"/>
        <title>Ejercicio3</title>
    </head>
        <div class="data-container">
            <% 
                request.setCharacterEncoding("UTF-8");
                String nombre = request.getParameter("nombre");
            %>
            <h2>
                Nombre: 
                <%out.print("Hola " + nombre);%>
            </h2>
        </div>
</html>
