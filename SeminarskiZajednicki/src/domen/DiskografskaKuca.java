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
public class DiskografskaKuca implements OpstiDomenskiObjekat, Serializable {

    private int diskografskaKucaID;
    private String nazivDiskografskeKuce;

    public DiskografskaKuca() {
    }

    public DiskografskaKuca(int diskografskaKucaID, String nazivDiskografskeKuce) {
        this.diskografskaKucaID = diskografskaKucaID;
        this.nazivDiskografskeKuce = nazivDiskografskeKuce;
    }
    
    
    @Override
    public String vratiNazivTabele() {
        return "diskografskakuca";
    }

    @Override
    public String vratiInsert() {
        return "'"+nazivDiskografskeKuce+"'";
    }

    @Override
    public int vratiID() {
        return diskografskaKucaID;
    }

    @Override
    public String vratiZaPretragu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<OpstiDomenskiObjekat> vratiListu(ResultSet rs) throws Exception {
        List<OpstiDomenskiObjekat> listaDiskografskihKuca = new ArrayList<>();
        while (rs.next()) {            
            DiskografskaKuca dk = new DiskografskaKuca(rs.getInt("DiskografskaKucaID"), rs.getString("NazivDiskografskeKuce"));
            listaDiskografskihKuca.add(dk);
        }
        return listaDiskografskihKuca;
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
     * @return the diskografskaKucaID
     */
    public int getDiskografskaKucaID() {
        return diskografskaKucaID;
    }

    /**
     * @param diskografskaKucaID the diskografskaKucaID to set
     */
    public void setDiskografskaKucaID(int diskografskaKucaID) {
        this.diskografskaKucaID = diskografskaKucaID;
    }

    /**
     * @return the nazivDiskografskeKuce
     */
    public String getNazivDiskografskeKuce() {
        return nazivDiskografskeKuce;
    }

    /**
     * @param nazivDiskografskeKuce the nazivDiskografskeKuce to set
     */
    public void setNazivDiskografskeKuce(String nazivDiskografskeKuce) {
        this.nazivDiskografskeKuce = nazivDiskografskeKuce;
    }

    @Override
    public String toString() {
        return nazivDiskografskeKuce;
    }
    
}
