/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.fiuni.cliente;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Esta clase contiene los datos de los clientes dentro de la base
 *
 * @author Jorge Martinez
 */
public class DatosClientes {

    /**
     * Este metodo retorna un arreglo con los elementos del txt que esten dentro
     * de estos
     *
     * @return
     */
    public String[] datosDeClientes() {
        ArrayList<String> lista = new ArrayList<>();
        String[] arreglo = new String[lista.size()];
        try {
            BufferedReader buffer = new BufferedReader(new FileReader("datosdeClientes.txt"));
            String p;
            while ((p = buffer.readLine()) != null) {

                StringTokenizer datos = new StringTokenizer(p, "|");

                ArrayList<String> list = new ArrayList<>();

                while (datos.hasMoreTokens()) {

                    list.add(datos.nextToken());
                }
                list.forEach((v) -> {
                    lista.add(v);
                });
                arreglo = lista.toArray(arreglo);
            }

        } catch (Exception ex) {
            System.out.println("Error" + ex.getLocalizedMessage());
        }
        return arreglo;
    }

    /**
     * Este metodo se encarga de recorrer todo el arreglo que contiene a los
     * elementos almacenados en la txt de clientes y retorna true si encuentra
     * el elemento que se le pase como parametro
     *
     * @param cedula
     * @return
     */
    public boolean existeCliente(String cedula) {
        String[] arreglo = new String[this.datosDeClientes().length];
        for (String arreglo1 : arreglo) {
            arreglo = this.datosDeClientes();
        }
        for (int i = 0; i < this.datosDeClientes().length; i++) {
            if (arreglo[i].equals(cedula)) {
                return true;
            }
        }
        return false;
    }

}
