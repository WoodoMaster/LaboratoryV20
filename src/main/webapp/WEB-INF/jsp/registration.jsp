<%@ page import="com.niptis.LaboratoryV20.test.entity.Greeting" %>
<%@ page contentType="text/html;charset=utf-8" %>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html>
<html>
<head>
    <title>"NIILSA" Construction lab</title>
</head>
<body bgcolor="#c0c0c0" background="img/city1.jpg">
<%
    String errorMsg = (String) request.getAttribute("errorMessage");
    if (errorMsg != null) {
%>
<h2>
    <%
            out.print(errorMsg);
        }
    %>
</h2>
<%
    Greeting obj = (Greeting) request.getAttribute("myMsg");
    if (obj != null) {
        String message = obj.getMessage();

%>
<h2>
    <%
            out.print(message);
        }
    %>
</h2>
<h2>
    Заполните форму:</h2>

<form action="Controller" method="post">
    Логин :
    <input type="text" name="login" value=""/>
    <hr>
    Почта :
    <input type="text" name="email" value=""/>
    <hr>
    Пароль:
    <input type="text" name="password" value=""/>
    <hr>
    Для завершения регистрации нажмите
    <input type="hidden" name="command" value="register">
    <input type="submit" value="Далее"/>
</form>
<hr>
<h3>Вернутся на
    <a href="MyController?command=main">главную страницу</a></h3>
</body>
</html>