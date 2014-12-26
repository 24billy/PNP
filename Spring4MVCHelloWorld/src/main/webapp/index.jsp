<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="width=device-width, initial-scale=1;text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="/springmvc/resources/css/bootstrap/bootstrap.min.css" />
    <!--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">-->
    <title>Spring-MVC</title>
</head>

<body>
    <%@ include file="WEB-INF/views/common/navbar.jsp"%>
    
	<div class="container-fluid">
	
		<div class="row">
	    	<div class="col-xs-12 bg-primary">
	    		<h1 class="text-center">Hello World (h1)</h1>
	    		<h2 class="text-center">Hello World (h2)</h2>
	    		<h3 class="text-center">Hello World (h3)</h3>
	    		<h4 class="text-center">Hello World (h4)</h4>
	    		<h5 class="text-center">Hello World (h5)</h5>
	    		<h6 class="text-center">Hello World (h6)</h6>
	    	</div>
		    <div class="col-xs-12 col-sm-6 col-md-4 bg-success">
		    	<h1>區塊1</h1>
		    	<form action="hello" method="get">
			        <div class="form-group">
			            <label for="inputName">name</label>
			        	<input type="text" class="form-control" id="inputName" name="name" placeholder="input your name">
			    	</div>
				    <button type="submit" class="btn btn-success">
				    	送出
				    </button>
			    </form>            
		    </div>  
		    
		    <div class="col-xs-12 col-sm-6 col-md-4 bg-danger">
		        <h1>區塊2</h1>   
		        <ul>
		            <li><a href="helloBilly">Hello Billy</a></li>
		            <li><a href="helloRita">Hello Rita</a></li>
		            <li><a href="helloLawrence">Hello Lawrence</a></li>
		        </ul>
		    </div>
		    
            <div class="col-xs-12 col-sm-6 col-md-4 bg-info">
                <h1>區塊3</h1>
				<button type="button" class="btn btn-default">Default</button>
				<button type="button" class="btn btn-primary">Primary</button>
				<button type="button" class="btn btn-success">Success</button>
				<button type="button" class="btn btn-info">Info</button>
				<button type="button" class="btn btn-warning">Warning</button>
				<button type="button" class="btn btn-danger">Danger</button>
            </div>	      
		</div>
	
	</div>

    <%@ include file="WEB-INF/views/common/footer.jsp"%>
    
  <!-- jQuery 1.11.1 -->
  <script type="text/javascript" src="/springmvc/resources/scripts/jquery/jquery.min.js"></script>
  <!-- Bootstrap 3.3.1 -->
  <script type="text/javascript" src="/springmvc/resources/scripts/bootstrap/bootstrap.min.js"></script>     

</body>

</html>