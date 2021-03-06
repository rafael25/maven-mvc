/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rv.proyect1.controllers;

import java.util.GregorianCalendar;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author rafael
 */
public class ZodiacoMaya implements ZodiacoInterface {
    ArrayList<SignoZodiaco> signos;

    public ZodiacoMaya() {
        String tipo = "maya";
        signos = new ArrayList(13);
        signos.add(0, new SignoZodiaco(tipo,"Ardilla", "TZUB – ARDILLA. Estas criaturas inquietas, les gusta trabajar mucho y son muy dedicadas. Consiguen amigos por donde quieran que vayan por su gran simpatia y buen humor. Cuando aparecen en tu vida la llenan de alegria y amor. Te brindan su apoyo incondicional. Les gusta hablar mucho, y expresar sus sentimientos. Puede que muchas veces se metan en ciertos lios, pero son capaces de salir enseguida porque son muy sinceras ademas."));
        signos.add(1, new SignoZodiaco(tipo,"Escorpion", "DZEC – ESCORPIÓN. Los escorpiones son muy de seguir las costumbres y la tradicionalidad. Pueden parecer que tienen una amplitud mental sobre cualquier tema, pero en lo profundo ellos tienen sus ideas rigidas que no les gustan cambiar. Analizan y observan cada situacion, le encanta escuchar al otro pero no relatar sus mas profundos comentarios. Son muy activos y hablan lo justo y necesario. Cuando el escorpion enuncia algo es porque es de suma importancia."));
        signos.add(2, new SignoZodiaco(tipo,"Halcon", "COZ – HALCÓN. Los nativos de este signo son seres muy espirituales. Y tienen un poder de personalidad muy fuerte. Tienen mucha presencia por eso otros signos lo respetan mucho. Dentro del calendario maya representa al dios de los mayas (Quetzalcoalt). Saber ver las cosas desde mucha distancia y ademas es muy perceptivo. Puede ver mucho mas alla de los demas signos. Tienen una capacidad especial, ante momentos duros saben estar muy tranquilos y serenos manteniendo una paz interior increible. En su vida pasa por muchisimas etapas: cuando es joven se dedica especialmente a hacer dinero, poseer bienes materiales como autos casas, ropa de marca y ademas de todo eso formar un nucleo familiar. Pero cuando se hace mas viejo, tiende mas a las cosas espirituales, por lo tanto intentara estudiar mucha metafisica, filosofia y teologia."));
        signos.add(3, new SignoZodiaco(tipo,"Jaguar", "BALAM – JAGUAR. El jaguar tiene mucha pasion y fogosidad que la emana de manera fatal. Todo ese caudal lo saca como una fiera. Es considerado un animal muy respetado por los descendientes de los dioses. Cada cosa que se plantean la cumplen sin problema, para ellos nada es imposible. Les encantan las situaciones de riesgo donde todas las hormonas estan en funcionamiento. Para conquistar a alguien, primero la observan, y comienzan a avanzar despacito, paso a paso y una vez que esta seguro comienza el ataque. Cuanto mas dificil es la tarea, mas le gusta la aventura, le genera una situacion unica."));
        signos.add(4, new SignoZodiaco(tipo,"Lagarto", "KIBRAY – LAGARTO. Estos seres, tienen la capacidad de adaptarse a cualquier ambiente y a cualquier entorno de personas. Son muy simples, y tienen mucha energia positiva que la contagian al ambiente, por lo tanto estar a lado de un lagarto es realmente un placer. Pero para que puedas entrar en su circulo debes aprender a ser ordenado como ellos, sobretodo en su pieza. Puede que entres a la habitacion y te encuentres que todo esta desordenado, pero en ese “desorden” ellos encuentran todo lo que buscan. Y si te atreves a moverle algo de lugar, sienten atacada su intimidad. Por otro lado no les gusta que le esten diciendo a cada rato que es lo que tienen que hacer y que es lo que no. Odian que los esten presionando y molestando. Si se cansa un lagarto, se pondra furioso y desaparecera. Algunos de ellos no son tan fanaticos del orden, les gusta que los demas le dejen todo preparado y no tener que realizar ellos este tipo de trabajos."));
        signos.add(5, new SignoZodiaco(tipo,"Lechuza", "MOAN – LECHUZA. Los nativos de esta luna, son seres muy intuitivos, podrian ser muy buenos psicologos por eso son personas a las cuales recurren otras por tener este don. Suelen ser muy sociables. Como toda lechuza, son extremadamente sabias, siempre saben aconsejar en el momento adecuado. El saber que poseen proviene de lo mas profundo de su alma. Son seres muy espirituales, sanan cuerpo y alma. Sin conocerlos podemos pensar que las lechuzas son seres volatiles, pero verdaderamente estan metidos en su mundo interno, meditando y viajando por nuevos rumbos, planificando nuevas propuestas para mas adelante."));
        signos.add(6, new SignoZodiaco(tipo,"Mono", "BATZ KIMIL – MONO. Los monos son los mas divertidos del horoscopo, y el mismo eso lo sabe. Le encanta estar siempre activo, haciendo pavadas, siempre tiene presente su niño interior. Siempre tiene ganas de estar bien y pasar cada momento como si fuera unico. El optimismo los caracteriza, y son seres con abundante esperanza. Les gusta conocer mucha gente, y les encanta estar siempre acompañados. Es muy dificil que uno no se lleve bien con los monos, tienen siempre muy buen humor y lo contagian muchisimo. Como organizadores de eventos son los mejores, organizaran todo de tal manera que nada hara falta. Tienen una alta capacidad para unir grupos variadisimos."));
        signos.add(7, new SignoZodiaco(tipo,"Murcielago", "TZOOTZ – MURCIELAGO. Los de esta luna, por naturaleza siempre estan al mando de todo y poseen mucho carisma. Por lo tanto los murcielagos tienen una energia especial, no tienen limites, todo puede cumplirse. Tienen un caracter muy fuerte que lo desarrollan a muy temprana edad. Tienen las cosas claras, por lo tanto su autoestima esta siempre alta. Al ser lideres pueden estar al mando de una empresa, o bien pueden ir escalando de poco hasta alcanzar el exito maximo. Se dice que son muy luchadores, no se les escapa nada. Estan dotados de una habilidad especial para resolver problemas."));
        signos.add(8, new SignoZodiaco(tipo,"Pavo Real", "KUTZ – PAVO REAL. Los pavos reales son unicos e irrepetibles. Son seres cuya tarea es crearse a si mismos una y otra vez con el solo fin de resaltar y mostrarse enteramente. Estan en este mundo para ser lo mejor en todo, no les gusta la gente mediocre. No les gusta el punto medio, son muy extremistas, o lo absoluto o nada. Son muy egocentricos, hacen muchas locuras pero son sumamente originales en lo que hacen. Por lo tanto suelen ver las cosas siempre muy positivas, desde el lado del optimismo. Se divierten muchisimo, disfrutan el aqui y el ahora. En lo mas profundo de sus almas a ellos les gustaria tener una vida sin complicaciones, pero no les ocurre asi. Porque querer siempre ganar y hacer las cosas bien, nunca se conforman con nada. Siempre piensan que hay algo mejor de lo que ellos hacen. Son personas con tendencia a subir de peso, por eso siempre estan queriendo hacer dietas balanceadas para controlar esa subida."));
        signos.add(9, new SignoZodiaco(tipo,"Serpiente", "KAN – SERPIENTE. Como ya sabemos todos, la serpiente es muy sensual, tiene mucha presencia, es muy coqueta y siempre va por la vida con mucha elegancia. Es muy glamorosa y no pasa desapercibida. Le gusta la vida lujuriosa y llena de cosas. Por ello, estara siempre activa tratando de lograr esa vida que tanto le gusta, buscara todas las herramientas necesarias para poder realizarlo. Le encanta que la respeten y le tengan muchisima admiracion. Inteligencia no le falta, es muy culta, le gusta leer muchisimo sobre temas variados, por eso en su casa tendra un lugar especializado para guardar todo tipo de libros y un escritorio para poder leerlos placidamente. Le gusta tener su espacio, y que nadie se atreva a ocuparselo porque se enojaria muchisimo. Ella siempre busca tareas para realizar y disfruta muchisimo de la soledad y la paz interior sin que nadie la moleste. Esto no impide que sea muy simpatica y le guste conocer gente. Pero su momento personal es muy importante."));
        signos.add(10, new SignoZodiaco(tipo,"Tortuga", "AAK – TORTUGA. A la tortuga le gusta mucho estar en su casa y disfrutar mucho de ella. Les encanta estar mucho con su familia y dedicarle mucho tiempo. Para ella las relaciones tanto de amistad como amorosas son de suma importancia en su vida. Son muy trabajadoras, siempre estan dispuestas a todo, a esforzarse y dar mas de si cada dia para darle todo a su familia. Las mujeres tortuga se dice que saben administrar el capital como ninguna mujer en el zodiaco. Y el hombre se puede decir que representa un ejemplo muy bueno a seguir como cabeza familiar. Le gusta muchos trabajar y estar sintiendo el poder natural del ambiente. Por eso aman la naturaleza y serian excelentes biologos, ecologistas, jardineros, especialistas en la flora y fauna a la cual cuidaran con gran amor. Les gusta defender los derechos de los hombres y en general, es muy justiciera y le gusta que todo funcione como corresponde. Cuando trabaja es muy importante que este comoda y a gusto con todos la que la rodean. Ella da todo de si y es muy leal. Esta dotada de una constancia y paciencia unicas. Ese es su secreto, con el cual consiguen todos sus frutos. Puede que le cueste llegar a donde ella quiere pero siempre, siempre llegara porque nunca dejara de luchar."));
        signos.add(11, new SignoZodiaco(tipo,"Venado", "KEH – VENADO. Dentro del horoscopo maya, las personas que poseen la mayor sensibilidad son los venados. Han nacido para amar profundamente y recibir mucho amor. Les encanta la paz y la armonia. Les encantan los momentos de cariño, amor, ternura. Son personas con mucho sentimentalismo, por eso requieren de un medio donde se sientan a gusto. No son para nada agresivos ni violentos, en su vida no existen esas palabras. Para ellos la vida es maravillosa y esta llena de caminos nuevos, hasta que se demuestre lo opuesto. Poseen mucha sinceridad y por supuesto les gusta rodearse de gente que sea igual a ellos. Son extremadamente sensuales. A traves de su mirada se puede ver toda la ternura que poseen. Con ella seducen muchisimo y es imposible no mirarlos, atrapan a primera vista. Afortunadamente todas las metas que se ponen, las cumplen. Lo realizan todo tan despacito y armonico que nadie se toma el atrevimiento a decir la palabra NO, para no lastimarlos. Suelen ser muy inocentes y compran con esa actitud."));
        signos.add(12, new SignoZodiaco(tipo,"Zorro", "FEX – ZORRO. El zorro es una persona que esta para dar sevicia a los demas. Es sumamente solidario y es capaz de dar todo por un amigo. Desde que nacen poseen ese don de ayudar y brindar todo lo que pueden al projimo desde lo material hasta lo sentimental. Son muy correctos, luchan por los derechos humanos y defienden a la gente que no tiene la capacidad para hacerlo. Este animal es muy trabajador, pero tendria que tener una relacion mas profunda con el dinero, porque trabaja mucho pero el capital nunca le alcanza para las necesidades que tiene. Generalmente si monta alguna empresa, esta no le reditua. Pueda que no este realizando s vocacion. Tendria que encauzar su energia en trabajos en donde pueda utilizar el don nato que posee. Algunos de los trabajos que podria realizar serian de enfermero, sociologo, medico, psicologo, etc. Es decir todas carreras que le permitan ayudar al otro."));
    }

    public SignoZodiaco getZodiaco(GregorianCalendar fecha) {
        int year = fecha.get(Calendar.YEAR);
        if (fecha.after(new GregorianCalendar(year-1, Calendar.DECEMBER, 13)) && fecha.before(new GregorianCalendar(year, Calendar.JANUARY, 9))) {
            return signos.get(4);
        }
        else if (fecha.after(new GregorianCalendar(year, Calendar.JANUARY, 10)) && fecha.before(new GregorianCalendar(year, Calendar.FEBRUARY, 6))) {
            return signos.get(6);
        }
        else if (fecha.after(new GregorianCalendar(year, Calendar.FEBRUARY, 7)) && fecha.before(new GregorianCalendar(year, Calendar.MARCH, 6))) {
            return signos.get(2);
        }
        else if (fecha.after(new GregorianCalendar(year, Calendar.MARCH, 7)) && fecha.before(new GregorianCalendar(year, Calendar.APRIL, 3))) {
            return signos.get(3);
        }
        else if (fecha.after(new GregorianCalendar(year, Calendar.APRIL, 4)) && fecha.before(new GregorianCalendar(year, Calendar.MAY, 1))) {
            return signos.get(12);
        }
        else if (fecha.after(new GregorianCalendar(year, Calendar.MAY, 2)) && fecha.before(new GregorianCalendar(year, Calendar.MAY, 29))) {
            return signos.get(9);
        }
        else if (fecha.after(new GregorianCalendar(year, Calendar.MAY, 30)) && fecha.before(new GregorianCalendar(year, Calendar.JUNE, 26))) {
            return signos.get(0);
        }
        else if (fecha.after(new GregorianCalendar(year, Calendar.JUNE, 27)) && fecha.before(new GregorianCalendar(year, Calendar.JULY, 25))) {
            return signos.get(10);
        }
        else if (fecha.after(new GregorianCalendar(year, Calendar.JULY, 26)) && fecha.before(new GregorianCalendar(year, Calendar.AUGUST, 22))) {
            return signos.get(7);
        }
        else if (fecha.after(new GregorianCalendar(year, Calendar.AUGUST, 23)) && fecha.before(new GregorianCalendar(year, Calendar.SEPTEMBER, 19))) {
            return signos.get(1);
        }
        else if (fecha.after(new GregorianCalendar(year, Calendar.SEPTEMBER, 20)) && fecha.before(new GregorianCalendar(year, Calendar.OCTOBER, 17))) {
            return signos.get(11);
        }
        else if (fecha.after(new GregorianCalendar(year, Calendar.OCTOBER, 18)) && fecha.before(new GregorianCalendar(year, Calendar.NOVEMBER, 14))) {
            return signos.get(5);
        }
        else if (fecha.after(new GregorianCalendar(year, Calendar.NOVEMBER, 15)) && fecha.before(new GregorianCalendar(year, Calendar.DECEMBER, 12))) {
            return signos.get(8);
        }
        return signos.get(0);
    }
    
}
