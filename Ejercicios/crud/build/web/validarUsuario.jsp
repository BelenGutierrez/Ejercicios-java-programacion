

<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">



    <title>Cuentas Bancarias</title>

  </head>
  <body>

    <%
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/cuentasbancarias", "root", "");
      Statement s = conexion.createStatement();
      
      /// Accedo a la base de datos de los usuarios
      ResultSet usuarios = s.executeQuery("SELECT * FROM clave");

      boolean acceso = false;
      while (usuarios.next()) {
      /// Si el nombre del usuario O la contraseña no son correctos, enviame a loginError sino continua
        if ((request.getParameter("idUsuario").equals(usuarios.getString("usuario"))) &&
               (request.getParameter("passUsuario").equals(usuarios.getString("pass")))) {
          out.print("<script>document.location = \"index.jsp\"</script>");
        } 
      }
      
      if (!acceso) {
        out.print("<script>document.location = \"loginError.html\"</script>");
      }
      
      
    %>
    

      <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
      <!-- Latest compiled and minified JavaScript -->
     <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
  </body>
</html>
