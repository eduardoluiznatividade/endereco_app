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
	  <h2>Cadastramento de Usuário</h2>
	  	  
	 <form action="/usuario/incluir" method="post">
	    <div class="mb-3 mt-3">
			<label>Nome</label>
			<input type="text" class="form-control" placeholder="Entre com o seu nome" name="nome" value="${usuario.nome}">
		</div>
		
		<div class="mb-3 mt-3">
			<label>Email</label>
			<input type="text" class="form-control" placeholder="Entre com o seu email" name="email" value="${usuario.email}">
		</div>
		
		<div class="mb-3 mt-3">
			<label>Senha</label>
			<input type="text" class="form-control" placeholder="Entre com a senha" name="senha" value="${usuario.senha}">
		</div>
		
		<div class="mb-3 mt-3">
			<label>Endereço</label>
			<input type="text" class="form-control" placeholder="Entre com o seu endereço" name="endereco" value="${usuario.endereco}">
		</div>
		
		<div class="mb-3 mt-3">
			<label>Acesso</label>
			
		</div>

	    <button type="submit" class="btn btn-primary">cadastrar</button>
	 </form>
  
	</div>

</body>
</html>