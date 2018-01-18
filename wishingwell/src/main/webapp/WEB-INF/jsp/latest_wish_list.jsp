<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<title>latest_wish_list</title>
</head>
<body>
<br>
See what wishes out there? > >
<table>
	<thead>
		<tr>
			<th nowrap="nowrap" width="3%">编号</th>
			<th nowrap="nowrap" width="8%">内容</th>
			<th nowrap="nowrap" width="8%">账号ID</th>
			<th nowrap="nowrap" width="8%">账号</th>
			<th nowrap="nowrap" width="8%">创建时间</th>
			<th nowrap="nowrap" width="8%">修改时间</th>
		</tr>
	</thead>
	<c:if test="${empty wishList}">
		<tr><td colspan="6">无数据</td></tr>
	</c:if>
	<c:forEach items="${wishList }" var="item" varStatus="vs">
		<tr>
			<td nowrap="nowrap" align="center">
				${vs.index+1 }
			</td>
			<td nowrap="nowrap" align="center" title="${item.content }">
				${item.content }
			</td>
			<td nowrap="nowrap" align="center" title="${item.accountId }">
				${item.accountId }
			</td>
			<td nowrap="nowrap" align="center" title="${item.account }">
				${item.account }
			</td>
			<td nowrap="nowrap" align="center" title="${item.createTime }">
				${item.createTime }
			</td>
			<td nowrap="nowrap" align="center" title="${item.updateTime }">
				${item.updateTime }
			</td>
		</tr>
	</c:forEach>
</table>
<a href="index.jsp">Home</a>
</body>
</html>