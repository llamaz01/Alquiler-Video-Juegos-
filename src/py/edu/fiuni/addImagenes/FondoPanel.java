/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.fiuni.addImagenes;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * Clase que se encarga de agregar imagenes
 *
 * @author Luz Lamas
 */
public class FondoPanel extends JPanel {

    private Image imagen;
    private String direccion;

    public FondoPanel(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Metodo que agrega la imagen y la ajusta a la pantalla
     *
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        imagen = new ImageIcon(getClass().getResource(direccion)).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }

}
