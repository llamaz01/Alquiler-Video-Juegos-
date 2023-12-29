/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.fiuni.cliente;

import py.edu.fiuni.dias.DayMetodos;
import py.edu.fiuni.administrador.DatosSemanales;
import py.edu.fiuni.generos.AlquilerJuegos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 * Esta clase contiene varios metodos relacionados a clientes
 *
 * @author Jorge Martinez
 */
public final class ClientesMetodos {

    public ClientesMetodos() {
        juego = new AlquilerJuegos();
        clientes = new ArrayList<>();
        datos = new DatosSemanales();
        datosClientes = new DatosClientes();

    }

    /**
     * Almacena los datos del cliente en un vector
     *
     * @param c
     */
    public void guardarCliente(Cliente c) {
        clientes.add(c);

    }

    /**
     * Almacena en txt
     *
     * @param c
     */
    public void guardarEnArchivos(Cliente c) {
        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter("registro.txt", true));

            DayMetodos day = new DayMetodos();

            bw.write(c.getNombre());
            bw.write("|" + c.getApellido());
            bw.write("|" + c.getCedula());
            bw.write("\n");
            bw.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Creando la carpeta .txt, Intente nuevamente");
        }
    }

    /**
     * Retorna un ArrayList con los datos de los clientes registrados
     *
     * @return
     */
    public ArrayList<Object> listaDeRegistros() {
        ArrayList<Object> list = new ArrayList<>();
        try {
            BufferedReader buffer = new BufferedReader(new FileReader("registro.txt"));
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

    /**
     *Metodo que se encarga de devolver el ultimo cliente que a iniciado sesion
     * IMPLEMENTADO: Luz Lamas
     * @return
     */
    public String ultimoRegitro() {
        String cedula;
        ArrayList<Object> lista = this.listaDeRegistros();
        cedula = (String) lista.get(lista.size() - 1);

        return cedula;
    }

    /**
     * Guarda los datos en un txt
     *
     * @param c
     */
    public void guardarCompra(Cliente c) {
        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter("datosSemanales.txt", true));

            DayMetodos day = new DayMetodos();

            bw.write(c.getNombre());
            bw.write("|" + c.getApellido());
            bw.write("|" + c.getCedula());
            bw.write("|" + juego.juegoComprado());
            bw.write("|" + juego.montoDeJuego());
            bw.write("|" + day.listarHoras());
            bw.write("|" + day.listarFechas());
            bw.write("\n");
            bw.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Creando la carpeta .txt, Intente nuevamente");
        }
    }

    /**
     * Este metodo se encargar de almacenar los elementos que se le pase a un
     * archivo txt
     *
     * @param c
     */
    public void archivosDeCliente(Cliente c) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("datosdeClientes.txt", true));
            bw.write(c.getNombre());
            bw.write("|" + c.getApellido());
            bw.write("|" + c.getCedula());
            bw.write("|" + c.getDireccion());
            bw.write("\n");
            bw.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Creando la carpeta .txt, Intente nuevamente");
        }
    }

    /**
     * Retorna true si es que el cliente se encuentra dentro del archivo txt
     *
     * @param cedula
     * @return
     */
    public boolean agregarCliente(String cedula) {
        if (existeCliente(cedula)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Retorna false si es que el cliente ya se encuentra en la lista
     *
     * @param cedula
     * @return
     */
    private boolean existeCliente(String cedula) {
        if (!datos.baseSemanal().stream().noneMatch((lista) -> (lista.equals(cedula)))) {
            return false;
        }
        return true;
    }

    /**
     * Retorna el nombre dependiendo del parametro que le pasemos
     *
     * @param cedula
     * @return
     */
    public String buscarNombre(String cedula) {
        String[] arreglo = new String[datosClientes.datosDeClientes().length];
        String nombre = " ";
        for (int i = 0; i < arreglo.length; i++) {
            arreglo = datosClientes.datosDeClientes();
        }
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].equals(cedula)) {
                nombre = arreglo[i - 2];
            }
        }
        return nombre;
    }

    /**
     * Retorna el apellido dependiendo del parametro que le pasemos
     *
     * @param cedula
     * @return
     */
    public String buscarApellido(String cedula) {
        String[] arreglo = new String[datosClientes.datosDeClientes().length];
        String apellido = " ";
        for (int i = 0; i < arreglo.length; i++) {
            arreglo = datosClientes.datosDeClientes();
        }
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].equals(cedula)) {
                apellido = arreglo[i - 1];
            }
        }
        return apellido;
    }

    /**
     * Retorna el domicilio dependiendo del parametro que le pasemos
     *
     * @param cedula
     * @return
     */
    public String buscarDomicilio(String cedula) {
        String[] arreglo = new String[datosClientes.datosDeClientes().length];
        String domicilio = " ";
        for (int i = 0; i < arreglo.length; i++) {
            arreglo = datosClientes.datosDeClientes();
        }
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].equals(cedula)) {
                domicilio = arreglo[i + 1];
            }
        }
        return domicilio;
    }

    private ArrayList<Cliente> clientes;
    private AlquilerJuegos juego;
    private DatosSemanales datos;
    private DatosClientes datosClientes;
}
