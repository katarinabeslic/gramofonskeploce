/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.kupac;

import baza.DatabaseBroker;
import so.OpstaSO;

/**
 *
 * @author katarina
 */
public class KreirajNovogKupcaSO extends OpstaSO {
    
    private int kupacID;

    @Override
    protected void proveriPreduslov(Object obj) throws RuntimeException {
        System.out.println("Nema preduslova!");
    }

    @Override
    protected void izvrsiKonkretnuOperaciju(Object obj) throws RuntimeException {
        kupacID = DatabaseBroker.vratiInstancu().vratiNajveciID("Kupac");
    }

    public int getKupacID() {
        return kupacID;
    }

    public void setKupacID(int kupacID) {
        this.kupacID = kupacID;
    }

    
}
