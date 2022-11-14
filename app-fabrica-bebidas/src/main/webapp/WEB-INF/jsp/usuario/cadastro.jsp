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
        <form action="/enderecos/cep" method="post" class="form-inline">
            <div class="form-group">
                <label>Cep:</label>
                <input type="text" class="form-control" placeholder="Preencha o CEP para buscar" name="cep">
            </div>

            <button type="submit" class="btn btn-default">Buscar CEP</button>
        </form>

        <h2>Cadastro de Usuario</h2>
        <form action="/usuarios" method="post">
            <div class="form-group">
                <label>Nome:</label>
                <input type="text" class="form-control" placeholder="Preencha o nome" name="nome">
            </div>
            <div class="form-group">
                <label>Email:</label>
                <input type="email" class="form-control" placeholder="Preencha o email" name="email">
            </div>
            <div class="form-group">
                <label>Senha:</label>
                <input type="password" class="form-control" placeholder="Preencha a senha" name="senha">
            </div>

            <c:import url="../endereco.jsp"/>

            <button type="submit" class="btn btn-default">Cadastrar</button>
        </form>
    </div>
</body>
</html>
