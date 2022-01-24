<%@ page contentType="text/html;charset=utf-8" %>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html>
<html>
<head>
    <title>Личный кабинет</title>
</head>
<body bgcolor="#c0c0c0" background="img/logo1.jpeg">

<%
    String email = (String) request.getParameter("email");
    String reginfo = (String) request.getParameter("registrationInfo");
    String loginationInfo =(String) request.getParameter("loginationInfo");
if (reginfo!=null) {
%>
<h2>
    <%
            out.print("Регистрация прошла успешно! На ваш электронный адрес "
                    + email +" направлено письмо с подтверждением.");
        } else if(loginationInfo.equals("ok")){
             out.print("Вход в личный кабинет выполнен успешно");
        }
    %>
</h2>
<h3>Вернутся на
    <a href="MyController?command=main">главную страницу</a></h3>

</body>
</html>