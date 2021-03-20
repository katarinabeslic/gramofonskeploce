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
import java.util.Objects;

/**
 *
 * @author katarina
 */
public class Ploca implements OpstiDomenskiObjekat, Serializable {
    
    private int plocaID;
    private String nazivPloce;
    private String opisPloce;
    private List<Zanr> listaZanrova;
    private Format format;
    private DiskografskaKuca diskografskaKuca;
    private double cena;

    public Ploca() {
    }

    public Ploca(int plocaID, String nazivPloce, String opisPloce, Format format, DiskografskaKuca diskografskaKuca, double cena) {
        this.plocaID = plocaID;
        this.nazivPloce = nazivPloce;
        this.opisPloce = opisPloce;
        this.format = format;
        this.diskografskaKuca = diskografskaKuca;
        this.cena = cena;
    }

    public Ploca(int plocaID, String nazivPloce, String opisPloce, List<Zanr> listaZanrova, Format format, DiskografskaKuca diskografskaKuca, double cena) {
        this.plocaID = plocaID;
        this.nazivPloce = nazivPloce;
        this.opisPloce = opisPloce;
        this.listaZanrova = listaZanrova;
        this.format = format;
        this.diskografskaKuca = diskografskaKuca;
        this.cena = cena;
    }

    @Override
    public String toString() {
        return getNazivPloce();
    }

    @Override
    public String vratiNazivTabele() {
        return "ploca";
    }

    @Override
    public String vratiInsert() {
        return plocaID+", '" +getNazivPloce()+ "', '" +getOpisPloce()+ "', '" +getCena()+ "', '" +getFormat().getFormatID()+ "', '" +getDiskografskaKuca().getDiskografskaKucaID()+ "'";
    }

    @Override
    public int vratiID() {
        return getPlocaID();
    }

    @Override
    public String vratiZaPretragu() {
        return "PlocaID = " +getPlocaID()+ " OR NazivPloce LIKE '%" +getNazivPloce()+ "%'";
    }

    @Override
    public List<OpstiDomenskiObjekat> vratiListu(ResultSet rs) throws Exception {
        List<OpstiDomenskiObjekat> listaPloca = new ArrayList<>();
        while (rs.next()) {
            Format f = new Format(rs.getInt("FormatID"), rs.getString("NazivFormata"));
            DiskografskaKuca dk = new DiskografskaKuca(rs.getInt("DiskografskaKucaID"), rs.getString("NazivDiskografskeKuce"));
            Ploca p = new Ploca(rs.getInt("PlocaID"), rs.getString("NazivPloce"), rs.getString("Opis"), f, dk, rs.getDouble("Cena"));
            listaPloca.add(p);
        }
        return listaPloca;
    }

    @Override
    public String vratiWhereUslovID() {
        return "PlocaID = " + plocaID;
    }

    @Override
    public String vratiJoinTabele() {
        return "ploca INNER JOIN format ON ploca.Format = format.FormatID INNER JOIN diskografskakuca ON ploca.DiskografskaKuca = diskografskaKuca.DiskografskaKucaID";
    }

    @Override
    public String vratiZaIzmenu() {
        return "NazivPloce = '" +getNazivPloce()+ "', Opis = '" +getOpisPloce()+ "', Cena = " +getCena()+ ", Format = " +getFormat().getFormatID()+ ", DiskografskaKuca = " +getDiskografskaKuca().getDiskografskaKucaID() + " WHERE PlocaID = " +getPlocaID();
    }

    /**
     * @return the plocaID
     */
    public int getPlocaID() {
        return plocaID;
    }

    /**
     * @param plocaID the plocaID to set
     */
    public void setPlocaID(int plocaID) {
        this.plocaID = plocaID;
    }

    /**
     * @return the nazivPloce
     */
    public String getNazivPloce() {
        return nazivPloce;
    }

    /**
     * @param nazivPloce the nazivPloce to set
     */
    public void setNazivPloce(String nazivPloce) {
        this.nazivPloce = nazivPloce;
    }

    /**
     * @return the opisPloce
     */
    public String getOpisPloce() {
        return opisPloce;
    }

    /**
     * @param opisPloce the opisPloce to set
     */
    public void setOpisPloce(String opisPloce) {
        this.opisPloce = opisPloce;
    }

    /**
     * @return the format
     */
    public Format getFormat() {
        return format;
    }

    /**
     * @param format the format to set
     */
    public void setFormat(Format format) {
        this.format = format;
    }

    /**
     * @return the diskografskaKuca
     */
    public DiskografskaKuca getDiskografskaKuca() {
        return diskografskaKuca;
    }

    /**
     * @param diskografskaKuca the diskografskaKuca to set
     */
    public void setDiskografskaKuca(DiskografskaKuca diskografskaKuca) {
        this.diskografskaKuca = diskografskaKuca;
    }

    /**
     * @return the cena
     */
    public double getCena() {
        return cena;
    }

    /**
     * @param cena the cena to set
     */
    public void setCena(double cena) {
        this.cena = cena;
    }

    /**
     * @return the listaZanrova
     */
    public List<Zanr> getListaZanrova() {
        return listaZanrova;
    }

    /**
     * @param listaZanrova the listaZanrova to set
     */
    public void setListaZanrova(List<Zanr> listaZanrova) {
        this.listaZanrova = listaZanrova;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ploca other = (Ploca) obj;
        if (this.plocaID != other.plocaID) {
            return false;
        }
        if (!Objects.equals(this.nazivPloce, other.nazivPloce)) {
            return false;
        }
        return true;
    }
    
    
}
