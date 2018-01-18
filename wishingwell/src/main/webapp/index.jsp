<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en"><head>
  <meta charset="UTF-8">
  <title>Wishing Well Home</title>
  <link rel="stylesheet" href="static/index.css">
</head>
<body>
<h2 align="center">Welcome to Wishing Well - The place where you can make your dream come true!</h2>
<c:if test="${sessionScope.username != null }">
	<p style="text-align:right;"><a href="logout">Logout</a></p>
</c:if>
<div style="margin-left:400px;">

<a href="latestWishList">See the latest wishes...</a> <br>
<a href="wishList">Check my wishes...</a>
<form action="addWish" method="POST">
<table>
	<tr>
		<td><input type="text" name = "content" placeholder="Type your wish here..." style="padding-right: 50px!important;width: 480px!important;" /></td>
		<td>
		   <input type = "submit" value = "Wish!"/>
		</td>
	</tr>
</table>
</form>
</div>

<div id="root">
	<div style="width: 400px; margin: 100px auto;">
		<span class="ant-calendar-picker"><div><input readonly="" value="" placeholder="请选择日期" class="ant-calendar-picker-input ant-input"><span class="ant-calendar-picker-icon">
		</span>
	</div>
</span>
<div style="margin-top: 20px;">当前日期：</div>
</div>
</div>

<script type="text/javascript" src="static/common.js"></script>
<script type="text/javascript" src="static/index.js"></script>

</body></html>
