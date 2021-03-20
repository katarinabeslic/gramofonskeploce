/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.racun;

import baza.DatabaseBroker;
import so.OpstaSO;

/**
 *
 * @author katarina
 */
public class KreirajNoviRacunSO extends OpstaSO {

    private int racunID;
    
    @Override
    protected void proveriPreduslov(Object obj) throws RuntimeException {
        System.out.println("Nema preduslova!");
    }

    @Override
    protected void izvrsiKonkretnuOperaciju(Object obj) throws RuntimeException {
        racunID = DatabaseBroker.vratiInstancu().vratiNajveciID("racun");
    }

    /**
     * @return the racunID
     */
    public int getRacunID() {
        return racunID;
    }

    /**
     * @param racunID the racunID to set
     */
    public void setRacunID(int racunID) {
        this.racunID = racunID;
    }
    
}
