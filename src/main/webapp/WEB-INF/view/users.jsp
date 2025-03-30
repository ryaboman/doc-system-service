<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<h2>Все пользователи</h2>
<br>
<table>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Login</th>
    </tr>

    <c:forEach var="emp" items="${allUsers}">
        <tr>
            <td>${emp.name}</td>
            <td>${emp.surname}</td>
            <td>${emp.login}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>