package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"../jquery/jquery-ui/jquery-ui.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"../css/index.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"../jquery/jquery/jquery-2.1.3.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"../jquery/jquery-ui/jquery-ui.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"../js/index.js\" type=\"text/javascript\"></script>\n");
      out.write("        <title>Index</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header></header>\n");
      out.write("        <div id=\"menuDiv\">\n");
      out.write("                    <ul id=\"menu\">\n");
      out.write("                    <li class=\"ui-widget-header\">Administracion Datos</li>\n");
      out.write("                    <li ref=\"ingresarMaterialDiv\" class=\"menuItem\">Administrar Material</a></li>\n");
      out.write("                    <li class=\"menuItem\">Inventario</li>\n");
      out.write("                    <li class=\"menuItem\">Historial</li>\n");
      out.write("                    <li class=\"ui-widget-header\">Administracion Usuarios</li>\n");
      out.write("                    <li class=\"menuItem\">Crear Usuario</li>\n");
      out.write("                    <li class=\"menuItem\">Modificar Usuario</li>\n");
      out.write("                    <li class=\"menuItem\">Consultar Usuario</li>\n");
      out.write("                    <li class=\"ui-widget-header\">Administracion Clientes</li>\n");
      out.write("                    <li class=\"menuItem\">Adicionar Cliente</li>\n");
      out.write("                    <li class=\"menuItem\">Modificar Cliente</li>\n");
      out.write("                    <li class=\"menuItem\">Consultar Cliente</li>\n");
      out.write("                    <li class=\"ui-widget-header\">Facturacion</li>\n");
      out.write("                    <li class=\"menuItem\">Nueva Venta</li>\n");
      out.write("                    <li class=\"menuItem\">Historial</li>\n");
      out.write("                    </ul>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"contentDiv\">\n");
      out.write("            <div id=\"ingresarMaterialDiv\" class=\"hide\">\n");
      out.write("                <h3 class=\"align-center\">INGRESAR MATERIAL</h3>\n");
      out.write("                <fieldset>\n");
      out.write("                    <table>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>codigo: </td>\n");
      out.write("                            <td><input id=\"codigoMaterial\" name=\"codigoMateria\" type=\"text\"/></td>\n");
      out.write("                            <td colspan=\"3\">nombre: </td>\n");
      out.write("                            <td><input id=\"nombreMaterial\" name=\"nombreMaterial\" type=\"text\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>nivel: </td>\n");
      out.write("                            <td><select id=\"nivelSel\">\n");
      out.write("                                    <option value=\"PA\">Parvulos</option>\n");
      out.write("                                    <option value=\"PJ\">Pre-Jardin</option>\n");
      out.write("                                    <option value=\"J\">Jardin</option>\n");
      out.write("                                    <option value=\"PR\">Primero</option>\n");
      out.write("                                    <option value=\"SE\">Segundo</option>\n");
      out.write("                                    <option value=\"TE\">Tercero</option>\n");
      out.write("                                    <option value=\"CU\">Cuarto</option>\n");
      out.write("                                    <option value=\"QU\">Quinto</option>\n");
      out.write("                                    <option value=\"SE\">Sexto</option>\n");
      out.write("                                    <option value=\"SP\">Septimo</option>\n");
      out.write("                                    <option value=\"OC\">Octavo</option>\n");
      out.write("                                    <option value=\"NO\">Noveno</option>\n");
      out.write("                                    <option value=\"DE\">Decimo</option>\n");
      out.write("                                    <option value=\"UN\">Undecimo</option>\n");
      out.write("                                    <option value=\"OT\">Otros</option>\n");
      out.write("                                </select>\n");
      out.write("                            </td>\n");
      out.write("                            <td>Asignatura: </td>\n");
      out.write("                            <td><select id=\"asignaturaSel\"></select></td>\n");
      out.write("                            <td>Editorial: </td>\n");
      out.write("                            <td><select id=\"editorialSel\"></select></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Precio Venta: </td>\n");
      out.write("                            <td><input id=\"precioVentaInp\" type=\"number\"/></td>\n");
      out.write("                            <td>Precio Descuento base: </td>\n");
      out.write("                            <td><input id=\"descuentoBaseInp\" type=\"number\"/> %</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><button class=\"icon-ui\" id=\"guardarBtn\">Guardar</button></td>\n");
      out.write("                            <td><button id=\"limpiarBtn\">Limpiar</button></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </fieldset>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <footer>\n");
      out.write("            \n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
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
