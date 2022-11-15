<%@ page pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="/">App Fabrica Bebidas</a>
        </div>
        <ul class="nav navbar-nav">
            <c:if test="${not empty usuario}">
                <li <c:if test="${foco == 'usuarios'}"> class="active"</c:if>><a href="/usuarios">Usuarios</a></li>
                <li <c:if test="${foco == 'malotes'}"> class="active"</c:if>><a href="/malotes">Malotes</a></li>
                <li <c:if test="${foco == 'fabricas'}"> class="active"</c:if>><a href="/fabricas">Fabricas</a></li>
                <li <c:if test="${foco == 'bebidas'}"> class="active"</c:if>><a href="/bebidas">Bebidas</a></li>
                <li <c:if test="${foco == 'cervejas'}"> class="active"</c:if>><a href="/cervejas">Cervejas</a></li>
                <li <c:if test="${foco == 'refrigerantes'}"> class="active"</c:if>><a href="/refrigerantes">Refrigerantes</a></li>
                <li <c:if test="${foco == 'sucos'}"> class="active"</c:if>><a href="/sucos">Sucos</a></li>
            </c:if>
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <c:if test="${empty usuario}">
                <li <c:if test="${foco == 'cadastro'}"> class="active"</c:if>>
                    <a href="/usuarios/cadastrar"><span class="glyphicon glyphicon-user"></span> Cadastro</a>
                </li>
                <li <c:if test="${foco == 'acesso'}"> class="active"</c:if>>
                    <a href="/usuarios/acessar"><span class="glyphicon glyphicon-log-in"></span> Acesso</a>
                </li>
            </c:if>
            <c:if test="${not empty usuario}">
                <li><a href="/usuarios/sair"><span class="glyphicon glyphicon-log-in"></span> Sair do ${usuario.nome}</a></li>
            </c:if>
        </ul>
    </div>
</nav>
