/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rv.nomina.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonWriter;

/**
 *
 * @author T
 */
public class ServletPagarNomina extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        Nomina n = new Nomina(new Trabajador(1, "Rafael", 40, 200));
        JsonObject jsonObject = Json.createObjectBuilder()
                .add("nomina", n.pagarNomina())
                .build();
        JsonWriter jsonWritter = Json.createWriter(out);
        jsonWritter.writeObject(jsonObject);
    }
}
