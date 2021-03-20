/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.ploca;

import baza.DatabaseBroker;
import domen.OpstiDomenskiObjekat;
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
public class TraziPlocuSO extends OpstaSO{

    private List<OpstiDomenskiObjekat> listaPloca;
    
    @Override
    protected void proveriPreduslov(Object obj) throws RuntimeException {
        System.out.println("Nema preduslova!");
    }

    @Override
    protected void izvrsiKonkretnuOperaciju(Object obj) throws RuntimeException {
        listaPloca = DatabaseBroker.vratiInstancu().vratiListuPretrage((Ploca)obj);
        for (OpstiDomenskiObjekat opstiDomenskiObjekat : listaPloca) {
            Ploca p = (Ploca) opstiDomenskiObjekat;
            ZanrPloce zp = new ZanrPloce();
            zp.setPloca(p);
            List<OpstiDomenskiObjekat> lzp = DatabaseBroker.vratiInstancu().vratiListuPretrage(zp);
            List<Zanr> listaZanrova = new ArrayList<>();
            for (OpstiDomenskiObjekat odo : lzp) {
                zp = (ZanrPloce) odo;
                listaZanrova.add(zp.getZanr());
            }
            p.setListaZanrova(listaZanrova);
        }
    }

    /**
     * @return the listaPloca
     */
    public List<OpstiDomenskiObjekat> getListaPloca() {
        return listaPloca;
    }

    /**
     * @param listaPloca the listaPloca to set
     */
    public void setListaPloca(List<OpstiDomenskiObjekat> listaPloca) {
        this.listaPloca = listaPloca;
    }
    
}
