/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.fiuni.administrador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Vector;

/**
 * Esta clase contiene los datos de la semana guardadas en la base de datos
 *
 * @author Jorge Martinez
 */
public class DatosSemanales {

    /**
     * Este metodo retorna un ArrayList con los elementos del txt que esten
     * dentro de estos
     *
     * @return
     */
    public ArrayList<Object> baseSemanal() {
        ArrayList<Object> list = new ArrayList<>();
        try {
            BufferedReader buffer = new BufferedReader(new FileReader("datosSemanales.txt"));
            String p;
            while ((p = buffer.readLine()) != null) {
                StringTokenizer datos = new StringTokenizer(p, "|");
                Vector vector = new Vector();
                while (datos.hasMoreTokens()) {
                    vector.addElement(datos.nextToken());
                }
                vector.forEach((v) -> {
                    list.add(v);
                });
            }
        } catch (Exception ex) {
            System.out.println("Error" + ex.getLocalizedMessage());
        }
        return list;
    }

}
