
<html>
<head>
    <title>Title</title>
    <link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body bgcolor="#B0C4DE">
<#if error??>
<div>Логин или пароль введены неверно</div>
</#if>
<form class="form-4" method="post" >
    <p>
        <label for="login">Логин</label>
        <input type="text" name="login" placeholder="Логин" required>
    </p>
    <p>
        <label for="password">Пароль</label>
        <input type="password" name='password' placeholder="Пароль" required>
    </p>

        <label for="remember-me">
        <input type="checkbox" id="remember-me" name="remember-me">Запомнить меня</label>
    <p>
        <input type="submit" value="Login">
    </p>
</form>
</body>
</html>
