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
public class Kupac implements OpstiDomenskiObjekat, Serializable {

    private int kupacID;
    private String imePrezime;
    private String adresa;
    private String brojTelefona;

    public Kupac() {
    }

    public Kupac(int kupacID, String imePrezime, String adresa, String brojTelefona) {
        this.kupacID = kupacID;
        this.imePrezime = imePrezime;
        this.adresa = adresa;
        this.brojTelefona = brojTelefona;
    }   
    
    @Override
    public String vratiNazivTabele() {
        return "kupac";
    }

    @Override
    public String vratiInsert() {
        return kupacID+",'" +imePrezime + "', '" + adresa + "', '" + brojTelefona + "'";
    }

    @Override
    public int vratiID() {
        return kupacID;
    }

    @Override
    public String vratiZaPretragu() {
        return "KupacID = " + kupacID + " OR ImePrezime LIKE '%"+imePrezime+"%' OR Adresa LIKE '%" + adresa + "%' OR BrojTelefona LIKE '%" + brojTelefona + "%'"; 
    }

    @Override
    public List<OpstiDomenskiObjekat> vratiListu(ResultSet rs) throws Exception {
        List<OpstiDomenskiObjekat> listaKupaca = new ArrayList<>();
        while (rs.next()) {            
            Kupac k = new Kupac(rs.getInt("KupacID"), rs.getString("ImePrezime"), rs.getString("Adresa"), rs.getString("BrojTelefona"));
            listaKupaca.add(k);
        }
        return listaKupaca;
    }

    @Override
    public String vratiWhereUslovID() {
        return "KupacID = " + kupacID;
    }

    @Override
    public String vratiJoinTabele() {
        return "kupac";
    }

    @Override
    public String vratiZaIzmenu() {
        return "ImePrezime = '" +imePrezime + "', Adresa = '" +adresa+ "', BrojTelefona = '" + brojTelefona+ "' WHERE KupacID = " + kupacID;
    }

    /**
     * @return the kupacID
     */
    public int getKupacID() {
        return kupacID;
    }

    /**
     * @param kupacID the kupacID to set
     */
    public void setKupacID(int kupacID) {
        this.kupacID = kupacID;
    }

    /**
     * @return the imePrezime
     */
    public String getImePrezime() {
        return imePrezime;
    }

    /**
     * @param imePrezime the imePrezime to set
     */
    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    /**
     * @return the adresa
     */
    public String getAdresa() {
        return adresa;
    }

    /**
     * @param adresa the adresa to set
     */
    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    /**
     * @return the brojTelefona
     */
    public String getBrojTelefona() {
        return brojTelefona;
    }

    /**
     * @param brojTelefona the brojTelefona to set
     */
    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    @Override
    public String toString() {
        return imePrezime;
    }
    
}
