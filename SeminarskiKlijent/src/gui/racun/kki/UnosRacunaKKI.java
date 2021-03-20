/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.racun.kki;

import domen.Kupac;
import domen.Racun;
import domen.StavkaRacuna;
import domen.Zaposleni;
import gui.prijava.kki.PrijavaKKI;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import konstante.Konstante;
import kontroler.komunikacija.KomunikacioniKontroler;
import transfer.KlijentskiZahtev;
import transfer.ServerskiOdgovor;

/**
 *
 * @author katarina
 */
public class UnosRacunaKKI {

    public static List<Kupac> vratiKupce(JComboBox<Object> cbKupac) {
        List<Kupac> listaKupaca = new ArrayList<>();    
        try {
            KlijentskiZahtev kz = new KlijentskiZahtev();
            kz.setOperacija(Konstante.VRATI_SVE_KUPCE);
            KomunikacioniKontroler.vratiInstancu().posaljiZahtev(kz);
            ServerskiOdgovor so = KomunikacioniKontroler.vratiInstancu().primiOdgovor();
            listaKupaca = (List<Kupac>) so.getOdgovor();
            cbKupac.removeAllItems();
            for (Kupac kupac : listaKupaca) {
                cbKupac.addItem(kupac);
            }
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(UnosRacunaKKI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaKupaca;
    }

    public static int vratiID(JTextField txtRacunID) {
        int racunID = -1;
        try {
            KlijentskiZahtev kz = new KlijentskiZahtev();
            kz.setOperacija(Konstante.VRATI_ID_RACUNA);
            KomunikacioniKontroler.vratiInstancu().posaljiZahtev(kz);
            ServerskiOdgovor so = KomunikacioniKontroler.vratiInstancu().primiOdgovor();
            racunID = (int) so.getOdgovor();
            txtRacunID.setText(String.valueOf(racunID));
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(UnosRacunaKKI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return racunID;
    }

    public static boolean sacuvajRacun(JTextField txtRacunID, JComboBox<Object> cbKupac, JTextField txtDatum, JTextField txtUkupanIznos) {
        boolean uspesno = false;    
        try {
            int racunID = Integer.parseInt(txtRacunID.getText());
            Kupac kupac = (Kupac) cbKupac.getSelectedItem();
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy.");
            Date datum = sdf.parse(txtDatum.getText());
            double ukupanIznos = Double.valueOf(txtUkupanIznos.getText());
            Zaposleni zaposleni = PrijavaKKI.getPrijavljeni();
            
            
            Racun racun = new Racun(racunID, datum, ukupanIznos, kupac, zaposleni);
            KlijentskiZahtev kz = new KlijentskiZahtev(racun, Konstante.SACUVAJ_RACUN);
            KomunikacioniKontroler.vratiInstancu().posaljiZahtev(kz);
            ServerskiOdgovor so = KomunikacioniKontroler.vratiInstancu().primiOdgovor();
            uspesno = (boolean) so.getOdgovor();
        } catch (ParseException | IOException | ClassNotFoundException ex) {
            Logger.getLogger(UnosRacunaKKI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return uspesno;
    }

    public static boolean sacuvajRacun(JTextField txtRacunID, JComboBox<Object> cbKupac, JTextField txtDatum, JTextField txtUkupanIznos, List<StavkaRacuna> listaStavkiRacuna) {
        boolean uspesno = false;    
        try {
            int racunID = Integer.parseInt(txtRacunID.getText());
            Kupac kupac = (Kupac) cbKupac.getSelectedItem();
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy.");
            Date datum = sdf.parse(txtDatum.getText());
            double ukupanIznos = Double.valueOf(txtUkupanIznos.getText());
            Zaposleni zaposleni = PrijavaKKI.getPrijavljeni();
            
            
            Racun racun = new Racun(racunID, datum, ukupanIznos, kupac, zaposleni);
            racun.setListaStavkiRacuna(listaStavkiRacuna);
            KlijentskiZahtev kz = new KlijentskiZahtev(racun, Konstante.SACUVAJ_RACUN);
            KomunikacioniKontroler.vratiInstancu().posaljiZahtev(kz);
            ServerskiOdgovor so = KomunikacioniKontroler.vratiInstancu().primiOdgovor();
            uspesno = (boolean) so.getOdgovor();
        } catch (ParseException | IOException | ClassNotFoundException ex) {
            Logger.getLogger(UnosRacunaKKI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return uspesno;
    }
    
}
