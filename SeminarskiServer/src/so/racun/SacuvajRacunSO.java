/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.racun;

import baza.DatabaseBroker;
import domen.Racun;
import domen.StavkaRacuna;
import java.sql.Date;
import so.OpstaSO;

/**
 *
 * @author katarina
 */
public class SacuvajRacunSO extends OpstaSO {

    private boolean uspesno;
    private Racun racun;
    
    @Override
    protected void proveriPreduslov(Object obj) throws RuntimeException {
        racun = (Racun) obj;
        Date datum = new Date(racun.getDatum().getTime());
        racun.setDatum(datum);
    }

    @Override
    protected void izvrsiKonkretnuOperaciju(Object obj) throws RuntimeException {
        uspesno = DatabaseBroker.vratiInstancu().sacuvaj((Racun)obj);
        for (StavkaRacuna stavkaRacuna : racun.getListaStavkiRacuna()) {
            stavkaRacuna.setRacun(racun);
            uspesno = DatabaseBroker.vratiInstancu().sacuvaj(stavkaRacuna);
        }
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
