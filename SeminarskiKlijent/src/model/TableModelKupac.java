/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import domen.Kupac;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author katarina
 */
public class TableModelKupac extends AbstractTableModel {

    private List<Kupac> listaKupaca;

    public List<Kupac> getListaKupaca() {
        return listaKupaca;
    }

    public void setListaKupaca(List<Kupac> listaKupaca) {
        this.listaKupaca = listaKupaca;
    }
    private String[] columnNames = new String[]{"Ime i prezime", "Adresa", "Broj telefona"};

    public TableModelKupac(List<Kupac> listaKupaca) {
        this.listaKupaca = listaKupaca;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
    @Override
    public int getRowCount() {
        if (listaKupaca == null) {
            return 0;
        }
        return listaKupaca.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Kupac kupac = listaKupaca.get(rowIndex);
        switch(columnIndex){
            case 0: return kupac.getImePrezime();
            case 1: return kupac.getAdresa();
            case 2: return kupac.getBrojTelefona();
            default: return "N/A";
        }
    }
    
    public void obrisi(int rowIndex){
        listaKupaca.remove(rowIndex);
        fireTableDataChanged();
    }
    
    public Kupac vratiKupca(int rowIndex){
        return listaKupaca.get(rowIndex);
    }
    
}
