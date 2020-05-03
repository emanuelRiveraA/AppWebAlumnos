<%-- 
    Document   : ingresar_alumnos
    Created on : 7/03/2019, 03:46:23 PM
    Author     : Idalia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="guardar-usuario" method="post">                  
            <label>Ingresar el nombre<label>
            <input type="text" name="nombre"/><br/>  
            <label>Ingresar los apellidos<label>
            <input type="text" name="apellidos"/> <br/>
            <label>Ingresar el grupo<label>
            <input type="text" name="grupo"/> <br/>
            <input type="submit" value="guardar"/>
        </form>
    </body>
</html>
