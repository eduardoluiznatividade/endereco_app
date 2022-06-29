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
	  <h2>Municípios</h2>
	  <hr>
	<c:if test="${not empty lista}">		
		<h4>Total de Municipios: ${lista.size()}</h4>
		  
		<table class="table table-striped">
		    <thead>
		      <tr>
		      	<th>ID</th>
		        <th>Nome</th>
		     </tr>
		    </thead>
		    <tbody>
		      <c:forEach var="m" items="${lista}">
			      <tr>
			      	<td>${m.id}</td>
			        <td>${m.nome}</td>
			     </tr>
		      </c:forEach>		      
		    </tbody>
	  	</table>
    </c:if>	  	  

	<c:if test="${empty lista}">		
	  <h4>Não existem municípios cadastrados!!!</h4>
	</c:if>

	</div>
</body>
</html>