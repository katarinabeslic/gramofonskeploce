/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.ploca.kki;

import domen.Ploca;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.JTextField;
import konstante.Konstante;
import kontroler.komunikacija.KomunikacioniKontroler;
import model.TableModelPloca;
import transfer.KlijentskiZahtev;
import transfer.ServerskiOdgovor;

/**
 *
 * @author katarina
 */
public class PretragaPlocaKKI {

    public static void prikaziUTabeli(List<Ploca> listaPloca, JTable tblPloca) {
        TableModelPloca tmp = new TableModelPloca(listaPloca);
        tblPloca.setModel(tmp);
    }

    public static List<Ploca> traziPlocu(JTextField txtKriterijumZaPretragu, JTable tblPloca) {
        List<Ploca> listaPloca = new ArrayList<>();    
        try {
            String kriterijum = txtKriterijumZaPretragu.getText();
            
            Ploca ploca = new Ploca();
            ploca.setNazivPloce(kriterijum);
            
            KlijentskiZahtev kz = new KlijentskiZahtev(ploca, Konstante.PRETRAGA_PLOCA);
            KomunikacioniKontroler.vratiInstancu().posaljiZahtev(kz);
            
            ServerskiOdgovor so = KomunikacioniKontroler.vratiInstancu().primiOdgovor();
            listaPloca = (List<Ploca>) so.getOdgovor();
            prikaziUTabeli(listaPloca, tblPloca);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(PretragaPlocaKKI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaPloca;
    }

    public static void vratiSvePloce(JTable tblPloca) {
        List<Ploca> listaPloca = new ArrayList<>();
            
        try {
            KlijentskiZahtev kz = new KlijentskiZahtev();
            kz.setOperacija(Konstante.VRATI_SVE_PLOCE);
            
            KomunikacioniKontroler.vratiInstancu().posaljiZahtev(kz);
            ServerskiOdgovor so = KomunikacioniKontroler.vratiInstancu().primiOdgovor();
            listaPloca = (List<Ploca>) so.getOdgovor();
            prikaziUTabeli(listaPloca, tblPloca);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(PretragaPlocaKKI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean obrisiPlocu(JTable tblPloca) {
        boolean uspesno = false;    
        try {
            int selektovanRed = tblPloca.getSelectedRow();
            TableModelPloca tmp = (TableModelPloca) tblPloca.getModel();
            Ploca ploca = tmp.vratiPlocu(selektovanRed);
            
            KlijentskiZahtev kz = new KlijentskiZahtev(ploca, Konstante.OBRISI_PLOCU);
            KomunikacioniKontroler.vratiInstancu().posaljiZahtev(kz);
            
            ServerskiOdgovor so = KomunikacioniKontroler.vratiInstancu().primiOdgovor();
            uspesno = (boolean) so.getOdgovor();
            if (uspesno) {
                tmp.obrisi(selektovanRed);                
            }
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(PretragaPlocaKKI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return uspesno;
    }
    
}
