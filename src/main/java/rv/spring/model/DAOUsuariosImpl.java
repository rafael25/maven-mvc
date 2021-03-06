/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rv.spring.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import org.codehaus.jackson.map.ObjectMapper;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import rv.nomina.controllers.HibernateUtilidades;

/**
 *
 * @author T107
 */
public class DAOUsuariosImpl extends DAO {
    @Override
    public String buscar() throws IOException {
        SessionFactory factory = HibernateUtilidades.getSessionFactory();
        Session session = factory.openSession();
        Transaction trans = session.beginTransaction();
        
        Criteria cricri = session.createCriteria(Usuarios.class);
        ArrayList<Usuarios> usuarios = (ArrayList<Usuarios>) cricri.list();
        
        Map<String, ArrayList<Usuarios>> singletonMap = Collections.singletonMap("usuarios", usuarios);
        
        trans.commit();
        session.close();
        
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(singletonMap);
    }
}
