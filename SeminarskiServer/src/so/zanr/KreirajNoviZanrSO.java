/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.zanr;

import baza.DatabaseBroker;
import so.OpstaSO;

/**
 *
 * @author katarina
 */
public class KreirajNoviZanrSO extends OpstaSO {
    
    private int zanrID;

    @Override
    protected void proveriPreduslov(Object obj) throws RuntimeException {
        System.out.println("Nema preduslova!");
    }

    @Override
    protected void izvrsiKonkretnuOperaciju(Object obj) throws RuntimeException {
        zanrID = DatabaseBroker.vratiInstancu().vratiNajveciID("zanr");
    }

    /**
     * @return the zanrID
     */
    public int getZanrID() {
        return zanrID;
    }

    /**
     * @param zanrID the zanrID to set
     */
    public void setZanrID(int zanrID) {
        this.zanrID = zanrID;
    }
    
}
