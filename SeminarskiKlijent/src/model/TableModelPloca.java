/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import domen.Ploca;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author katarina
 */
public class TableModelPloca extends AbstractTableModel {
    
    private List<Ploca> listaPloca;

    public TableModelPloca(List<Ploca> listaPloca) {
        this.listaPloca = listaPloca;
    }

    private String[] columnNames = new String[]{"Naziv ploče", "Cena ploče", "Format ploče", "Diskografska kuća ploče"};

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
    @Override
    public int getRowCount() {
        if (listaPloca == null) {
            return 0;
        }
        return listaPloca.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Ploca ploca = listaPloca.get(rowIndex);
        switch(columnIndex){
            case 0: return ploca.getNazivPloce();
            case 1: return String.valueOf(ploca.getCena());
            case 2: return ploca.getFormat().getNazivFormata();
            case 3: return ploca.getDiskografskaKuca().getNazivDiskografskeKuce();
            default: return "N/A";
        }
    }

    /**
     * @return the listaPloca
     */
    public List<Ploca> getListaPloca() {
        return listaPloca;
    }

    /**
     * @param listaPloca the listaPloca to set
     */
    public void setListaPloca(List<Ploca> listaPloca) {
        this.listaPloca = listaPloca;
    }

    /**
     * @return the columnNames
     */
    public String[] getColumnNames() {
        return columnNames;
    }

    /**
     * @param columnNames the columnNames to set
     */
    public void setColumnNames(String[] columnNames) {
        this.columnNames = columnNames;
    }

    public Ploca vratiPlocu(int selectedRow) {
        return listaPloca.get(selectedRow);
    }

    public void obrisi(int selektovanRed) {
        listaPloca.remove(selektovanRed);
        fireTableDataChanged();
    }
    
}
