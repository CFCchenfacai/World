<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/css.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#mid").toggle(function(){
			$("[name='mid']").attr("checked",true);
		}
		,function(){
			$("[name='mid']").attr("checked",false);
		})
	})
		
	
	function delAll() {
		var mids=$("[name='mid']:checked").map(function(){
			return $(this).val();
		}).get().join(",");
		$.post("delAll.do",{"mid":mids},function(da){
			if(da){
				alert("批删成功");
				location.href="list.do";
			}
		})
	}
</script>
</head>
<body>
	<form action="list.do" method="post">
	电影名称<input type="text" name="mname">
	<input type="submit" value="搜索">
	</form>
	<table>
		<tr>
			<td colspan="10">
				<a href="add.jsp"><input type="button" value="影视添加"></a>
				<input type="button" value="批量删除" onclick="delAll()">
			</td>
		</tr>
		<tr>
			<td><input type="button" value="全选/全不选" id="mid" onclick="qx()"></td>
			<td>电影名称</td>
			<td>电影简介</td>
			<td>电影导演</td>
			<td>电影分类</td>
			<td>上映时间</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${page.list }" var="m">
			<tr>
				<td><input type="checkbox" name="mid" value="${m.mid }"></td>
				<td>${m.mname }</td>
				<td>${m.mdesc }</td>
				<td>${m.mautor }</td>
				<td>${m.bname }</td>
				<td>${m.mdate }</td>
				<td>
					<a href="update.jsp?mid=${m.mid }"><input type="button" value="修改"></a>
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="10">
				<a href="?pageNum=${page.pageNum-1<1?page.pageNum:page.pageNum-1 }"><input type="button" value="上一页"></a>
				<a href="?pageNum=${page.pageNum+1>page.pages?page.pageNum:page.pageNum+1 }"><input type="button" value="下一页"></a>
				${page.pageNum }/${page.pages }页
			</td>
		</tr>
	</table>
</body>
</html>