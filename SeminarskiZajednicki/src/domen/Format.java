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
public class Format implements OpstiDomenskiObjekat, Serializable {
    
    private int formatID;
    private String nazivFormata;

    public Format() {
    }

    public Format(int formatID, String nazivFormata) {
        this.formatID = formatID;
        this.nazivFormata = nazivFormata;
    }
    

    @Override
    public String vratiNazivTabele() {
        return "format";
    }

    @Override
    public String vratiInsert() {
        return "'" + nazivFormata + "'";
    }

    @Override
    public int vratiID() {
        return formatID;
    }

    @Override
    public String vratiZaPretragu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<OpstiDomenskiObjekat> vratiListu(ResultSet rs) throws Exception {
        List<OpstiDomenskiObjekat> listaFormata = new ArrayList<>();
        while (rs.next()) {            
            Format f = new Format(rs.getInt("FormatID"), rs.getString("NazivFormata"));
            listaFormata.add(f);
        }
        return listaFormata;
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
     * @return the formatID
     */
    public int getFormatID() {
        return formatID;
    }

    /**
     * @param formatID the formatID to set
     */
    public void setFormatID(int formatID) {
        this.formatID = formatID;
    }

    /**
     * @return the nazivFormata
     */
    public String getNazivFormata() {
        return nazivFormata;
    }

    /**
     * @param nazivFormata the nazivFormata to set
     */
    public void setNazivFormata(String nazivFormata) {
        this.nazivFormata = nazivFormata;
    }

    @Override
    public String toString() {
        return nazivFormata;
    }
    
}
