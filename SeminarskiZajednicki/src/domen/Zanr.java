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
public class Zanr implements OpstiDomenskiObjekat, Serializable {

    private int ZanrID;
    private String nazivZanra;

    public Zanr() {
    }

    public Zanr(int ZanrID, String nazivZanra) {
        this.ZanrID = ZanrID;
        this.nazivZanra = nazivZanra;
    }

    @Override
    public String toString() {
        return nazivZanra;
    }
    
    @Override
    public String vratiNazivTabele() {
        return "zanr";
    }

    @Override
    public String vratiInsert() {
        return "'" +nazivZanra+ "'";
    }

    @Override
    public int vratiID() {
        return ZanrID;
    }

    @Override
    public String vratiZaPretragu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<OpstiDomenskiObjekat> vratiListu(ResultSet rs) throws Exception {
        List<OpstiDomenskiObjekat> listaZanrova = new ArrayList<>();
        while (rs.next()) {            
            Zanr z = new Zanr(rs.getInt("ZanrID"), rs.getString("NazivZanra"));
            listaZanrova.add(z);
        }
        return listaZanrova;
    }

    @Override
    public String vratiWhereUslovID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String vratiJoinTabele() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String vratiZaIzmenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the ZanrID
     */
    public int getZanrID() {
        return ZanrID;
    }

    /**
     * @param ZanrID the ZanrID to set
     */
    public void setZanrID(int ZanrID) {
        this.ZanrID = ZanrID;
    }

    /**
     * @return the nazivZanra
     */
    public String getNazivZanra() {
        return nazivZanra;
    }

    /**
     * @param nazivZanra the nazivZanra to set
     */
    public void setNazivZanra(String nazivZanra) {
        this.nazivZanra = nazivZanra;
    }
    
}
