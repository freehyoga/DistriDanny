package model.distDanny.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.distDanny.entidades.DistMaterial;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-12-03T21:26:33")
@StaticMetamodel(DistAsignatura.class)
public class DistAsignatura_ { 

    public static volatile SingularAttribute<DistAsignatura, String> codigo;
    public static volatile CollectionAttribute<DistAsignatura, DistMaterial> distMaterialCollection;
    public static volatile SingularAttribute<DistAsignatura, String> id;
    public static volatile SingularAttribute<DistAsignatura, String> nombre;

}