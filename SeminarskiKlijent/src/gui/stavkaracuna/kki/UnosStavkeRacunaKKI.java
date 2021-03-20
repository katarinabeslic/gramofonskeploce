/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.stavkaracuna.kki;

import domen.Ploca;
import domen.Racun;
import domen.StavkaRacuna;
import gui.PnlUnosRacuna;
import gui.racun.kki.UnosRacunaKKI;
import java.io.IOException;
import java.util.ArrayList;
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
public class UnosStavkeRacunaKKI {
    
    static PnlUnosRacuna unosRacuna;

    public static List<Ploca> vratiPloce(JComboBox<Object> cbPloca) {
        List<Ploca> listaPloca = new ArrayList<>();
        try {
            KlijentskiZahtev kz = new KlijentskiZahtev();
            kz.setOperacija(Konstante.VRATI_SVE_PLOCE);
            KomunikacioniKontroler.vratiInstancu().posaljiZahtev(kz);
            ServerskiOdgovor so = KomunikacioniKontroler.vratiInstancu().primiOdgovor();
            listaPloca = (List<Ploca>) so.getOdgovor();
            cbPloca.removeAllItems();
            for (Ploca ploca : listaPloca) {
                cbPloca.addItem(ploca);
            }
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(UnosStavkeRacunaKKI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaPloca;
    }

    public static int vratiRedniBroj(List<StavkaRacuna> listaStavkiRacuna, JTextField txtRedniBroj) {
        int noviRedniBroj = 0;
        
        if (listaStavkiRacuna == null) {
            noviRedniBroj = 1;
        } else {
            int redniBroj = listaStavkiRacuna.size();
            noviRedniBroj = redniBroj + 1;
        }
        txtRedniBroj.setText(String.valueOf(noviRedniBroj));
        
        return noviRedniBroj;
    }

    public static StavkaRacuna sacuvajStavkuRacuna(Racun racun, JTextField txtRedniBroj, JComboBox<Object> cbPloca, JTextField txtKolicina, List<StavkaRacuna> listaStavkiRacuna) {
        int redniBroj = Integer.parseInt(txtRedniBroj.getText());
        Ploca ploca = (Ploca) cbPloca.getSelectedItem();
        int kolicina = Integer.parseInt(txtKolicina.getText());
        double iznos = ploca.getCena() * kolicina;
        
        StavkaRacuna stavkaRacuna = new StavkaRacuna(racun, redniBroj, kolicina, iznos, ploca);
        return stavkaRacuna;
    }

    
    
}
