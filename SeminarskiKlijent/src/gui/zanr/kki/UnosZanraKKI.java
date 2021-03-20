/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.zanr.kki;

import domen.Zanr;
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
public class UnosZanraKKI {

    public static int vratiID(JTextField txtZanrID) {
        int zanrID = -1;
            
        try {
            KlijentskiZahtev kz = new KlijentskiZahtev();
            kz.setOperacija(Konstante.VRATI_ID_ZANRA);
            
            KomunikacioniKontroler.vratiInstancu().posaljiZahtev(kz);
            ServerskiOdgovor so = KomunikacioniKontroler.vratiInstancu().primiOdgovor();
            zanrID = (int) so.getOdgovor();
            txtZanrID.setText(String.valueOf(zanrID));
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(UnosZanraKKI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return zanrID;
    }

    public static boolean sacuvajZanr(JTextField txtZanrID, JTextField txtNazivZanra) {
        boolean uspesno = false;
            
        try {
            Zanr zanr = new Zanr(Integer.valueOf(txtZanrID.getText()), txtNazivZanra.getText());
            KlijentskiZahtev kz = new KlijentskiZahtev(zanr, Konstante.SACUVAJ_ZANR);
            KomunikacioniKontroler.vratiInstancu().posaljiZahtev(kz);
            
            ServerskiOdgovor so = KomunikacioniKontroler.vratiInstancu().primiOdgovor();
            uspesno = (boolean) so.getOdgovor();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(UnosZanraKKI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return uspesno;
    }
    
}
