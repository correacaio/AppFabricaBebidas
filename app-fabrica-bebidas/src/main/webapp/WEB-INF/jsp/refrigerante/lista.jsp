<%@ page pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>Cadastro de Refrigerantes</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
    <c:import url="../menu.jsp"/>

    <c:if test="${not empty usuario}">
        <h4><a href="/refrigerantes/cadastrar">Novo Refrigerante</a></h4>

        <table class="table table-striped">
            <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Nome</th>
                    <th scope="col">Descri��o</th>
                    <th scope="col">Valor</th>
                    <th scope="col">Gaseificado</th>
                    <th scope="col">Gramas de A�ucar</th>
                    <th scope="col">Sabor</th>
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
                        <td>${elemento.gaseificado}</td>
                        <td>${elemento.gramasAcucar}</td>
                        <td>${elemento.sabor}</td>
                        <td><a href="/refrigerantes/${elemento.id}/excluir">excluir</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </c:if>
</body>
</html>