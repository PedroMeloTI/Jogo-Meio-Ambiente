package com.Views;

import javax.swing.JLabel;

/**
 *
 * @author pedro
 */

public final class BemVindo extends javax.swing.JFrame {
    

    public BemVindo() {
        initComponents();
        this.setLocationRelativeTo(null);        
    }
    
    String y;
    public void getlbl(JLabel l){
        l.getText();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblJogador = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAjuda = new javax.swing.JButton();
        btnJogar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        lblJogador.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        getContentPane().add(lblJogador);
        lblJogador.setBounds(30, 70, 370, 50);
        lblJogador.getAccessibleContext().setAccessibleDescription("");

        jLabel2.setFont(new java.awt.Font("URW Chancery L", 0, 48)); // NOI18N
        jLabel2.setText("        EDUCATRASH");
        jLabel2.setAutoscrolls(true);
        jLabel2.setBorder(null);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel2.setPreferredSize(new java.awt.Dimension(255, 200));
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 490, 60);

        btnAjuda.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        btnAjuda.setText("Como jogar");
        btnAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjudaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAjuda);
        btnAjuda.setBounds(50, 290, 190, 50);

        btnJogar.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        btnJogar.setText("Jogar");
        btnJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogarActionPerformed(evt);
            }
        });
        getContentPane().add(btnJogar);
        btnJogar.setBounds(50, 220, 190, 50);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel3.setText("O que gostaria de fazer?");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(29, 137, 290, 50);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Imagens/meio-ambiente.jpeg"))); // NOI18N
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -20, 510, 420);

        setSize(new java.awt.Dimension(509, 387));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjudaActionPerformed
        Help h = new Help();        
        h.setVisible(true);
        
    }//GEN-LAST:event_btnAjudaActionPerformed

    private void btnJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogarActionPerformed
        Jogo jogo = new Jogo();
        jogo.setVisible(true);
        dispose();
       
    }//GEN-LAST:event_btnJogarActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BemVindo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BemVindo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BemVindo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BemVindo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
    }   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjuda;
    private javax.swing.JButton btnJogar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    protected static javax.swing.JLabel lblJogador;
    // End of variables declaration//GEN-END:variables
}
