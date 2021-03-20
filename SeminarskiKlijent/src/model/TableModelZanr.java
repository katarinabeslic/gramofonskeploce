/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import domen.Zanr;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author katarina
 */
public class TableModelZanr extends AbstractTableModel{
    List<Zanr> listaZanrova;

    public TableModelZanr(List<Zanr> listaZanrova) {
        this.listaZanrova = listaZanrova;
    }
    
    @Override
    public int getRowCount() {
        if (listaZanrova == null) {
            return 0;
        }
        return listaZanrova.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public String getColumnName(int column) {
        return "Žanr ploče";
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Zanr z = listaZanrova.get(rowIndex);
        switch(columnIndex){
            case 0: return z.getNazivZanra();
            default: return "NA";
        }
    }

    public List<Zanr> vratiListu() {
        return listaZanrova;
    }

    public void dodaj(Zanr zanr) {
        listaZanrova.add(zanr);
        fireTableDataChanged();
    }

    public void obrisi(int selektovanRed) {
        listaZanrova.remove(selektovanRed);
        fireTableDataChanged();
    }
    
}
