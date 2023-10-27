<%@ page import="com.example.cadidate.models.Candidate" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Kaiser-DEV
  Date: 10/28/2023
  Time: 1:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Report 2</title>
</head>
<body>
<h1>List Candidate Has Email</h1>
<table>
    <thead>
    <tr>
        <td>Id</td>
        <td>Full Name</td>
        <td>Phone</td>
        <td>Email</td>
        <td>Detail</td>
    </tr>
    </thead>
    <tbody>
    <%
        List<Candidate> candidates = (List<Candidate>)request.getAttribute("candidates");
        if (candidates != null) {
            for (Candidate can:
                    candidates) {
    %>

    <tr>
        <td><%=can.getId()%></td>
        <td><%=can.getFullName()%></td>
        <td><%=can.getPhone()%></td>
        <td><%=can.getEmail()%></td>
        <td><a href="page?action=detail-candidate&id=<%=can.getId()%>">See Detail</a></td>
    </tr>
    <%
            }
        }
    %>

    </tbody>
</table>
</body>
</html>
