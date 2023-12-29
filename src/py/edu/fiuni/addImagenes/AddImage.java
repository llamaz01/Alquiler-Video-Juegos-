/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.fiuni.addImagenes;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 * Clase que se encarga de agregar imagenes
 *
 * @author Luz Lamas
 */
public class AddImage {

    /**
     * Metodo que se encarga de agregar imagenes al jLabel
     *
     * @param direccion
     * @param label
     */
    public void iconoLabel(String direccion, JLabel label) {
        ImageIcon imagen = new ImageIcon(direccion);
        Icon ico = new ImageIcon(imagen.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(ico);
        //this.repaint();
    }

    /**
     * Metodo que agrega imagenes a los botones
     *
     * @param direccion
     * @param button
     */
    public void addBtnImagen(String direccion, JButton button) {
        ImageIcon imagen = new ImageIcon(direccion);
        Icon ico = new ImageIcon(imagen.getImage().getScaledInstance(button.getWidth(), button.getHeight(), Image.SCALE_DEFAULT));
        Icon ico2 = new ImageIcon(imagen.getImage().getScaledInstance(button.getWidth() - 10, button.getHeight() - 10, Image.SCALE_DEFAULT));
        button.setIcon(ico);
        button.setContentAreaFilled(false);
        button.setPressedIcon(ico2);
    }

    /**
     * Esta clase redimensiona la imagen que se le pase
     *
     * @author Jorge Martinez
     * @param direccion
     * @param ancho
     * @param largo
     * @return
     */
    public Icon dimensionarImagen(String direccion, int ancho, int largo) {
        ImageIcon imagen = new ImageIcon(direccion);
        Icon ico = new ImageIcon(imagen.getImage().getScaledInstance(ancho, largo, Image.SCALE_DEFAULT));
        return ico;
    }

}
