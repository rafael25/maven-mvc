/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rv.spring.model;

/**
 *
 * @author T107
 */
public class Direccion {
    private String calle;
    private String colonia;
    private String estado;
    private long cp;

    public Direccion() {
    }

    public Direccion(String calle, String colonia, String estado, long cp) {
        this.calle = calle;
        this.colonia = colonia;
        this.estado = estado;
        this.cp = cp;
    }

    public long getCp() {
        return cp;
    }

    public void setCp(long cp) {
        this.cp = cp;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", colonia=" + colonia + ", estado=" + estado + ", cp=" + cp + '}';
    }
}
