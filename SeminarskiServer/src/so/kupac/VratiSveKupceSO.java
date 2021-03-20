/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.kupac;

import baza.DatabaseBroker;
import domen.Kupac;
import domen.OpstiDomenskiObjekat;
import java.util.List;
import so.OpstaSO;

/**
 *
 * @author katarina
 */
public class VratiSveKupceSO extends OpstaSO {

    private List<OpstiDomenskiObjekat> listaKupaca;
    
    @Override
    protected void proveriPreduslov(Object obj) throws RuntimeException {
        System.out.println("Nema preduslova!");
    }

    @Override
    protected void izvrsiKonkretnuOperaciju(Object obj) throws RuntimeException {
        listaKupaca = DatabaseBroker.vratiInstancu().vratiJoinListu((Kupac)obj);
        
    }

    /**
     * @return the listaKupaca
     */
    public List<OpstiDomenskiObjekat> getListaKupaca() {
        return listaKupaca;
    }

    /**
     * @param listaKupaca the listaKupaca to set
     */
    public void setListaKupaca(List<OpstiDomenskiObjekat> listaKupaca) {
        this.listaKupaca = listaKupaca;
    }
    
}
