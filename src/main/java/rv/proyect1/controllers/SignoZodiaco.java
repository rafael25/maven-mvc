/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rv.proyect1.controllers;

/**
 *
 * @author rafael
 */
public class SignoZodiaco {
    private String nombre;
    private String horoscopo;

    public SignoZodiaco() {}

    public SignoZodiaco(String nombre, String horoscopo) {
        this.nombre = nombre;
        this.horoscopo = horoscopo;
    }

    public String getHoroscopo() {
        return horoscopo;
    }

    public void setHoroscopo(String horoscopo) {
        this.horoscopo = horoscopo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
