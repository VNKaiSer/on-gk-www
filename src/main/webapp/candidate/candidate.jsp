<%@ page import="java.util.List" %>
<%@ page import="com.example.cadidate.models.Candidate" %><%--
  Created by IntelliJ IDEA.
  User: Kaiser-DEV
  Date: 10/27/2023
  Time: 1:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Candidate</title>
</head>
<body>
    <h1>List Candidate</h1>
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
                int i = 1;
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
            %>

        </tbody>
    </table>

</body>
</html>
