/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.zaposleni;

import baza.DatabaseBroker;
import domen.OpstiDomenskiObjekat;
import domen.Zaposleni;
import java.util.List;
import so.OpstaSO;

/**
 *
 * @author katarina
 */
public class PrijaviZaposlenogSO extends OpstaSO {

    private Zaposleni prijavljeni;
    
    @Override
    protected void proveriPreduslov(Object obj) throws RuntimeException {
        System.out.println("Nema preduslova!");
    }

    @Override
    protected void izvrsiKonkretnuOperaciju(Object obj) throws RuntimeException {
        List<OpstiDomenskiObjekat> lista = DatabaseBroker.vratiInstancu().vratiListuPretrage((Zaposleni)obj);
        prijavljeni = (Zaposleni) lista.get(0);
    }

    /**
     * @return the prijavljeni
     */
    public Zaposleni getPrijavljeni() {
        return prijavljeni;
    }

    /**
     * @param prijavljeni the prijavljeni to set
     */
    public void setPrijavljeni(Zaposleni prijavljeni) {
        this.prijavljeni = prijavljeni;
    }
    
}
