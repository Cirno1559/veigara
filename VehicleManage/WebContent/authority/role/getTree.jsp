<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>权限信息</title>
<%@ include file="../../sales-plugin/common/admin-common-head.jsp" %>
<%@ include file="../../sales-plugin/common/common.jsp" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/sales-plugin/ztree/css/zTreeStyle/zTreeStyle.css"> 
<script src="${pageContext.request.contextPath}/sales-plugin/ztree/js/jquery-1.4.4.min.js"></script>
<script src="${pageContext.request.contextPath}/sales-plugin/ztree/js/jquery.ztree.all.min.js"></script>
<script src="${pageContext.request.contextPath}/sales-plugin/ztree/js/jquery.ztree.core.js"></script>

<script src="${pageContext.request.contextPath}/sales-plugin/ztree/js/jquery.ztree.excheck.js"></script>

<script type="text/javascript">
      var arr = new Array();  
       
        var setting={
        		
        		view: {
        		    dblClickExpand: true,//双击节点时，是否自动展开父节点的标识
        		    showLine: true,//是否显示节点之间的连线
        		    fontCss:{'color':'black','font-weight':'bold'},//字体样式函数
        		    selectedMulti: true //设置是否允许同时选中多个节点
        		  },
        		check: {
        			enable: true,
        			chkStyle: "checkbox",
        			chkboxType: { "Y": "p", "N": "s" }
        		},
        		async:{
        			enable:true,
        			url:"${pageContext.request.contextPath}/authority/getMenuTree.do"
        		},
        		callback:{       			
        		
        			//根据id 自动选中
        			 onAsyncSuccess: function onAsyncSuccess(event, treeId, treeNode, msg) {  
        				
        				 var zTree = $.fn.zTree.getZTreeObj("treeNode"); 
        				  var list=$("#rolelist").val();
      				 	<!--切割字符串-->
      				 	if(list!=null){
      				 	 var li= list.substring(1,list.length-1);
       				  var ss = li.toString().split(",")
       				  for (var i = 0; i < ss.length; i++) {
       					  var node = zTree.getNodeByParam("id",ss[i], null);
       					  zTree.checkNode(node, true, false, true);
       					  zTree.expandNode(node, true ,true,true,false);//展开
						}
      				 	}
        				 
        				
        		        } 
        		//获取点击的菜单id
        		
        		}
        		
        }      
	$(document).ready(function(){
	    zTreeObj = $.fn.zTree.init($("#treeNode"), setting);
	    <!--提交权限-->
		    $("#submit").click( function (e,treeId,treeNode){
		    	 var treeObj=$.fn.zTree.getZTreeObj("treeNode");
		            nodes=treeObj.getCheckedNodes(true);
		            var arr1 = new Array();
		    		 
		            for(var i=0;i<nodes.length;i++){
		           	var id =nodes[i].id;
		           	arr1.push(id);
		            //alert(nodes[i].id); //获取选中节点的值
		            }
		            var roleId = $.trim($("#roleId").val());
		            var data1 = {"roleId":roleId,"list": arr1};
		            $.ajax({
			               type: "POST",
			               url: "${pageContext.request.contextPath}/authority/keep.do?time="+new Date(),
			               data: data1,
			               success: function (msg) {
			                   if (msg == "success") {
			                	   layer.alert('权限修改成功',function(index, layero){		                		    
			                		   layer.close(index);
			                		   window.location.href="roleQuery.do";   
			                	   });
			                	   
			               		}else if (msg == "fail") {
			               			layer.alert('权限修改失败',function(index, layero){		                		    
				                		   layer.close(index)});
				                      
				                   }
			                		 		                    
			                   }	              
			           });    
		    });
		    <!--关闭窗口-->
		    $("#close").click(function(){
		    	layer.closeAll();
		    })
		 });
</script>
</head>
<body>

<ul id="treeNode" class="ztree"></ul>
		<!-- 获取roleid -->
		<input type="hidden" style="height: 36px;" value="${roleId }" id="roleId" />
		<!--获取权限menuId 集合  -->
		<input type="hidden" style="height: 36px;" value="${list }" id="rolelist" />
		
	 <div class="probtn_box clearfix col-lg-6" style=" margin-top: 70px;margin-left: 50px">	
		<!-- <!-- <input type="button" value="保存" class="btn blue_btn submit" id="submit">		 
		<input type="button" value="返回" class="btn blue_btn " id="close" > --> 
		<button type="button" class="btn btn-default btn-warning" id="submit">保存</button>
		<button type="button" class="btn btn-default btn-success" id="close">返回</button>
	</div>
	
</body>
</html>