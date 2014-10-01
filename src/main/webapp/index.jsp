<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Aplicacion Web con MVC basica</h1>
        <form action="horoscopo" method="POST">
            <p>Escribe tu texto</p>
            <input type="text" name="nombre" /><br />
            <select name="signo">
                <option>Virgo</option>
                <option>Sagitario</option>
                <option>Libra</option>
                <option></option>
                <option></option>
                <option></option>
                <option></option>
                <option></option>
                <option></option>
                <option></option>
                <option></option>
                <option></option>
            </select>
            <input type="submit" value="Apachurrame" />
        </form>
    </body>
</html>
