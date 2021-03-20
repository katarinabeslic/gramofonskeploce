/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.prijava.kki;

import domen.Zaposleni;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import konstante.Konstante;
import kontroler.komunikacija.KomunikacioniKontroler;
import transfer.KlijentskiZahtev;
import transfer.ServerskiOdgovor;

/**
 *
 * @author katarina
 */
public class PrijavaKKI {

    public static Zaposleni prijavljeni;

    public static Zaposleni getPrijavljeni() {
        return prijavljeni;
    }

    public static Zaposleni prijaviSe(Zaposleni zaposleni) {
        try {
            KlijentskiZahtev kz = new KlijentskiZahtev();
            kz.setOperacija(Konstante.PRIJAVA);
            kz.setParametar(zaposleni);
            KomunikacioniKontroler.vratiInstancu().posaljiZahtev(kz);

            ServerskiOdgovor so = KomunikacioniKontroler.vratiInstancu().primiOdgovor();
            prijavljeni = (Zaposleni) so.getOdgovor();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(PrijavaKKI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return prijavljeni;
    }
}
