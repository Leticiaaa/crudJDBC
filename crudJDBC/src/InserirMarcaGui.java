/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leticia_macena
 */
public class InserirMarcaGui extends javax.swing.JFrame {

    /**
     * Creates new form MarcaGui
     */
    public InserirMarcaGui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JPanel();
        inserirMarcaTxt = new javax.swing.JLabel();
        nomeTxt = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        mTxt = new javax.swing.JLabel();
        campoM = new javax.swing.JTextField();
        limparJB = new javax.swing.JButton();
        salvarJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painel.setBackground(new java.awt.Color(204, 204, 255));
        painel.setLayout(null);

        inserirMarcaTxt.setText("Inserir Marca");
        painel.add(inserirMarcaTxt);
        inserirMarcaTxt.setBounds(30, 20, 63, 14);

        nomeTxt.setText("Nome:");
        painel.add(nomeTxt);
        nomeTxt.setBounds(20, 120, 31, 14);

        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });
        painel.add(campoNome);
        campoNome.setBounds(70, 120, 250, 20);

        mTxt.setText("M:");
        painel.add(mTxt);
        mTxt.setBounds(20, 80, 12, 14);

        campoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoMActionPerformed(evt);
            }
        });
        painel.add(campoM);
        campoM.setBounds(70, 80, 70, 20);

        limparJB.setText("Limpar");
        painel.add(limparJB);
        limparJB.setBounds(190, 160, 63, 23);

        salvarJB.setText("Salvar");
        painel.add(salvarJB);
        salvarJB.setBounds(260, 160, 63, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void campoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoMActionPerformed

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
            java.util.logging.Logger.getLogger(InserirMarcaGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InserirMarcaGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InserirMarcaGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InserirMarcaGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InserirMarcaGui().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoM;
    private javax.swing.JTextField campoNome;
    private javax.swing.JLabel inserirMarcaTxt;
    private javax.swing.JButton limparJB;
    private javax.swing.JLabel mTxt;
    private javax.swing.JLabel nomeTxt;
    private javax.swing.JPanel painel;
    private javax.swing.JButton salvarJB;
    // End of variables declaration//GEN-END:variables
}
