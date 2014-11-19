/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rv.spring;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import rv.nomina.controllers.HibernateUtilidades;
import rv.spring.model.Direcciones;
import rv.spring.model.Usuarios;

/**
 *
 * @author T107
 */
public class ProbarUsuariosDirecciones {
    public static void main(String args[]) {
        SessionFactory factory = HibernateUtilidades.getSessionFactory();
        Session session = factory.openSession();
        Transaction trans = session.beginTransaction();
        
        Usuarios u = new Usuarios();
        Direcciones d = new Direcciones();
        
        d.setCalle("Mi callesita");
        d.setColonia("Mi colonia");
        d.setEstado("Mi estado de animo");
        d.setIdUsuario(u);
        
        u.setNombre("Rafael");
        u.setEdad(26);
        u.setSueldo(50000f);
        u.setDireccion(d);
        
        session.save(u);
        session.save(d);
        trans.commit();
        session.close();
    }
}
