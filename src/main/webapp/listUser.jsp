<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table style="padding:30px" border="1px">
                        <thead>
                            <tr>
                                <th>empId</th>
                                <th>username</th>
                                <th>email</th>
                                <th>mobileNo</th>
                                 <th>address</th>
                                  <th>panNo</th>
                                   <th>city</th>
                                <th>Actions</th>
                            </tr>
                        </thead>
                        <tbody>
                            <!--   for (Todo todo: todos) {  -->
                            <c:forEach var="user" items="${userList}">

                                <tr>
                                    <td>
                                        <c:out value="${user.userId}" />
                                    </td>
                                    <td>
                                        <c:out value="${user.username}" />
                                    </td>
                                    <td>
                                        <c:out value="${user.email}" />
                                    </td>
                                    <td>
                                        <c:out value="${user.mobileNo}" />
                                    </td>
                                     <td>
                                        <c:out value="${user.address}" />
                                    </td>
                                     <td>
                                        <c:out value="${user.panNo}" />
                                    </td>
                                     <td>
                                        <c:out value="${user.city}" />
                                    </td>
                                   <td><a href="delete?id=<c:out value='${user.userId}' />">Delete</a>&nbsp;&nbsp;&nbsp;<a href="edit?id=<c:out value='${user.userId}' />">Edit</a></td>
                                    
                                </tr>
                            </c:forEach>
                            <!-- } -->
                        </tbody>

                    </table>
              
        </body>

        </html>
</body>
</html>