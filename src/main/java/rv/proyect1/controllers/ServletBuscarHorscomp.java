/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rv.proyect1.controllers;

import java.io.IOException;
import java.io.PrintWriter;
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
        switch (signo) {
            case 1:
                out.println("Horoscopo de Hoy:");
                out.println(" Acuario. Merece la pena gastarse un dinero en una cena si la compa��a es agradable y pasas una velada inolvidable. Tienes que hacer estas cosas m�s a menudo. Si dejas de pensar en los problemas ajenos y te concentras en los tuyos resolve.");
                break;
            case 2:
                out.println("Horoscopo de Hoy:");
                out.println("Piscis. Has cometido muchos errores a la hora de tomar decisiones importantes. Esto ha hecho que te refugies en casa para llorar las penas. Intenta salir y disfrutar del buen tiempo. Hay que ser m�s previsor. Pueden ocurrir unos cuantos");
                break;
            case 3:
                out.println("Horoscopo de Hoy:");
                out.println("Aries. La ilusi�n mueve monta�as. Est�s dispuesto a realizar m�s cambios en tu vida. Acumulas demasiadas energ�as, ahora es preciso que aprendas a utilizarlas. Tienes cualidades para generar dinero. Superar�s cualquier problema que surja.");
                break;
            case 4:
                out.println("Horoscopo de Hoy:");
                out.println("Tauro. Te encuentras en una fase de renovaci�n. No te sientes a gusto con tu cuerpo. Meditas la posibilidad de pasar por el quir�fano para hacerte unos arreglos. Presta m�s atenci�n a los cobros de tu empresa. Se te puede escapar alguna");
                break;
            case 5:
                out.println("Horoscopo de Hoy:");
                out.println("Geminis. Podr�as perder algo de dinero por tu exceso de confianza. Dejar�s que alguien maneje tus cuentas y falle con las inversiones. Es mejor que te ocupes t� de tus finanzas. Las ganas de hacer las cosas bien ser� lo esencial para que.");
                break;
            case 6:
                out.println("Horoscopo de Hoy:");
                out.println("Cancer. Tras una �poca de tensi�n ser�a adecuado que te hicieras un chequeo m�dico. Tu alimentaci�n ha cambiado considerablemente y te encuentras m�s cansado de lo habitual. Est�s harto de tu trabajo y cada vez toleras menos a tus compa�.");
                break;
            case 7:
                out.println("Horoscopo de Hoy:");
                out.println("Leo. Traza un plan para cambiar tu imagen, tu alimentaci�n, tu vida. Ha llegado el momento de afrontar el futuro con nuevas perspectivas. Eres una persona m�s independiente. Intenta explorar nuevas �reas. Pese a contar con mucha experien");
                break;
            case 8:
                out.println("Horoscopo de Hoy:");
                out.println("Virgo. Procura salir a divertirte con tus amigos en lugar de lamentarte por tus fallos. Encontrar�s en ellos el consuelo que tanto reclamas. La vida puede sorprenderte hoy. Es un buen momento para abrir un negocio. Si te decantas por una.");
                break;
            case 9:
                out.println("Horoscopo de Hoy:");
                out.println("Libra. Si quieres pasar un d�a agradable busca la compa��a de los animales. Son siempre agradecidos y chistosos. Nunca te dejar�n solo y te aportar�n mucha tranquilidad. Lo agradecer�s. Empiezas a involucrarte en nuevos proyectos. Te ade.");
                break;
            case 10:
                out.println("Horoscopo de Hoy:");
                out.println("Escorpio. Tienes unas cuantas preocupaciones en la cabeza, por eso es conveniente que establezcas una serie de prioridades en tu vida. No dejes en un segundo plano a tu familia. Escasean las ofertas laborales. Es mejor que luches por con.");
                break;
            case 11:
                out.println("Horoscopo de Hoy:");
                out.println("Sagitario. Alguien te observa desde hace tiempo. Vigila tus pasos y busca que cometas un fallo para acusarte y ponerte en evidencia ante los dem�s. Podr�a tratarse de un conocido. Intentas ser lo m�s responsable y comprometido en el trab.");
                break;
            case 12:
                out.println("Horoscopo de Hoy:");
                out.println("Capricornio. Comun�cate con claridad para que tus interlocutores puedan entenderte. Evita entrar en temas pol�micos como puede ser la pol�tica o la religi�n. Cualquier discusi�n te perjudicar�a. La situaci�n en la empresa es cada vez men.");
                break;
                
        }
    }
}