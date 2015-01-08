<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="width=device-width, initial-scale=1;text/html; charset=UTF-8">

    <link rel="stylesheet" type="text/css" href="/springmvc/resources/css/bootstrap/bootstrap.min.css" />
    
    <!-- jQuery 1.11.1 
    <script type="text/javascript" src="/springmvc/resources/scripts/jquery/jquery.min.js"></script>
    -->
    <!-- Bootstrap 3.3.1 
    <script type="text/javascript" src="/springmvc/resources/scripts/bootstrap/bootstrap.min.js"></script>
    -->
    <title>Spring-MVC</title>
    
    <style type="text/css">
        html { overflow-y: hidden; }
    </style>
</head>

<body class="main">
    <%@ include file="WEB-INF/views/common/navbar.jsp"%>
    
    <!-- 上下捲動箭頭 -->
    <div class="arrows" id="pageUp" style="
       position: fixed;
       left:48%;
       top: 50px;
       height: 25px;
       width:60px;
       text-align: center;
       font-size: 20px;
       z-index:1;
       display: none;
    ">
        <span class="glyphicon glyphicon-chevron-up" aria-hidden="true" ></span>
    </div>
       
    <div class="arrows" id="pageDown" style="
       position: fixed;
       left:48%;
       bottom: 60px;
       height: 25px;
       width:60px;
       text-align: center;
       font-size: 20px;
       z-index:1;
    ">
       <span class="glyphicon glyphicon-chevron-down" aria-hidden="true"></span>
    </div>
        
    <!-- header section -->
    <section id="sec0">
        <div class="container-fluid bg-primary sec">
            <div class="row">
                <div class="col-xs-12">
                    <h1>Header123</h1>
                </div>
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
    <section id="sec1">
    	<div class="container-fluid bg-success sec">
    		<div class="row">
    			<div class="col-xs-12">
    				<h1>區塊1</h1>
			    	<form action="hello" method="get">
				        <div class="form-group">
				            <label for="inputName">name</label>
				        	<input type="text" class="form-control" id="inputName" name="name" placeholder="input your name">
				    	</div>
                        <div class="form-group">
                            <label for="inputTel">tel</label>
                            <input type="number" class="form-control" id="inputTel" name="tel" placeholder="input your phoneNumber">
                        </div>
                        <div class="form-group">
                            <label for="inputFile">file</label>
                            <input type="file" class="form-control" id="inputFile" name="file"/>
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
    <section id="sec2">
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
	<section id="sec3">
		<div class="container-fluid bg-info sec">
			<div class="row">
				<div class="col-xs-12">
					<h1>區塊3</h1>
				</div>
				<div class="col-xs-12 col-sm-6 col-md-4 col-lg-3">
				    <button type="button" class="btn btn-default">Default</button>
				</div>
				<div class="col-xs-12 col-sm-6 col-md-4 col-lg-3">
				                <button type="button" class="btn btn-success">Success</button>				
				</div>
				<div class="col-xs-12 col-sm-6 col-md-4 col-lg-3">
				    <button type="button" class="btn btn-warning">Warning</button>
				</div>
				<div class="col-xs-12 col-sm-6 col-md-4 col-lg-3">
				    <button type="button" class="btn btn-danger">Danger</button>
				</div>
				<div class="col-xs-12 col-sm-6 col-md-4 col-lg-3">
				    <button type="button" class="btn btn-primary">Primary</button>
				</div>
				<div class="col-xs-12 col-sm-6 col-md-4 col-lg-3">
				    <button type="button" class="btn btn-info">Info</button>
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
	        <li class="selected">
	            <a href="#sec0" class="rapidnofollow">header</a>
	        </li>
	        <li>
	            <a href="#sec1" class="rapidnofollow">block 1</a>
	        </li>
	        <li>
	            <a href="#sec2" class="rapidnofollow">block 2</a>
	        </li>
	        <li>
	            <a href="#sec3" class="rapidnofollow">block 3</a>
	        </li>
	    </ul>
    </div>
    
    <%@ include file="WEB-INF/views/common/footer.jsp"%>
    
	     
	
	<!-- 頁面滑動(動畫) -->
	<script>
	// if there's no ad in section 0, it will be hidden from view and minSection will be 1.
	var Section = 0;
	
	$("a[href^=#]").click(function(e) { 
		 e.preventDefault(); 
		 
		 var dest = $(this).attr('href'); 
		 $('html,body').animate({ scrollTop: $(dest).offset().top }, 'slow');

		 Section = dest.substring(4,5)
		 refreshArrowsAndRightNav()
	});
	
	$(document).on('keyup', function(e) {
        var down, up, beginning, end;

        // space bar / page down, j/k, arrow keys
        if (e.keyCode) {
            down = (e.keyCode === 32 || e.keyCode === 34 || e.keyCode === 74 || e.keyCode === 40);
            up = (e.keyCode === 33 || e.keyCode === 75 || e.keyCode === 38);
            beginning = (e.keyCode === 36);
            end = (e.keyCode === 35);
            
            if(down && Section < 3) {
            	scrollDown();
                if (e.preventDefault) { 
                    e.preventDefault(); 
                } 
                else { 
                    e.returnValue = false; 
                }
                
            }
            if(up && Section > 0) {
            	scrollUp();
            	if (e.preventDefault) { 
            		e.preventDefault(); 
                } 
            	else { 
            	    e.returnValue = false; 
                }
            	 
            }
            if(beginning) {
            	Section = 0;
            	$('html,body').animate({ scrollTop: $("#sec0").offset().top }, 'slow');
            	refreshArrowsAndRightNav();
            	
            	if (e.preventDefault) { 
                    e.preventDefault(); 
                } 
                else { 
                    e.returnValue = false; 
                }
                 
            }
            if(end) {
            	Section = 3;
            	$('html,body').animate({ scrollTop: $("#sec3").offset().top }, 'slow');
            	refreshArrowsAndRightNav();
            	
                if (e.preventDefault) { 
                    e.preventDefault(); 
                } 
                else { 
                    e.returnValue = false; 
                }
                 
            }
        }
	});
	
	$("#pageDown").click(function(e) {
		scrollDown();
	});
	
	$("#pageUp").click(function(e) {
	    scrollUp();
	});
	
	function scrollDown() {
		Section = Section + 1;
        var dest = "#sec" + Section;
        
        refreshArrowsAndRightNav();
        $('html,body').animate({ scrollTop: $(dest).offset().top }, 'slow');
	};
	
	function scrollUp() {
		Section = Section - 1;
		var dest = "#sec" + Section;
		
		refreshArrowsAndRightNav();
		$('html,body').animate({ scrollTop : $(dest).offset().top }, 'slow');
	};
	
    function refreshArrowsAndRightNav(){
    	if (Section < 1) {
            $("#pageUp").hide();
	    }
        if (Section > 0 ) {
            $("#pageUp").show();
        }
	    if (Section > 0) {
            $("#pageDown").show();
	    }
        if (Section > 2 ) {
            $("#pageDown").hide();
        }
        
        removeAllSelectedClass();
        $("a[href=#sec" + Section + "]").parent().addClass("selected");
        
        function removeAllSelectedClass(){
            $(".sohp-dots-nav li").removeClass("selected");
        }
    };
	</script>
</body>

</html>