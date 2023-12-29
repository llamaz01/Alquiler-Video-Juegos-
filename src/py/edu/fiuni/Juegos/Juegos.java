package py.edu.fiuni.Juegos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Esta clase contiene todos los getters y setters de la clase juego
 *
 * @author Jorge Martinez
 */
public class Juegos {

    /**
     * Este es el constructor de la clase juego
     *
     * @param titulo
     * @param Categoria
     * @param descripcion
     * @param monto
     */
    public Juegos(String titulo, String Categoria, String descripcion, double monto) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.monto = monto;
        this.categoria = categoria;

    }

    public Juegos() {
        this.titulo = " ";
        this.descripcion = " ";
        this.monto = 0.0;
        this.categoria = " ";

    }

    public int getNumJuego() {
        return numJuego;
    }

    public void setNumJuego(int numJuego) {
        this.numJuego = numJuego;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    private String titulo;
    private String descripcion;
    private double monto;
    private String categoria;
    private int numJuego;

}
