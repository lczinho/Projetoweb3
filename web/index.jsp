<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exames</title>
        <link rel="stylesheet" href="css/style.css"/>
    </head>
    <body>
        
        <form action="LoginController" method="post">
        <h1>:::Login:::</h1>
        <input type="text" name="user" id="user" class="fields" placeholder="Nome de usuário" required>
        <br><br>
        <input type="password" name="pass" id="pass" class="fields" placeholder="Senha" required>
        <br><br>
        <input type="submit" value="enviar">
        </form>
    </body>
</html>
