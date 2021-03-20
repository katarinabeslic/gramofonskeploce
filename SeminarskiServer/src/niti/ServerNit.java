/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niti;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author katarina
 */
public class ServerNit extends Thread {
    
    private ServerSocket ss;
    private Socket s;
    private static List<RadSaKlijentomNit> klijenti = new ArrayList<>();

    public ServerNit() {
    }

    @Override
    public void run() {
        try {
            ss = new ServerSocket(8989);
            System.out.println("Server je pokrenut...");
        } catch (IOException ex) {
            Logger.getLogger(ServerNit.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        while (!isInterrupted()) {            
            try {
                s = ss.accept();
                System.out.println("Klijent se uspešno povezao...");
                RadSaKlijentomNit klijent = new RadSaKlijentomNit(s);
                klijenti.add(klijent);
                klijent.start();                
            } catch (IOException ex) {
                Logger.getLogger(ServerNit.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
