<%@ page isELIgnored="false" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
  	<link rel="stylesheet" type="text/css" href="css/jquery-ui-1.10.2.custom.min.css" />
  	<script type="text/javascript" src="js/jquery-1.9.1.js"></script>
  	<script type="text/javascript" src="js/jquery-ui-1.10.2.custom.min.js"></script>
  	<script type="text/javascript" src="js/webbox.js"></script>
  	<style type="text/css">
  		body {
  			font-family:"Arial", "Helvetica", sans-serif;
  			margin:0px;
  			padding:0px;
  		}
  		.logo {
  			font-family: "Arial Black", "Arial Bold", Gadget, sans-serif;
  			font-size:22pt;
  			float:left;
  			width:120px;
  			color:#680148;
  		}
  		.box_holder {
  			float:left;
  			width:100%;
  		}
  		.box {
  			width:100%;
  			height:30pt;
  			padding:4px;
  			font-size:16pt;
  			padding-left:7px;
  		}
  		.box:focus {
  			border: 2px solid #680148;
  		}
  		.header {
  			padding:15px;
  		}
  		.msg_holder {
  			font-size:10pt;
  		}
  		.iframe_holder {
  			width:100%;
  			height:100%;
  		}
  		.iframe {
  			width:100%;
  			height:100%;
  			border:0px;
  			border-top:1px solid #ccc;
  		}
  		.url {
  			font-size:10pt;
  			padding: 5px 16px 5px 16px;
  			text-align: right;
  		}
  		
  		.url span {
  			border: 1px solid #680148;
  			padding: 0px 3px 1px 3px;
  		}
  	</style>
  </head>
  <body>
<%--     <p><spring:message code="hello"/>.</p> --%>
    <div class="header">
    	<div class="box_holder"><input type="text" id="box" class="box"/></div>
    	<div class="msg_holder">[message]</div>
    </div>
    <div class="content">
    	<div class="url"><span>http://diacritice.opa.ro</span></div>
    	<div class="iframe_holder">
	    	<iframe src="http://diacritice.opa.ro" class="iframe"></iframe>
    	</div>
    </div>
  </body>
</html>