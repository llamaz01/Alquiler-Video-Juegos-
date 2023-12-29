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
public class DescripcionJuegosPc {

    public String Accion(String juego) {
        if (juego.equals("The Elder")) {
            juego = "<html>Skyrim renueva todo lo visto en el increíble Oblivion, mostrándonos un enorme <br>"
                    + "mundo que explorar libremente, donde relacionarnos con todo tipo de personajes y<br>"
                    + "embarcarnos en decenas de aventuras en las que nuestras decisiones influirán en el<br>"
                    + "resultado. Un juego de rol abierto, inmenso y lleno de secretos.";
        }
        if (juego.equals("Grand")) {
            juego = "<html>Está protagonizada por Michael, Franklin y Trevor, tres criminales con diferentes<br>"
                    + "habilidades, pudiendo cambiar de personaje en todo momento y vivir cada una de<br>"
                    + "sus vidas, así como aprovechar sus habilidades en las misiones.";
        }
        if (juego.equals("The Witcher")) {
            juego = "<html>El jugador controlará una vez más a Geralt de Rivia, el afamado cazador de<br>"
                    + "monstruos, (también conocido como el Lobo Blanco) y se enfrentará a un<br>"
                    + "diversificadísimo bestiario y a unos peligros de unas dimensiones nunca vistas hasta<br>"
                    + "el momento en la serie, mientras recorre los reinos del Norte. Durante su aventura,<br>"
                    + "tendrá que hacer uso de un gran arsenal de armas, armaduras y todo tipo de magias<br>"
                    + "para enfrentarse al que hasta ahora ha sido su mayor desafío, la cacería salvaje.";
        }
        if (juego.equals("Undertale")) {
            juego = "<html>En Undertale encarnaremos a un niño que, tras caer por un misterioso pozo, acaba<br>"
                    + "envuelto en un mundo de fantasía, lleno de criaturas y monstruos, en el que tendrá<br>"
                    + "que sobrevivir, entablar amistades y tomar decisiones que cambiarán el curso de la historia.";
        }
        if (juego.equals("Mass")) {
            juego = "<html>Acompaña al Comandante Jack Shepard en una épica aventura para PC, que<br>"
                    + "combina acción y rol, en la que tendrá que salvar a la galaxia de la extinción de su <br>"
                    + "vida. Creado por Bioware, autores de Baldur's Gate, Mass Effect combina rol con <br>"
                    + "toma de decisiones y acción en tiempo real";
        }
        if (juego.equals("lara")) {
            juego = "<html>Corre, conduce y nada en la piel de Lara Croft por espectaculares aunque peligrosos<br>"
                    + " entornos mientras descubres antiguas reliquias para comprender la verdad y resolver el misterio<br>"
                    + " tras la conspiración que amenaza al mundo<br>"
                    +"- Descubre ubicaciones increíbles a medida que avanzas por la selva, el desierto y las montañas<br>"
                    + "todas ellas llenas de secretos y peligros<br>";
        }
        return juego;
    }

    public String Aventura(String juego) {
        if (juego.equals("Half")) {
            juego = "<html>En esta entrega tomaremos el papel de Alyx Vance, la conocida hacker que<br>"
                    + "descubrimos en la segunda entrega de la saga y que será la protagonista principal de <br>"
                    + "esta entrega que tiene lugar, cronológicamente, justo antes de los sucesos ocurridos<br>"
                    + " en Half-Life 2. De nuevo, viviremos luchas contra los Combine y demás en un<br>"
                    + "terreno postapocalíptico. Es compatible con Valve Index, el nuevo headset de<br>"
                    + "laempresa.";
        }
        if (juego.equals("BioShock")) {
            juego = "<html>Años después, un soldado americano llega a la <br>"
                    + "ciudad para comprobar que algo ha ido mal. Los mutantes proliferan, los antaño<br>"
                    + "gloriosos edificios de Art Decó están en ruinas, y la única autoridad parecen ser<br>"
                    + "unos gigantescos hombres mecánicos armados con taladros ";
        }
        if (juego.equals("Ori and")) {
            juego = "<html>Ori and the Will of the Wisps es la secuela de Ori and the Blind Forest es un juego<br>"
                    + "de plataformas 2D creado por Moon Studios. Con un estilo visual colorista y<br>"
                    + "llamativo, el juego nos reta a explorar niveles, consiguiendo nuevas habilidades y<br>"
                    + "abriendo nuevos caminos que podremos seguir recorriendo.";
        }
        if (juego.equals("Minecraft")) {
            juego = "<html>Esta edición se ofrecerá, además, como una descarga gratuita a los que ya tengan <br>"
                    + "Minecraft en PC, y no será un sustituto de la original, sino una versión paralela. ";
        }
        if (juego.equals("Slay")) {
            juego = "<html>Slay the Spire es un título que se ocupa de combinar los juegos de cartas<br>"
                    + "coleccionables con el componente roguelike y las aventuras propias del género de rol";
        }
        return juego;
    }

    public String Carreras(String juego) {
        if (juego.equals("F1 2017")) {
            juego = "<html>Encontraremos un homenaje a la competición de motor más prestigiosa del <br>"
                    + "planeta ofreciendo coches clásicos";
        }
        if (juego.equals("Pro Cycling")) {
            juego = "<html>El simulador de ciclismo con licencia oficial del Tour de Francia y la Vuelta a<br>"
                    + "España vuelve un año más ofreciendo a los jugadores una combinación entre<br>"
                    + "simulación deportiva y gestión de equipos. Tendremos que dirigir a nuestro<br>"
                    + "equipo, gestionando patrocinios y contratos, entrenando a nuestros ciclistas y<br>"
                    + "motivándoles.";
        }
        if (juego.equals("Laser League")) {
            juego = "<html>Laser League nos propone competir en un deporte extremo con una estética<br>"
                    + "inspirada en Tron mientras se disparan con láseres. El juego ofrece múltiples<br>"
                    + "clases de personajes y habilidades especiales para potenciar las diferentes<br>"
                    + "características de los personajes.";
        }
        if (juego.equals("Descenders")) {
            juego = "<html>Desarrollado por RaqueSquid nos propone descender con premura y con<br>"
                    + "diferentes bicicletas por escenarios y recorridos generados de forma<br>"
                    + "procedimental en cada partida.";
        }
        if (juego.equals("Steep")) {
            juego = "<html>Steep para PC es un juego de deportes extremos que nos traslada a los Alpes,<br>"
                    + "pudiendo alternar entre una cámara en primera y tercera persona para librar todo <br>"
                    + "tipo de pruebas en un mundo completamente abierto.";
        }
        return juego;
    }

    public String Estrategia(String juego) {
        if (juego.equals("StarCraft")) {
            juego = "<html>Éste es el primero, Wings of Liberty, cuya campaña narra la historia de los Terran, <br>"
                    + "los humanos lanzados a la conquista del espacio que inevitablemente se ven las <br>"
                    + "caras en el camino con los Zerg y con los Protoss. Además de un completo modo <br>"
                    + "campaña, Starcraft II incluye un modo multijugador lleno de posibilidades gracias a<br>"
                    + "la conexión con Battle";
        }
        if (juego.equals("Yu-Gi-Oh")) {
            juego = "<html>En Yu-Gi-Oh! Duel Links, los duelistas pueden construir su deck definitivo eligiendo<br>"
                    + "entre más de 700 cartas de Yu-Gi-Oh! para jugar duelos rápidos PvP y en tiempo <br>"
                    + "real. ";
        }
        if (juego.equals("XCOM")) {
            juego = "<html>XCOM: Enemy Unknown para Pc es la revisión de uno de los juegos de estrategia <br>"
                    + "Casi 20 años después, ofrece un juego completamente nuevo partiendo de la base<br>"
                    + " original, con modos multijugador, online, y aspectos gráficos y sonoros a la altura<br>"
                    + "del presente año.";
        }
        if (juego.equals("Slay")) {
            juego = "<html>Slay the Spire es un título que se ocupa de combinar los juegos de cartas <br>"
                    + "coleccionables con el componente roguelike y las aventuras propias del género de<br>"
                    + " rol";
        }
        if (juego.equals("Dota")) {
            juego = "<html>Ice Frog y Valve aúnan fuerzas para crear la segunda entrega de Defense of the <br>"
                    + "Ancients. Manteniendo los más de cien héroes de la aventura original, el juego da <br>"
                    + "un giro apostando por el motor Source desarrollado por Valve. ";
        }

        return juego;
    }

    public String Terror(String juego) {
        if (juego.equals("Dead Space")) {
            juego = "<html>Este juego de terror de Electronic Arts para PC nos lleva a una estación espacial<br>"
                    + "aparentemente abandonada, en la que un técnico, Isaac Clarke, tendrá que<br>"
                    + "enfrentarse a sus peores pesadillas en forma de necromorfos. ";
        }
        if (juego.equals("Devotion")) {
            juego = "<html>Devotion es un videojuego juego de terror en primera persona que se ambientará en <br>"
                    + "Taiwán en los años 80 y pondrá su atención en una pequeña familia marcada por su <br>"
                    + "fervor religioso. Esta familia vive en un bloque de apartamentos antiguo y la religión <br>"
                    + "es parte importante de su día a día. Sin embargo, la familia, antes feliz, vive ahora un <br>"
                    + "pequeño infierno en un espacio que parece estar poseído por alguna fuerza sobrenatural";
        }
        if (juego.equals("Resident Evil")) {
            juego = "<html>Chris Redfield, protagonista del primer Resident Evil, viaja a África para investigar un <br>"
                    + "misterioso brote zombi. Para ayudarle en su misión contará con Sheva, una agente <br>"
                    + "especial que le acompañará durante la aventura y le auxiliará cuando se vea <br>"
                    + "superado por los enemigos.";
        }
        if (juego.equals("The Evil")) {
            juego = "<html>The Evil Within 2 es la secuela del aclamado juego de terror de Tango Game Studio y <br>"
                    + "Shinji Mikami, creador de Resident Evil. Ofrecerá de nuevo una aventura de horror y <br>"
                    + "acción, con elementos sobrenaturales, y características intrínsecas del survival <br>"
                    + "horror, género que el propio Mikami perfeccionó en los noventa.";
        }
        if (juego.equals("Yomawari")) {
            juego = "<html>Yomawari: Night Alone para PC es un juego de acción y terror 'Survival Horror' en el <br>"
                    + "que exploramos la ciudad de Poro en busca de nuestra hermana. Tendremos que <br>"
                    + "iluminar nuestro camino con una linterna mientras buscamos todo tipo de ítems que<br>"
                    + "nos sean útiles.";
        }
        return juego;
    }

}
