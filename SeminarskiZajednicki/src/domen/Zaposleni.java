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
public class Zaposleni implements OpstiDomenskiObjekat, Serializable {
    
    private int zaposleniID;
    private String imePrezime;
    private String korisnickoIme;
    private String lozinka;

    public Zaposleni() {
    }

    public Zaposleni(int zaposleniID, String imePrezime, String korisnickoIme, String lozinka) {
        this.zaposleniID = zaposleniID;
        this.imePrezime = imePrezime;
        this.korisnickoIme = korisnickoIme;
        this.lozinka = lozinka;
    }    

    @Override
    public String vratiNazivTabele() {
        return "zaposleni";
    }

    @Override
    public String vratiInsert() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int vratiID() {
        return zaposleniID;
    }

    @Override
    public String vratiZaPretragu() {
        return "KorisnickoIme = '" + korisnickoIme + "' AND Lozinka = '" + lozinka + "'";
    }

    @Override
    public List<OpstiDomenskiObjekat> vratiListu(ResultSet rs) throws Exception {
        List<OpstiDomenskiObjekat> listaZaposlenih = new ArrayList<>();
        while (rs.next()) {            
            Zaposleni z = new Zaposleni(rs.getInt("ZaposleniID"), rs.getString("ImePrezime"), rs.getString("KorisnickoIme"), rs.getString("Lozinka"));
            listaZaposlenih.add(z);
        }
        return listaZaposlenih;
    }

    @Override
    public String vratiWhereUslovID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String vratiJoinTabele() {
        return "zaposleni";
    }

    @Override
    public String vratiZaIzmenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getZaposleniID() {
        return zaposleniID;
    }

    public void setZaposleniID(int zaposleniID) {
        this.zaposleniID = zaposleniID;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    @Override
    public String toString() {
        return imePrezime+"";
    }
    
    
    
}
