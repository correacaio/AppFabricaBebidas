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
    <table class="table table-striped">
        <thead>
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Localização</th>
                <th scope="col">Inicialização</th>
                <th scope="col">Tamanho</th>
                <th scope="col">Empresa</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="elemento" items="${lista}" varStatus="loop">
                <tr>
                    <th scope="row">${elemento.id}</th>
                    <td>${elemento.localizacao}</td>
                    <td>${elemento.dataInicializacao}</td>
                    <td>${elemento.tamanho}</td>
                    <td>${elemento.empresa.id}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
