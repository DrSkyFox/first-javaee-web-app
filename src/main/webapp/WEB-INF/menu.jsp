
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Menu</title>
</head>
<body>
    <c:url value="/catalog" var="catalog" />
    <c:url value="/main" var="main" />
    <c:url value="/order" var="order" />
    <c:url value="/cart" var="cart" />
    <c:url value="/product" var="product" />
    <a href="${main}" >Main</a>
    <a href="${catalog}" >Catalog</a>
    <a href="${product}" >Product</a>
    <a href="${cart}" >Cart</a>
    <a href="${order}" >Order</a>
</body>
</html>
