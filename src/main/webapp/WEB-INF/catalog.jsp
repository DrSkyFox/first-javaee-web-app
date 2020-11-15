<%--
  Created by IntelliJ IDEA.
  User: test
  Date: 15.11.2020
  Time: 22:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div class="container">
    <div class="row py-2">
        <div class="col-12">
            <a class="btn btn-primary" href="todo.html">Add Todo</a>
        </div>

        <div class="col-12">
            <table class="table table-bordered my-2">
                <thead>
                <tr>
                    <th scope="col">Id</th>
                    <th scope="col">Description</th>
                    <th scope="col">User</th>
                    <th scope="col">Target date</th>
                    <th scope="col">Actions</th>
                </tr>
                </thead>
                <tbody>


                <c:forEach var="todo" items="${requestScope.todos}">
                    <%--                <% for (ToDo todo : (List<ToDo>) request.getAttribute("todos")) { %>--%>

                    <tr>
                        <th scope="row">
                            <c:out value="${todo.id}"/>
                                <%--                        <%= todo.getId() %>--%>
                        </th>
                        <td>
                            <c:out value="${todo.description}"/>
                                <%--                        <%= todo.getDescription() %>--%>
                        </td>
                        <td>
                            Cristina
                        </td>
                        <td>
                            <c:out value="${todo.targetDate}"/>
                                <%--                        <%= todo.getTargetDate() %>--%>
                        </td>
                        <td>
                            <c:url value="/todo.html" var="todoUrl">
                                <c:param name="id" value="${todo.id}"/>
                            </c:url>
                            <a class="btn btn-success" href="${todoUrl}"><i class="fas fa-edit"></i></a>
                            <a class="btn btn-danger" href="#"><i class="far fa-trash-alt"></i></a>
                        </td>
                    </tr>

                    <%--                <% } %>--%>
                </c:forEach>

                </tbody>
            </table>
        </div>
    </div>
</div>

</body>
</html>
