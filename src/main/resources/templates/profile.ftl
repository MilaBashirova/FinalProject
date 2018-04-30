<#ftl encoding='UTF-8'>
<html>
<head>
</head>
<body>
<div >${user.firstName}</div>
<div >${user.lastName}</div>
<#if userAdmin??>
<a href="/functions">Функции</a>
</#if>
<a href="/products">Товары</a>
<p><a href="/logout">Выход</a></p>

</body>
</html>