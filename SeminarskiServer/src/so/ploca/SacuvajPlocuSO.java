/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.ploca;

import baza.DatabaseBroker;
import domen.Ploca;
import domen.Zanr;
import domen.ZanrPloce;
import so.OpstaSO;

/**
 *
 * @author katarina
 */
public class SacuvajPlocuSO extends OpstaSO {

    private boolean uspesno;
    private Ploca ploca;

    @Override
    protected void proveriPreduslov(Object obj) throws RuntimeException {
        ploca = (Ploca) obj;
    }

    @Override
    protected void izvrsiKonkretnuOperaciju(Object obj) throws RuntimeException {
        uspesno = DatabaseBroker.vratiInstancu().sacuvaj((Ploca) obj);
        for (Zanr zanr : ploca.getListaZanrova()) {
            ZanrPloce zanrPloce = new ZanrPloce(ploca, zanr);
            uspesno = DatabaseBroker.vratiInstancu().sacuvaj(zanrPloce);
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
