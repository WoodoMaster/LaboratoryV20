<%@ page import="com.niptis.LaboratoryV20.test.entity.Greeting" %>
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
<h2> Добро пожаловать в НИИСЛА. </h2>
<h3>Научно-исследовательская и испытательная лаборатория строительной акустики и вентиляционных систем</h3>
<% //TODO заменить скриплеты на jstl
    Greeting obj = (Greeting) request.getAttribute("myMsg");
    if (obj != null) {
        String message = obj.getMessage();
%>
<h3><%
        out.print(message);
    }
%></h3>
<h3>Стандартный порядок выполнения заказа:
    <ul>
        <li><a href="MyController?command=registration">Регистрация</a> или
            <a href="MyController?command=logination">авторизация</a> на сайте;
        </li>
        <li>Заполнение заявки на выполнение работ;</li>
        <li>Согласование деталей со специалистом;</li>
        <li>Подписание договора и оплата счета;</li>
        <li>Проведение испытаний;</li>
        <li>Оформление и передача протокола;</li>
        <li>Подписание акта выполненных работ и анкеты отзыва.</li>
    </ul>
</h3>

<hr>
ул. Скорины, д. 15, 220114, г. Минск комн. 121 телефон +375 17 2955648
</body>
</html>