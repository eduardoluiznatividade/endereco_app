<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AppEndereco</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">
		<h2>Cadastramento de Usuários</h2>

		<form action="/usuario/incluir" method="post">
		
			<div class="mb-3 mt-3">
				<label>Nome:</label>
				<input type="text" class="form-control"
					placeholder="Entre com o seu nome" name="nome"
					value="Eduardo">
			</div>
			<div class="mb-3 mt-3">
			<label>Email:</label>
			<input type="text" class="form-control"
					placeholder="Entre com o seu email" name="email"
					value="eduardo@email.com">
			</div>
			<div class="mb-3 mt-3">
				<label>Senha:</label> <input type="text" class="form-control"
					placeholder="Entre com a sua senha" name="senha"
					value="123">
			</div>
				
			<c:import url="/WEB-INF/jsp/endereco.jsp"></c:import>
			
			<button type="submit" class="btn btn-primary">Cadastrar</button>
			
		</form>

	</div>

</body>
</html>