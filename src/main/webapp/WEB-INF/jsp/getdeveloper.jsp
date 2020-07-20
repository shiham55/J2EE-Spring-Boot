<html lang="en">
<head>
  <meta charset="utf-8">

  <title>Get Developer</title>
  <meta name="description" content="J2EE form submit test">
  <meta name="author" content="Shiham">
</head>
<body>
	<form action="getdeveloper" method="post">
		<input type="text" name="id"><br>
		<input type="submit">
	</form>  
	<fieldset>
		<legend>Developer Info</legend>
		<p>${dev.id}</p>
		<p>${dev.name}</p>
		<p>${dev.tech}</p>
	</fieldset>
</body>
</html>