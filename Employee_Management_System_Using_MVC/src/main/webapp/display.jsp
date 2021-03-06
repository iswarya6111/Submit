<%@page import= "java.util.Iterator" %>
<%@page import="com.bean.Employee" %>
<%@page import="java.util.List" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>  // prefix name can be ur wish

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Employee Details</h2>
<table border = "1">
<tr>
      <th>Id</th>
      <th>Name</th>
      <th>Salary</th>
      </tr>
      <%
      Object obj = session.getAttribute("obj");
      List<Employee> listOfEmp = (List<Employee>)obj;
      Iterator<Employee> li = listOfEmp.iterator();
      while (li.hasNext()){
    	  Employee emp = li.next();
    	  %>
    	  <tr>
    	     <td><%=emp.getId() %></td>
    	     <td><%=emp.getName() %></td>
    	     <td><%=emp.getSalary() %></td>
    	     </tr>
    	     <%
      }
      
    %>
</table>
<br/>
<h2> Employee Details-using JSTL</h2>
<table border = "1">
    <tr>
       <th>Id</th>
      <th>Name</th>
      <th>Salary</th>
      </tr>
  <core:forEach items="${sessionScope.obj }" var="emp">
     <tr>
         <td><core:out value="${emp.getId() }"></core:out></td>
          <td><core:out value="${emp.getName() }"></core:out></td>
          <td><core:out value="${emp.getSalary() }"></core:out></td>
          </tr>
          </core:forEach>
</table>
 <a href = "index.jsp">Add Employee</a>
</body>
</html>