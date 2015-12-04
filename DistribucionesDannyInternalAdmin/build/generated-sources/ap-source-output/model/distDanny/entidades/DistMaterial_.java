package model.distDanny.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.distDanny.entidades.DistAsignatura;
import model.distDanny.entidades.DistEditorial;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-12-03T21:26:33")
@StaticMetamodel(DistMaterial.class)
public class DistMaterial_ { 

    public static volatile SingularAttribute<DistMaterial, Integer> codigo;
    public static volatile SingularAttribute<DistMaterial, Integer> precio;
    public static volatile SingularAttribute<DistMaterial, DistEditorial> editorialId;
    public static volatile SingularAttribute<DistMaterial, Integer> descuento;
    public static volatile SingularAttribute<DistMaterial, DistAsignatura> asignaturaId;
    public static volatile SingularAttribute<DistMaterial, String> id;
    public static volatile SingularAttribute<DistMaterial, String> nombre;

}