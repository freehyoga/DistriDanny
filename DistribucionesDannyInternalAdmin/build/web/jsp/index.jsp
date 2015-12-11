<%-- 
    Document   : index
    Created on : 22-feb-2015, 17:00:52
    Author     : Hector
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../jquery/jquery-ui/jquery-ui.css" rel="stylesheet" type="text/css"/>
        <link href="../css/index.css" rel="stylesheet" type="text/css"/>
        <script src="../jquery/jquery/jquery-2.1.3.js" type="text/javascript"></script>
        <script src="../jquery/jquery-ui/jquery-ui.js" type="text/javascript"></script>
        <script src="../js/index.js" type="text/javascript"></script>
        <title>Index</title>
    </head>
    <!--comentario Andres -->
    <body>
        <header> </header>
        <div id="menuDiv">
                    <ul id="menu">
                    <li class="ui-widget-header">Administracion Datos</li>
                    <li ref="ingresarMaterialDiv" class="menuItem">Administrar Material</a></li>
                    <li class="menuItem">Inventario</li>
                    <li class="menuItem">Historial</li>
                    <li class="ui-widget-header">Administracion Usuarios</li>
                    <li class="menuItem">Crear Usuario</li>
                    <li class="menuItem">Modificar Usuario</li>
                    <li class="menuItem">Consultar Usuario</li>
                    <li class="ui-widget-header">Administracion Clientes</li>
                    <li class="menuItem">Adicionar Cliente</li>
                    <li class="menuItem">Modificar Cliente</li>
                    <li class="menuItem">Consultar Cliente</li>
                    <li class="ui-widget-header">Facturacion</li>
                    <li class="menuItem">Nueva Venta</li>
                    <li class="menuItem">Historial</li>
                    </ul>
        </div>
        <div id="contentDiv">
            <div id="ingresarMaterialDiv" class="hide">
                <h3 class="align-center">INGRESAR MATERIAL</h3>
                <fieldset>
                    <table>
                        <tr>
                            <td>codigo: </td>
                            <td><input id="codigoMaterial" name="codigoMateria" type="text"/></td>
                            <td colspan="3">nombre: </td>
                            <td><input id="nombreMaterial" name="nombreMaterial" type="text"/></td>
                        </tr>
                        <tr>
                            <td>nivel: </td>
                            <td><select id="nivelSel">
                                    <option value="PA">Parvulos</option>
                                    <option value="PJ">Pre-Jardin</option>
                                    <option value="J">Jardin</option>
                                    <option value="PR">Primero</option>
                                    <option value="SE">Segundo</option>
                                    <option value="TE">Tercero</option>
                                    <option value="CU">Cuarto</option>
                                    <option value="QU">Quinto</option>
                                    <option value="SE">Sexto</option>
                                    <option value="SP">Septimo</option>
                                    <option value="OC">Octavo</option>
                                    <option value="NO">Noveno</option>
                                    <option value="DE">Decimo</option>
                                    <option value="UN">Undecimo</option>
                                    <option value="OT">Otros</option>
                                </select>
                            </td>
                            <td>Asignatura: </td>
                            <td><select id="asignaturaSel"></select></td>
                            <td>Editorial: </td>
                            <td><select id="editorialSel"></select></td>
                        </tr>
                        <tr>
                            <td>Precio Venta: </td>
                            <td><input id="precioVentaInp" type="number"/></td>
                            <td>Precio Descuento base: </td>
                            <td><input id="descuentoBaseInp" type="number"/> %</td>
                        </tr>
                        <tr>
                            <td><button class="icon-ui" id="guardarBtn">Guardar</button></td>
                            <td><button id="limpiarBtn">Limpiar</button></td>
                        </tr>
                    </table>
                </fieldset>
            </div>
            
        </div>
        <footer>
            
        </footer>
    </body>
</html>
