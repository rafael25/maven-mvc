/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rv.proyect1.controllers;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author rafael
 */
public class ZodiacoGriego implements ZodiacoInterface {
    ArrayList<SignoZodiaco> signos;

    public ZodiacoGriego() {
        signos = new ArrayList();
        signos.add(new SignoZodiaco("","Acuario", ""));
    }

    public SignoZodiaco getZodiaco(GregorianCalendar fecha) {
        return new SignoZodiaco("griego","Libra", "Libra 2014: La vida social será clave para los Libra en el año 2014. Les influirá en su vida profesional y en la evolución y el progreso de sus finanzas.\n" +
"\n" +
"Establecerán contactos laborales muy interesantes, para su trabajo al mismo tiempo que se divierten y se relacionan. La familia, el hogar, las propiedades acaparan su atención todo el año. Su pareja será la llave, para sobrellevar todo esto.\n" +
"\n" +
"El año 2014 estará lleno de retos para los Libra, pero después de lo que han vivido y tenido que afrontar desde 2011, ya están preparados para afrontarlo mental y físicamente a la perfección. Es un milagro que sigan sanos y cuerdos. Les esperan cosas preciosas este año y se lo han ganado.\n" +
"\n" +
"En el trabajo les espera un ascenso y grandes recompensas de aquí hasta el 16 de Julio. Los estudiantes sacarán buenos resultados y les reconocerán el esfuerzo.\n" +
"\n" +
"Con el dinero sigue sin irles demasiado bien, al igual que el año pasado. Saturno sigue estando en su casa de la Economía y necesita reestructurar y organizar sus finanzas.\n" +
"\n" +
"Si quieren sentirse bien, cuídense porque la salud no será muy buena. Descansen, relájense y si no se encuentran bien, vayan al médico.\n" +
"\n" +
"Lo que más les va a interesar este año es: su profesión, sus amigos, sus actividades, la economía, el hogar, la familia, la salud, el amor, las relaciones de pareja, el cuidado de su imagen y su cuerpo y la diversión.\n" +
"\n" +
"Sus logros más importantes en 2014 estarán relacionados con: su cuerpo y su imagen, la economía, la diversión y los placeres, los amigos y su carrera profesional. ");
    }
    
}
