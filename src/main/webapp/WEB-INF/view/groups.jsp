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
        <th>id_group</th>
        <th>group_name</th>
        <th>permission</th>
        <th>description</th>
    </tr>

    <c:forEach var="emp" items="${allGroups}">
        <tr>
            <td>${emp.id}</td>
            <td>${emp.name}</td>
            <td>${emp.permission}</td>
            <td>${emp.description}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>