<html>

<head>
	<title>Teste</title>
</head>

<body>
<h2>Hello World!</h2>
<form>
	Idade <input type="number" name="idade">
	<button>Calcular</button>
</form>
<%
//Inicio do Scriplet.
String idadeString = request.getParameter("idade");

int idade = idadeString == null ? 0 : Integer.parseInt(idadeString);

if (idade != 0) {
	if (idade < 18) {
		
%>

	<h3><%=idade%> De menor! Bro.</h3>
<%

	}else{	
%>
	<h3><%out.print(idade) %> De maior! Bro.</h3>
<%
	}
}
%>
</body>
</html>
