/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.fiuni.nuevosDatosXBOX;

import py.edu.fiuni.Juegos.Juegos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 * Esta clase contiene a la base datos de los juegos de XBOX que se vayan
 * agregando
 *
 * @author Jorge Martinez
 */
public class BaseXbox {

    /**
     * Añade los datos en un bloc de notas
     *
     * @param j
     */
    public void guardarEnArchivos(Juegos j) {
        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter("juegosXbox.txt", true));
            bw.write(j.getTitulo());
            bw.write("|" + "❛" + j.getDescripcion() + "❜");
            bw.write("|" + j.getCategoria());
            bw.write("|" + j.getMonto());
            bw.write("\n");
            bw.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Creando la carpeta .txt, Intente nuevamente");
        }
    }

    /**
     * Si el juego introducido existe, retorna false y si no retona true
     *
     * @param juego
     * @return
     */
    public boolean existeDentroDeLaBase(String juego) {
        for (Object lista : datosJuegosXbox()) {
            if (lista.equals(juego)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Retorna un arreglo con los datos del bloc de notas que existen dentro del
     * el
     *
     * @return
     */
    public String[] datosJuegosXbox() {
        ArrayList<String> lista = new ArrayList<String>();
        String[] arreglo = new String[lista.size()];
        try {
            BufferedReader buffer = new BufferedReader(new FileReader("juegosXbox.txt"));
            String p;
            while ((p = buffer.readLine()) != null) {
                StringTokenizer datos = new StringTokenizer(p, "|");
                ArrayList<String> list = new ArrayList<String>();
                while (datos.hasMoreTokens()) {
                    list.add(datos.nextToken());
                }
                for (String v : list) {
                    lista.add(v);
                }
                arreglo = lista.toArray(arreglo);
            }
        } catch (Exception ex) {
            System.out.println("Error" + ex.getLocalizedMessage());
        }
        return arreglo;
    }

    /**
     * Retorna el monto del juego que encuentre en la base datos 
     *
     * @param juego
     * @return
     */
    public String dameMonto(String juego) {
        String[] arreglo = new String[datosJuegosXbox().length];
        String monto = "";
        arreglo = datosJuegosXbox();

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].equals(juego)) {
                monto = arreglo[i + 3];
            }
        }
        return monto;
    }

}
