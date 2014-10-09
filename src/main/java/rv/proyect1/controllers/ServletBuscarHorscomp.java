/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rv.proyect1.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        int signo = Integer.parseInt(request.getParameter("signo"));
        GregorianCalendar fecha = new GregorianCalendar(1988, 10, 15);
        
        ArrayList<SignoZodiaco> signos = new ArrayList();
        
        ZodiacoInterface griego = new ZodiacoGriego();
        ZodiacoInterface maya = new ZodiacoMaya();
        ZodiacoInterface chino = new ZodiacoChino();
        
        signos.add(griego.getZodiaco(fecha));
        signos.add(maya.getZodiaco(fecha));
        signos.add(chino.getZodiaco(fecha));
    }
}