<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Bem vindo ao nosso gerenciador de empresas!
	<br />

<c:if test="${not empty usuarioLogado }">
Você está logado como ${usuarioLogado.email}  </br>

</c:if>

	<form action="executa?tarefa=NovaEmpresa" method="post">

		<label>nome: </label> <input type="text" name="nome" /> <input
			value="adicionar" type="submit" />
	</form>

	<form action="executa" method="post">
		<input type="hidden" name="tarefa" value="Login" />
		email : <input type="email" name="email" /> senha : <input
			type="password" name="senha" /> <input type="submit" value="Login" />


	</form>

	<form action="executa" method="post">
		<input type="hidden" name="tarefa" value="Logout"/> 
		<input type="submit" value="Logout" />
	</form>
</body>
</html>