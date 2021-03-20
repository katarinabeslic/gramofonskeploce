/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.diskografskakuca.kki;

import domen.DiskografskaKuca;
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
public class UnosDiskografskeKuceKKI {

    public static int vratiID(JTextField txtDiskografskaKucaID) {
        int diskografskaKucaID = -1;
            
        try {
            KlijentskiZahtev kz = new KlijentskiZahtev();
            kz.setOperacija(Konstante.VRATI_ID_DISKOGRAFSKE_KUCE);
            KomunikacioniKontroler.vratiInstancu().posaljiZahtev(kz);
            ServerskiOdgovor so = KomunikacioniKontroler.vratiInstancu().primiOdgovor();
            diskografskaKucaID = (int) so.getOdgovor();
            txtDiskografskaKucaID.setText(String.valueOf(diskografskaKucaID));
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(UnosDiskografskeKuceKKI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return diskografskaKucaID;
    }

    public static boolean sacuvajDiskografskuKucu(JTextField txtDiskografskaKucaID, JTextField txtNazivDiskografskeKuce) {
        boolean uspesno = false;
            
        try {

            DiskografskaKuca diskografskaKuca = new DiskografskaKuca(Integer.valueOf(txtDiskografskaKucaID.getText()), txtNazivDiskografskeKuce.getText());
            
            KlijentskiZahtev kz = new KlijentskiZahtev(diskografskaKuca, Konstante.SACUVAJ_DISKOGRAFSKU_KUCU);
            KomunikacioniKontroler.vratiInstancu().posaljiZahtev(kz);
            
            ServerskiOdgovor so = KomunikacioniKontroler.vratiInstancu().primiOdgovor();
            uspesno = (boolean) so.getOdgovor();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(UnosDiskografskeKuceKKI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return uspesno;
    }
    
}
