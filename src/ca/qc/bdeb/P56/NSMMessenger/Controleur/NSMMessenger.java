/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.P56.NSMMessenger.Controleur;

import ca.qc.bdeb.P56.NSMMessenger.IClient;
import ca.qc.bdeb.P56.NSMMessenger.NSMClient;
import ca.qc.bdeb.P56.NSMMessenger.Vue.ChatPrimitif;
import ca.qc.bdeb.P56.NSMMessenger.Vue.CompteUtilisateur;
import ca.qc.bdeb.P56.NSMMessenger.Vue.Login;
import ca.qc.bdeb.P56.NSMMessengerCommunication.CreationResponse;
import ca.qc.bdeb.P56.NSMMessengerCommunication.LoginResponse;
import ca.qc.bdeb.mvc.Observateur;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author 1150275
 */
public class NSMMessenger implements Observateur {

    public enum Observation {

        MESSAGERECU, LOGIN, CREATION, REPONSELOGIN, REPONSECREATION, OUVRIRCREATION, ENVOIMESSAGE
    }

    IClient client;
    Login login;
    CompteUtilisateur cu;
    ChatPrimitif chat;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
    // If Nimbus is not available, you can set the GUI to another look and feel.
        }
        System.out.println("Dufour26");
        System.out.println("Grégoire");
        System.out.println("Bye");
        System.out.println("Boudreau");
        System.out.println("Dube");

        NSMMessenger m = new NSMMessenger();

    }

    public NSMMessenger() {
        client = new NSMClient(this);
        login = new Login(this);
    }

    @Override
    public void changementEtat() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void changementEtat(Enum<?> e, Object o) {
        Observation obs = (Observation) e;
        switch (obs) {
            case MESSAGERECU:
                if(chat != null)
                    chat.ajouterMessage((String) o);
                break;
            case REPONSELOGIN:
                switch(((LoginResponse) o).response)
                {
                    case ACCEPTED:
                        login.setVisible(false);
                        chat = new ChatPrimitif(this);
                        break;
                    case REFUSED:
                        //todo: afficher message
                        break;
                }
                break;
            case REPONSECREATION:
                switch(((CreationResponse) o).response)
                {
                    case ACCEPTED:
                        //todo: afficher message
                        if(cu != null)
                            cu.dispose();
                        login.setVisible(true);
                        break;
                        
                    case EXISTING_USERNAME:
                        //todo: afficher message
                        break;
                        
                }
                break;
            case LOGIN:
                client.login((InfoLogin) o);
                break;
            case CREATION:
                client.creerCompte((InfoCreation) o);
                break;
            case OUVRIRCREATION:
                cu = new CompteUtilisateur(this);
                login.setVisible(false);
                break;
        }
    }

}
