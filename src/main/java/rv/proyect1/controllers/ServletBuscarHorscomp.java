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
                out.println(" Acuario. Merece la pena gastarse un dinero en una cena si la compañía es agradable y pasas una velada inolvidable. Tienes que hacer estas cosas más a menudo. Si dejas de pensar en los problemas ajenos y te concentras en los tuyos resolve.");
                break;
            case 2:
                out.println("Horoscopo de Hoy:");
                out.println("Piscis. Has cometido muchos errores a la hora de tomar decisiones importantes. Esto ha hecho que te refugies en casa para llorar las penas. Intenta salir y disfrutar del buen tiempo. Hay que ser más previsor. Pueden ocurrir unos cuantos");
                break;
            case 3:
                out.println("Horoscopo de Hoy:");
                out.println("Aries. La ilusión mueve montañas. Estás dispuesto a realizar más cambios en tu vida. Acumulas demasiadas energías, ahora es preciso que aprendas a utilizarlas. Tienes cualidades para generar dinero. Superarás cualquier problema que surja.");
                break;
            case 4:
                out.println("Horoscopo de Hoy:");
                out.println("Tauro. Te encuentras en una fase de renovación. No te sientes a gusto con tu cuerpo. Meditas la posibilidad de pasar por el quirófano para hacerte unos arreglos. Presta más atención a los cobros de tu empresa. Se te puede escapar alguna");
                break;
            case 5:
                out.println("Horoscopo de Hoy:");
                out.println("Geminis. Podrías perder algo de dinero por tu exceso de confianza. Dejarás que alguien maneje tus cuentas y falle con las inversiones. Es mejor que te ocupes tú de tus finanzas. Las ganas de hacer las cosas bien será lo esencial para que.");
                break;
            case 6:
                out.println("Horoscopo de Hoy:");
                out.println("Cancer. Tras una época de tensión sería adecuado que te hicieras un chequeo médico. Tu alimentación ha cambiado considerablemente y te encuentras más cansado de lo habitual. Estás harto de tu trabajo y cada vez toleras menos a tus compañ.");
                break;
            case 7:
                out.println("Horoscopo de Hoy:");
                out.println("Leo. Traza un plan para cambiar tu imagen, tu alimentación, tu vida. Ha llegado el momento de afrontar el futuro con nuevas perspectivas. Eres una persona más independiente. Intenta explorar nuevas áreas. Pese a contar con mucha experien");
                break;
            case 8:
                out.println("Horoscopo de Hoy:");
                out.println("Virgo. Procura salir a divertirte con tus amigos en lugar de lamentarte por tus fallos. Encontrarás en ellos el consuelo que tanto reclamas. La vida puede sorprenderte hoy. Es un buen momento para abrir un negocio. Si te decantas por una.");
                break;
            case 9:
                out.println("Horoscopo de Hoy:");
                out.println("Libra. Si quieres pasar un día agradable busca la compañía de los animales. Son siempre agradecidos y chistosos. Nunca te dejarán solo y te aportarán mucha tranquilidad. Lo agradecerás. Empiezas a involucrarte en nuevos proyectos. Te ade.");
                break;
            case 10:
                out.println("Horoscopo de Hoy:");
                out.println("Escorpio. Tienes unas cuantas preocupaciones en la cabeza, por eso es conveniente que establezcas una serie de prioridades en tu vida. No dejes en un segundo plano a tu familia. Escasean las ofertas laborales. Es mejor que luches por con.");
                break;
            case 11:
                out.println("Horoscopo de Hoy:");
                out.println("Sagitario. Alguien te observa desde hace tiempo. Vigila tus pasos y busca que cometas un fallo para acusarte y ponerte en evidencia ante los demás. Podría tratarse de un conocido. Intentas ser lo más responsable y comprometido en el trab.");
                break;
            case 12:
                out.println("Horoscopo de Hoy:");
                out.println("Capricornio. Comunícate con claridad para que tus interlocutores puedan entenderte. Evita entrar en temas polémicos como puede ser la política o la religión. Cualquier discusión te perjudicaría. La situación en la empresa es cada vez men.");
                break;
                
        }
    }
}