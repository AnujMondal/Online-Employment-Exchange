<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<footer class="footer">

<style>


.footer{
	/* border: 2px solid red; */
	position: relative;
	bottom: 0px;
	width: 100vw;
	height: 250px;
	left: 0px;
}

.container-footer {
	display: flex;
	justify-content: center;
	align-items: center;
	flex-wrap: wrap;
	padding: 10px;
	height: 100%;
	width: 100%;
	background-color: #1a1a2e;
	bottom: 0px;
}

.footer-content {
	display: flex;
	gap: 120px;
	flex: 1;
	height: 70%;
	width: 100%;
	align-items: center;
	justify-content: center; 
}

.quick-links ul {
	list-style: none;
	padding-left: 0;
}

.quick-links a {
	color: gray;
	text-decoration: none;
	transition: color 0.3s ease;
}

.quick-links a:hover {
	color: #ffcc29;
}

.additional-info p {
	font-size: 14px;
}

/* Copyright section */
.copyright {
	margin-top: 20px;
	text-align: center;
	font-size: 14px;
	flex-basis: 100%;
}
</style>
	<div class="container-footer">
		<div class="footer-content">
			<div class="quick-links">
				<h3>Quick Links</h3>
				<ul>
					<li><a href="#">About Us</a></li>
					<li><a href="#">Contact Us</a></li>
					<li><a href="#">Terms and Conditions</a></li>
					<li><a href="#">Privacy Policy</a></li>
				</ul>
			</div>
			<div class="additional-info">
				<h3>Additional Information</h3>
				<p>Welcome to Job Portal, your gateway to career opportunities. Explore, apply, and 
                                connect with your dream jobs effortlessly. Join us today and shape your future!"</p>
			</div>
		</div>
		<div class="copyright">
			<p>&copy; 2024 Employment Exchange Application. Design and developed with <span style="color: red"> ❤</span> by Nandini and team!</p>
		</div>
	</div>
</footer>
