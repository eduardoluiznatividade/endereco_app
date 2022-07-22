<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="/app">AppEndereco</a>
    </div>
    <ul class="nav navbar-nav">
    	<li class="active">
      		<a href="/">Home</a>
      	</li>
      	<c:if test="${not empty user}">
      		<li class="active">
      			<a href="/enderecos">Endereço</a>
      		</li>
      		  	<li class="active">
      		<a href="/estados">Estados</a>
      	</li>
      	</c:if>
       	<c:if test="${not empty user}">
      		<li class="active">
      			<a href="/logout">Logout</a>
      		</li>
      	</c:if>
     	<c:if test="${empty user}">
      		<li class="active">
	      		<a href="/usuario">Signup</a>
	      	</li>
	      	<li class="active">
      			<a href="/login">Login</a>
      		</li>
      	</c:if>
     </ul>
  </div>
</nav>