/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.format.kki;

import domen.Format;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import konstante.Konstante;
import kontroler.komunikacija.KomunikacioniKontroler;
import transfer.KlijentskiZahtev;
import transfer.ServerskiOdgovor;

/**
 *
 * @author katarina
 */
public class UnosFormataKKI {

    public static int vratiID(JTextField txtFormatID) {
        int formatID = 1;
            
        try {
            KlijentskiZahtev kz = new KlijentskiZahtev();
            kz.setOperacija(Konstante.VRATI_ID_FORMATA);
            KomunikacioniKontroler.vratiInstancu().posaljiZahtev(kz);
            ServerskiOdgovor so = KomunikacioniKontroler.vratiInstancu().primiOdgovor();
            formatID = (int) so.getOdgovor();
            txtFormatID.setText(String.valueOf(formatID));
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(UnosFormataKKI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return formatID;
    }

    public static boolean sacuvajFormat(JTextField txtFormatID, JTextField txtNazivFormata) {
        boolean uspesno = false;
            
        try {
            Format format = new Format(Integer.valueOf(txtFormatID.getText()), txtNazivFormata.getText());
            KlijentskiZahtev kz = new KlijentskiZahtev(format, Konstante.SACUVAJ_FORMAT);
            KomunikacioniKontroler.vratiInstancu().posaljiZahtev(kz);
            
            ServerskiOdgovor so = KomunikacioniKontroler.vratiInstancu().primiOdgovor();
            uspesno = (boolean) so.getOdgovor();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(UnosFormataKKI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return uspesno;
    }
    
}
