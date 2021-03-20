/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.format;

import baza.DatabaseBroker;
import domen.Format;
import domen.OpstiDomenskiObjekat;
import java.util.List;
import so.OpstaSO;

/**
 *
 * @author katarina
 */
public class VratiSveFormateSO extends OpstaSO {

    private List<OpstiDomenskiObjekat> listaFormata;
    
    @Override
    protected void proveriPreduslov(Object obj) throws RuntimeException {
        System.out.println("Nema preduslova!");
    }

    @Override
    protected void izvrsiKonkretnuOperaciju(Object obj) throws RuntimeException {
        listaFormata = DatabaseBroker.vratiInstancu().vratiListu((Format)obj);
    }

    /**
     * @return the listaFormata
     */
    public List<OpstiDomenskiObjekat> getListaFormata() {
        return listaFormata;
    }

    /**
     * @param listaFormata the listaFormata to set
     */
    public void setListaFormata(List<OpstiDomenskiObjekat> listaFormata) {
        this.listaFormata = listaFormata;
    }
    
}
