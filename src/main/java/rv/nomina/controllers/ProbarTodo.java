/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rv.nomina.controllers;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author T
 */
public class ProbarTodo {
    public static void main(String args[]) {
        // Paso 1: Abrir SessionFactory
        SessionFactory factory = HibernateUtilidades.getSessionFactory();
        Session mySession = factory.openSession();
        
        // Paso 2: Empezar una transaccion
        Transaction trans = mySession.beginTransaction();
        Trabajador t1 = new Trabajador("Rafael", "Viveros", "Badillo");
        mySession.save(t1);
        
        Trabajador t2 = new Trabajador(2, "Estefania", "Ortiz", "Navarrete");
        mySession.update(t2);
        
        ArrayList<Trabajador> todos = (ArrayList<Trabajador>) mySession.createCriteria(Trabajador.class).list();
        
        for (Trabajador t : todos) {
            System.out.println(t);
        }
        
        // Paso 3: Liberamos la transaccion
        trans.commit();
        
        // Pas 4: Liberarmos la session
        mySession.close();
    }
}
