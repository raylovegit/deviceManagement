<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    
    <title>欢迎光临设备管理信息系统</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" language="javascript" src="${ctx}/js/jquery.js"></script>
<script type="text/javascript" language="javascript" src="${ctx}/js/jquery.treeview.js" ></script>
<link rel="stylesheet" href="${ctx}/css/jquery.treeview.css" />
<link rel="stylesheet" href="${ctx}/css/screen.css" />
<script type="text/javascript">
$(document).ready(function()
{
	//slides the element with class "menu_body" when paragraph with class "menu_head" is clicked 
	$("#firstpane p.menu_head").click(function()
    {
		$(this).next("div.menu_body").slideToggle(300).siblings("div.menu_body").slideUp("slow");
	});
		$(".red").treeview({
			animated: "fast",
			collapsed: true,
			unique: true,
			toggle: function() {
				window.console && console.log("%o was toggled", this);
			}
		});
});
</script>
<style type="text/css">
body {
	margin: 10px auto;
	font: 75%/120% Verdana,Arial, Helvetica, sans-serif;
}
.menu_list {	
	width: 160px;
}
.menu_head {
	cursor: pointer;
	position: relative;
	margin:1px;
    font-weight:bold;
    background: #eef4d3 url(images/menu3.gif) no-repeat;

}
.menu_body {
	display:none;
	padding: 1em;
}
.menu_body a{
  display:block;
  color:#006699;
  padding-left:10px;
  text-decoration:none;
}
.menu_body a:hover{
  color: #000000;
  text-decoration:underline;
  }
  
.menu_head{
	width: 160px;
	height:25px;
	border: 1px solid #ccc;
	margin: 0px;
	display:block;
	text-align:center;
	line-height:25px;
	}
	
.menu_head:link, .menu_head:visited {
	color: #888;
	display: block;
	background: url(images/menu3.gif);
	}
	
.menu_head:hover, .menu_head:active {
	color: #283A50;
	background: url(images/menu3.gif) 0 -26px;
	}
</style>
  </head>
  
  <body>
  <div style="float:left"> <!--This is the first division of left-->
  <div id="firstpane" class="menu_list"> <!--Code for menu starts here-->
	<p class="menu_head">基本信息管理</p>
		<div class="menu_body">
            <ul class="red">
            <li><span>设备管理</span>
            <ul>
            <li><span><a href="${ctx}/deviceAction_list.action" target="main">设备信息列表</a></span></li>
            <li><span><a href="${ctx}/deviceAction_preCreate.action" target="main">添加新设备</a></span></li>
            </ul></li>
            
            <li><span>设备维修管理</span>
            <ul>
            <li><span><a href="${ctx}/repairAction_list.action" target="main">维修信息列表</a></span></li>
            <li><span><a href="${ctx}/repairAction_preCreate.action" target="main">添加维修设备</a></span></li>
            </ul></li>
            </ul>
		</div>
		
     
		
  </div>  <!--Code for menu ends here-->
</div>
  </body>
</html>
