package model.distDanny.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.distDanny.entidades.DistMaterial;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-12-03T21:26:33")
@StaticMetamodel(DistEditorial.class)
public class DistEditorial_ { 

    public static volatile SingularAttribute<DistEditorial, Integer> codigo;
    public static volatile CollectionAttribute<DistEditorial, DistMaterial> distMaterialCollection;
    public static volatile SingularAttribute<DistEditorial, String> id;
    public static volatile SingularAttribute<DistEditorial, String> nombre;

}