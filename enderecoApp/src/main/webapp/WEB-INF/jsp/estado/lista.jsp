<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AppEndereco</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
	  <h2>Estados</h2>
	  <hr>
	<c:if test="${not empty lista}">		
		<h4>Total de Estados: ${lista.size()}</h4>
		  
		<table class="table table-striped">
		    <thead>
		      <tr>
		      	<th>UF</th>
		        <th>Nome</th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>
		      <c:forEach var="e" items="${lista}">
			      <tr>
			      	<td>${e.sigla}</td>
			        <td>${e.nome}</td>
			        <td><a href="/estado/${e.id}/municipios">Listar municípios</a></td>
			      </tr>
		      </c:forEach>		      
		    </tbody>
	  	</table>
    </c:if>	  	  

	<c:if test="${empty lista}">		
	  <h4>Não existem estados cadastrados!!!</h4>
	</c:if>

	</div>
</body>
</html>