<%@ page language="java" contentType="text/html; ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>Cadastro de Bebidas</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">App Fabrica Bebidas</a>
            </div>
            <ul class="nav navbar-nav">
                <li><a href="/malotes">Malotes</a></li>
                <li><a href="/fabricas">Fabricas</a></li>
                <li class="active"><a href="/bebidas">Bebidas</a></li>
                <li><a href="/cervejas">Cervejas</a></li>
                <li><a href="/refrigerantes">Refrigerantes</a></li>
                <li><a href="/sucos">Sucos</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
                <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
            </ul>
        </div>
    </nav>
    <table class="table table-striped">
        <thead>
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Nome</th>
                <th scope="col">Descrição</th>
                <th scope="col">Valor</th>
                <th scope="col"></th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="elemento" items="${lista}">
                <tr>
                    <th scope="row">${elemento.id}</th>
                    <td>${elemento.nome}</td>
                    <td>${elemento.descricao}</td>
                    <td>${elemento.valor}</td>
                    <td><a href="/bebidas/${elemento.id}/excluir">excluir</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
