<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/21/2021
  Time: 7:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new employee</title>
</head>
<body>
<h1>Employee form create</h1>
<form action="/employee/create" method="post">
    <div>
        Id <input type="text" name="id">
    </div>
    <div>
        Fullname <input type="text" name="fullName">
    </div>
    <div>
        Birthday <input type="text" name="birthDay">
    </div>
    <div>
        Position <input type="text" name="position">
    </div>
    <div>
        Department <input type="text" name="department">
    </div>
    <div>
        Email <input type="text" name="email">
    </div>
    <div>
        <input type="submit" value="Submit">
        <input type="reset" value="Reset">
    </div>
</form>
</body>
</html>
