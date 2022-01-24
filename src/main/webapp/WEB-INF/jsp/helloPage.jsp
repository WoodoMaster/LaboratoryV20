<%@ page contentType="text/html;charset=utf-8" %>
<?xml version="1.0" encoding="UTF-8" ?>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type"
          content="text/html; charset=utf-8">
    <title>"NIILSA" Construction lab</title>
</head>

<body background="img/city1.jpg">
<h3>Welcome to "NIILSA" - accredited constructing laboratory</h3>
<c:set var="message" scope="page" value="${2*2000}"/>
<c:out value="${message}"/>


<hr>
<form action="MyController" method="get">
    <input type="hidden" name="command" value="logination">
    <input type="submit" value="Login Page"/>
</form>
<hr>
<hl>
    <a href="MyController?command=logination">Login</a>

    <h3>If you are new user, go to
        <hr>
        <form action="MyController" method="get">
            <input type="hidden" name="command" value="registration">
            <input type="submit" value="Registration page"/>
        </form>
        <hr>
        <a href="MyController?command=registration">Registration page</a></h3>
    </hl>
</body>
</html>