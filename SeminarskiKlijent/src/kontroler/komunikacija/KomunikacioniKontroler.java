/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler.komunikacija;

import java.awt.Font;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import transfer.KlijentskiZahtev;
import transfer.ServerskiOdgovor;

/**
 *
 * @author katarina
 */
public class KomunikacioniKontroler {
    
    private Socket socket;
    private static KomunikacioniKontroler instanca;
    
    private KomunikacioniKontroler(){
        try {
            socket = new Socket("localhost", 8989);
            System.out.println("Uspešno povezivanje sa serverom...");
        } catch (IOException ex) {
            Logger.getLogger(KomunikacioniKontroler.class.getName()).log(Level.SEVERE, null, ex);
            JLabel label = new JLabel("Neuspešno povezivanje sa serverom!");
            label.setFont(new Font("Calibri light",  Font.PLAIN, 16));
            JOptionPane.showMessageDialog(null, label, "Greška!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static KomunikacioniKontroler vratiInstancu(){
        if (instanca == null) {
            instanca = new KomunikacioniKontroler();
        }
        return instanca;
    }
    
    public void posaljiZahtev(KlijentskiZahtev kz) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.writeObject(kz);
        out.flush();
    }
    
    public ServerskiOdgovor primiOdgovor() throws IOException, ClassNotFoundException{
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        ServerskiOdgovor so = (ServerskiOdgovor) in.readObject();
        return so;
    }
    
}
