<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>设备管理信息系统</title>
<link href="style/main.css" rel="stylesheet" type="text/css" />
</head>
<!-- js.jsp的导入不能在页面的顶部，也不能在页面js下面的，因为不在作用范围内 -->
  <%@ include file="/common/js.jsp"%>
<script type="text/javascript">
    	$(function(){
		  			if(${pageNow == 1})
		  					$("#pre").attr("href","javascript:void(0)").css("color","#ccc");
		  			 if(${allPages == pageNow})
		  					$("#next").attr("href","javascript:void(0)").css("color","#ccc");
		  		});
  </script>
<body>
<table width="100%" cellpadding="0" cellspacing="0">
  <tr>
    <td>
      <table width="100%" height="269" cellpadding="0" cellspacing="0" class="table">
        <tr>
          <td valign="top">
            <table width="100%" class="top" cellpadding="0" cellspacing="0">
              <tr>
                <td>当前位置</td>
				
              </tr>
            </table>
            <form id="listForm" action="${ctx}/newsAction_list.action" method="post">
            <table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
                <tr bgcolor="#E7E7E7">
                    <td height="24" colspan="8" bgcolor="#CEDFDE">&nbsp;文档列表&nbsp;</td>
                </tr>
                <tr align="center" bgcolor="#EDF3E3" height="22">
                   
					<td width="4%">序号</td>
					<td width="15%">设备号码</td>
					<td width="10%">维修人</td>
					<td width="20%">维修日期</td>
					<td width="20%">维修费用</td>
					<td width="20%" colspan="2">操作</td>
                </tr>
                
                <c:forEach items="${nlist}" var="n" varStatus="s">
					<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22" >
					
					<td>${s.index+1}</td>
					<td>${n.deviceId}</td>
					<td>${n.repairPeople}</td>
					<td>${n.repairDate}</td>
					<td>${n.repairPrice}</td>
					<td><a href="${ctx}/repairAction_preUpdate.action?pageNow=${pageNow}&id=${n.id}">编辑</a></td>
					<td><a href="${ctx}/repairAction_delete.action?pageNow=${pageNow}&repair.id=${n.id}" onclick="if(!confirm('确定要删除吗？')) return false;">删除</a></td>
					</tr>
				</c:forEach>
                
                <tr bgcolor="#EDF3E3">
                <td height="28" colspan="4">
                    &nbsp;
                    
					
					
                </td>
                <td colspan="4">
                   <a class="coolbg">有${allCount}条信息&nbsp;&nbsp;共${allPages}页&nbsp;&nbsp;当前第${pageNow}页</a>
                   <a id="pre" href="${ctx}/repairAction_list.action?pageNow=${pageNow-1}" class="coolbg">上一页</a>
                   <a id="next" href="${ctx}/repairAction_list.action?pageNow=${pageNow+1}" class="coolbg">下一页</a>
                </td>
                </tr>
                <tr align="right" bgcolor="#CEDFDE">
                    <td height="36" colspan="8" align="center"><!--翻页代码 --></td>
                </tr>
                </table></form></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
        </tr>
      </table>
    </td>
  </tr>
</table>
</body>
</html>