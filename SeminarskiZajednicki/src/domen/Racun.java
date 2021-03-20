/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author katarina
 */
public class Racun implements OpstiDomenskiObjekat, Serializable {

    private int racunID;
    private Date datum;
    private double ukupanIznos;
    private Kupac kupac;
    private Zaposleni zaposleni;
    private List<StavkaRacuna> listaStavkiRacuna;

    public Racun() {
    }

    public Racun(int racunID, Date datum, double ukupanIznos, Kupac kupac, Zaposleni zaposleni) {
        this.racunID = racunID;
        this.datum = datum;
        this.ukupanIznos = ukupanIznos;
        this.kupac = kupac;
        this.zaposleni = zaposleni;
    }

    @Override
    public String toString() {
        return "Racun{" + "racunID=" + getRacunID() + ", datum=" + getDatum() + ", ukupanIznos=" + getUkupanIznos() + ", kupac=" + getKupac() + ", zaposleni=" + getZaposleni() + '}';
    }
    
    @Override
    public String vratiNazivTabele() {
        return "racun";
    }

    @Override
    public String vratiInsert() {
        return racunID + ",'" +getDatum()+ "', '" +getUkupanIznos()+ "', '" +getKupac().getKupacID()+ "', '" +getZaposleni().getZaposleniID()+"'";
    }

    @Override
    public int vratiID() {
        return getRacunID();
    }

    @Override
    public String vratiZaPretragu() {
        return "RacunId = " +getRacunID()+ " OR Datum = '" +new java.sql.Date(getDatum().getTime())+ "'";
    }

    @Override
    public List<OpstiDomenskiObjekat> vratiListu(ResultSet rs) throws Exception {
        List<OpstiDomenskiObjekat> listaRacuna = new ArrayList<>();
        while (rs.next()) {            
            Kupac kupac = new Kupac();
            kupac.setKupacID(rs.getInt("Kupac"));
            Zaposleni zaposleni = new Zaposleni();
            zaposleni.setZaposleniID(rs.getInt("Zaposleni"));
            Racun racun = new Racun(rs.getInt("RacunID"), rs.getDate("Datum"), rs.getDouble("UkupanIznos"), kupac, zaposleni);
            listaRacuna.add(racun);
        }
        return listaRacuna;
    }

    @Override
    public String vratiWhereUslovID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String vratiJoinTabele() {
        return "racun r INNER JOIN kupac k ON (r.Kupac = k.KupacID) INNER JOIN zaposleni z ON (r.Zaposleni = z.ZaposleniID)";
    }

    @Override
    public String vratiZaIzmenu() {
        return "UkupanIznos = " +getUkupanIznos();
    }

    /**
     * @return the racunID
     */
    public int getRacunID() {
        return racunID;
    }

    /**
     * @param racunID the racunID to set
     */
    public void setRacunID(int racunID) {
        this.racunID = racunID;
    }

    /**
     * @return the datum
     */
    public Date getDatum() {
        return datum;
    }

    /**
     * @param datum the datum to set
     */
    public void setDatum(Date datum) {
        this.datum = datum;
    }

    /**
     * @return the ukupanIznos
     */
    public double getUkupanIznos() {
        return ukupanIznos;
    }

    /**
     * @param ukupanIznos the ukupanIznos to set
     */
    public void setUkupanIznos(double ukupanIznos) {
        this.ukupanIznos = ukupanIznos;
    }

    /**
     * @return the kupac
     */
    public Kupac getKupac() {
        return kupac;
    }

    /**
     * @param kupac the kupac to set
     */
    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    /**
     * @return the zaposleni
     */
    public Zaposleni getZaposleni() {
        return zaposleni;
    }

    /**
     * @param zaposleni the zaposleni to set
     */
    public void setZaposleni(Zaposleni zaposleni) {
        this.zaposleni = zaposleni;
    }

    /**
     * @return the listaStavkiRacuna
     */
    public List<StavkaRacuna> getListaStavkiRacuna() {
        return listaStavkiRacuna;
    }

    /**
     * @param listaStavkiRacuna the listaStavkiRacuna to set
     */
    public void setListaStavkiRacuna(List<StavkaRacuna> listaStavkiRacuna) {
        this.listaStavkiRacuna = listaStavkiRacuna;
    }
    
}
