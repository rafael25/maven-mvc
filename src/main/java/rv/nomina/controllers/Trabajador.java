
package rv.nomina.controllers;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author rafael25
 */
@Entity
@Table(name = "trabajador")

public class Trabajador implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_TRABAJADOR")
    private Integer idTrabajador;
    
    @Column(name = "NOMBRE")
    private String nombre;
    
    @Column(name = "PATERN")
    private String patern;
    
    @Column(name = "MATERN")
    private String matern;

    public Trabajador() {
    }

    public Trabajador(Integer idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public Trabajador(String nombre, String patern, String matern) {
        this.nombre = nombre;
        this.patern = patern;
        this.matern = matern;
    }

    public Integer getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(Integer idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPatern() {
        return patern;
    }

    public void setPatern(String patern) {
        this.patern = patern;
    }

    public String getMatern() {
        return matern;
    }

    public void setMatern(String matern) {
        this.matern = matern;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTrabajador != null ? idTrabajador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trabajador)) {
            return false;
        }
        Trabajador other = (Trabajador) object;
        if ((this.idTrabajador == null && other.idTrabajador != null) || (this.idTrabajador != null && !this.idTrabajador.equals(other.idTrabajador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rv.nomina.controllers.Trabajador[ idTrabajador=" + idTrabajador + " ]";
    }
    
}
