<%@ page pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>Cadastro de Empresas</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
    <c:import url="../menu.jsp"/>

    <div class="container">
        <h2>Acesso</h2>
        <form action="/usuarios/acessar" method="post">
            <div class="form-group">
                <label>Email:</label>
                <input type="email" class="form-control" placeholder="Preencha o email" name="email">
            </div>
            <div class="form-group">
                <label>Senha:</label>
                <input type="password" class="form-control" placeholder="Preencha a senha" name="senha">
            </div>
            <button type="submit" class="btn btn-default">Acessar</button>
        </form>
    </div>
</body>
</html>
