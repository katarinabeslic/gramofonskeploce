/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler;

import baza.DatabaseBroker;
import domen.DiskografskaKuca;
import domen.Format;
import domen.Kupac;
import domen.OpstiDomenskiObjekat;
import domen.Ploca;
import domen.Racun;
import domen.Zanr;
import domen.Zaposleni;
import java.util.List;
import so.diskografskakuca.KreirajNovuDiskografskuKucuSO;
import so.diskografskakuca.SacuvajDiskografskuKucuSO;
import so.diskografskakuca.VratiSveDiskografskeKuceSO;
import so.format.KreirajNoviFormatSO;
import so.format.SacuvajFormatSO;
import so.format.VratiSveFormateSO;
import so.kupac.IzmeniKupcaSO;
import so.kupac.KreirajNovogKupcaSO;
import so.kupac.ObrisiKupcaSO;
import so.kupac.SacuvajKupcaSO;
import so.kupac.TraziKupcaSO;
import so.kupac.VratiSveKupceSO;
import so.ploca.IzmeniPlocuSO;
import so.ploca.KreirajNovuPlocuSO;
import so.ploca.ObrisiPlocuSO;
import so.ploca.SacuvajPlocuSO;
import so.ploca.TraziPlocuSO;
import so.ploca.VratiSvePloceSO;
import so.racun.KreirajNoviRacunSO;
import so.racun.SacuvajRacunSO;
import so.zanr.KreirajNoviZanrSO;
import so.zanr.SacuvajZanrSO;
import so.zanr.VratiSveZanroveSO;
import so.zaposleni.PrijaviZaposlenogSO;

/**
 *
 * @author katarina
 */
public class Kontroler {
    private DatabaseBroker dbb;
    private static Kontroler instanca;

    private Kontroler() {
        dbb = new DatabaseBroker();
    }
    
    public static Kontroler vratiInstancu(){
        if (instanca == null) {
            instanca = new Kontroler();
        }
        return instanca;
    }

    public Zaposleni prijaviSe(Zaposleni zaposleni) throws RuntimeException, ClassNotFoundException {
        PrijaviZaposlenogSO pz = new PrijaviZaposlenogSO();
        pz.izvrsiOperaciju(zaposleni);
        return pz.getPrijavljeni();
    }

    public int kreirajNovogKupca() throws RuntimeException, ClassNotFoundException {
        KreirajNovogKupcaSO knk = new KreirajNovogKupcaSO();
        knk.izvrsiOperaciju(new Kupac());
        return knk.getKupacID();
    }

    public boolean sacuvajKupca(Kupac kupacZaCuvanje) throws RuntimeException, ClassNotFoundException {
        SacuvajKupcaSO sk = new SacuvajKupcaSO();
        sk.izvrsiOperaciju(kupacZaCuvanje);
        return sk.isUspesno();
    }

    public List<OpstiDomenskiObjekat> traziKupca(Kupac kupacZaPretragu) throws RuntimeException, ClassNotFoundException {
        TraziKupcaSO tk = new TraziKupcaSO();
        tk.izvrsiOperaciju(kupacZaPretragu);
        return tk.getListaKupaca();
    }

    public List<OpstiDomenskiObjekat> vratiSveKupce() throws RuntimeException, ClassNotFoundException {
        VratiSveKupceSO vsk = new VratiSveKupceSO();
        vsk.izvrsiOperaciju(new Kupac());
        return vsk.getListaKupaca();
    }

    public boolean obrisiKupca(Kupac kupacZaBrisanje) throws RuntimeException, ClassNotFoundException {
        ObrisiKupcaSO ok = new ObrisiKupcaSO();
        ok.izvrsiOperaciju(kupacZaBrisanje);
        return ok.isUspesno();
    }

    public boolean izmeniKupca(Kupac kupacZaIzmenu) throws RuntimeException, ClassNotFoundException {
        IzmeniKupcaSO ik = new IzmeniKupcaSO();
        ik.izvrsiOperaciju(kupacZaIzmenu);
        return ik.isUspesno();
    }

    public List<OpstiDomenskiObjekat> vratiZanrove() throws RuntimeException, ClassNotFoundException {
        VratiSveZanroveSO vsz = new VratiSveZanroveSO();
        vsz.izvrsiOperaciju(new Zanr());
        return vsz.getListaZanrova();
    }

    public List<OpstiDomenskiObjekat> vratiFormate() throws RuntimeException, ClassNotFoundException {
        VratiSveFormateSO vsf = new VratiSveFormateSO();
        vsf.izvrsiOperaciju(new Format());
        return vsf.getListaFormata();
    }

    public List<OpstiDomenskiObjekat> vratiDiskografskeKuce() throws RuntimeException, ClassNotFoundException {
        VratiSveDiskografskeKuceSO vsdk = new VratiSveDiskografskeKuceSO();
        vsdk.izvrsiOperaciju(new DiskografskaKuca());
        return vsdk.getListaDiskografskihKuca();
    }

    public int kreirajNovuPlocu() throws RuntimeException, ClassNotFoundException {
        KreirajNovuPlocuSO knp = new KreirajNovuPlocuSO();
        knp.izvrsiOperaciju(new Ploca());
        return knp.getPlocaID();
    }

    public boolean sacuvajPlocu(Ploca plocaZaCuvanje) throws RuntimeException, ClassNotFoundException {
        SacuvajPlocuSO sp = new SacuvajPlocuSO();
        sp.izvrsiOperaciju(plocaZaCuvanje);
        return sp.isUspesno();
    }

    public int kreirajNoviZanr() throws RuntimeException, ClassNotFoundException {
        KreirajNoviZanrSO knz = new KreirajNoviZanrSO();
        knz.izvrsiOperaciju(new Zanr());
        return knz.getZanrID();
    }

    public int kreirajNoviFormat() throws RuntimeException, ClassNotFoundException {
        KreirajNoviFormatSO knf = new KreirajNoviFormatSO();
        knf.izvrsiOperaciju(new Format());
        return knf.getFormatID();
    }

    public int kreirajNovuDiskografskuKucu() throws RuntimeException, ClassNotFoundException {
        KreirajNovuDiskografskuKucuSO kndk = new KreirajNovuDiskografskuKucuSO();
        kndk.izvrsiOperaciju(new DiskografskaKuca());
        return kndk.getDiskografskaKucaID();
    }

    public boolean sacuvajZanr(Zanr zanrZaCuvanje) throws RuntimeException, ClassNotFoundException {
        SacuvajZanrSO sz = new SacuvajZanrSO();
        sz.izvrsiOperaciju(zanrZaCuvanje);
        return sz.isUspesno();
    }

    public boolean sacuvajFormat(Format formatZaCuvanje) throws RuntimeException, ClassNotFoundException {
        SacuvajFormatSO sf = new SacuvajFormatSO();
        sf.izvrsiOperaciju(formatZaCuvanje);
        return sf.isUspesno();
    }

    public boolean sacuvajDiskografskuKucu(DiskografskaKuca diskografskaKucaZaCuvanje) throws RuntimeException, ClassNotFoundException {
        SacuvajDiskografskuKucuSO sdk = new SacuvajDiskografskuKucuSO();
        sdk.izvrsiOperaciju(diskografskaKucaZaCuvanje);
        return sdk.isUspesno();
    }

    public List<OpstiDomenskiObjekat> traziPlocu(Ploca plocaZaPretragu) throws RuntimeException, ClassNotFoundException {
        TraziPlocuSO tp = new TraziPlocuSO();
        tp.izvrsiOperaciju(plocaZaPretragu);
        return tp.getListaPloca();
    }

    public List<OpstiDomenskiObjekat> vratiSvePloce() throws RuntimeException, ClassNotFoundException {
        VratiSvePloceSO vsp = new VratiSvePloceSO();
        vsp.izvrsiOperaciju(new Ploca());
        return vsp.getListaPloca();
    }

    public boolean izmeniPlocu(Ploca plocaZaIzmenu) throws RuntimeException, ClassNotFoundException {
        IzmeniPlocuSO ip = new IzmeniPlocuSO();
        ip.izvrsiOperaciju(plocaZaIzmenu);
        return ip.isUspesno();
    }

    public boolean obrisiPlocu(Ploca plocaZaBrisanje) throws RuntimeException, ClassNotFoundException {
        ObrisiPlocuSO op = new ObrisiPlocuSO();
        op.izvrsiOperaciju(plocaZaBrisanje);
        return op.isUspesno();
    }

    public int kreirajNoviRacun() throws RuntimeException, ClassNotFoundException {
        KreirajNoviRacunSO knr = new KreirajNoviRacunSO();
        knr.izvrsiOperaciju(new Racun());
        return knr.getRacunID();
    }

    public boolean sacuvajRacun(Racun racunZaCuvanje) throws RuntimeException, ClassNotFoundException {
        SacuvajRacunSO sr = new SacuvajRacunSO();
        sr.izvrsiOperaciju(racunZaCuvanje);
        return sr.isUspesno();
    }
    
    
}
