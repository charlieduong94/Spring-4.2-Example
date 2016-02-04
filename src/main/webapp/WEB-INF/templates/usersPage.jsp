<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: charlie
  Date: 1/27/16
  Time: 6:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users</title>
    <link href="css/styles.css" rel="stylesheet"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"/>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.0/jquery.js" type="text/javascript"></script>
    <script src="/js/userForm.js"></script>
</head>
<body>
    <div class="content">
        <h3 class="">Users Table</h3>
        <p>
            Try adding some users to the table. If you are feeling adventurous, see if you can make the necessary changes to
            allow users to be removed from the table from this page.
        </p>
        <div class="table-wrapper">
            <table id="user-table" class="table">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Age</th>
                </tr>
                </thead>
                <tbody>
                <!-- This is how to iterate through a list using JSTL, more can be found @ http://docs.oracle.com/javaee/5/tutorial/doc/bnakd.html-->
                <c:forEach var="user" items="${users}">
                    <tr>
                        <td>
                                ${user.id}
                        </td>
                        <td>
                                ${user.name}
                        </td>
                        <td>
                                ${user.age}
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>

        <form id="createForm" class="form-inline">
            <div class="form-group">
                <label for="name">Name</label>
                <input type="text" class="form-control" id="name" placeholder="Jane Doe">
            </div>
            <div class="form-group">
                <label for="age">Age</label>
                <input type="number" min="0" class="form-control" id="age" placeholder="20">
            </div>
            <button id="createButton" class="btn btn-primary">Add User</button>
        </form>
        <p id='responseMessage'></p>
    </div>
</body>
</html>
