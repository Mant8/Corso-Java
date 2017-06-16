<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html>
	<head>
		<title>Crea il tuo Ordine - Dolci da SBALLO! - Pasticceria</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<!--[if lte IE 8]><script src="assets/js/html5shiv.js"></script><![endif]-->
		<link rel="stylesheet" href="assets/css/main.css" />
		<!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
		<!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
		<noscript><link rel="stylesheet" href="assets/css/noscript.css" /></noscript>
	</head>
	<body class="is-loading">

		<!-- Wrapper -->
			<div id="wrapper">

				<!-- Main -->
					<section id="main">
						<header>
							<span class="avatar"><img src="images/avatar.jpg" alt="" /></span>
							<h1>Gestione Pasticceria</h1>
							<p>Crea il tuo Ordine</p>
						</header>
						
						<%
						List<String> listaIngredienti = (ArrayList<String>) request.getAttribute("listaIngredienti");
						if(!"0".equals((String)request.getAttribute("stato"))){
						%>
						<hr />
						<h2>Seleziona l'ingrediente dei desideri</h2>
						<form method="post" action="Ordine">
							<select name="ingrediente">
							<%
								for (String s : listaIngredienti) {
							%>
							<div class="field">
									<option name="<%=s%>">
										<%=s%>
									</option>
							</div>
							<%
								}
							%>
                            </select>
                            <input type="hidden" name="stato" value="0">
							<ul class="actions">
								<li><input type="submit" value="Entra" /></li>
							</ul>
						</form>
						
						<%
						}						
						if(!"1".equals((String)request.getAttribute("stato"))){
						List<String> listaDolci = (ArrayList<String>) request.getAttribute("listaDolci");
						%>
						<hr />
						<h2>Seleziona il tipo di dolce</h2>
						<form method="post" action="Ordine">
							<select name="tipo">
							<%
								for (String s : listaDolci) {
							%>
							<div class="field">
									<option name="<%=s%>">
										<%=s%>
									</option>
							</div>
							<%
								}
							%>
                            </select>
                            <input type="hidden" name="stato" value="1">
							<ul class="actions">
								<li><input type="submit" value="Entra" /></li>
							</ul>
						</form>
						<%
						}						
						if(!"2".equals((String)request.getAttribute("stato"))){
						%>
						<hr />
                        <h2>Insersci le quantità</h2>
						<form method="post" action="Ordine">
							<div class="field">
								<input type="text" name="grammi" placeholder="Grammi" />
							</div>
 								<input type="hidden" name="stato" value="2">
							<ul class="actions">
								<li><input type="submit" value="Entra" /></li>
							</ul>
						</form>
						<%
							}
						%>
						<hr />
<!-- Footer -->
					<footer id="footer">
						<ul class="copyright">
							<li>&copy; Porco Dio</li>
						</ul>
					</footer>

			</div>

		<!-- Scripts -->
			<!--[if lte IE 8]><script src="assets/js/respond.min.js"></script><![endif]-->
			<script>
				if ('addEventListener' in window) {
					window.addEventListener('load', function() { document.body.className = document.body.className.replace(/\bis-loading\b/, ''); });
					document.body.className += (navigator.userAgent.match(/(MSIE|rv:11\.0)/) ? ' is-ie' : '');
				}
			</script>

	</body>
</html>