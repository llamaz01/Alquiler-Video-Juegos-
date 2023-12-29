/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.fiuni.generos;

/**
 * Clase que se encarga de devolver descripciones de los juegos segun el genero
 *
 * @author Luz Lamas
 */
public class DescripcionJuegosPlay {

    public String Accion(String juego) {
        if (juego.equals("Darksiders")) {
            juego = "<html>Darksiders II para PS3 continúa la historia del original, pero situándonos esta vez en el papel de "
                    + "<br>otro jinete del Apocalipsis, Muerte. Esta secuela tiene lugar en el inframundo, continuando los"
                    + "<br>sucesos del primer juego, y Muerte tendrá que usar su guadaña y otras armas para acabar con "
                    + "<br>oleadas de enemigos ";
        }
        if (juego.equals("Mortal Kombat")) {
            juego = "<html>Luchadores capaces de despertar la fascinación de los jugadores, una jugabilidad sólida "
                    + "y reconocible y un contexto y estilo artístico con la suficiente identidad propia como para"
                    + " sentar cátedra en el género.";
        }
        if (juego.equals("Call")) {
            juego = "<html>Call of Duty: Infinite Warfare es un videojuego de disparos en primera persona<br> "
                    + "desarrollado por Infinity Ward y distribuido por Activision.";
        }
        if (juego.equals("Destiny")) {
            juego = "<html>Se trata de un título de acción y aventura en el que el jugador debe crear su propio<br>"
                    + "personaje y evolucionarlo para lograr salvar la tierra. Un juego de acción en primera persona<br>"
                    + "donde la ciencia ficción y la definición \"Shared Wold Shooter\" harán el resto";
        }
        if (juego.equals("Madagascar")) {
            juego = "<html>Una divertidísima aventura que llevará a toda la banda de viaje por toda Europa hasta Nueva<br>"
                    + "York en un circo en el que tendrán que actuar si quieren salvar sus vidas para poder regresar a<br>"
                    + " casa. Los jugadores podrán experimentar toda la diversión del circo completando trepidantes y<br>"
                    + " locas misiones dirigidas por los Pingüinos, realizando acrobacias increíbles en los más famosos<br>"
                    + " lugares de Europa y deslumbrar a la multitud con sus números circenses en el circo<html>";
        }
        if (juego.equals("Spider")) {
            juego = "<html>Nuevo entrega de la franquicia Spider-Man a cargo de los mismos creadores que Shattered "
                    + "<br>Dimensions. En el juego asumiremos los roles del clásico Amazing Spider-Man y de Spider-Man"
                    + "<br>2099 con la misión de corregir una corriente temporal que podría provocar una catástrofe e"
                    + "<br>incluso la muerte de Peter Parker.";
        }
        if (juego.equals("InFamous")) {
            juego = "<html>Cole posee los poderes del juego original en inFamous 2, sumando a los poderes básicos de "
                    + "<br>electricidad e iónicos los poderes de karma y se pueden personalizar para conferirle distintos "
                    + "<br>efectos. El amplificador es una novedad del juego, que sustituye el arma de melé del anterior, y"
                    + "<br>que permite a Cole realizar nuevos tipos de ataque normal y cargado.";
        }
        if (juego.equals("The Last")) {
            juego = "<html>The Last of Us: Part II es un videojuego de acción-aventura desarrollado por Naughty Dog y "
                    + "<br>publicado por Sony. Su lanzamiento se produjo el 19 de junio de 2020";
        }

        return juego;
    }

    public String Aventura(String juego) {
        if (juego.equals("Death Stranding")) {
            juego = "<html>Death Stranding es un título de acción, aventura y exploración en mundo abierto de<br>"
                    + "ambientación postapocalíptica. Se trata del nuevo videojuego de Hideo Kojima, padre de Metal<br>"
                    + " Gear y Snatcher, una enigmática obra que se define como el primer juego de su género, ya que<br>"
                    + "incluye una serie de mecánicas, detalles y aspectos que lo alejan de otros videojuegos similares. ";
        }
        if (juego.equals("Blacksad")) {
            juego = "<html>La trama se centra en el caso de la desaparición de la estrella del boxeo Bobby Yale, y el <br>"
                    + "suicidio de su mentor y dueño del gimnasio donde entrenaba, Joe Dunn. La hija de <br>"
                    + "Dunn, Sonia Dunn, contratará nuestros servicios para que encontremos a Bobby antes de<br>"
                    + " un combate importante, pero a medida que avanzamos con nuestra investigación,<br>"
                    + "averiguaremos que nada es lo que parece";
        }
        if (juego.equals("Those Who Remain ")) {
            juego = "<html>Those Who Remain es una historia de terror psicológico en primera persona<br>"
                    + "ambientada en la durmiente localidad de Dormont, una aventura<br>"
                    + " Enfréntate a sus incómodos horrores, conserva la cordura y sobrevive a la noche<br>";
        }
        if (juego.equals("Days Gone")) {
            juego = "<html>Days Gone es un videojuego de acción-aventura y horror de supervivencia, desarrollado por el<br>"
                    + " estudio SIE Bend Studio y que fue publicado por Sony Interactive Entertainment en exclusiva<br>"
                    + "para la consola PlayStation 4 el 26 de abril del año 2019";
        }
        if (juego.equals("Assassin's")) {
            juego = "<html>Assassin's Creed Odyssey es un videojuego desarrollado por Ubisoft Quebec y publicado por<br>"
                    + "Ubisoft. Es el decimoprimer juego de mayor importancia y el vigesimoprimero en general dentro<br>"
                    + "de la saga Assassin's Creed, siendo posterior al juego Assassin's Creed Orígins, se trataría de<br>"
                    + "una precuela";
        }
        return juego;
    }

    public String Carrera(String juego) {
        if (juego.equals("Moto")) {
            juego = "<html>Calienta motores y prepara todo para un nuevo capítulo de MotoGP™! Vuelve MotoGP™20,<br>"
                    + "esta vez con un modo Carrera de representante renovado y mucho mas ";
        }
        if (juego.equals("Need")) {
            juego = "<html>Need for Speed Heat es un videojuego de carreras desarrollado por Ghost Games y publicado<br>"
                    + "por Electronic Arts para Microsoft Windows, PlayStation 4 y Xbox One. Es la vigésimo cuarta <br>"
                    + "entrega de la saga Need for Speed y conmemora el 25 aniversario de la serie";
        }
        if (juego.equals("F1 2019")) {
            juego = "<html>Llega el momento del análisis de Legends F1 2019, la edición especial del juego oficial de la <br>"
                    + "Fórmula 1 que acaba de salir a la venta";
        }
        if (juego.equals("Team Sonic")) {
            juego = "<html>Team Sonic Racing es un videojuego de carreras desarrollado por Sumo Digital y distribuido por <br>"
                    + "Sega Está integrado por personajes y escenarios pertenecientes a la franquicia Sonic the<br>"
                    + "Hedgehog. Fue lanzado el 21 de mayo de 2019";
        }
        if (juego.equals("RUSH")) {
            juego = "<html>Con RUSH VR, ponte un traje aéreo y sumérgete en ese mundo donde la adrenalina no deja de <br>"
                    + "fluir. Vuela por las laderas de las montañas a velocidades ";
        }

        return juego;
    }

    public String Terror(String juego) {
        if (juego.equals("Resident Evil")) {
            juego = "<html>Resident Evil 3: Nemesis cuyo título original es Biohazard 3: Last Escape  es un videojuego de<br>"
                    + "acción-aventura del estilo survival horror desarrollado y distribuido por Capcom. La entrega, <br>"
                    + "precedida por Resident Evil 2, es el tercer título de la franquicia";
        }
        if (juego.equals("Moons")) {
            juego = "<html>Moons of Madness nos lleva hasta el planeta rojo para vivir una terrorífica aventura narrativa<br>"
                    + " aunque en conjunto bastante previsible.";
        }
        if (juego.equals("Dead")) {
            juego = "<html>Dead Island 2 Es un videojuego de ARPG/Horror de supervivencia que estaba siendo<br>"
                    + "desarrollado por la empresa Dambuster Studios.El juego fue confirmado durante el evento E3 de<br>"
                    + "2014, pero sería cancelado en octubre de 2015";
        }
        if (juego.equals("Blair")) {
            juego = "<html>Tres estudiantes de cine se pierden en un bosque habitado por una bruja, durante su <br>"
                    + "investigación de la leyenda.";
        }
        if (juego.equals("The Evil")) {
            juego = "<html>The Evil Within 2, conocido en Japón como Psycho Break 2 es un videojuego de horror de<br>"
                    + "supervivencia en tercera persona desarrollado por Tango Gameworks y distribuido por Bethesda<br>"
                    + "Softworks, siendo la secuela directa de The Evil Within";
        }

        return juego;
    }

    public String Estrategia(String juego) {
        if (juego.equals("Hell")) {
            juego = "<html>En Hell Warder, nos encontraremos con una historia en la que se nos presenta un reino<br>"
                    + "fantástico que se encuentra al borde de la destrucción en manos de los demonios. Con <br>"
                    + "esta premisa, tomaremos el control de nuestro héroe, un Hell Warder, para evitar que <br>"
                    + "las hordas enemigas acaben con nuestro mundo y lo condenen a la destrucción";
        }
        if (juego.equals("fifa")) {
            juego = "<html>FIFA 16 es un videojuego de fútbol desarrollado por EA Canadá y publicado por EA Sports.";
        }
        if (juego.equals("Transport")) {
            juego = "<html>Año 1850. El mundo está inmerso en la mayor transformación jamás vista. Conviértete en testigo de la<br>"
                    + "aparición de la producción y el transporte a gran escala. Por todas partes se construyen fábricas para<br>"
                    + "saciar el deseo del público por consumir nuevos productos. Con poco dinero y una idea innovadora, <br>"
                    + "podrás erigir un imperio. ¡Lánzate a la conquista del mundo!";
        }
        if (juego.equals("Desperados")) {
            juego = "<html>Desperados III es un videojuego de táctica de tiempo real desarrollado por Mimimi Games y<br>"
                    + "publicados por THQ Nordic. Es el primer lanzamiento en la serie desde el 2007 fuera del spin-off<br>"
                    + "Helldorado";
        }
        if (juego.equals("Beholder")) {
            juego = "<html>Traducción del inglés-Beholder es un videojuego ruso sobre la vida en un estado totalitario. El <br>"
                    + "juego fue desarrollado por Warm Lamp Games y publicado por Alawar Entertainment. Beholder <br>"
                    + "se lanzó en Steam el 9 de noviembre de 2016 ";
        }
        if (juego.equals("Northgard")) {
            juego = "<html>Construye tu asentamiento en el continente recién descubierto de Northgard. Asigna varios<br>"
                    + "trabajos a tus vikingos ,granjero, guerrero etc.";
        }

        return juego;
    }

}
