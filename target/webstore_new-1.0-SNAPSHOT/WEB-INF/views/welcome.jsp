<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <title>Welcome</title>
</head>
<body>
<section>
    <div class="jumbotron">
        <div class="container">
            <h1>${intro}</h1>
            <h1>${greeting}</h1>
            <p> ${tagline} </p>
            <p> ${country}</p> <br>
            <p>
                <a href=" <spring:url value="/market/customers" /> " class="btn btn-primary">
                    View Customers
                </a>

                <a href=" <spring:url value="/webstore/market/products" /> " class = "btn btn-primary">View Products</a>
            </p>
        </div>
    </div>
</section>
</body>
</html>