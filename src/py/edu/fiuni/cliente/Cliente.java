/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.fiuni.cliente;

/**
 * Esta clase contiene los getters y setters de los clientes
 *
 * @author Jorge Martinez
 */
public class Cliente {

    public Cliente(String nombre, String apellido, String direccion, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;

    }

    public Cliente() {
        this.nombre = " ";
        this.apellido = " ";
        this.cedula = " ";
        this.direccion = " ";

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    private String apellido;
    private String cedula;
    private String nombre;
    private String direccion;


}
