/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.qc.bdeb.P56.NSMMessengerServer;

import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;
import com.esotericsoftware.kryonet.Server;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 1150580
 */
public class NSMServer {
    public static void main(String[] args) {
        
        System.out.println("Je suis un serveur");
        Server server = new Server();
        server.start();
        try {
            server.bind(54123);
        } catch (IOException ex) {
            Logger.getLogger(NSMServer.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erreur: socket ne peut pas être bind");
            System.exit(1);
        }
        
        server.addListener(new Listener(){
            @Override
            public void received (Connection connection, Object object)
            {
                
            }
        });
    }
}
