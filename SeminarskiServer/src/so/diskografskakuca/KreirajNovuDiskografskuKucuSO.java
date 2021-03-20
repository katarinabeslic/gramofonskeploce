/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.diskografskakuca;

import baza.DatabaseBroker;
import so.OpstaSO;

/**
 *
 * @author katarina
 */
public class KreirajNovuDiskografskuKucuSO extends OpstaSO {

    private int diskografskaKucaID;
    
    @Override
    protected void proveriPreduslov(Object obj) throws RuntimeException {
        System.out.println("Nema preduslova!");
    }

    @Override
    protected void izvrsiKonkretnuOperaciju(Object obj) throws RuntimeException {
        diskografskaKucaID = DatabaseBroker.vratiInstancu().vratiNajveciID("diskografskakuca");
    }

    /**
     * @return the diskografskaKucaID
     */
    public int getDiskografskaKucaID() {
        return diskografskaKucaID;
    }

    /**
     * @param diskografskaKucaID the diskografskaKucaID to set
     */
    public void setDiskografskaKucaID(int diskografskaKucaID) {
        this.diskografskaKucaID = diskografskaKucaID;
    }
    
}
