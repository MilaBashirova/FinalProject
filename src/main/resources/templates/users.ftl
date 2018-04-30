<html>
<head>
    <title>Title</title>
    <link href="/css/styles.css" rel="stylesheet" type="text/css">
</head>
<body>
<p>Пользователи</p>
<table>
    <tr>
        <th>Фамилия</th>
        <th>Имя</th>
    </tr>
    <#list usersFromServer as user>
        <tr>
            <td>${user.lastName}</td>
            <td>${user.firstName}</td>
        </tr>
    </#list>
</table>
<a href="/addProducts">Добавить продукт</a>
</body>
</html>