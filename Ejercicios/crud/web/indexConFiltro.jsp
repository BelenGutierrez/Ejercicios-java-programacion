

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

    <style>
      
      
      body {
        height: 50em;
        background-color: #000;
      }
      div {
        margin: 3em auto;
      }
      table, h2{
        background-color: grey;
      }
      
      h2{
        margin: 0;
        padding:40px;
      }
      
      table tr:nth-child(2n+2) {
        background-color: teal;
       
      }
       input{
        background-color: #e0ebeb;
      }
      
      nav a {
        position:  fixed;
        z-index: 2;
        top: 0.5em;
        right: 2em;
        text-align: center;
        margin: 2em 1em;
      }      
      
      nav {
        height: 6em;
        background-color: grey;
        opacity: 0.9;
        position: fixed;
        top: 0;
        left: 0;
        width: 100%;
      }
      
      div#busqueda {
        margin: 1em 1em;
      }
      div.input-group {
        margin: 0 auto;
      }
      form[action="indexConFiltro.jsp"] {
        height: 3em;
        width: 100%;
      }
      input#busqueda {
        margin: 0 auto;
        width: 40%;
      }
      </style>

  </head>
  <body>
    <nav>
      <div id="busqueda">
        <form action="indexConFiltro.jsp" method="post">
        <label class="control-label" for="busqueda">Busca el nombre de la entidad bancaria:</label>
        <div class="input-group">
          <span class="input-group-addon">
            <span class="glyphicon glyphicon-search" aria-hidden="true"></span>
          </span>
          <%
          out.println("<input type=\"text\" class=\"form-control\" id=\"busqueda\" name=\"busqueda\"" + " placeholder=\"Buscar...\">");
            %>
            
          </form>
           
        </div>   
      </div>
       <a style="margin: 2.2em 45% 0 0" class="btn btn-danger" href="index.jsp" role="button">
         <span class="glyphicon glyphicon-remove"></span> Eliminar Filtro</a> 
       <a href="login.html" class="btn btn-primary"><span class="glyphicon glyphicon-home"></span> Cerrar sesión</a><!--</button> -->
    </nav>    
    
     <div class="container">
       
      <br><br>			
      <div class="panel ">
        <div class="panel-heading text-center"><h2>Cuentas Offshore</h2></div>
          

    <%
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/cuentasbancarias", "root", "");
      Statement s = conexion.createStatement();
      
      /// Carga todas las filas en un resulset al que le llamo listado
      String consulta =( "SELECT * FROM cuenta WHERE banco LIKE '%" + request.getParameter("busqueda") + "%'");
      ResultSet listado = s.executeQuery("SELECT * FROM cuenta WHERE banco LIKE '%" + request.getParameter("busqueda") + "%'");
      out.println(consulta);
    %>
    
    <table class="table-bordered table-hover">
     
      <tr><th>Numero</th><th>Banco</th><th>Titular</th><th>Origen</th><th>Apertura</th><th>Saldo</th><th></th><th></th></tr>
      
      <form action="altaCuenta.jsp"  method="get">
        <tr>    <td><input type="text" name="numero" size="25"></td>
                  <td><input type="text" name="banco" size="25"></td>
                  <td><input type="text" name="titular" size="25"></td>
                  <td><input type="text" name="origen" size="25"></td>
                  <td><input type="text" name="apertura" size="10"></td>
                  <td><input type="text" name="saldo" size="10"></td>
                  <td><button type="submit" value="Añadir" class="btn btn-primary"><span class="glyphicon glyphicon-plus"></span> Añadir</button></td>
                  <td></td>
                    </tr>    
             </form>
     
     
      <%
            /// Comprueba los campos del listado
            while (listado.next()) {
              
              out.println("<tr><td>");
              
              out.println(listado.getString("numero") + "</td>");
        
              out.println("<td>" + listado.getString("banco") + "</td>");
             
              out.println("<td>" + listado.getString("titular") + "</td>");
            
              out.println("<td>" + listado.getString("origen") + "</td>");
           
              out.println("<td>" + listado.getString("apertura") + "</td>");
          
              out.println("<td>" + listado.getString("saldo") + "</td>");

         
            
          %>
          
         
      <td>
             <form  action="modificaCuenta.jsp" >
              <input type="hidden" name="numero" value="<%=listado.getString("numero")%>">
              <input type="hidden" name="banco" value="<%=listado.getString("banco")%>">
              <input type="hidden" name="titular" value="<%=listado.getString("titular")%>">
              <input type="hidden" name="origen" value="<%=listado.getString("origen")%>">
              <input type="hidden" name="apertura" value="<%=listado.getString("apertura")%>">
              <input type="hidden" name="saldo" value="<%=listado.getString("saldo")%>">
              <button type="submit"  class="btn btn-info"><span class="glyphicon glyphicon-pencil"></span> Modificar</button>
           </form>
          </td>
         
          
          <td>
            <form method="get" action="preguntarBaja.jsp">
              <input type="hidden" name="numero" value="<%=listado.getString("numero")%>"/>
              <button type="submit" class="btn btn-danger"><span class="glyphicon glyphicon-remove"></span> Eliminar</button>
            </form>
          </td></tr>
         
             <%
            } // while   

          
          %>
      
      
           </table>
        </div>
     </div>    
      <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
      <!-- Latest compiled and minified JavaScript -->
     <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
  </body>
</html>
