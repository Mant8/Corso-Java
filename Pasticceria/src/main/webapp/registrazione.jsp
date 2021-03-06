<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html>
	<head>
		<title>Registrazione Utente - Dolci da SBALLO! - Pasticceria</title>
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
							<p>Registrazione Utente</p>
						</header>
						<hr />
						<h2>Inserisci i tuoi dati</h2>
						<form method="post" action="Utente">
							<div class="field">
								<input type="text" name="nome" placeholder="Nome" />
							</div>
							<div class="field">
								<input type="text" name="cognome" placeholder="Cognome" />
							</div>
                            <div class="field">
								<input type="text" name="codiceFiscale" placeholder="Codice Fiscale" />
							</div>
							<ul class="actions">
								<li><input type="submit" value="Registrati!" /></li>
							</ul>
						</form>
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