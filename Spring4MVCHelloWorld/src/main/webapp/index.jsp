<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="/Spring4MVCHelloWorld/src/main/webapp/resources/css/bootstrap/bootstrap.min.css" />
    <title>Spring-MVC</title>
</head>

<body>

        <h2>Hello World</h2>
        <h3>
            <form action="hello" method="get">
                <input type="text" name="name" placeholder="input your name">
                <button type="submit">送出</button>
            </form>            
        </h3>
        
        <h2>
            <a href="helloBilly">Hello Billy</a><br>
            <a href="helloRita">Hello Rita</a><br>
            <a href="helloLawrence">Hello Lawrence</a><br>
        </h2>

</body>

</html>