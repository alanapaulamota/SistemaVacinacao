<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="css/estilocadusuario.css">
<link rel="stylesheet" href="font-awesome/css/fontawesome.min.css">
<link rel="shortcut icon" type="image/x-icon" href="img/7785zegotao.ico">

<title>Cadastro</title>
</head>

<body>
	<!--Navbar da P?gina-->
	<nav class="navbar navbar-expand-lg navbar-dark justify-content-end"
		style="height: 80px; background-color: #39bcb6;">
		<!--Imagem Logo SNV-->
		<!--<a class="navbar-brand" href="#">
        <img src="img/zegotao.png" width="35" height="80" alt="Logo SNV" title="Logo SNV">
      </a>-->
		<form method="POST" modelAttribute="userForm" class="form-signin">

			<!--navbar-->
			<div class="nav justify-content-end" id="navbarSite">
				<ul class="nav justify-content-end ">

					<!--Sobre-->
					<li class="nav-item">
						<button class="btn fa fa-question-circle"
							style="background-color: #39bcb6; color: black; font-size: 1.25em; padding: 10px;">
							<a href="sobre.html" style="color: #ffff; font-family: arial;">
								Sobre</a>
						</button>
					</li>

					<!--Contate-nos-->
					<li class="nav-item">
						<button class="btn fa fa-phone-square"
							style="background-color: #39bcb6; color: black; font-size: 1.25em; padding: 10px;">
							<a href="faleconosco.html"
								style="color: #ffff; font-family: arial;"> Contate-nos</a>
						</button>
					</li>
				</ul>
			</div>
	</nav>

	<!-- Corpo -->
	<br>
	<br>

	<div class="container-fluid" style="width: 90%">
		<div class="row">
			<div class="col-md-12 ">
				<h1>Cadastro</h1>
				<br>
				<div class="formsix-pos">
					<div class="form-group">
						<input type="text" class="form-control" required="" id="cadnome"
							placeholder="Nome Completo" style="font-family: arial">
					</div>
				</div>

				<form>
					<div class="form-row">
						<div class="col">
							<input type="text" class="form-control" placeholder="E-mail"
								style="font-family: arial">
						</div>
						<div class="col">
							<input type="text" class="form-control" placeholder="Telefone"
								style="font-family: arial">
						</div>
					</div>
				</form>

				<br>

				<form>
					<div class="form-row">
						<div class="col">
							<input type="text" class="form-control" placeholder="CPF"
								style="font-family: arial">
						</div>
						<div class="col">
							<input type="text" class="form-control" placeholder="RG"
								style="font-family: arial">
						</div>
					</div>
				</form>

				<br>

				<form>
					<div class="form-row">
						<div class="col">
							<input type="text" class="form-control"
								placeholder="Data de Nascimento" style="font-family: arial">
						</div>
						<div class="col">
							<input type="text" class="form-control" placeholder="Sexo"
								style="font-family: arial">
						</div>
					</div>
				</form>

				<br>

				<form>
					<div class="form-row">
						<div class="col">
							<input type="text" class="form-control" placeholder="Endere?o"
								style="font-family: arial">
						</div>
						<div class="col">
							<input type="text" class="form-control" placeholder="Complemento"
								style="font-family: arial">
						</div>
					</div>
				</form>

				<br>

				<form>
					<div class="form-row">
						<div class="col">
							<input type="text" class="form-control" placeholder="CEP"
								style="font-family: arial">
						</div>
						<div class="col">
							<input type="text" class="form-control" placeholder="Cart?o SUS"
								style="font-family: arial">
						</div>
					</div>
				</form>

				<br>

				<form>
					<div class="form-row">
						<div class="col">
							<input type="text" class="form-control" placeholder="Nome da M?e"
								style="font-family: arial">
						</div>
						<div class="col">
							<input type="text" class="form-control" placeholder="Nome do Pai"
								style="font-family: arial">
						</div>
					</div>
				</form>

				<br>

				<form>
					<div class="form-row">
						<div class="col">
							<input type="text" class="form-control" placeholder="Senha"
								style="font-family: arial">
						</div>
						<div class="col">
							<input type="text" class="form-control"
								placeholder="Confirme sua Senha" style="font-family: arial">
						</div>
					</div>

					<br>

					<button type="button" class="btn btn-primary btn-lg"
						style="background-color: #4E598F; border: transparent;">Salvar</button>
				</form>


			</div>
		</div>
	</div>

	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<!-- Rodap?-->
	<div class="container-fluid pt-3 navbar-fixed-bottom"
		id="container-rodape" style="background-color: #39bcb6; color: white">
		<div class="row">
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12"
				style="font-size: 13px; text-align: center">
				<p>SNV 2021 ? Todos os direitos reservados</p>
			</div>
		</div>
	</div>

	<!--
    <footer id="rodape" style=" background-color: #39bcb6; color: white">
        <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" style="font-size: 13px; text-align: center">
         <p>SNV 2021 ? Todos os direitos reservados</p>
        </div>
    </footer> -->

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
		integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
		integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
		crossorigin="anonymous"></script>
	<script src="https://use.fontawesome.com/62e43a72a9.js"></script>
</body>
</html>