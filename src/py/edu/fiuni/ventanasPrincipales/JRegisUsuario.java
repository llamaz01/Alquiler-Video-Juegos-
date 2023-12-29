/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.fiuni.ventanasPrincipales;

import py.edu.fiuni.addImagenes.FondoPanel;
import py.edu.fiuni.addImagenes.AddImage;
import py.edu.fiuni.cliente.Cliente;
import py.edu.fiuni.cliente.ClientesMetodos;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 * Esta clase se encarga de pedir los datos correspondientes al usuario
 *
 * @author Jorge Martinez
 */
public class JRegisUsuario extends javax.swing.JFrame {

    /**
     * Creates new form PanelDevolucion
     */
    public JRegisUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        add.iconoLabel("src/Iconos/Logo.png", jlbLogo);
        add.iconoLabel("src/Fondos/addUSSER.png", jlbAddUsser);
        cliente = new Cliente();
        mdosCliente = new ClientesMetodos();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new FondoPanel("/Fondos/PanelUsuario..gif");
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldBarrio = new javax.swing.JTextField();
        jlbLogo = new javax.swing.JLabel();
        btnAgregarUSSER = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCI = new javax.swing.JTextField();
        jlbAddUsser = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido");

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Domicilio");

        jlbLogo.setBackground(new java.awt.Color(102, 0, 102));
        jlbLogo.setForeground(new java.awt.Color(153, 153, 0));

        btnAgregarUSSER.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAgregarUSSER.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarUSSER.setText("Agregar");
        btnAgregarUSSER.setBorderPainted(false);
        btnAgregarUSSER.setContentAreaFilled(false);
        btnAgregarUSSER.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarUSSER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarUSSERMouseClicked(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("C.I.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldNombre)
                    .addComponent(jTextFieldApellido)
                    .addComponent(jTextFieldBarrio, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCI)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbAddUsser, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnAgregarUSSER)
                .addGap(46, 46, 46))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jlbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCI, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancelar)
                        .addComponent(btnAgregarUSSER))
                    .addComponent(jlbAddUsser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Hace invisible la ventana
     *
     * @param evt
     */
    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked

        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarMouseClicked
    /**
     * Este metodo se encarga de registrar a nuevos clientes asegurandose
     * primero de que estos ya no esten agregados dentro de la lista
     *
     * @param evt
     */
    private void btnAgregarUSSERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarUSSERMouseClicked
        String mensaje = "";
        String nombre = "";
        String apellido = "";
        String ci = "";
        String domicilio = "";

        nombre = jTextFieldNombre.getText().trim();
        apellido = jTextFieldApellido.getText().trim();
        ci = jTextFieldCI.getText().trim();
        domicilio = jTextFieldBarrio.getText().trim();

        verificarCliente(nombre, apellido, ci, domicilio, mensaje);
    }//GEN-LAST:event_btnAgregarUSSERMouseClicked
    /**
     * Este metodo se encarga de verificar algunos posibles errores a la hora de
     * registrar al usuario, si no encuentra tales errores, las registra
     *
     * @param nombre
     * @param apellido
     * @param ci
     * @param domicilio
     * @param mensaje
     * @throws HeadlessException
     */
    private void verificarCliente(String nombre, String apellido, String ci, String domicilio, String mensaje) throws HeadlessException {
        //ESTO VERFICA SI ES QUE EL ENCARGADO NO DIGITA NADA
        if (nombre.equals("") || apellido.equals("") || ci.equals("") || domicilio.equals("")) {
            mensaje = "ERROR";
            JOptionPane.showMessageDialog(null, "➣ Los datos digitados, no estan completos ✘", "ERROR ↵ ↵ ", 0, add.dimensionarImagen("src/ImagenJuegos/error.png", 70, 70));
        } else if (!mdosCliente.agregarCliente(ci) && mensaje != ("ERROR")) {
            JOptionPane.showMessageDialog(null, "✍ El cliente ya esta dentro de la lista, Por favor inicie Sesion ツ", "ERROR ↵ ↵ ", 0, add.dimensionarImagen("src/ImagenJuegos/error.png", 70, 70));
        } else if (mdosCliente.agregarCliente(ci) && mensaje != ("ERROR")) {
            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            cliente.setCedula(ci);
            cliente.setDireccion(domicilio);
            mdosCliente.guardarCliente(cliente);
            mdosCliente.archivosDeCliente(cliente);

            JOptionPane.showMessageDialog(null, "➣ Agregado con exito ✔", "", 0, add.dimensionarImagen("src/ImagenJuegos/agregar.png", 70, 70));
            this.setVisible(false);
        }
    }

    //Clases
    private final Cliente cliente;
    private final ClientesMetodos mdosCliente;

    private AddImage add = new AddImage();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarUSSER;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldBarrio;
    private javax.swing.JTextField jTextFieldCI;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JLabel jlbAddUsser;
    private javax.swing.JLabel jlbLogo;
    // End of variables declaration//GEN-END:variables
}
