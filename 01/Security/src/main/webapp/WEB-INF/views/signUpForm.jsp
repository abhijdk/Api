<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 01-12-2023
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
  <h2>Signup</h2>

  <form action="processSignup" method="post" >

      <!-- Name Input -->
      <label for="name">Name:</label>
      <input type="text" id="name" name="name" ><br>

      <!-- Username Input -->
      <label for="userName">Username:</label>
      <input type="text" id="userName" name="userName" required><br>

      <!-- Password Input -->
      <label for="password">Password:</label>
      <input type="password" id="password" name="password" required><br>

      <!-- Role Dropdown -->
      <label for="role">Role:</label>
      <select id="role" name="role">
          <option value="ROLE_USER">User</option>
          <option value="ROLE_ADMIN">Admin</option>
      </select><br>

      <!-- Submit Button -->
      <input type="submit" value="Signup">

  </form>

  </body>
</html>