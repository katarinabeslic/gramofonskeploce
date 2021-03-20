/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.zanr;

import baza.DatabaseBroker;
import domen.Zanr;
import so.OpstaSO;

/**
 *
 * @author katarina
 */
public class SacuvajZanrSO extends OpstaSO {

    private boolean uspesno;
    
    @Override
    protected void proveriPreduslov(Object obj) throws RuntimeException {
        System.out.println("Nema preduslova!");
    }

    @Override
    protected void izvrsiKonkretnuOperaciju(Object obj) throws RuntimeException {
        uspesno = DatabaseBroker.vratiInstancu().sacuvaj((Zanr)obj);
    }

    /**
     * @return the uspesno
     */
    public boolean isUspesno() {
        return uspesno;
    }

    /**
     * @param uspesno the uspesno to set
     */
    public void setUspesno(boolean uspesno) {
        this.uspesno = uspesno;
    }
    
}
