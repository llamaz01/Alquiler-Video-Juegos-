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
public class DescripcionJuegosSwitch {

    public String Accion(String juego) {
        if (juego.equals("Mario")) {
            juego = "<html>Mario + Rabbids Kingdom Battle es un videojuego de rol táctico basado en turnos desarrollado y<br>"
                    + "publicado por Ubisoft. Es un \"crossover\" de las franquicias de Raving Rabbids de Ubisoft y Mario<br>"
                    + "de Nintendo. Salió a la venta en todo el mundo el 29 de agosto de 2017";
        }
        if (juego.equals("Terraria")) {
            juego = "<html>Terraria es un videojuego de acción, aventura y de sandbox producido de forma independiente por el<br>"
                    + "estudio Re-Logic. Tiene características tales como la exploración, la artesanía, la construcción de estructuras<br> "
                    + "y el combate";
        }

        if (juego.equals("Assassin's Creed")) {
            juego = "<html>Assassin's Creed III es un videojuego de acción-aventura de la franquicia Assassin's Creed,<br>"
                    + "desarrollado y distribuido por Ubisoft, lanzado el 30 de octubre de 2012";
        }
        if (juego.equals("Super")) {
            juego = "<html>Luchadores y mundos de juego míticos colisionan en el enfrentamiento definitivo: ¡una<br>"
                    + "nueva entrada de la serie Super Smash Bros. para Nintendo Switch!";
        }
        if (juego.equals("DRAGON")) {
            juego = "<html>¡Emprende una aventura muy constructiva y derrota a los Hijos de Hargon en<br> "
                    + "DRAGON QUEST BUILDERS 2 para Nintendo Switch!";
        }
        if (juego.equals("The Legend of Zelda")) {
            juego = "<html>Ayuda a Link a escapar de una tierra extraña en The Legend of Zelda: Link's<br>"
                    + "Awakening para Nintendo Switch.";
        }
        return juego;
    }

    public String Aventura(String juego) {
        if (juego.equals("Blair")) {
            juego = "<html>Recorre un bosque maldito en el que el tiempo y el espacio se distorsionan en<br>"
                    + "Blair Witch para Nintendo Switch";
        }
        if (juego.equals("Sky")) {
            juego = "<html>Vuela con tus amigos por el mundo encantador de Sky: <br>"
                    + "Niños de la Luz para Nintendo Switch.";
        }
        if (juego.equals("Pokémon")) {
            juego = "<html>¡Preparaos para explorar la región de Galar y descubrir nuevos Pokémon en Pokémon Escudo,<br>"
                    + " solo para Nintendo Switch!";
        }
        if (juego.equals("DOOM")) {
            juego = "<html>Acaba con hordas de demonios cuando y donde te apetezca con DOOM,<br>"
                    + " un frenético y divertido shooter en primera persona para Nintendo Switch.";
        }
        if (juego.equals("Animal Crossing")) {
            juego = "<html>Comienza una nueva vida con el Plan de Asentamiento<br> "
                    + "en Islas Desiertas de Nook Inc.!";
        }
        return juego;
    }

    public String Carrera(String juego) {
        if (juego.equals("Mario Kart Tour")) {
            juego = "<html>¡Calienta motores porque Mario Kart Tour, el primer juego de Mario Kart!<br>";
        }
        if (juego.equals("Carnage")) {
            juego = "<html>Un combate épico de coches con montones de vehículos, entornos para destruir,<br>"
                    + " docenas de mapas increíbles, física realista y un estilo artístico único.";
        }
        if (juego.equals("Voxel Pirates")) {
            juego = "<html>¡Compite con tus amigos por el control de los siete mares en salvajes<br>"
                    + " batallas cooperativas!";
        }
        if (juego.equals("OVERPASS")) {
            juego = "<html>Conduce buggies y quads de grandes fabricantes y salva todo tipo de obstáculos<br>"
                    + " en circuitos extremos todoterreno de gran exigencia técnica.";
        }
        if (juego.equals("Crash")) {
            juego = "¡Crash vuelve al volante!";
        }
        return juego;
    }

    public String Estrategia(String juego) {
        if (juego.equals("Warhammer")) {
            juego = "<html>Hazte con el control del ejército más avanzado de todo el Imperio:<br>"
                    + "el Adeptus Mechanicus.";
        }
        if (juego.equals("Demon's")) {
            juego = "<html>Un RPG táctico por turnos con 30 tipos de personajes y más<br>"
                    + "de 50 horas de juego.";
        }
        if (juego.equals("Empire of Sin")) {
            juego = "<html>Adéntrate en los bajos fondos del Chicago de los años 20 en<br>"
                    + "Empire of Sin para Nintendo Switch.";
        }
        if (juego.equals("Despotism")) {
            juego = "<html>Una poderosa IA está esclavizando a la humanidad… ¡Pero qué más da,<br>"
                    + "estamos en el bando ganador!";
        }

        if (juego.equals("XCOM")) {
            juego = "<html>Despierta una resistencia global y salva a la Tierra de la ocupación alienígena<br>"
                    + "en XCOM 2 para Nintendo Switch.";
        }
        return juego;
    }

    public String Terror(String juego) {
        if (juego.equals("Resident")) {
            juego = "<html>Resident Evil, la remasterización de su remake para GameCube, y Resident Evil 4 son<br>"
                    + " dos de las entregas más aclamadas de toda la saga, por lo que ahora tendremos, por<br>"
                    + " primera vez, la oportunidad de disfrutarlos en formato portátil.";
        }
        if (juego.equals("Outlast")) {
            juego = "<html>Se trata de la secuela del exitoso juego de supervivencia y terror Outlast. Aunque <br>"
                    + "cuenta con nuevos personajes y una nueva ambientación, esta entrega tiene<br>"
                    + " lugar en el mismo universo y conecta de alguna forma con la historia del primero.";
        }
        if (juego.equals("Layers")) {
            juego = "<html>Layers of Fear es un juego de terror en primera persona, ambientado en un <br>"
                    + "decadente siglo XIX, en el que encarnaremos a un pintor con una grave <br>"
                    + "enfermedad mental que mientras intenta crear la obra maestra de su vida,<br>"
                    + "descubrirá una oscura historia sobre su pasado. ";
        }
        if (juego.equals("Viviette")) {
            juego = "<html>Viviette es una aventura de terror, exploración y puzles diseñada al estilo de los <br>"
                    + "videojuegos de SNES y la época de los 16 bit. Nos invita a explorar una mansión en <br>"
                    + "la que radica una fuerza maligna, ofreciéndonos un argumento rico lleno de <br>"
                    + "elementos especiales y sobrenaturales.";
        }
        if (juego.equals("The Padre")) {
            juego = "<html>The Padre es un juego de terror y aventura gráfica al estilo de los viejos clásicos. The<br>"
                    + "Padre ofrece una jugabilidad basada en las raíces del point-and-click, añadiendo un<br>"
                    + "componente de acción en los combates. Promete gran cantidad de horas de juego y <br>"
                    + "una ambientación muy trabajada";
        }
        return juego;
    }
}
