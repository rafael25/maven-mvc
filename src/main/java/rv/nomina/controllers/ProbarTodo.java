/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rv.nomina.controllers;

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
        Trabajador t = new Trabajador("Rafael", "Viveros", "Badillo");
        mySession.save(t);
        
        // Paso 3: Liberamos la transaccion
        trans.commit();
        
        // Pas 4: Liberarmos la session
        mySession.close();
    }
}
