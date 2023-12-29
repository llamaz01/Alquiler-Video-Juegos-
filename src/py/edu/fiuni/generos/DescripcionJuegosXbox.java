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
public class DescripcionJuegosXbox {

    public String Terror(String juego) {
        if (juego.equals("Silent Hill")) {
            juego = "<html>En esta ocasión encarnaremos a un presidiario llamado Murphy Pendleton, que <br>"
                    + "está siendo trasladado en autobús a un centro penitenciario, cuando éste sufre <br>"
                    + "un accidente. Tras despertar confuso en medio de un bosque, llega al nebuloso <br>"
                    + "pueblo de Silent Hill para enfrentarse a todo tipo de situaciones terroríficas, <br>"
                    + "mientras recuerda las partes más oscuras de su pasado.";
        }
        if (juego.equals("Deadlight")) {
            juego = "<html>En un 1986 alternativo, el mundo se ha convertido en un lugar apocalíptico en el <br>"
                    + "que el futuro se ha desvanecido. Randal Wayne se enfrenta a lo que queda de la <br>"
                    + "raza humana, ahora convertida en una hora de zombis y su única herramienta<br>"
                    + "para sobrevivir en tan hostil entorno es nuestra habilidad al mando";
        }
        if (juego.equals("Slender")) {
            juego = "<html>Tenemos ahora cinco escenarios diferentes en los que la alargada figura nos <br>"
                    + "perseguirá sin cesar, acompañado de otros entes mucho más fieros, rápidos y <br>"
                    + "violentos que la criatura original. Los aficionados de Slender: The Eight Pages <br>"
                    + "pueden así expandir su experiencia, más elaborada ahora en todos los aspectos.";
        }
        if (juego.equals("AMY")) {
            juego = "<html>El título nos traslada a una América post-apocalíptica donde un virus ha <br>"
                    + "transformado a la raza humana en feroces bestias hambrientas de carne. <br>"
                    + "Controlamos a una mujer infectada por el virus que intenta sobrevivir con la <br>"
                    + "ayuda de una niña de ocho años llamada Amy y que tiene misteriosos poderes";
        }
        if (juego.equals("Metro")) {
            juego = "<html>Nos vuelve a llevar a un Moscú post-apocalíptico en el que los pocos <br>"
                    + "supervivientes se refugian de los mutantes y otras amenazas en los túneles de <br>"
                    + "metro de la capital rusa. Metro: Last Light ejerce de puente entre los sucesos del <br>"
                    + "primer juego y la novela Metro 2034, enfrentándonos a la amenaza de los <br>"
                    + "mutantes ";
        }
        return juego;
    }

    public String Accion(String juego) {
        if (juego.equals("Diablo III")) {
            juego = "<html>Se trata de una edición que incluye el título original, la expansión Diablo III:<br>"
                    + " Reaper of Souls, y todas las mejores que han ido llegando estos meses <br>"
                    + "mediantes parches, más alguna novedad exclusiva de esta versión de <br>"
                    + "consola";
        }
        if (juego.equals("Mass")) {
            juego = "<html>Mejora el sistema de combate del primer juego, e incluye novedades como <br>"
                    + "la regeneración automática de vida. Cuenta con un nuevo sistema de <br>"
                    + "cinemáticas que hace que los rostros de los personajes sean más reales, y <br>"
                    + "de nuevo las decisiones que tomemos afectarán al desarrollo de la historia <br>"
                    + "y al resto de personajes que nos acompañan por toda la galaxia.";
        }
        if (juego.equals("Red")) {
            juego = "<html>Sigue habiendo vaqueros y forajidos, pero ya hay coches y electricidad. En <br>"
                    + "este contexto, el forajido John Marston tendrá que limpiar su nombre en una<br>"
                    + " aventura que nos llevará por una gran extensión de terreno lleno de <br>"
                    + "pueblos, aldeas, lugares ocultos y desafíos, desde la caza de animales <br>"
                    + "salvajes hasta emboscadas tendidas por bandas de criminales. ";
        }
        if (juego.equals("BioShock")) {
            juego = "<html>La ciudad subacuática de Rapture fue construida en los años 40 como el <br>"
                    + "sueño de un visionario. Una ciudad donde el hombre sería libre, y donde no <br>"
                    + "habría ni dioses ni reyes: solo la ciencia y la libertad";
        }
        if (juego.equals("Halo")) {
            juego = "<html>El Jefe Maestro vuelve en una aventura en la que tendrá que pelear contra <br>"
                    + "el Covenant y contra el Flood. La campaña puede jugarse en cooperativo <br>"
                    + "para hasta cuatro jugadores, e incluye un completo modo multijugador";
        }
        return juego;
    }

    public String Aventura(String juego) {
        if (juego.equals("The Walking")) {
            juego = "<html>Nos sumergimos así en una experiencia con toques de aventura gráfica, en el <br>"
                    + "que viviremos la historia de un hombre que se ve envuelto, sin esperarlo, por<br>"
                    + "una epidemia zombi, en la que no sólo tendrá que sobrevivir, sino tomar duras<br>"
                    + " decisiones y proteger a la pequeña Clementine";
        }
        if (juego.equals("Batman")) {
            juego = "<html>El héroe de Gotham tendrá que infiltrarse en la isla Arkham, hospital <br>"
                    + "psiquiátrico donde están internados la mayoría de sus peores enemigos, que <br>"
                    + "han organizado un motín liderado por El Jóker";
        }
        if (juego.equals("Dishonored")) {
            juego = "<html>Es un juego de acción y aventura en primera persona, con una ambientación <br>"
                    + "futurista steampunk, en el que controlamos a un letal asesino en un mundo <br>"
                    + "corrupto, dominado por una dictadura.";
        }
        if (juego.equals("Minecraft")) {
            juego = "<html>Esta versión cuenta con la jugabilidad básica, pudiendo construir nuestro <br>"
                    + "refugio, recoger recursos y defenderlo, con la promesa de que futuras <br>"
                    + "actualizaciones irán ampliando sus funciones y acercándola a versión de PC, <br>"
                    + "siempre en evolución";
        }
        if (juego.equals("Halo Infinite")) {
            juego = "<html>Halo Infinite continúa la historia de Halo 5: Guardians y dirige a la franquicia hacia <br>"
                    + "direcciones ambiciosas e inesperadas, impulsada por el nuevo motor Slipspace.";
        }
        return juego;
    }

    public String Estrategia(String juego) {
        if (juego.equals("XCOM")) {
            juego = "<html>Casi 20 años después, ofrece un juego completamente nuevo partiendo <br>"
                    + "de la base original, con modos multijugador, online, y aspectos gráficos y<br>"
                    + " sonoros a la altura del presente año.";
        }
        if (juego.equals("Planeswalkers")) {
            juego = "<html>Podrás enfrentarte a la inteligencia artificial o reunir a tus aliados en el <br>"
                    + "nuevo modo multijugador, llamado Archienemigo, donde formaréis <br>"
                    + "equipo para derrotar a un jefe enemigo";
        }
        if (juego.equals("Anomaly")) {
            juego = "<html>Anomaly: Warzone Earth para Xbox 360 se trata de un juego de <br>"
                    + "estrategia en el que tendremos que intentar liberar varios centros <br>"
                    + "urbanos de unas fuerzas alienígenas que están invadiendo la tierra";
        }
        if (juego.equals("Omerta")) {
            juego = "<html>La particularidad residirá en que realizaremos todo tipo de crímenes,<br>"
                    + "como robo de bancos o contrabando, además de poder trabajar en<br>"
                    + "negocios legales, tanto para ganar dinero como para blanquearlo";
        }
        if (juego.equals("XBLA")) {
            juego = "<html>El juego goza de más de 8 millones de jugadores en todo el mundo,<br>"
                    + "que compran tanto sobres de cartas aleatorias como cartas sueltas y específicas<br>"
                    + " en tiendas especializadas, las cuales pueden llegar a alcanzar precios realmente<br>"
                    + "elevados según su rareza, para crearse mazos cada vez más poderosos.";
        }
        return juego;
    }

    public String Carreras(String juego) {
        if (juego.equals("Forza")) {
            juego = "<html>Vuelve a incluir un extenso repertorio de circuitos, coches reales de todas las <br>"
                    + "épocas, y un completísimo modo online en el que establecer competiciones e <br>"
                    + "intercambiar modificaciones de coches con otros usuarios.";
        }
        if (juego.equals("Trials")) {
            juego = "<html>Vuelve a contar con un sistema de piruetas completos, gráficos avanzados, y <br>"
                    + "esta vez cuenta con conectividad multiplataforma con Trials Frontier para <br>"
                    + "dispositivos móviles. Además, cuenta con modo multijugador y editor de pistas";
        }
        if (juego.equals("Forza Horizon")) {
            juego = "<html>Podemos recorrer la ciudad de Niza y sus alrededores y competir en diferentes <br>"
                    + "tipos de pruebas, con el objetivo de conseguir los diez coches disponibles. En <br>"
                    + "los siguientes vídeos podéis ver los primeros minutos, y además os dejamos <br>"
                    + "con nuevas imágenes";
        }
        if (juego.equals("F1")) {
            juego = "<html>Cuenta con todos los pilotos y escuderías de la temporada 2012 de Formula 1<br>"
                    + ", además del nuevo circuito de Austin. Incluye un modo campeonato con más <br>"
                    + "opciones de configuración y rivalidades con otros pilotos";
        }
        if (juego.equals("SBK")) {
            juego = "<html>Este completo simulador incluye cuatro categorías: SBK, Supersport, <br>"
                    + "Superstock 1000 y Leyendas SBK, 79 pilotos, 16 circuitos y hasta nueve modos <br>"
                    + "de juego, convirtiéndose en un juego que satisfará a los fans de la competición,<br>"
                    + " especialmente con el modo Leyendas";
        }
        return juego;
    }

}
