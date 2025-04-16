<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<%@page import="com.DB.*"%>
<%@page import="com.dao.*"%>
<%@page import="com.entity.*"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Job - Job Portal</title>
<link rel="stylesheet" href="components/all_css.jsp">
<style>
body {
	background-color: #181818;
	color: #fff;
	margin: 0;
	padding: 0;
	overflow-x: hidden;
	min-height: 120vh;
}

.content {
	padding: 30px;
	margin: 0 auto;
	width: 80vw;
	min-height: 85vh;
}

.headingText {
	margin-bottom: 15px;
	margin-top: 0;
	color: #ffc107;
	text-align: center;
}

.job-details {
	background-color: #262626;
	padding: 40px;
	border-radius: 10px;
	box-shadow: 0px 4px 8px rgba(255, 255, 255, 0.2);
	margin-bottom: 30px;
}

.job-field {
	margin-bottom: 15px;
}

.job-field label {
	display: inline-block;
	width: 120px;
	font-weight: bold;
}

.job-field span {
	display: inline-block;
	color: #d4d4d4;
}

.jobTitle {
	color: #ffc107;
}

.buttons {
	margin-top: 20px;
}

.buttons button {
	padding: 10px 20px;
	margin-right: 10px;
	background-color: #0056b0;
	border: none;
	border-radius: 5px;
	color: #fff;
	cursor: pointer;
	transition: background-color 0.3s ease;
	font-size: 16px;
}

.buttons .edit:hover {
	background-color: blue;
}

.buttons .delete:hover {
	background-color: red;
}

footer {
	position: relative;
	bottom: 0px;
}
</style>
</head>
<body>

	<%@include file="components/navbar.jsp"%>

	<div class="content">
		<h1 class="headingText">Job Details</h1>

		<%
		JobDAO dao = new JobDAO(DBConnect.getConn());
		List<Jobs> list = dao.getAllJobs();
		for (Jobs j : list) {
		%>
		 
	                      <div class="card mt-2">
                           <div class="card-body">
                               <div class="text-center text-primary">
                                   <i class="far fa-clipboard fa-2x"></i>
                               </div>
                               
                               
                               
                               
                               
                              <h6><%=j.getTitle() %></h6>
                               <p><%=j.getDescription() %></p>
                               <br>
                               <div class="form-row">
                                <div class="form-group col-md-3">
                                   <input type="text" class="form-control form-control-sm"
                                          value="Location:<%=j.getLocation() %>" readonly>
                               </div> 
                                <div class="form-group col-md-3">
                                   <input type="text" class="form-control form-control-sm"
                                          value="Category:<%=j.getCategory() %>" readonly>
                               </div>
                                   
                                <div class="form-group col-md-3">
                                   <input type="text" class="form-control form-control-sm"
                                          value="Status:<%=j.getStatus() %>" readonly>
                               </div>
                            </div>
                              <h6>
                              Publish Date:
                               <%=j.getPdate() %></h6>
                                <div class=" text-center ">
                                    <a href="edit.jsp?id=<%=j.getId() %>"
                                     class="btn-sm bg-success text-white">Edit</a> 
                                     
                                    <a href="delete?id=<%=j.getId() %>"
                                     class="btn-sm bg-danger text-white">Delete</a> 
                               </div>
                           </div>
                        </div>
		<%
		}
		%>

	</div>

	<%@ include file="components/footer.jsp"%>
</body>
</html>
