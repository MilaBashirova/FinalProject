<html>
<head>
    <title>Products</title>
    <link href="/css/styles.css" rel="stylesheet" type="text/css">
</head>
<body>
<table>
    <tr>
        <th>Name</th>
        <th>Price</th>
    </tr>
    <#list productsFromServer as product>
        <tr>
            <td>${product.name}</td>
            <td>${product.price}</td>
        </tr>
    </#list>
</table>
</body>
</html>