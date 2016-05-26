package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("    <!-- Latest compiled and minified CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" integrity=\"sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    <!-- Optional theme -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css\" integrity=\"sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <title>Cuentas Bancarias</title>\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      body {\n");
      out.write("        height: 50em;\n");
      out.write("        background-color: #000;\n");
      out.write("      }\n");
      out.write("      div {\n");
      out.write("        margin: 3em auto;\n");
      out.write("      }\n");
      out.write("      table, h2{\n");
      out.write("        background-color: grey;\n");
      out.write("      }\n");
      out.write("      \n");
      out.write("      h2{\n");
      out.write("        margin: 0;\n");
      out.write("        padding:40px;\n");
      out.write("      }\n");
      out.write("      \n");
      out.write("      table tr:nth-child(2n+2) {\n");
      out.write("        background-color: teal;\n");
      out.write("       \n");
      out.write("      }\n");
      out.write("       input{\n");
      out.write("        background-color: #e0ebeb;\n");
      out.write("      }\n");
      out.write("      \n");
      out.write("      nav a {\n");
      out.write("        position:  fixed;\n");
      out.write("        z-index: 2;\n");
      out.write("        top: 0.5em;\n");
      out.write("        right: 2em;\n");
      out.write("        text-align: center;\n");
      out.write("        margin: 2em 1em;\n");
      out.write("      }      \n");
      out.write("      \n");
      out.write("      nav {\n");
      out.write("        height: 6em;\n");
      out.write("        background-color: grey;\n");
      out.write("        opacity: 0.9;\n");
      out.write("        position: fixed;\n");
      out.write("        top: 0;\n");
      out.write("        left: 0;\n");
      out.write("        width: 100%;\n");
      out.write("      }\n");
      out.write("      \n");
      out.write("      div#busqueda {\n");
      out.write("        margin: 1em 1em;\n");
      out.write("      }\n");
      out.write("      div.input-group {\n");
      out.write("        margin: 0 auto;\n");
      out.write("      }\n");
      out.write("      form[action=\"indexConFiltro.jsp\"] {\n");
      out.write("        height: 3em;\n");
      out.write("        width: 100%;\n");
      out.write("      }\n");
      out.write("      input#busqueda {\n");
      out.write("        margin: 0 auto;\n");
      out.write("        width: 40%;\n");
      out.write("      }\n");
      out.write("      </style>\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <nav>\n");
      out.write("      <div id=\"busqueda\">\n");
      out.write("        <form action=\"indexConFiltro.jsp\" method=\"post\">\n");
      out.write("        <label class=\"control-label\" for=\"busqueda\">Busca el nombre de la entidad bancaria:</label>\n");
      out.write("        <div class=\"input-group\">\n");
      out.write("          <span class=\"input-group-addon\">\n");
      out.write("            <span class=\"glyphicon glyphicon-search\" aria-hidden=\"true\"></span>\n");
      out.write("          </span>\n");
      out.write("          ");

          out.println("<input type=\"text\" class=\"form-control\" id=\"busqueda\" name=\"busqueda\"" + " placeholder=\"Buscar...\">");
            
      out.write("\n");
      out.write("            \n");
      out.write("          </form>\n");
      out.write("           \n");
      out.write("        </div>   \n");
      out.write("      </div>\n");
      out.write("       <a style=\"margin: 2.2em 45% 0 0\" class=\"btn btn-danger\" href=\"#\" role=\"button\">\n");
      out.write("         <span class=\"glyphicon glyphicon-remove\"></span> Eliminar Filtro</a> \n");
      out.write("       <a href=\"login.html\" class=\"btn btn-primary\"><span class=\"glyphicon glyphicon-home\"></span> Cerrar sesión</a><!--</button> -->\n");
      out.write("    </nav>    \n");
      out.write("    \n");
      out.write("     <div class=\"container\">\n");
      out.write("       \n");
      out.write("      <br><br>\t\t\t\n");
      out.write("      <div class=\"panel \">\n");
      out.write("        <div class=\"panel-heading text-center\"><h2>Cuentas Offshore</h2></div>\n");
      out.write("          \n");
      out.write("\n");
      out.write("    ");

      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/cuentasbancarias", "root", "");
      Statement s = conexion.createStatement();
      
      /// Carga todas las filas en un resulset al que le llamo listado
      ResultSet listado = s.executeQuery("SELECT * FROM cuenta");
    
      out.write("\n");
      out.write("    \n");
      out.write("    <table class=\"table-bordered table-hover\">\n");
      out.write("     \n");
      out.write("      <tr><th>Numero</th><th>Banco</th><th>Titular</th><th>Origen</th><th>Apertura</th><th>Saldo</th><th></th><th></th></tr>\n");
      out.write("      \n");
      out.write("      <form action=\"altaCuenta.jsp\"  method=\"get\">\n");
      out.write("        <tr>    <td><input type=\"text\" name=\"numero\" size=\"25\"></td>\n");
      out.write("                  <td><input type=\"text\" name=\"banco\" size=\"25\"></td>\n");
      out.write("                  <td><input type=\"text\" name=\"titular\" size=\"25\"></td>\n");
      out.write("                  <td><input type=\"text\" name=\"origen\" size=\"25\"></td>\n");
      out.write("                  <td><input type=\"text\" name=\"apertura\" size=\"10\"></td>\n");
      out.write("                  <td><input type=\"text\" name=\"saldo\" size=\"10\"></td>\n");
      out.write("                  <td><button type=\"submit\" value=\"Añadir\" class=\"btn btn-primary\"><span class=\"glyphicon glyphicon-plus\"></span> Añadir</button></td>\n");
      out.write("                  <td></td>\n");
      out.write("                    </tr>    \n");
      out.write("             </form>\n");
      out.write("     \n");
      out.write("     \n");
      out.write("      ");

            /// Comprueba los campos del listado
            while (listado.next()) {
              
              out.println("<tr><td>");
              
              out.println(listado.getString("numero") + "</td>");
        
              out.println("<td>" + listado.getString("banco") + "</td>");
             
              out.println("<td>" + listado.getString("titular") + "</td>");
            
              out.println("<td>" + listado.getString("origen") + "</td>");
           
              out.println("<td>" + listado.getString("apertura") + "</td>");
          
              out.println("<td>" + listado.getString("saldo") + "</td>");

         
            
          
      out.write("\n");
      out.write("          \n");
      out.write("         \n");
      out.write("      <td>\n");
      out.write("             <form  action=\"modificaCuenta.jsp\" >\n");
      out.write("              <input type=\"hidden\" name=\"numero\" value=\"");
      out.print(listado.getString("numero"));
      out.write("\">\n");
      out.write("              <input type=\"hidden\" name=\"banco\" value=\"");
      out.print(listado.getString("banco"));
      out.write("\">\n");
      out.write("              <input type=\"hidden\" name=\"titular\" value=\"");
      out.print(listado.getString("titular"));
      out.write("\">\n");
      out.write("              <input type=\"hidden\" name=\"origen\" value=\"");
      out.print(listado.getString("origen"));
      out.write("\">\n");
      out.write("              <input type=\"hidden\" name=\"apertura\" value=\"");
      out.print(listado.getString("apertura"));
      out.write("\">\n");
      out.write("              <input type=\"hidden\" name=\"saldo\" value=\"");
      out.print(listado.getString("saldo"));
      out.write("\">\n");
      out.write("              <button type=\"submit\"  class=\"btn btn-info\"><span class=\"glyphicon glyphicon-pencil\"></span> Modificar</button>\n");
      out.write("           </form>\n");
      out.write("          </td>\n");
      out.write("         \n");
      out.write("          \n");
      out.write("          <td>\n");
      out.write("            <form method=\"get\" action=\"preguntarBaja.jsp\">\n");
      out.write("              <input type=\"hidden\" name=\"numero\" value=\"");
      out.print(listado.getString("numero"));
      out.write("\"/>\n");
      out.write("              <button type=\"submit\" class=\"btn btn-danger\"><span class=\"glyphicon glyphicon-remove\"></span> Eliminar</button>\n");
      out.write("            </form>\n");
      out.write("          </td></tr>\n");
      out.write("         \n");
      out.write("             ");

            } // while   

          
          
      out.write("\n");
      out.write("      \n");
      out.write("      \n");
      out.write("           </table>\n");
      out.write("        </div>\n");
      out.write("     </div>    \n");
      out.write("      <script>window.jQuery || document.write('<script src=\"../../assets/js/vendor/jquery.min.js\"><\\/script>')</script>\n");
      out.write("      <!-- Latest compiled and minified JavaScript -->\n");
      out.write("     <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\" integrity=\"sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS\" crossorigin=\"anonymous\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
