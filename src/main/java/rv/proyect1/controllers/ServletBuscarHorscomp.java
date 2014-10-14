/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rv.proyect1.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonWriter;

/**
 *
 * @author T
 */
public class ServletBuscarHorscomp extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        int year = 1900;
        int mes = 0;
        int dia = 1;
        try {
            year = Integer.parseInt(request.getParameter("year"));
            mes = Integer.parseInt(request.getParameter("mes"));
            dia = Integer.parseInt(request.getParameter("dia"));
        } catch (NumberFormatException e) {
        } catch (Exception e) {
        }
        
        GregorianCalendar fecha = new GregorianCalendar(year, mes-1, dia);
        
        ArrayList<SignoZodiaco> signos = new ArrayList();
        
        Pitonisa pitonisas[] = new Pitonisa[3];
        pitonisas[0] = new Pitonisa(new ZodiacoGriego());
        pitonisas[1] = new Pitonisa(new ZodiacoMaya());
        pitonisas[2] = new Pitonisa(new ZodiacoChino());
        
        for (Pitonisa p : pitonisas) {
            signos.add(p.getZodiaco(fecha));
        }
        
        JsonObjectBuilder jsonBuilder = Json.createObjectBuilder();
        JsonObjectBuilder zodiacosBuilder = Json.createObjectBuilder();
        
        for (SignoZodiaco z : signos) {
            zodiacosBuilder.add(z.getTipo(), Json.createObjectBuilder()
                .add("nombre", z.getNombre())
                .add("horoscopo", z.getHoroscopo())
                .build());
        }
        
        JsonObject json = jsonBuilder.add("zodiacos", zodiacosBuilder.build()).build();
        JsonWriter writer = Json.createWriter(out);
        writer.writeObject(json);
    }
}
