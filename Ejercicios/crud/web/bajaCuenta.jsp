



<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Baja Cuenta</title>
  </head>
  <body>
    <%
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/cuentasbancarias","root", "");
      Statement s = conexion.createStatement();

      s.execute ("DELETE FROM cuenta WHERE numero LIKE  '" + request.getParameter("numero") + "'");
      
      out.print("<script>document.location = \"index.jsp\"</script>");
    %>	
    
  </body>
</html>
