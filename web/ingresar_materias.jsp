<%-- 
    Document   : materias
    Created on : 7/03/2019, 03:45:36 PM
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
       <form action="guardar_materia" method="post">                  
            <label>Ingresar el materia<label>
            <input type="text" name="materia"/><br/>  
            <label>Ingresar los grupo<label>
            <input type="text" name="grupo"/> <br/>
            <label>Ingresar el hora<label>
            <input type="text" name="hora"/> <br/>
            <input type="submit" value="guardar"/>
        </form>
    </body>
</html>
