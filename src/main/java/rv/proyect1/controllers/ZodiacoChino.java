/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rv.proyect1.controllers;

import java.util.GregorianCalendar;
import java.util.ArrayList;

/**
 *
 * @author rafael
 */
public class ZodiacoChino implements ZodiacoInterface {
    ArrayList<SignoZodiaco> signos;

    public ZodiacoChino() {
        signos = new ArrayList();
        signos.add(new SignoZodiaco("", "", ""));
    }

    public SignoZodiaco getZodiaco(GregorianCalendar fecha) {
        return new SignoZodiaco("chino","Dragón", "Los que han nacido en 1904, 1916, 1928, 1940, 1952, 1964, 1976, 1988, 2000Tendrás mucha suerte este año, acabarás con éxito muchos proyectos que tenías abiertos. Es un año que vas a ver realizados los sueños que creías imposibles.\n" +
"\n" +
"La pareja será un apoyo muy importante en tu vida, no olvides todo lo que te ha ayudado y ha estado a tu lado apoyándote en todo momento.\n" +
"\n" +
"Amor:\n" +
"\n" +
"Estarás más centrado en aspectos laborales. No descuides a tu pareja y encuentra un equilibrio entre tu relación y los demás aspectos de tu vida.\n" +
"Si no tienes pareja tampoco será una prioridad encontrarla. Preferirás el éxito económico o laboral antes que ponerte a buscar a tu media naranja. Si se presenta, ¡no le dejes escapar!\n" +
"Principios de año es una época muy buena para encontrar el amor y empezar una nueva relación. Desprenderás mucha energía positiva y tu atractivo personal te permitirá conquistar una persona especial que va a aparecer en tu vida.\n" +
"Mayo, la clave para entenderte con tu pareja es la comunicación. No entres en bucle con problemas pasados y transmítele tus miedos y preocupaciones.\n" +
"Verano, es la estación de las reconciliaciones, deja atrás los problemas y tu relación de pareja se verá reforzada.\n" +
"A finales de año el amor se encuentra en su punto álgido, los problemas pertenecen al pasado, así que no escarbes en ellos y disfruta del buen momento que vais a vivir.\n" +
"\n" +
"Trabajo:\n" +
"\n" +
"Es un buen año para invertir, estarás rodeado de personas inteligentes que te asesorarán de la mejor manera ayudándote a lograr tus objetivos. Es el momento de asumir más riesgo, no retrases el momento y se el primero en lanzarte en ese proyecto que llevas tiempo pensando. No dejes que se te adelanten.\n" +
"\n" +
"Dinero:\n" +
"\n" +
"No vas a tener problemas de dinero, pero intenta ampliar tus fuentes de ingresos y no las concentres en una sola. Este año tendrás muchas posibilidades de ganar dinero, vas a tener la estabilidad económica que llevas tiempo buscando.\n" +
"\n" +
"Salud:\n" +
"\n" +
"Concédete tiempo para ti y no estés tan estresado, intenta salir a caminar a la montaña para relajarte y no estar todo el día encerrado en casa sin moverte, con estar en el trabajo tienes suficiente. Para controlar tu aparato circulatorio no tomes muchas grasas. Cuida el sueño para remitir los dolores de cabeza que a menudo sueles padecer. Pide vitaminas a tu médico para remitir el cansancio.\n" +
"\n" +
"El Consejo de este Año: Aleja la apatía y realiza todas las tareas que tienes pendientes, verás resultados a tu esfuerzo ");
    }
}
