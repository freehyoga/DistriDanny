/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.distDanny.controllerJPA;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.UserTransaction;
import model.distDanny.entidades.DistAsignatura;
import model.distDanny.entidades.DistEditorial;

/**
 *
 * @author Hector
 */
public class MaterialJpaController implements Serializable {
    
    private UserTransaction utx = null;
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        emf = Persistence.createEntityManagerFactory( "DistribucionesDannyInternalAdminPU2" );
        return emf.createEntityManager();
    }
    
    public void guardarMaterial(){
        
    }
    
    public HashMap cargueInicial() throws Exception{
        HashMap datosRetorno = new HashMap();
        List<DistEditorial> editoriales = this.getEditoriales();
        List<DistAsignatura> asignaturas = this.getAsignaturas();
        datosRetorno.put("editoriales", editoriales);
        datosRetorno.put("asignaturas", asignaturas);
        return datosRetorno;
    }
    
    public List<DistAsignatura> getAsignaturas() throws Exception{
        List<DistAsignatura> asignaturasList = new ArrayList<>();
        EntityManager em = getEntityManager();
        try {
            asignaturasList = em.createNamedQuery("DistAsignatura.findAll").getResultList();
        }
        catch(Exception e){
            StringBuilder datosMetodo = new StringBuilder();
            datosMetodo.append("Clase: ");
            datosMetodo.append(this.getClass());
            datosMetodo.append(" Metodo:getAsignaturas");
            datosMetodo.append(" Error: ");
            datosMetodo.append(e);
            throw new Exception("Error al consultar las asignaturas."+datosMetodo.toString());
        }
         finally {
            em.close();
        }
        return asignaturasList;
    }
    
    public List<DistEditorial> getEditoriales() throws Exception{
        List<DistEditorial> editorialesList = new ArrayList<>();
         EntityManager em = getEntityManager();
        try {
            editorialesList = em.createNamedQuery("DistEditorial.findAll").getResultList();
        }
        catch(Exception e){
            StringBuilder datosMetodo = new StringBuilder();
            datosMetodo.append("Clase: ");
            datosMetodo.append(this.getClass());
            datosMetodo.append(" Metodo:getEditoriales");
            datosMetodo.append(" Error: ");
            datosMetodo.append(e);
            throw new Exception("Error al consultar las editoriales."+datosMetodo.toString());
        }
         finally {
            em.close();
        }
        return editorialesList;
    }
}
