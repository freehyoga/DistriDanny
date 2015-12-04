/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.distDanny.entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "dist_asignatura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DistAsignatura.findAll", query = "SELECT d FROM DistAsignatura d"),
    @NamedQuery(name = "DistAsignatura.findById", query = "SELECT d FROM DistAsignatura d WHERE d.id = :id"),
    @NamedQuery(name = "DistAsignatura.findByNombre", query = "SELECT d FROM DistAsignatura d WHERE d.nombre = :nombre"),
    @NamedQuery(name = "DistAsignatura.findByCodigo", query = "SELECT d FROM DistAsignatura d WHERE d.codigo = :codigo")})
public class DistAsignatura implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODIGO")
    private String codigo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "asignaturaId")
    private Collection<DistMaterial> distMaterialCollection;

    public DistAsignatura() {
    }

    public DistAsignatura(String id) {
        this.id = id;
    }

    public DistAsignatura(String id, String nombre, String codigo) {
        this.id = id;
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
        if (!(object instanceof DistAsignatura)) {
            return false;
        }
        DistAsignatura other = (DistAsignatura) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.distDanny.entidades.DistAsignatura[ id=" + id + " ]";
    }
    
}
