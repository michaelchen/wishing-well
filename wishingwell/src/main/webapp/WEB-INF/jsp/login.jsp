<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Wishing Well Login</title>
   </head>

   <body>
   	<div style="margin-left:600px;">
      <h2>Login</h2>
       <h5>${sessionScope.message}</h5>
      <form:form method = "POST" action = "/wishingwell/login">
         <table>
            <tr>
               <td><form:label path = "account">Account</form:label></td>
               <td><form:input path = "account" /></td>
            </tr>
            <tr>
               <td><form:label path = "password">Password</form:label></td>
               <td><form:input path = "password" /></td>
            </tr>
            <tr>
               <td>
                  <input type = "submit" value = "Login"/>
               </td>
               <td>
                  <a href="register">Register</a>
               </td>
            </tr>
         </table>  
      </form:form>
   	</div>
</body>
</html>