/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.ploca.kki;

import domen.DiskografskaKuca;
import domen.Format;
import domen.Ploca;
import domen.Zanr;
import domen.ZanrPloce;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import konstante.Konstante;
import kontroler.komunikacija.KomunikacioniKontroler;
import transfer.KlijentskiZahtev;
import transfer.ServerskiOdgovor;

/**
 *
 * @author katarina
 */
public class UnosPloceKKI {

    public static void vratiZanrove(JComboBox<Object> cbZanr) {
        try {
            KlijentskiZahtev kz = new KlijentskiZahtev();
            kz.setOperacija(Konstante.VRATI_SVE_ZANROVE);
            KomunikacioniKontroler.vratiInstancu().posaljiZahtev(kz);

            ServerskiOdgovor so = KomunikacioniKontroler.vratiInstancu().primiOdgovor();
            List<Zanr> listaZanrova = (List<Zanr>) so.getOdgovor();

            cbZanr.removeAllItems();

            for (Zanr zanr : listaZanrova) {
                cbZanr.addItem(zanr);
            }
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(UnosPloceKKI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void vratiFormate(JComboBox<Object> cbFormat) {
        try {
            KlijentskiZahtev kz = new KlijentskiZahtev();
            kz.setOperacija(Konstante.VRATI_SVE_FORMATE);
            KomunikacioniKontroler.vratiInstancu().posaljiZahtev(kz);

            ServerskiOdgovor so = KomunikacioniKontroler.vratiInstancu().primiOdgovor();
            List<Format> listaFormata = (List<Format>) so.getOdgovor();

            cbFormat.removeAllItems();

            for (Format format : listaFormata) {
                cbFormat.addItem(format);
            }
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(UnosPloceKKI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void vratiDiskografskeKuce(JComboBox<Object> cbDiskografskaKuca) {
        try {
            KlijentskiZahtev kz = new KlijentskiZahtev();
            kz.setOperacija(Konstante.VRATI_SVE_DISKOGRAFSKE_KUCE);
            KomunikacioniKontroler.vratiInstancu().posaljiZahtev(kz);

            ServerskiOdgovor so = KomunikacioniKontroler.vratiInstancu().primiOdgovor();
            List<DiskografskaKuca> listaDiskografskihKuca = (List<DiskografskaKuca>) so.getOdgovor();

            cbDiskografskaKuca.removeAllItems();

            for (DiskografskaKuca diskografskaKuca : listaDiskografskihKuca) {
                cbDiskografskaKuca.addItem(diskografskaKuca);
            }
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(UnosPloceKKI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int vratiID(JTextField txtPlocaID) {
        int plocaID = -1;

        try {
            KlijentskiZahtev kz = new KlijentskiZahtev();
            kz.setOperacija(Konstante.VRATI_ID_PLOCE);

            KomunikacioniKontroler.vratiInstancu().posaljiZahtev(kz);
            ServerskiOdgovor so = KomunikacioniKontroler.vratiInstancu().primiOdgovor();
            plocaID = (int) so.getOdgovor();
            txtPlocaID.setText(String.valueOf(plocaID));
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(UnosPloceKKI.class.getName()).log(Level.SEVERE, null, ex);
        }

        return plocaID;
    }

    public static boolean sacuvajPlocu(JTextField txtPlocaID, JTextField txtNazivPloce, JTextArea txtOpisPloce, JTextField txtCena, List<Zanr> listaZanrova, JComboBox<Object> cbFormat, JComboBox<Object> cbDiskografskaKuca) {
        boolean uspesno = false;

        try {
            int plocaID = Integer.parseInt(txtPlocaID.getText());
            String nazivPloce = txtNazivPloce.getText();
            nazivPloce = nazivPloce.replaceAll("'", "''");
            String opisPloce = txtOpisPloce.getText();
            opisPloce = opisPloce.replaceAll("'", "''");

            double cena = Double.parseDouble(txtCena.getText());

            Format format = (Format) cbFormat.getSelectedItem();
            DiskografskaKuca diskografskaKuca = (DiskografskaKuca) cbDiskografskaKuca.getSelectedItem();

            Ploca ploca = new Ploca(plocaID, nazivPloce, opisPloce, listaZanrova, format, diskografskaKuca, cena);
            
            for (Zanr zanr : listaZanrova) {
                ZanrPloce zp = new ZanrPloce(ploca, zanr);
            }
            

            KlijentskiZahtev kz = new KlijentskiZahtev();
            kz.setParametar(ploca);
            kz.setOperacija(Konstante.SACUVAJ_PLOCU);

            KomunikacioniKontroler.vratiInstancu().posaljiZahtev(kz);
            ServerskiOdgovor so = KomunikacioniKontroler.vratiInstancu().primiOdgovor();
            uspesno = (boolean) so.getOdgovor();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(UnosPloceKKI.class.getName()).log(Level.SEVERE, null, ex);
        }

        return uspesno;
    }

    public static boolean izmeniPlocu(JTextField txtPlocaID, JTextField txtNazivPloce, JTextArea txtOpisPloce, JTextField txtCena, List<Zanr> listaZanrova, JComboBox<Object> cbFormat, JComboBox<Object> cbDiskografskaKuca) {
        boolean uspesno = false;
        try {
            int plocaID = Integer.parseInt(txtPlocaID.getText());
            String nazivPloce = txtNazivPloce.getText();
            nazivPloce = nazivPloce.replaceAll("'", "''");
            String opisPloce = txtOpisPloce.getText();
            opisPloce = opisPloce.replaceAll("'", "''");
            double cena = Double.parseDouble(txtCena.getText());
            Format format = (Format) cbFormat.getSelectedItem();
            DiskografskaKuca diskografskaKuca = (DiskografskaKuca) cbDiskografskaKuca.getSelectedItem();

            Ploca ploca = new Ploca(plocaID, nazivPloce, opisPloce, listaZanrova, format, diskografskaKuca, cena);

            KlijentskiZahtev kz = new KlijentskiZahtev(ploca, Konstante.IZMENI_PLOCU);
            KomunikacioniKontroler.vratiInstancu().posaljiZahtev(kz);

            ServerskiOdgovor so = KomunikacioniKontroler.vratiInstancu().primiOdgovor();
            uspesno = (boolean) so.getOdgovor();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(UnosPloceKKI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return uspesno;
    }

}
