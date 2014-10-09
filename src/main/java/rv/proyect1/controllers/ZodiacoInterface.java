/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rv.proyect1.controllers;

import java.util.GregorianCalendar;
/**
 *
 * @author rafael
 */
public interface ZodiacoInterface {
    public SignoZodiaco getZodiaco(GregorianCalendar fecha);
}
