/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.qc.bdeb.P56.NSMMessenger.Vue;

import ca.qc.bdeb.P56.NSMMessenger.IClient;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Marc-Antoine
 */
public class CompteUtilisateur extends javax.swing.JFrame {

    IClient client;
    
    public CompteUtilisateur(IClient client) {
        initComponents();
        this.client = client;
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCreation = new javax.swing.JPanel();
        txtPassword = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        btnCreerCompte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtPassword.setText("Mot de passe");

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtEmail.setText("Courriel");

        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtUsername.setText("Nom d'utilisateur");

        btnCreerCompte.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCreerCompte.setText("Creer compte");
        btnCreerCompte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreerCompteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCreationLayout = new javax.swing.GroupLayout(pnlCreation);
        pnlCreation.setLayout(pnlCreationLayout);
        pnlCreationLayout.setHorizontalGroup(
            pnlCreationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCreationLayout.createSequentialGroup()
                .addGroup(pnlCreationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCreerCompte, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCreationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlCreationLayout.createSequentialGroup()
                            .addGap(332, 332, 332)
                            .addGroup(pnlCreationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPassword)
                                .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)))
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(332, Short.MAX_VALUE))
        );
        pnlCreationLayout.setVerticalGroup(
            pnlCreationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCreationLayout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCreerCompte, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCreation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCreation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreerCompteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreerCompteActionPerformed
        client.creerCompte(txtUsername.getText(), txtPassword.getText(), txtEmail.getText());
        this.dispose();
    }//GEN-LAST:event_btnCreerCompteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreerCompte;
    private javax.swing.JPanel pnlCreation;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
