/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.qc.bdeb.P56.NSMMessenger.Vue;

import ca.qc.bdeb.P56.NSMMessenger.Controleur.InfoCreation;
import ca.qc.bdeb.P56.NSMMessenger.Controleur.NSMMessenger.Observation;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Marc-Antoine
 */
public class CompteUtilisateur extends javax.swing.JFrame {

   ChatGUI gui;
    
    public CompteUtilisateur(ChatGUI gui) {
        this.gui = gui;
        initComponents();
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
        txtEmail = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        btnCreerCompte = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirmation = new javax.swing.JPasswordField();
        btnCreerCompte1 = new javax.swing.JButton();
        lblCourriel = new javax.swing.JLabel();
        lblConfirmation = new javax.swing.JLabel();
        lblMotDePasse = new javax.swing.JLabel();
        lblUtilisateur = new javax.swing.JLabel();
        lblErreur = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlCreation.setMaximumSize(new java.awt.Dimension(300, 400));
        pnlCreation.setMinimumSize(new java.awt.Dimension(300, 400));
        pnlCreation.setPreferredSize(new java.awt.Dimension(300, 400));

        txtEmail.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N

        txtUsername.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N

        btnCreerCompte.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnCreerCompte.setText("Creer");
        btnCreerCompte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreerCompteActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        txtConfirmation.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        txtConfirmation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmationActionPerformed(evt);
            }
        });

        btnCreerCompte1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnCreerCompte1.setText("Annuler");
        btnCreerCompte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreerCompte1ActionPerformed(evt);
            }
        });

        lblCourriel.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        lblCourriel.setText("Courriel");

        lblConfirmation.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        lblConfirmation.setText("Confirmation");

        lblMotDePasse.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        lblMotDePasse.setText("Mot de passe");

        lblUtilisateur.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        lblUtilisateur.setText("Utilisateur");

        lblErreur.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblErreur.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout pnlCreationLayout = new javax.swing.GroupLayout(pnlCreation);
        pnlCreation.setLayout(pnlCreationLayout);
        pnlCreationLayout.setHorizontalGroup(
            pnlCreationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCreationLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(pnlCreationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCourriel)
                    .addGroup(pnlCreationLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(pnlCreationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail)
                            .addGroup(pnlCreationLayout.createSequentialGroup()
                                .addComponent(btnCreerCompte1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCreerCompte, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCreationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCreationLayout.createSequentialGroup()
                                    .addComponent(lblConfirmation)
                                    .addGap(109, 109, 109))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCreationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblMotDePasse)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                    .addComponent(lblUtilisateur)
                                    .addComponent(txtUsername)))
                            .addComponent(lblErreur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(txtConfirmation))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        pnlCreationLayout.setVerticalGroup(
            pnlCreationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCreationLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblErreur, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUtilisateur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMotDePasse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblConfirmation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConfirmation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCourriel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCreationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreerCompte, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreerCompte1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCreation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCreation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreerCompteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreerCompteActionPerformed
        char[] motDePasse = txtPassword.getPassword();  
        String motDePasseString = new String(motDePasse); 
        char[] motDePasseConfirmation = txtConfirmation.getPassword();  
        String motDePasseConfirmationString = new String(motDePasseConfirmation); 
        Pattern pattern = Pattern.compile("([A-Z0-9._%+-]+@+[A-Z0-9.-]+\\.[A-Z]{2,4})");
        Matcher matcher = pattern.matcher(txtEmail.getText().toUpperCase());
        
        if((motDePasseString.equals(motDePasseConfirmationString))){
            if (!(txtUsername.getText().isEmpty()) && !(motDePasseString.isEmpty())
                    && !(motDePasseConfirmationString.isEmpty())&& !(txtEmail.getText().isEmpty())){ 
                if (matcher.matches()){ 
                    InfoCreation ic = new InfoCreation();
                    ic.username = txtUsername.getText();
                    ic.password = motDePasseString;
                    ic.email = txtEmail.getText();
                    gui.aviserObservateurs(Observation.CREATION, ic);
                }
                else{
                    lblErreur.setText("Courriel non valide");
                }
            }
            else
            {
              lblErreur.setText("Tous les champs doivent être remplis"); 
            }
        }
        else{
            lblErreur.setText("Vos mots de passes correspondent pas");
        }
            
    }//GEN-LAST:event_btnCreerCompteActionPerformed

    private void btnCreerCompte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreerCompte1ActionPerformed
        gui.retourLogin();
    }//GEN-LAST:event_btnCreerCompte1ActionPerformed

    private void txtConfirmationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmationActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreerCompte;
    private javax.swing.JButton btnCreerCompte1;
    private javax.swing.JLabel lblConfirmation;
    private javax.swing.JLabel lblCourriel;
    private javax.swing.JLabel lblErreur;
    private javax.swing.JLabel lblMotDePasse;
    private javax.swing.JLabel lblUtilisateur;
    private javax.swing.JPanel pnlCreation;
    private javax.swing.JPasswordField txtConfirmation;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables


}
