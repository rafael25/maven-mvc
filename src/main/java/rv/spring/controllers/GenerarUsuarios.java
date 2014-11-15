/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rv.spring.controllers;

import java.util.ArrayList;
import rv.spring.model.Direccion;
import rv.spring.model.Usuario;

/**
 *
 * @author T107
 */
public class GenerarUsuarios {
    public static ArrayList<Usuario> getUsuarios() {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        
        Direccion d1 = new Direccion("Calle uno", "Una colonia", "Mexico", 55666);
        Direccion d2 = new Direccion("Calle dos", "Una segunda colonia", "Mexico", 55676);
        Direccion d3 = new Direccion("Calle tres", "Una terera colonia", "Mexico", 55688);
        
        Usuario u1 = new Usuario("Rafael", 26, 60000, d1);
        Usuario u2 = new Usuario("Fany", 20, 80000, d2);
        Usuario u3 = new Usuario("Ana", 25, 90000, d3);
        
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u2);
        
        return usuarios;
    }
}
