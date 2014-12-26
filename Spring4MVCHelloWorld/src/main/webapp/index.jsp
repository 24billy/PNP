<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="width=device-width, initial-scale=1;text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="/springmvc/resources/css/bootstrap/bootstrap.min.css" />
    <!--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">-->
    <title>Spring-MVC</title>
</head>

<body class="main">
    <%@ include file="WEB-INF/views/common/navbar.jsp"%>
    
    <!-- header section -->
    <section id="header">
        <div class="container-fluid bg-primary sec">
            <div class="row">
		    	<div class="col-xs-12">
		    	    <h1 class="text-center">Hello World (h1)</h1>
                    <h2 class="text-center">Hello World (h2)</h2>
                    <h3 class="text-center">Hello World (h3)</h3>
                    <h4 class="text-center">Hello World (h4)</h4>
                    <h5 class="text-center">Hello World (h5)</h5>
                    <h6 class="text-center">Hello World (h6)</h6>
					
		      	</div>
	       </div>
	    </div>
    </section>

    <!-- section 1 -->
    <section id="first">
    	<div class="container-fluid bg-success sec">
    		<div class="row">
    			<div class="col-xs-12">
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
    		</div>
    	</div>       
    </section>

    <!-- section 2 -->
    <section id="second">
    	<div class="container-fluid bg-warning sec">
    		<div class="row">
    			<div class="col-xs-12">
    				<h1>區塊2</h1>   
			        <h1>Rita 要的圖片</h1>
                    <img src="resources/images/hunk.png" class="img-responsive" alt="" />
    			</div>
    		</div>
    	</div>
    </section>

	<!-- section 3 -->
	<section id="third">
		<div class="container-fluid bg-info sec">
			<div class="row">
				<div class="col-xs-12">
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
	</section>    	

    <!-- 右方點狀導覽列 -->
    <div class="sohp-nav sohp-right">

         <ul class="sohp-dots-nav">
             <li class="ad" style="display:none">
                 <a href="#" class="rapidnofollow">Ad</a>
             </li>
             <li>
                 <a href="#header" class="rapidnofollow">header</a>
             </li>
             <li>
                 <a href="#first" class="rapidnofollow">block 1</a>
             </li>
             <li>
                 <a href="#second" class="rapidnofollow">block2</a>
             </li>
             <li>
                 <a href="#third" class="rapidnofollow">block 3</a>
             </li>
         </ul>

     </div>

    <%@ include file="WEB-INF/views/common/footer.jsp"%>
    
  <!-- jQuery 1.11.1 -->
  <script type="text/javascript" src="/springmvc/resources/scripts/jquery/jquery.min.js"></script>
  <!-- Bootstrap 3.3.1 -->
  <script type="text/javascript" src="/springmvc/resources/scripts/bootstrap/bootstrap.min.js"></script>     
  <script>
  $("a[href^=#]").click(function(e) { 
	  e.preventDefault(); 
	  var dest = $(this).attr('href'); 
	  $('html,body').animate({ scrollTop: $(dest).offset().top }, 'slow'); 
	  });
  </script>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#down").click(function() {
				$(".img").slideDown('fast', function() {
					$(".effect").html('Slide Down Transition Complete');
				});
			});
			$("#up").click(function() {
				$(".img").slideUp('slow', function() {
					$(".effect").html('Slide Up Transition Complete');
				});
			});
		});
	</script>
</body>

</html>