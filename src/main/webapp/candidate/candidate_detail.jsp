<%@ page import="com.example.cadidate.models.Candidate" %>
<%@ page import="javax.management.relation.Role" %>
<%@ page import="com.example.cadidate.models.Experience" %><%--
  Created by IntelliJ IDEA.
  User: Kaiser-DEV
  Date: 10/27/2023
  Time: 1:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Detail</h1>
    <%
        Candidate candidate = (Candidate) request.getAttribute("candidate");
        StringBuilder listRole = new StringBuilder();
        for (Experience experience:
             candidate.getExperiences()) {
            listRole.append(experience);
        }
        System.out.println(listRole);
    %>
    <table>
        <tr>
            <td>Id</td>
            <td><%=candidate.getId()%></td>
        </tr>
        <tr>
            <td>Name</td>
            <td><%=candidate.getFullName()%></td>
        </tr>
        <tr>
            <td>Phone</td>
            <td><%=candidate.getPhone()%></td>
        </tr>
        <tr>
            <td>List Exp</td>
            <td><%=candidate.getExperiences()%></td>
        </tr>


    </table>
</body>
</html>
