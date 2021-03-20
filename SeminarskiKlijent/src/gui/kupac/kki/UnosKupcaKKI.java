/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.kupac.kki;

import domen.Kupac;
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
public class UnosKupcaKKI {

    public static int vratiID(JTextField txtKupacID) {
        int kupacID = -1;
        
        try {
            KlijentskiZahtev kz = new KlijentskiZahtev();
            kz.setOperacija(Konstante.VRATI_ID_KUPCA);
            KomunikacioniKontroler.vratiInstancu().posaljiZahtev(kz);
            ServerskiOdgovor so = KomunikacioniKontroler.vratiInstancu().primiOdgovor();
            kupacID = (int) so.getOdgovor();
            txtKupacID.setText(String.valueOf(kupacID));
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(UnosKupcaKKI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return kupacID;
    }

    public static boolean sacuvajKupca(JTextField txtKupacID, JTextField txtImePrezime, JTextField txtAdresa, JTextField txtBrojTelefona) {
        boolean uspesno = false;
            
        try {
            int kupacID = Integer.parseInt(txtKupacID.getText());
            String imePrezime = txtImePrezime.getText();
            String adresa = txtAdresa.getText();
            String brojTelefona = txtBrojTelefona.getText();
            
            Kupac kupac = new Kupac(kupacID, imePrezime, adresa, brojTelefona);
            
            KlijentskiZahtev kz = new KlijentskiZahtev();
            kz.setParametar(kupac);
            kz.setOperacija(Konstante.SACUVAJ_KUPCA);
            KomunikacioniKontroler.vratiInstancu().posaljiZahtev(kz);
            
            ServerskiOdgovor so = KomunikacioniKontroler.vratiInstancu().primiOdgovor();
            uspesno = (boolean) so.getOdgovor();
            
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(UnosKupcaKKI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return uspesno;
    }

}
