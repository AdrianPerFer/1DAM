<%-- 
    Document   : tabla
    Created on : Feb 16, 2023, 8:29:19 AM
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
        <% int n = Integer.parseInt(request.getParameter("numero")); %>
        <h1>Tabla de multiplicar</h1>
        <table>
            <%
                for(int i = 0 ; i < 11 ; i++){
                    int resultado = n * i;
                    out.println(
                      "<tr>"
                        + "<td>" + n + "x" + i + "</td>"
                        + "<td> = </td>"
                        + "<td>" + resultado + "</td>"
                    + "</tr>"
                    );
                }
            %>
        </table>
    </body>
</html>
