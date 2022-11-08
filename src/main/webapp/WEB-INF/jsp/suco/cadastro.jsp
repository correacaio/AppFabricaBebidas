<%@ page pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>Cadastro de Suco</title>
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
            <h2>Cadastro de Suco</h2>
            <form action="/sucos" method="post">
                <div class="form-group">
                    <label>Nome:</label>
                    <input type="text" class="form-control" placeholder="Preencha o nome" name="nome">
                </div>
                <div class="form-group">
                    <label>Descricao:</label>
                    <input type="text" class="form-control" placeholder="Preencha a descricao" name="descricao">
                </div>
                <div class="form-group">
                    <label>Valor:</label>
                    <input type="number" step="0.01" class="form-control" placeholder="Preencha o valor" name="valor">
                </div>
                <div class="form-group">
                    <label>Fruta:</label>
                    <input type="text" class="form-control" placeholder="Preencha qual a fruta" name="fruta">
                </div>
                <div class="form-group">
                    <label>Adicao Acucar:</label>
                    <input type="checkbox" class="form-control" placeholder="Preencha se tem adicao de acucar" name="adicaoAcucar">
                </div>
                <div class="form-group">
                    <label>Pct Suco:</label>
                    <input type="number" step="0.01" class="form-control" placeholder="Preencha a porcentagem de suco natural da fruta" name="pctSucoFruta">
                </div>
                <button type="submit" class="btn btn-default">Cadastrar</button>
            </form>
        </div>
    </c:if>
</body>
</html>
