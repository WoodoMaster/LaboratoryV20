<%@ page import="com.niptis.LaboratoryV20.test.entity.Greeting" %>
<%@ page contentType="text/html;charset=utf-8" %>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html>
<html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Вход в личный кабинет</title>
</head>
<body background="img/city1.jpg">

<h1>Для входа в личный кабинет введите логин и пароль</h1>
<%
    String loginationInfo =(String) request.getParameter("loginationInfo");
    if (loginationInfo!=null) {
%>
<h2>
    <%
            out.print("Ошибка входа, повторите попытку"); }
    %>
</h2>
<form action = "Controller" method="post">
Логин:
<input type = "text" name = "login" value =""/>
<hr>
Пароль:
<input type = "text" name = "password" value =""/>
<hr>
<input type="hidden" name = "command" value = "login">
<input type="submit" value="Login" />
</form>

<h3>Back to 
<a href="MyController?command=main">main page</a>  </h3>
</body>
</html>