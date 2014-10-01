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
                <option value="1">Acuario</option>
                <option value="2">Piscis</option>
                <option value="3">Aries</option>
                <option value="4">Tauro</option>
                <option value="5">Geminis</option>
                <option value="6">Cancer</option>
                <option value="7">Leo</option>
                <option value="8">Virgo</option>
                <option value="9">Libra</option>
                <option value="10">Escorpio</option>
                <option value="11">Sagitario</option>
                <option value="12">Capricornio</option>
            </select>
            <input type="submit" value="Apachurrame" />
        </form>
    </body>
</html>
