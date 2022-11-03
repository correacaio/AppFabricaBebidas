<%@ page language="java" contentType="text/html; ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>Cadastro de Sucos</title>
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
                <th scope="col">Nome</th>
                <th scope="col">Descrição</th>
                <th scope="col">Valor</th>
                <th scope="col">Fruta</th>
                <th scope="col">Adição de Açucar</th>
                <th scope="col">% Suco</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="elemento" items="${lista}">
                <tr>
                    <th scope="row">${elemento.id}</th>
                    <td>${elemento.nome}</td>
                    <td>${elemento.descricao}</td>
                    <td>${elemento.valor}</td>
                    <td>${elemento.fruta}</td>
                    <td>${elemento.adicaoAcucar}</td>
                    <td>${elemento.pctSucoFruta}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
