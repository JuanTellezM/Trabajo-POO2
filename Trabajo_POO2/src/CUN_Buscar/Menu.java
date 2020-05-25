
package CUN_Buscar;
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
         setTitle("Menu");
        
        //setLocationRelativeTo(null);
        
          setSize(500, 400);
        setLocation(300, 200);
        
       
  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        profesor = new javax.swing.JButton();
        estudiante = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        getContentPane().setLayout(null);

        profesor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/profesor1.png"))); // NOI18N
        profesor.setText("Profesor");
        profesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profesorActionPerformed(evt);
            }
        });
        getContentPane().add(profesor);
        profesor.setBounds(40, 280, 160, 70);

        estudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estudiante1.png"))); // NOI18N
        estudiante.setText("Estudiante");
        estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estudianteActionPerformed(evt);
            }
        });
        getContentPane().add(estudiante);
        estudiante.setBounds(310, 280, 170, 70);

        salir.setText("Cerrar Sesion");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir);
        salir.setBounds(340, 10, 140, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cc2.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 70, 260, 200);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/jp.png"))); // NOI18N
        getContentPane().add(jButton3);
        jButton3.setBounds(0, 0, 540, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profesorActionPerformed
        Profesores m=new Profesores();
        m.show();
        this.dispose(); 
    }//GEN-LAST:event_profesorActionPerformed

    private void estudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estudianteActionPerformed
        Estudiantes m=new Estudiantes();
        m.show();
        this.dispose(); 
    }//GEN-LAST:event_estudianteActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
     this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton estudiante;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton profesor;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables

  
}
