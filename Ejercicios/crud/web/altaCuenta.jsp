

<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">


    <title>Alta Cuenta</title>
  </head>
  <body>
    <%
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/cuentasbancarias", "root", "");
      Statement s = conexion.createStatement();

      request.setCharacterEncoding("UTF-8");

      // Comprueba la existencia de la cuenta bancaria
      
      String consultaNumCcc = "SELECT * FROM cuenta WHERE numero LIKE '"
              + request.getParameter("numero") + "'";

      ResultSet numeroDeCuenta = s.executeQuery(consultaNumCcc);
      numeroDeCuenta.last();

      if (numeroDeCuenta.getRow() != 0) {
        out.println("Lo siento, la cuenta bancaria  "
                + request.getParameter("numero") + " ,ya existe.");
      } else {
        String insercion = "INSERT INTO cuenta VALUES (" +  " '" +request.getParameter("numero") + "' , "
                + " '" + request.getParameter("banco") + "' , "
                + " '" + request.getParameter("titular") + "' ,"
                + " '" + request.getParameter("origen") + "' ,"
                + " '" + request.getParameter("apertura") + "' ,"
                 +  Double.valueOf(request.getParameter("saldo")) + ")";
        s.execute(insercion);
       
        out.print("<script>document.location = \"index.jsp\"</script>");
      }
      
    %>
    
    <br>
    
</body>
</html>
