/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.distDanny.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Hector
 */
@Entity
@Table(name = "dist_material")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DistMaterial.findAll", query = "SELECT d FROM DistMaterial d"),
    @NamedQuery(name = "DistMaterial.findById", query = "SELECT d FROM DistMaterial d WHERE d.id = :id"),
    @NamedQuery(name = "DistMaterial.findByCodigo", query = "SELECT d FROM DistMaterial d WHERE d.codigo = :codigo"),
    @NamedQuery(name = "DistMaterial.findByNombre", query = "SELECT d FROM DistMaterial d WHERE d.nombre = :nombre"),
    @NamedQuery(name = "DistMaterial.findByPrecio", query = "SELECT d FROM DistMaterial d WHERE d.precio = :precio"),
    @NamedQuery(name = "DistMaterial.findByDescuento", query = "SELECT d FROM DistMaterial d WHERE d.descuento = :descuento")})
public class DistMaterial implements Serializable {
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
    @Size(min = 1, max = 50)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRECIO")
    private int precio;
    @Column(name = "DESCUENTO")
    private Integer descuento;
    @JoinColumn(name = "ASIGNATURA_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private DistAsignatura asignaturaId;
    @JoinColumn(name = "EDITORIAL_ID", referencedColumnName = "ID")
    @ManyToOne
    private DistEditorial editorialId;

    public DistMaterial() {
    }

    public DistMaterial(String id) {
        this.id = id;
    }

    public DistMaterial(String id, int codigo, String nombre, int precio) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Integer getDescuento() {
        return descuento;
    }

    public void setDescuento(Integer descuento) {
        this.descuento = descuento;
    }

    public DistAsignatura getAsignaturaId() {
        return asignaturaId;
    }

    public void setAsignaturaId(DistAsignatura asignaturaId) {
        this.asignaturaId = asignaturaId;
    }

    public DistEditorial getEditorialId() {
        return editorialId;
    }

    public void setEditorialId(DistEditorial editorialId) {
        this.editorialId = editorialId;
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
        if (!(object instanceof DistMaterial)) {
            return false;
        }
        DistMaterial other = (DistMaterial) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.distDanny.entidades.DistMaterial[ id=" + id + " ]";
    }
    
}
