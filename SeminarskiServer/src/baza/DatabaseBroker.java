/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baza;

import com.mysql.jdbc.Connection;
import domen.OpstiDomenskiObjekat;
import domen.Ploca;
import domen.Zanr;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author katarina
 */
public class DatabaseBroker {

    private Connection konekcija;
    private static DatabaseBroker instanca;

    public static DatabaseBroker vratiInstancu() {
        if (instanca == null) {
            instanca = new DatabaseBroker();
        }
        return instanca;
    }

    public void otvoriKonekciju() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/seminarski";
        String username = "root";
        String password = "";

        try {
            konekcija = (Connection) DriverManager.getConnection(url, username, password);
            konekcija.setAutoCommit(false);
        } catch (SQLException ex) {
            throw new RuntimeException("Neuspešno otvaranje konekcije!");
        }
    }

    public void commit() {
        try {
            konekcija.commit();
        } catch (SQLException ex) {
            throw new RuntimeException("Neuspešno commit-ovanje transakcije");
        }
    }

    public void rollback() {
        try {
            konekcija.rollback();
        } catch (SQLException ex) {
            throw new RuntimeException("Neuspešno rollback-ovanje transakcije");
        }
    }

    public void zatvoriKonekciju() {
        try {
            konekcija.close();
        } catch (SQLException ex) {
            throw new RuntimeException("Neuspešno zatvaranje konekcije");
        }
    }

    public int vratiNajveciID(String tabela) {
        try {
            String upit = "SELECT MAX(" + tabela + "ID) AS Sifra FROM " + tabela;
            System.out.println(upit);
            Statement statement = konekcija.createStatement();
            ResultSet rs = statement.executeQuery(upit);
            int ID = 0;
            if (rs.next()) {
                ID = rs.getInt("Sifra");
            }
            ID++;

            statement.close();
            rs.close();
            return ID;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseBroker.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Neuspešno vraćanje najvećeg ID-a!");
        }
    }

    public boolean sacuvaj(OpstiDomenskiObjekat odo) {
        boolean uspesno = false;

        try {
            String upit = "INSERT INTO " + odo.vratiNazivTabele() + " VALUES (" + odo.vratiInsert() + ")";
            System.out.println(upit);
            PreparedStatement statement = konekcija.prepareStatement(upit);
            statement.executeUpdate();
            konekcija.commit();
            statement.close();
            uspesno = true;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseBroker.class.getName()).log(Level.SEVERE, null, ex);
            try {
                konekcija.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(DatabaseBroker.class.getName()).log(Level.SEVERE, null, ex1);
            }
            throw new RuntimeException("Neuspešno čuvanje objekta!");
        }

        return uspesno;
    }

    public List<OpstiDomenskiObjekat> vratiListu(OpstiDomenskiObjekat odo) {
        try {
            String upit = "SELECT * FROM " + odo.vratiNazivTabele();
            System.out.println(upit);
            Statement statement = konekcija.createStatement();
            ResultSet rs = statement.executeQuery(upit);
            return odo.vratiListu(rs);
        } catch (Exception ex) {
            Logger.getLogger(DatabaseBroker.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Neuspešno učitavanje objekata!");
        }
    }

    public List<OpstiDomenskiObjekat> vratiJoinListu(OpstiDomenskiObjekat odo) {
        try {
            String upit = "SELECT * FROM " + odo.vratiJoinTabele();
            System.out.println(upit);
            Statement statement = konekcija.createStatement();
            ResultSet rs = statement.executeQuery(upit);
            return odo.vratiListu(rs);
        } catch (Exception ex) {
            Logger.getLogger(DatabaseBroker.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Neuspešno učitavanje objekta!");
        }
    }

    public List<OpstiDomenskiObjekat> vratiListuPretrage(OpstiDomenskiObjekat odo) {
        try {
            String upit = "SELECT * FROM " + odo.vratiJoinTabele() + " WHERE " + odo.vratiZaPretragu();
            System.out.println(upit);
            Statement statement = konekcija.createStatement();
            ResultSet rs = statement.executeQuery(upit);
            return odo.vratiListu(rs);
        } catch (Exception ex) {
            Logger.getLogger(DatabaseBroker.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Neuspešna pretraga...");
        }
    }

    public boolean obrisi(OpstiDomenskiObjekat odo) {
        boolean uspesno = false;

        try {
            String upit = "DELETE FROM " + odo.vratiNazivTabele() + " WHERE " + odo.vratiWhereUslovID();
            System.out.println(upit);
            Statement statement = konekcija.createStatement();
            statement.executeUpdate(upit);
            statement.close();
            uspesno = true;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseBroker.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Neuspešno brisanje objekta!");
        }
        return uspesno;
    }

    public boolean izmeni(OpstiDomenskiObjekat odo) {
        boolean uspesno = false;

        try {
            String upit = "UPDATE " + odo.vratiNazivTabele() + " SET " + odo.vratiZaIzmenu();
            System.out.println(upit);
            Statement statement = konekcija.createStatement();
            statement.executeUpdate(upit);
            uspesno = true;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        return uspesno;
    }

}
