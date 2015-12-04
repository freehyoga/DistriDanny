/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.distDanny.entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Hector
 */
@Entity
@Table(name = "dist_editorial")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DistEditorial.findAll", query = "SELECT d FROM DistEditorial d"),
    @NamedQuery(name = "DistEditorial.findById", query = "SELECT d FROM DistEditorial d WHERE d.id = :id"),
    @NamedQuery(name = "DistEditorial.findByCodigo", query = "SELECT d FROM DistEditorial d WHERE d.codigo = :codigo"),
    @NamedQuery(name = "DistEditorial.findByNombre", query = "SELECT d FROM DistEditorial d WHERE d.nombre = :nombre")})
public class DistEditorial implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO")
    private int codigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "NOMBRE")
    private String nombre;
    @OneToMany(mappedBy = "editorialId")
    private Collection<DistMaterial> distMaterialCollection;

    public DistEditorial() {
    }

    public DistEditorial(String id) {
        this.id = id;
    }

    public DistEditorial(String id, int codigo, String nombre) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public Collection<DistMaterial> getDistMaterialCollection() {
        return distMaterialCollection;
    }

    public void setDistMaterialCollection(Collection<DistMaterial> distMaterialCollection) {
        this.distMaterialCollection = distMaterialCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DistEditorial)) {
            return false;
        }
        DistEditorial other = (DistEditorial) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.distDanny.entidades.DistEditorial[ id=" + id + " ]";
    }
    
}
