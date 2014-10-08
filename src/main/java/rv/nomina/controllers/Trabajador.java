/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rv.nomina.controllers;

/**
 *
 * @author T
 */
public class Trabajador {
    private int id;
    private String nombre;
    private int horasLaboradas;
    private float sueldoBase;

    public Trabajador() {
    }

    public Trabajador(int id, String nombre, int horasLaboradas, float sueldoBase) {
        this.id = id;
        this.nombre = nombre;
        this.horasLaboradas = horasLaboradas;
        this.sueldoBase = sueldoBase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasLaboradas() {
        return horasLaboradas;
    }

    public void setHorasLaboradas(int horasLaboradas) {
        this.horasLaboradas = horasLaboradas;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
}
