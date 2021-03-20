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
import java.util.ArrayList;
import java.util.List;
import so.OpstaSO;

/**
 *
 * @author katarina
 */
public class IzmeniPlocuSO extends OpstaSO {

    private boolean uspesno;
    private Ploca ploca;
    private List<ZanrPloce> listaZanrovaPloce;
    @Override
    protected void proveriPreduslov(Object obj) throws RuntimeException {
        ploca = (Ploca) obj;
        listaZanrovaPloce = new ArrayList<>();
        for (Zanr zanr : ploca.getListaZanrova()) {
            ZanrPloce zp = new ZanrPloce(ploca, zanr);
            listaZanrovaPloce.add(zp);
        }
    }

    @Override
    protected void izvrsiKonkretnuOperaciju(Object obj) throws RuntimeException {
        uspesno = DatabaseBroker.vratiInstancu().izmeni((Ploca)obj);
        uspesno = DatabaseBroker.vratiInstancu().obrisi(listaZanrovaPloce.get(0));
        for (ZanrPloce zanrPloce : listaZanrovaPloce) {
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
