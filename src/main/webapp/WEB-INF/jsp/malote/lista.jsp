<%@ page language="java" contentType="text/html; ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>Cadastro de Fabricas</title>
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
                <li class="active"><a href="/malotes">Malotes</a></li>
                <li><a href="/fabricas">Fabricas</a></li>
                <li><a href="/bebidas">Bebidas</a></li>
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
                <th scope="col">Status</th>
                <th scope="col">Data Solicitação</th>
                <th scope="col">Data Conclusão</th>
                <th scope="col">Fabrica</th>
                <th scope="col">Valor Total</th>
                <th scope="col"></th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="elemento" items="${lista}" varStatus="loop">
                <tr>
                    <th scope="row">${elemento.id}</th>
                    <td>${elemento.status}</td>
                    <td>${elemento.dataSolicitacao}</td>
                    <td>${elemento.dataConclusao}</td>
                    <td>${elemento.fabrica.id}</td>
                    <td>${elemento.valorTotal}</td>
                    <td><a href="/malotes/${elemento.id}/excluir">excluir</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
