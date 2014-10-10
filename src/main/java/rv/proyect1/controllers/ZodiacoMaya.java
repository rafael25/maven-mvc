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
public class ZodiacoMaya implements ZodiacoInterface {
    ArrayList<SignoZodiaco> signos;

    public ZodiacoMaya() {
        signos = new ArrayList();
        signos.add(new SignoZodiaco("","", ""));
    }

    public SignoZodiaco getZodiaco(GregorianCalendar fecha) {
        return new SignoZodiaco("maya","Venado", "KEH – VENADO\n" +
"(20 de septiembre a 17 de octubre)\n" +
"\n" +
"Características generales\n" +
"\n" +
"Dentro del horóscopo maya, las personas que poseen la mayor sensibilidad son los venados. Han nacido para amar profundamente y recibir mucho amor. Les encanta la paz y la armonía.\n" +
"Les encantan los momentos de cariño, amor, ternura. Son personas con mucho sentimentalismo, por eso requieren de un medio donde se sientan a gusto. No son para nada agresivos ni violentos, en su vida no existen esas palabras. Para ellos la vida es maravillosa y esta llena de caminos nuevos, hasta que se demuestre lo opuesto. Poseen mucha sinceridad y por supuesto les gusta rodearse de gente que sea igual a ellos.\n" +
"Son extremadamente sensuales. A través de su mirada se puede ver toda la ternura que poseen. Con ella seducen muchísimo y es imposible no mirarlos, atrapan a primera vista. Afortunadamente todas las metas que se ponen, las cumplen. Lo realizan todo tan despacito y armónico que nadie se toma el atrevimiento a decir la palabra NO, para no lastimarlos. Suelen ser muy inocentes y compran con esa actitud.\n" +
"\n" +
"Trabajo\n" +
"\n" +
"Tienen una veta artística inmensa. Sus mejores profesiones podrían ir relacionadas con esta veta. Triunfarían como escultores, pintores, poetas, diseñadores etc. Indistintamente de la ocupación que tengan, siempre la realizan como mucha creatividad e imaginación porque lo rutinario los destruye. El trabajo administrativo lo mataría, pero si por razones de la vida lo tienen que realizar, se adaptara de tal manera de poder crear un clima tan ameno y distinto cada día que nunca será una rutina aburrida.\n" +
"\n" +
"Amor\n" +
"\n" +
"En el ámbito amoroso, este animal es sumamente romántico y amoroso. Se puede decir que es un aspecto muy importante en su vida. Tiende a vivir profundamente el amor como el de las películas que presentan siempre un final alegre. Una vez que surge el enamoramiento, les será muy difícil olvidarse de esa persona. Cambiarlos, sacarlos de esa estructura es una tarea bastante complicada.\n" +
"\n" +
"La luna en venado para las mujeres\n" +
"\n" +
"La mujer venado esta siempre arreglada, bien vestida, estará siempre dispuesta a la acción y a sentirse bien con su interior y exterior. Es muy sentimental y romántica, y su historia de amor será como el de las novelas. Gracias al amor en su vida ella existe. Por lo tanto todo rondara en ese tema. Todos los aspectos de su vida estarán impregnados de amor y armonía. Dará mucho amor y también lo recibirá. Al ser muy apasionada, esperara que su amor también lo sea, que le escriba cartas, que la llame por teléfono, que la invite a cenar, que le proponga el noviazgo y luego el casamiento, mas tarde los hijos y vivir felices para toda la vida. Una mujer cuando tiene a sus retoños, les suele dedicar el tiempo completo, es una mama orgullosa de ellos. Su lema es amar para siempre hasta morir.\n" +
"De todas maneras, las mujeres venado deben aceptar a los demás, deben saber que no tienen esas mismas características que ellas. En el amor nada es perfecto y hay que aprender mucho de él.\n" +
"\n" +
"La luna en venado para los hombres\n" +
"\n" +
"Los hombres venado, suelen tenerle miedo al compromiso. No es por falta de sentimientos, tengamos en cuenta que es el signo mas sensible del zodiaco pero puede ser que esta característica que le impida llegar a algo sumamente formal. Suelen pensar demasiado las cosas, como por ejemplo, si la mujer que eligieron es la correcta, si se equivocaron. Pero al ser personas muy infieles será por eso que no les gusta estar atado a una persona. Al gustarle la libertad, contrayendo matrimonio es como meterse en una cárcel donde la libertad desaparece. Al tener mucho cariño para dar, prefieren tener muchas mujeres así dan todo ese amor que poseen.\n" +
"Si usted es una persona que ama profundamente a un hombre de este signo, debe tener en cuenta que la paciencia es una cualidad que debe poseer. Luego debe actuar cuidadosamente, porque es muy asustadizo y cualquier propuesta indecente lo asustara. Una vez que lo tenga comiendo de la palma de su mano, será uno de los hombres que le dará mas cariño y amor del mundo. Te llenara de tanto cariño y sabrá como estimularte para que seas feliz. Conocen mucho la naturaleza femenina.\n" +
"\n" +
"Afinidad\n" +
"\n" +
"El mas compañero para un venado es la serpiente, porque coinciden en muchos pensamientos y pensaran una manera en la cual el mundo este repleto de amor. Con el mono pasaran mucho tiempo juntos y con las tranquilas tortugas que le mostraran como caminar por la vida y ver la realidad tal cual es.");
    }
    
}
