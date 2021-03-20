/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.diskografskakuca;

import baza.DatabaseBroker;
import domen.DiskografskaKuca;
import domen.OpstiDomenskiObjekat;
import java.util.List;
import so.OpstaSO;

/**
 *
 * @author katarina
 */
public class VratiSveDiskografskeKuceSO extends OpstaSO {

    private List<OpstiDomenskiObjekat> listaDiskografskihKuca;
    
    @Override
    protected void proveriPreduslov(Object obj) throws RuntimeException {
        System.out.println("Nema preduslova!");
    }

    @Override
    protected void izvrsiKonkretnuOperaciju(Object obj) throws RuntimeException {
        listaDiskografskihKuca = DatabaseBroker.vratiInstancu().vratiListu((DiskografskaKuca) obj);
    }

    /**
     * @return the listaDiskografskihKuca
     */
    public List<OpstiDomenskiObjekat> getListaDiskografskihKuca() {
        return listaDiskografskihKuca;
    }

    /**
     * @param listaDiskografskihKuca the listaDiskografskihKuca to set
     */
    public void setListaDiskografskihKuca(List<OpstiDomenskiObjekat> listaDiskografskihKuca) {
        this.listaDiskografskihKuca = listaDiskografskihKuca;
    }
    
}
