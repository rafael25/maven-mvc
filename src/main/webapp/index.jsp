<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
 "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="js/libs/foundation/css/normalize.css">
    <link rel="stylesheet" href="js/libs/foundation/css/foundation.min.css" />
    <link rel="stylesheet" href="style.css" />
</head>
<body>
    <div class="fixed">
        <nav class="top-bar" data-topbar role="navigation">
            <ul class="title-area">
            <li class="name"><h1><a href="/">Elementos POO</a></h1></li>
                <li class="toggle-topbar menu-icon"><a href="#"><span>Menú</span></a></li>
            </ul>
            <section class="top-bar-section">
                <ul class="left">
                    <li><a href="tu-horoscopo.html">Proyecto 1</a></li>
                </ul>
            </section>
        </nav>
    </div>
    <div class="row">
        <div class="large-12 columns">
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
                <input class="button" type="submit" value="Apachurrame" />
            </form>
        </div>
    </div>
    <script src="js/libs/jquery/jquery.js"></script>
    <script src="js/libs/foundation/js/foundation.min.js"></script>
    <script>
        $(document).foundation();
    </script>
</body>
</html>
