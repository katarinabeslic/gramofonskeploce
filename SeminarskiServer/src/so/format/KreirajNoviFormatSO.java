/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.format;

import baza.DatabaseBroker;
import so.OpstaSO;

/**
 *
 * @author katarina
 */
public class KreirajNoviFormatSO extends OpstaSO {

    private int formatID;
    
    @Override
    protected void proveriPreduslov(Object obj) throws RuntimeException {
        System.out.println("Nema preduslova!");
    }

    @Override
    protected void izvrsiKonkretnuOperaciju(Object obj) throws RuntimeException {
        formatID = DatabaseBroker.vratiInstancu().vratiNajveciID("format");
    }

    /**
     * @return the formatID
     */
    public int getFormatID() {
        return formatID;
    }

    /**
     * @param formatID the formatID to set
     */
    public void setFormatID(int formatID) {
        this.formatID = formatID;
    }
    
}
