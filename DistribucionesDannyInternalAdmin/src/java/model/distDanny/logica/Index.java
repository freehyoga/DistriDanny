/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.distDanny.logica;

import java.util.HashMap;
import java.util.List;
import model.distDanny.controllerJPA.MaterialJpaController;
import model.distDanny.entidades.DistAsignatura;
import model.distDanny.entidades.DistEditorial;

/**
 *
 * @author Hector
 */
public class Index {
    public HashMap cargueInicial() throws Exception{
        HashMap datosRetorno = new HashMap();
        List<DistEditorial> editoriales = this.consultarEditoriales();
        List<DistAsignatura> asignaturas = this.consultarAsignaturas();
        datosRetorno.put("editoriales", editoriales);
        datosRetorno.put("asignaturas", asignaturas);
        return datosRetorno;
    }
    
    public List<DistEditorial> consultarEditoriales() throws Exception{
         return new MaterialJpaController().getEditoriales();
    }
    
    public List<DistAsignatura> consultarAsignaturas() throws Exception{
        return new MaterialJpaController().getAsignaturas();
    }
}
