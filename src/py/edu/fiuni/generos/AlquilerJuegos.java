/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.fiuni.generos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Clase que se encarga de administrar la base de datos de los juegos alquilados
 *
 * @author Luz Lamas
 */
public class AlquilerJuegos {

    /**
     * Constructor con un array que agregara los juegos
     */
    public AlquilerJuegos() {
        listaJuegos = new ArrayList();

    }

    /**
     * Constructor para añair el nombre y monto del juego
     *
     * @param titulo
     * @param monto
     */
    public AlquilerJuegos(String titulo, String monto) {
        this.titulo = titulo;
        this.monto = monto;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Metodo que se encarga de agregrar el juego a la base de datos
     *
     * @param c
     */
    public void alquilarJuego(AlquilerJuegos c) {
        try {

            BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficheroJuegos, true), "utf-8"));
            //para tomar una separacion
            Fescribe.write(c.getTitulo() + "\t" + c.getMonto() + "\r\n");

            Fescribe.close();

        } catch (Exception ex) {
            //Captura un posible error le imprime en pantalla   
            System.out.println(ex.getMessage());
        }
    }

    /**
     *
     */
    public void agregarJuegos() {
        try {
            String linea = null;
            BufferedReader leerFichero = new BufferedReader(new FileReader(ficheroJuegos));
            while ((linea = leerFichero.readLine()) != null) {
                //este bucle es para meter todos los datos leidos de archivo de texto separlo en atributos y convertirlos a objeto para poder trabajar con el 
                //en esta parte le digo que lo separe en tokens pero ojo estos tokens son solo Strings tengo que convertirlos para poder emterlos en el objeto y trabajar con ellos
                StringTokenizer mistokens = new StringTokenizer(linea, "\t");
                String titulo = mistokens.nextToken().trim();
                String monto = mistokens.nextToken().trim();

                //lo paso al constructor para que me cree los objetos
                juegos = new AlquilerJuegos(titulo, monto);
                //lo añado al vecto para poder jugetear con el 
                listaJuegos.add(juegos);

            }
            leerFichero.close();

        } catch (Exception ex) {
            //Captura un posible error le imprime en pantalla   
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Metodo que se encarga de eliminar los datos del array
     */
    public void ActualizarArraList() {
        //Este es el ArrayList declarado arriba 
        listaJuegos.clear();
        agregarJuegos();
    }

    /**
     * metodo que se encarga de verificar si el juego ya a sido alquilado
     *
     * @param juego
     * @return
     */
    public boolean existeJuego(String juego) {
        if (listaJuegos.size() == 0) {
            agregarJuegos();
        }
        for (AlquilerJuegos n : listaJuegos) {
            if (n.getTitulo().equals(juego)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Metodo que se encarga de devolver el juego eliminandolo de la base de
     * datos de juegos alquilaos
     *
     * @param nombre
     */
    public void devolverJuego(String nombre) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroJuegos));
            for (AlquilerJuegos n : listaJuegos) {
                if (!n.getTitulo().equals(nombre)) {
                    bw.write(n.titulo + "\t" + n.monto + "\r\n");
                }
            }
            bw.close();
            listaJuegos.clear();
            agregarJuegos();

        } catch (Exception ex) {
            //Captura un posible error le imprime en pantalla   
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Metodo que retorna un arreglo con todos los nombres de los juegos
     * alquilados
     *
     * @return
     */
    public String[] MostrarObjetos() {
        ArrayList<String> juego = new ArrayList();
        String[] lista;
        if (listaJuegos.size() == 0) {
            agregarJuegos();
        }
        for (AlquilerJuegos n : listaJuegos) {
            juego.add(n.getTitulo());
        }
        lista = new String[juego.size()];
        for (int i = 0; i < juego.size(); i++) {
            lista[i] = juego.get(i);
        }
        return lista;
    }

    /**
     * metodo que devuelve el ultimo juego alquilado
     *
     * @return
     */
    public String juegoComprado() {
        ArrayList<String> juego = new ArrayList();
        String lista = " ";
        if (listaJuegos.size() == 0) {
            agregarJuegos();
        }
        for (AlquilerJuegos n : listaJuegos) {
            juego.add(n.getTitulo());
        }
        lista = juego.get(juego.size() - 1);
        return lista;
    }

    /**
     * Metodo que devuelve el ultimo monto del juego alquilado
     *
     * @return
     */
    public String montoDeJuego() {
        ArrayList<String> juego = new ArrayList();
        String lista = " ";
        if (listaJuegos.size() == 0) {
            agregarJuegos();
        }
        for (AlquilerJuegos n : listaJuegos) {
            juego.add(n.getMonto());
        }
        lista = juego.get(juego.size() - 1);
        return lista;
    }

    private String titulo;
    private String monto;
    //base de datos de juegos alquilados
    File ficheroJuegos = new File("juegos.txt");
    private ArrayList<AlquilerJuegos> listaJuegos;
    private AlquilerJuegos juegos = null;

}
