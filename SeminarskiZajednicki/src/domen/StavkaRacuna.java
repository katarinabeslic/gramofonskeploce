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
public class StavkaRacuna implements OpstiDomenskiObjekat, Serializable {

    private Racun racun;
    private int redniBroj;
    private int kolicina;
    private double iznos;
    private Ploca ploca;

    public StavkaRacuna() {
    }

    public StavkaRacuna(Racun racun, int redniBroj, int kolicina, double iznos, Ploca ploca) {
        this.racun = racun;
        this.redniBroj = redniBroj;
        this.kolicina = kolicina;
        this.iznos = iznos;
        this.ploca = ploca;
    }
    
    @Override
    public String vratiNazivTabele() {
        return "stavkaracuna";
    }

    @Override
    public String vratiInsert() {
        return "'" +racun.getRacunID()+ "', '" +redniBroj+ "', '" +kolicina+ "', '" +iznos+ "', '" +ploca.getPlocaID()+ "'";
    }

    @Override
    public int vratiID() {
        return redniBroj;
    }

    @Override
    public String vratiZaPretragu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<OpstiDomenskiObjekat> vratiListu(ResultSet rs) throws Exception {
        List<OpstiDomenskiObjekat> listaStavkiRacuna = new ArrayList<>();
        while (rs.next()) {            
            Racun racun = new Racun();
            racun.setRacunID(rs.getInt("RacunID"));
            Ploca ploca = new Ploca();
            ploca.setPlocaID(rs.getInt("Ploca"));
            StavkaRacuna stavkaRacuna = new StavkaRacuna(racun, rs.getInt("RedniBroj"), rs.getInt("Kolicina"), rs.getDouble("Iznos"), ploca);
            listaStavkiRacuna.add(stavkaRacuna);
        }
        return listaStavkiRacuna;
    }

    @Override
    public String vratiWhereUslovID() {
        return "stavkaracuna.Racun = " +racun.getRacunID();
    }

    @Override
    public String vratiJoinTabele() {
        return "stavkaracuna sr INNER JOIN racun r ON (sr.Racun = r.RacunID) INNER JOIN ploca p ON (sr.Ploca = p.PlocaID)";
    }

    @Override
    public String vratiZaIzmenu() {
        return "Kolicina = '" +kolicina+ "', Iznos = '" +iznos+ "', Ploca = " +ploca.getPlocaID();
    }

    /**
     * @return the racun
     */
    public Racun getRacun() {
        return racun;
    }

    /**
     * @param racun the racun to set
     */
    public void setRacun(Racun racun) {
        this.racun = racun;
    }

    /**
     * @return the redniBroj
     */
    public int getRedniBroj() {
        return redniBroj;
    }

    /**
     * @param redniBroj the redniBroj to set
     */
    public void setRedniBroj(int redniBroj) {
        this.redniBroj = redniBroj;
    }

    /**
     * @return the kolicina
     */
    public int getKolicina() {
        return kolicina;
    }

    /**
     * @param kolicina the kolicina to set
     */
    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    /**
     * @return the iznos
     */
    public double getIznos() {
        return iznos;
    }

    /**
     * @param iznos the iznos to set
     */
    public void Iznos(double iznos) {
        this.iznos = iznos;
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
    
}
