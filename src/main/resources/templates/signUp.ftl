<#ftl encoding='UTF-8'>
<html>
<head>
    
</head>
<body>
<div >
    <div >
        Зарегистрируйтесь!
    </div>
    <form method="post" action="/signUp">
       <p> <label for="login">Логин
            <input  type="text" id="login" name="login">
        </label>
        </p>
        <p>
        <label for="password">Пароль
            <input type="password" id="password" name="password">
        </label>
        </p>
        <p>
            <label for="first-name">Имя
            <input  id="first-name" name="firstName">
        </label>
        </p>
        <p>
            <label for="last-name">Фамилия
            <input  id="last-name" name="lastName">
        </label>
        </p>

        <p>
            <input type="submit" value="SignUp">
        </p>
    </form>
</div>
</body>
</html>