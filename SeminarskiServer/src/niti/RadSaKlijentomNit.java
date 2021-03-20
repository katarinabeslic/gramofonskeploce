/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niti;

import domen.DiskografskaKuca;
import domen.Format;
import domen.Kupac;
import domen.OpstiDomenskiObjekat;
import domen.Ploca;
import domen.Racun;
import domen.Zanr;
import domen.Zaposleni;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import konstante.Konstante;
import kontroler.Kontroler;
import transfer.KlijentskiZahtev;
import transfer.ServerskiOdgovor;

/**
 *
 * @author katarina
 */
public class RadSaKlijentomNit extends Thread {

    private Socket s;
    private boolean kraj = false;

    public RadSaKlijentomNit(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        while (!kraj) {
            ServerskiOdgovor so = new ServerskiOdgovor();
            KlijentskiZahtev kz = primiZahtev();
            int operacija = kz.getOperacija();
            
            try {
                switch (operacija) {
                    case Konstante.PRIJAVA:
                        Zaposleni zaposleni = (Zaposleni) kz.getParametar();
                        Zaposleni prijavljeni = Kontroler.vratiInstancu().prijaviSe(zaposleni);
                        so.setOdgovor(prijavljeni);
                        break;
                    case Konstante.VRATI_ID_KUPCA:
                        int kupacID = Kontroler.vratiInstancu().kreirajNovogKupca();
                        so.setOdgovor(kupacID);
                        break;
                    case Konstante.SACUVAJ_KUPCA:
                        Kupac kupacZaCuvanje = (Kupac) kz.getParametar();
                        boolean uspesnoCuvanjeKupca = Kontroler.vratiInstancu().sacuvajKupca(kupacZaCuvanje);
                        so.setOdgovor(uspesnoCuvanjeKupca);
                        break;
                    case Konstante.PRETRAGA_KUPACA:
                        Kupac kupacZaPretragu = (Kupac) kz.getParametar();
                        List<OpstiDomenskiObjekat> listaPronadjenihKupaca = Kontroler.vratiInstancu().traziKupca(kupacZaPretragu);
                        so.setOdgovor(listaPronadjenihKupaca);
                        break;
                    case Konstante.VRATI_SVE_KUPCE:
                        List<OpstiDomenskiObjekat> listaKupaca = Kontroler.vratiInstancu().vratiSveKupce();
                        so.setOdgovor(listaKupaca);
                        break;
                    case Konstante.OBRISI_KUPCA:
                        Kupac kupacZaBrisanje = (Kupac) kz.getParametar();
                        boolean uspesnoBrisanjeKupca = Kontroler.vratiInstancu().obrisiKupca(kupacZaBrisanje);
                        so.setOdgovor(uspesnoBrisanjeKupca);
                        break;
                    case Konstante.IZMENI_KUPCA:
                        Kupac kupacZaIzmenu = (Kupac) kz.getParametar();
                        boolean uspesnaIzmenaKupca = Kontroler.vratiInstancu().izmeniKupca(kupacZaIzmenu);
                        so.setOdgovor(uspesnaIzmenaKupca);
                        break;
                    case Konstante.VRATI_SVE_ZANROVE:
                        List<OpstiDomenskiObjekat> listaZanrova = Kontroler.vratiInstancu().vratiZanrove();
                        so.setOdgovor(listaZanrova);
                        break;
                    case Konstante.VRATI_SVE_FORMATE:
                        List<OpstiDomenskiObjekat> listaFormata = Kontroler.vratiInstancu().vratiFormate();
                        so.setOdgovor(listaFormata);
                        break;
                    case Konstante.VRATI_SVE_DISKOGRAFSKE_KUCE:
                        List<OpstiDomenskiObjekat> listaDiskografskihKuca = Kontroler.vratiInstancu().vratiDiskografskeKuce();
                        so.setOdgovor(listaDiskografskihKuca);
                        break;
                    case Konstante.VRATI_ID_PLOCE:
                        int plocaID = Kontroler.vratiInstancu().kreirajNovuPlocu();
                        so.setOdgovor(plocaID);
                        break;
                    case Konstante.SACUVAJ_PLOCU:
                        Ploca plocaZaCuvanje = (Ploca) kz.getParametar();
                        boolean uspesnoCuvanjePloce = Kontroler.vratiInstancu().sacuvajPlocu(plocaZaCuvanje);
                        so.setOdgovor(uspesnoCuvanjePloce);
                        break;
                    case Konstante.VRATI_ID_ZANRA:
                        int zanrID = Kontroler.vratiInstancu().kreirajNoviZanr();
                        so.setOdgovor(zanrID);
                        break;
                    case Konstante.VRATI_ID_FORMATA:
                        int formatID = Kontroler.vratiInstancu().kreirajNoviFormat();
                        so.setOdgovor(formatID);
                        break;
                    case Konstante.VRATI_ID_DISKOGRAFSKE_KUCE:
                        int diskografskaKucaID = Kontroler.vratiInstancu().kreirajNovuDiskografskuKucu();
                        so.setOdgovor(diskografskaKucaID);
                        break;
                    case Konstante.SACUVAJ_ZANR:
                        Zanr zanrZaCuvanje = (Zanr) kz.getParametar();
                        boolean uspesnoCuvanjeZanra = Kontroler.vratiInstancu().sacuvajZanr(zanrZaCuvanje);
                        so.setOdgovor(uspesnoCuvanjeZanra);
                        break;
                    case Konstante.SACUVAJ_FORMAT:
                        Format formatZaCuvanje = (Format) kz.getParametar();
                        boolean uspesnoCuvanjeFormata = Kontroler.vratiInstancu().sacuvajFormat(formatZaCuvanje);
                        so.setOdgovor(uspesnoCuvanjeFormata);
                        break;
                    case Konstante.SACUVAJ_DISKOGRAFSKU_KUCU:
                        DiskografskaKuca diskografskaKucaZaCuvanje = (DiskografskaKuca) kz.getParametar();
                        boolean uspesnoCuvanjeDiskografskeKuce = Kontroler.vratiInstancu().sacuvajDiskografskuKucu(diskografskaKucaZaCuvanje);
                        so.setOdgovor(uspesnoCuvanjeDiskografskeKuce);
                        break;
                    case Konstante.PRETRAGA_PLOCA:
                        Ploca plocaZaPretragu = (Ploca) kz.getParametar();
                        List<OpstiDomenskiObjekat> listaPronadjenihPloca = Kontroler.vratiInstancu().traziPlocu(plocaZaPretragu);
                        so.setOdgovor(listaPronadjenihPloca);
                        break;
                    case Konstante.VRATI_SVE_PLOCE:
                        List<OpstiDomenskiObjekat> listaPloca = Kontroler.vratiInstancu().vratiSvePloce();
                        so.setOdgovor(listaPloca);
                        break;
                    case Konstante.IZMENI_PLOCU:
                        Ploca plocaZaIzmenu = (Ploca) kz.getParametar();
                        boolean uspesnaIzmenaPloce = Kontroler.vratiInstancu().izmeniPlocu(plocaZaIzmenu);
                        so.setOdgovor(uspesnaIzmenaPloce);
                        break;
                    case Konstante.OBRISI_PLOCU:
                        Ploca plocaZaBrisanje = (Ploca) kz.getParametar();
                        boolean uspesnoBrisanjePloce = Kontroler.vratiInstancu().obrisiPlocu(plocaZaBrisanje);
                        so.setOdgovor(uspesnoBrisanjePloce);
                        break;
                    case Konstante.VRATI_ID_RACUNA:
                        int racunID = Kontroler.vratiInstancu().kreirajNoviRacun();
                        so.setOdgovor(racunID);
                        break;
                    case Konstante.SACUVAJ_RACUN:
                        Racun racunZaCuvanje = (Racun) kz.getParametar();
                        boolean uspesnoCuvanjeRacuna = Kontroler.vratiInstancu().sacuvajRacun(racunZaCuvanje);
                        so.setOdgovor(uspesnoCuvanjeRacuna);
                        break;
                }

                posaljiOdgovor(so);
            } catch (RuntimeException | ClassNotFoundException ex) {
                Logger.getLogger(RadSaKlijentomNit.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public KlijentskiZahtev primiZahtev() {
        KlijentskiZahtev kz = new KlijentskiZahtev();
        try {
            ObjectInputStream in = new ObjectInputStream(s.getInputStream());
            kz = (KlijentskiZahtev) in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(RadSaKlijentomNit.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kz;
    }

    public void posaljiOdgovor(ServerskiOdgovor so) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
            out.writeObject(so);
            out.flush();
        } catch (IOException ex) {
            Logger.getLogger(RadSaKlijentomNit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
