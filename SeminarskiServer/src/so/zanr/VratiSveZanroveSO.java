/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.zanr;

import baza.DatabaseBroker;
import domen.OpstiDomenskiObjekat;
import domen.Zanr;
import java.util.List;
import so.OpstaSO;

/**
 *
 * @author katarina
 */
public class VratiSveZanroveSO extends OpstaSO {

    private List<OpstiDomenskiObjekat> listaZanrova;
    
    @Override
    protected void proveriPreduslov(Object obj) throws RuntimeException {
        System.out.println("Nema preduslova!");
    }

    @Override
    protected void izvrsiKonkretnuOperaciju(Object obj) throws RuntimeException {
        listaZanrova = DatabaseBroker.vratiInstancu().vratiListu((Zanr) obj);
    }

    /**
     * @return the listaZanrova
     */
    public List<OpstiDomenskiObjekat> getListaZanrova() {
        return listaZanrova;
    }

    /**
     * @param listaZanrova the listaZanrova to set
     */
    public void setListaZanrova(List<OpstiDomenskiObjekat> listaZanrova) {
        this.listaZanrova = listaZanrova;
    }
    
}
