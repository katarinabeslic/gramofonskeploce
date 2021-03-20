/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.kupac.kki;

import domen.Kupac;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.JTextField;
import konstante.Konstante;
import kontroler.komunikacija.KomunikacioniKontroler;
import model.TableModelKupac;
import transfer.KlijentskiZahtev;
import transfer.ServerskiOdgovor;

/**
 *
 * @author katarina
 */
public class PretragaKupacaKKI {

    public static void prikaziUTabeli(List<Kupac> listaKupaca, JTable tblKupac) {
        TableModelKupac tmk = new TableModelKupac(listaKupaca);
        tblKupac.setModel(tmk);
    }

    public static List<Kupac> traziKupca(JTextField txtKriterijumZaPretragu, JTable tblKupac) {
        List<Kupac> listaKupaca = new ArrayList<>();
            
        try {
            String kriterijum = txtKriterijumZaPretragu.getText();
            
            Kupac kupac = new Kupac();
            kupac.setImePrezime(kriterijum);
            
            KlijentskiZahtev kz = new KlijentskiZahtev(kupac, Konstante.PRETRAGA_KUPACA);
            KomunikacioniKontroler.vratiInstancu().posaljiZahtev(kz);
            
            ServerskiOdgovor so = KomunikacioniKontroler.vratiInstancu().primiOdgovor();
            listaKupaca = (List<Kupac>) so.getOdgovor();
            
            PretragaKupacaKKI.prikaziUTabeli(listaKupaca, tblKupac);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(PretragaKupacaKKI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listaKupaca;
    }

    public static List<Kupac> vratiSveKupce(JTable tblKupac) {
        List<Kupac> listaKupaca = new ArrayList<>();
        try {
            KlijentskiZahtev kz = new KlijentskiZahtev();
            kz.setOperacija(Konstante.VRATI_SVE_KUPCE);
            KomunikacioniKontroler.vratiInstancu().posaljiZahtev(kz);
            
            ServerskiOdgovor so = KomunikacioniKontroler.vratiInstancu().primiOdgovor();
            listaKupaca = (List<Kupac>) so.getOdgovor();
            prikaziUTabeli(listaKupaca, tblKupac);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(PretragaKupacaKKI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaKupaca;
    }

    public static boolean obrisiKupca(JTable tblKupac) {
        boolean uspesno = false;
            
        try {
            int selektovanRed = tblKupac.getSelectedRow();
            TableModelKupac tmk = (TableModelKupac) tblKupac.getModel();
            Kupac kupac = tmk.vratiKupca(selektovanRed);
            
            KlijentskiZahtev kz = new KlijentskiZahtev(kupac, Konstante.OBRISI_KUPCA);
            KomunikacioniKontroler.vratiInstancu().posaljiZahtev(kz);
            
            ServerskiOdgovor so = KomunikacioniKontroler.vratiInstancu().primiOdgovor();
            uspesno = (boolean) so.getOdgovor();
            if (uspesno) {
                tmk.obrisi(selektovanRed);
            }
            
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(PretragaKupacaKKI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return uspesno;

    }

    public static boolean izmeniKupca(JTextField txtKupacID, JTextField txtImePrezime, JTextField txtAdresa, JTextField txtBrojTelefona) {
        boolean uspesno = false;
            
        try {
            int kupacID = Integer.parseInt(txtKupacID.getText());
            String imePrezime = txtImePrezime.getText();
            String adresa = txtAdresa.getText();
            String brojTelefona = txtBrojTelefona.getText();
            
            Kupac kupac = new Kupac(kupacID, imePrezime, adresa, brojTelefona);
            
            KlijentskiZahtev kz = new KlijentskiZahtev(kupac, Konstante.IZMENI_KUPCA);
            KomunikacioniKontroler.vratiInstancu().posaljiZahtev(kz);
            
            ServerskiOdgovor so = KomunikacioniKontroler.vratiInstancu().primiOdgovor();
            uspesno = (boolean) so.getOdgovor();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(PretragaKupacaKKI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return uspesno;
    }
    
}
