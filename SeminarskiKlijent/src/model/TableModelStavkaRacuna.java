/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import domen.StavkaRacuna;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author katarina
 */
public class TableModelStavkaRacuna extends AbstractTableModel {

    private List<StavkaRacuna> listaStavkiRacuna;

    public TableModelStavkaRacuna(List<StavkaRacuna> listaStavkiRacuna) {
        this.listaStavkiRacuna = listaStavkiRacuna;
    }
    
    String[] columnNames = new String[]{"Redni broj", "Naziv gramofonske ploče", "Cena gramofonske ploče", "Količina", "Iznos stavke računa"};

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
    @Override
    public int getRowCount() {
        if (listaStavkiRacuna == null) {
            return 0;
        }
        return listaStavkiRacuna.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        StavkaRacuna stavka = listaStavkiRacuna.get(rowIndex);
        switch(columnIndex){
            case 0: return stavka.getRedniBroj();
            case 1: return stavka.getPloca().getNazivPloce();
            case 2: return stavka.getPloca().getCena();
            case 3: return stavka.getKolicina();
            case 4: return stavka.getIznos();
            default: return "N/A";
        }
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

    public void dodajStavku(StavkaRacuna stavkaRacuna) {
        listaStavkiRacuna.add(stavkaRacuna);
        fireTableDataChanged();
    }
    
    public void obrisiStavku(int selektovanRed){
        listaStavkiRacuna.remove(selektovanRed);
        srediRedneBrojeve(listaStavkiRacuna);
        fireTableDataChanged();
    }

    public StavkaRacuna vratiStavkuRacuna(int selektovanRed) {
        return listaStavkiRacuna.get(selektovanRed);
    }

    private void srediRedneBrojeve(List<StavkaRacuna> listaStavkiRacuna) {
        int redniBroj = 0;
        for (StavkaRacuna stavkaRacuna : listaStavkiRacuna) {
            stavkaRacuna.setRedniBroj(++redniBroj);
        }
    }
    
}
