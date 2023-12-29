/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.fiuni.ventanasPrincipales;

import py.edu.fiuni.addImagenes.AddImage;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Esta clase contiene a metodos que seran utilizados para llevar a link o
 * añadir mensajes
 *
 * @author Jorge Martinez
 */
public class PagRedSocial {

    public PagRedSocial() {
        add = new AddImage();
    }

    /**
     * Este metodo sirve para llevar a un enlace dentro de la web
     *
     * @param web
     */
    public void paginasWeb(String web) {

        try {
            Desktop.getDesktop().browse(new URI(web));
        } catch (URISyntaxException ex) {
            Logger.getLogger(PagRedSocial.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PagRedSocial.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Este metodo sirve para introducir imagenes con tamaños especificos
     */
    public void addMensajes(String mensaje, String imagen, int ancho, int alto) {
        JOptionPane.showMessageDialog(null, null, mensaje, 0, add.dimensionarImagen(imagen, ancho, alto));

    }

    private AddImage add;
}
