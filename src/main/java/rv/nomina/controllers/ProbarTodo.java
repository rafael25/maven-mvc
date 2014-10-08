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
public class ProbarTodo {
    public static void main(String args[]) {
        Nomina n = new Nomina(new Trabajador(1, "Rafael", 40, 200));
        n.pagarNomina();
    }
}
