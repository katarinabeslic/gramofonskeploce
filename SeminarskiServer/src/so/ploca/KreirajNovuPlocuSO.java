/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.ploca;

import baza.DatabaseBroker;
import so.OpstaSO;

/**
 *
 * @author katarina
 */
public class KreirajNovuPlocuSO extends OpstaSO {

    private int plocaID;
    
    @Override
    protected void proveriPreduslov(Object obj) throws RuntimeException {
        System.out.println("Nema preduslova!");
    }

    @Override
    protected void izvrsiKonkretnuOperaciju(Object obj) throws RuntimeException {
        plocaID = DatabaseBroker.vratiInstancu().vratiNajveciID("ploca");
    }

    /**
     * @return the plocaID
     */
    public int getPlocaID() {
        return plocaID;
    }

    /**
     * @param plocaID the plocaID to set
     */
    public void setPlocaID(int plocaID) {
        this.plocaID = plocaID;
    }
    
}
