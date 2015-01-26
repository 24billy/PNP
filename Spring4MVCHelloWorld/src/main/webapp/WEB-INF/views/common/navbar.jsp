<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    <!-- jQuery 1.11.1 -->
    <script type="text/javascript" src="/springmvc/resources/scripts/jquery/jquery.min.js"></script>
    <!-- Bootstrap 3.3.1 -->
    <script type="text/javascript" src="/springmvc/resources/scripts/bootstrap/bootstrap.min.js"></script>
    
    <style>
        body {
        margin-top: 35px;
        }
        
        .sec {
        padding-top: 35px;
        min-height: 600px;
        }
        .img-responsive {
		    display: block;
		    max-width: 100%;
		    width: 50%;
		    height: auto;
		}
		
		<!-- right nav -->
		.sohp-nav {
		    font-size: 16px;
		}
		.sohp-nav a.gn-signup {
		    position: relative;
		    top: -1px;
		    height: 36px;
		    text-align: center;
		    padding: 0 22px 0 21px;
		    background-color: #128fdc;
		    color: #fff;
		    border-radius: 3px;
		    border: none;
		    cursor: pointer;
		    font-weight: 600;
		    font-size: 16px;
		    line-height: 36px;
		    display: inline-block;
		    margin: 6px 5px 0 20px;
		    transition: background-color 150ms ease-in-out;
		}
		.sohp-nav a.gn-signup:hover, .sohp-nav a.gn-signup:focus {
		    background-color: #1c9be9;
		}
		.sohp-right {
		    position: fixed;
		    top: 0px;
		    right: 0px;
		    width: 40px;
		    height: 100%;
		    z-index: 2;
		}
		.sohp-dots-nav {
		    position: absolute;
		    top: 50%;
		    left: 50%;
		    list-style-type: none;
		}
				
		.sohp-dots-nav,
		.sohp-dots-nav li {
		    margin: 0px;
		    padding: 0px;
		}
		
		.sohp-dots-nav {
		    margin-left: -10px;
		    /* -ve margin, half of height */
		    margin-top: -44px;
		    z-index: 10;
		}
		
		.sohp-dots-nav li {
		    position: relative;
		    width: 17px;
		    height: 17px;
		    overflow: hidden;
		}
		
		.sohp-dots-nav li:last-of-type {
		    margin-bottom: 0px;
		    margin-top: 0px;
		}
		
		.sohp-dots-nav li a {
		    position: absolute;
		    top: 50%;
		    left: 50%;
		    width: 4px;
		    height: 4px;
		    margin: -2px 0px 0px -2px;
		    background: #ccc;
		    background: rgba(255,255,255,0.75);
		    background: rgba(0,30,62,0.75);
		    border-radius: 100%;
		    line-height: 5em; /* sneaky: hide inner text */
		    transition: all 0.1s ease-in-out;
		}
		
		.sohp-dots-nav li a:focus {
		    outline: none;
		}
		
		.sohp-dots-nav li:hover a,
		.sohp-dots-nav li.selected a {
		    width: 12px;
		    height: 12px;
		    margin: -6px 0px 0px -6px;
		    background: #fff;
		    background-color: rgba(2,223,130,0.75);
		}
		
		.sohp-dots-nav li.selected a {
		    transition: all 0.15s ease-in-out;
		}
		
		.sohp-dots-nav li:not(.selected):hover a {
		    background-color: rgba(255,255,255,0.75);
		    background-color: rgba(2,223,130,0.75);
		    width: 10px;
		    height: 10px;
		    margin: -5px 0px 0px -5px;
		}		
		
		
		.arrows span:hover {
		  color: white;
		  font-size: 30px;
		}
    </style>
    
    <!-- jQuery 1.11.1 
	<script type="text/javascript" src="/springmvc/resources/scripts/jquery/jquery.min.js"></script>
	-->
	<!-- Bootstrap 3.3.1 
	<script type="text/javascript" src="/springmvc/resources/scripts/bootstrap/bootstrap.min.js"></script>
	-->
</head>

    <nav class="navbar navbar-default navbar-fixed-top">
    
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle   ="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="<c:url value='/'/>">Pro Meritage</a>
        </div>
    
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="page-scroll"><a href="<c:url value='/#sec1'/>">Link 1<span class="sr-only">(current)</span></a></li>
                <li class="page-scroll"><a href="<c:url value='/#sec2'/>">Link 2</a></li>
                <li class="page-scroll"><a href="<c:url value='/#sec3'/>">Link 3</a></li>
            </ul>
		    <div class="nav navbar-nav navbar-right">
	             <c:if test="${!isLogin}">
		             <li class="active page-scroll">
    	                 <a id="login">Login</a>
	                 </li>
	                 <li>
                         <a id="loginByGoogle" href="<c:url value='/login/loginByGoogle'/>">Login(google)</a>
	                 </li>
	             </c:if>
	             <c:if test="${isLogin}">
                    <li class="active page-scroll">
                        <form action="login/logout" method="get">
                           <a>
                            <button class="btn btn-danger btn-lg"  type="submit">登出</button>
                           </a>
                        </form>
                    </li>
                    <li class="active page-scroll">
                        <a>Hello ${userName}</a>
                    </li>
                 </c:if>
            </div>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
      
    </nav>
    
<div id="loginModal" class="modal fade">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				<h4 class="modal-title">登入會員</h4>
			</div>
			<form action="login/login" method="get">
				<div class="modal-body">
				    <div class="input-group">
                        <span class="input-group-addon" id="basic-addon1">帳號</span>
                        <input type="text" class="form-control" name="userName" placeholder="userName" aria-describedby="basic-addon1">
                    </div>
                    <br>
				    <div class="input-group">
                        <span class="input-group-addon" id="basic-addon2">密碼</span>
                        <input type="password" class="form-control" name="password" placeholder="password" aria-describedby="basic-addon2">
                    </div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
					<button type="submit" class="btn btn-primary">登入</button>
				</div>
			</form>
		</div><!-- /.modal-content -->
	</div><!-- /.modal-dialog -->
</div><!-- /.modal -->

<script type="text/javascript">

	$('#login').on('click', function () {
		$('#loginModal').modal('show');
		$('#myInput').focus();
	})
	
</script>     
</html>
