<%@ page import="com.example.cadidate.models.Candidate" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Kaiser-DEV
  Date: 10/27/2023
  Time: 10:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Report 1</title>
</head>
<body>
    <h1> REPORT 1</h1>
    <br>
    <form method="post">
        <label for="role"> Roles
            <select id="role" name="role">
                <option name="ADMINSTRATION" value="0">ADMINSTRATION</option>
                <option name="STAFF" value="1">STAFF</option>
                <option name="MANAGER" value="2">MANAGER</option>
                <option name="EXCUTIVE" value="3">EXCUTIVE</option>
            </select>
        </label>
        <button type="submit">View</button>
    </form>

    <div>
        <h1>List Candidate By Role</h1>
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

    </div>




</body>
</html>
