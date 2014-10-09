/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rv.proyect1.controllers;

import java.util.GregorianCalendar;
import java.util.ArrayList;

/**
 *
 * @author rafael
 */
public class ZodiacoChino implements ZodiacoInterface {
    ArrayList<SignoZodiaco> signos;

    public ZodiacoChino() {
        signos = new ArrayList();
        signos.add(new SignoZodiaco("", ""));
    }

    public SignoZodiaco getZodiaco(GregorianCalendar fecha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
