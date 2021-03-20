/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author katarina
 */
public class ZanrPloce implements OpstiDomenskiObjekat, Serializable{

    private Ploca ploca;
    private Zanr zanr;

    public ZanrPloce() {
    }

    public ZanrPloce(Ploca ploca, Zanr zanr) {
        this.ploca = ploca;
        this.zanr = zanr;
    }

    @Override
    public String vratiNazivTabele() {
        return "zanrploce";
    }

    @Override
    public String vratiInsert() {
        return "'"+getPloca().getPlocaID()+"', '"+getZanr().getZanrID()+"'";
    }

    @Override
    public int vratiID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String vratiZaPretragu() {
        return "zanrploce.PlocaID = " + getPloca().getPlocaID();
    }

    @Override
    public List<OpstiDomenskiObjekat> vratiListu(ResultSet rs) throws Exception {
        List<OpstiDomenskiObjekat> listaZanrovaPloce = new ArrayList<>();
        while (rs.next()) {            
            int plocaID = rs.getInt("PlocaID");
            ploca.setPlocaID(plocaID);
            int zanrID = rs.getInt("ZanrID");
            String nazivZanra = rs.getString("NazivZanra");
            zanr = new Zanr(zanrID, nazivZanra);
            ZanrPloce zanrPloce = new ZanrPloce(ploca, zanr);
            listaZanrovaPloce.add(zanrPloce);
        }
        return listaZanrovaPloce;
    }

    @Override
    public String vratiWhereUslovID() {
        return "zanrploce.PlocaID = " + getPloca().getPlocaID();
    }

    @Override
    public String vratiJoinTabele() {
        return "zanrploce INNER JOIN ploca ON (zanrploce.plocaid = ploca.plocaid) INNER JOIN zanr ON (zanrploce.zanrid = zanr.zanrid)";
    }

    @Override
    public String vratiZaIzmenu() {
        return "ZanrID = " + getZanr().getZanrID();
    }

    /**
     * @return the ploca
     */
    public Ploca getPloca() {
        return ploca;
    }

    /**
     * @param ploca the ploca to set
     */
    public void setPloca(Ploca ploca) {
        this.ploca = ploca;
    }

    /**
     * @return the zanr
     */
    public Zanr getZanr() {
        return zanr;
    }

    /**
     * @param zanr the zanr to set
     */
    public void setZanr(Zanr zanr) {
        this.zanr = zanr;
    }

}
