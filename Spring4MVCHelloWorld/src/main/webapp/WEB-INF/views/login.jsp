<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="width=device-width, initial-scale=1;text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="/springmvc/resources/css/bootstrap/bootstrap.min.css" />
	<title>Login Success Page</title>
</head>

<body>

	<div class="container-fluid">
		<div class="text-center">
			<h1>login page</h1>
			<h1>${result}</h1>
			<form action="/springmvc/gohome" >
			   <button type="submit" class="btn btn-success" >回主頁</button>
			</form>
		</div>
			
	</div>
	
	<%@ include file="common/footer.jsp"%>

	<!-- jQuery 1.11.1 -->
	<script type="text/javascript" src="/springmvc/resources/scripts/jquery/jquery.min.js"></script>
	<!-- Bootstrap 3.3.1 -->
	<script type="text/javascript" src="/springmvc/resources/scripts/bootstrap/bootstrap.min.js"></script> 
</body>

</html>