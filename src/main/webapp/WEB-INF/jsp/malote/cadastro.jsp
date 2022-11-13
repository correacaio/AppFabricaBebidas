<%@ page pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>Cadastro de Malote</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
    <c:import url="../menu.jsp"/>

    <c:if test="${not empty usuario}">
        <div class="container">
            <h2>Cadastro de Malote</h2>

            <form action="/malotes" method="post">
                <div class="form-group">
                    <label>Status:</label>
                    <input type="text" class="form-control" placeholder="Preencha o status" name="status">
                </div>
                <div class="form-group">
                    <label>Data Solicitacao:</label>
                    <input type="datetime-local" class="form-control" placeholder="Preencha a data de solicitacao" name="dataSolicitacao">
                </div>
                <div class="form-group">
                    <label>Data Conclusao:</label>
                    <input type="datetime-local" class="form-control" placeholder="Preencha a data de conclusao" name="dataConclusao">
                </div>
                <div class="form-group">
                    <label>Valor Total:</label>
                    <input type="number" step="0.01" class="form-control" placeholder="Preencha o valor total" name="valorTotal">
                </div>
                <div class="form-group">
                    <label>Fabrica:</label>
                    <select name="fabrica" class="form-control">
                        <c:forEach var="s" items="${fabricas}">
                            <option value="${s.id}">${s.nome}</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="form-group">
                    <label>Bebidas:</label>
                    <c:forEach var="p" items="${bebidas}">
                        <div class="form-check">
                            <input class="form-check-input" type="checkbox" name="bebidas" value="${p.id}">
                            <label class="form-check-label"> ${p.nome}</label>
                        </div>
                    </c:forEach>
                </div>
                <button type="submit" class="btn btn-default">Cadastrar</button>
            </form>
        </div>
    </c:if>
</body>
</html>
