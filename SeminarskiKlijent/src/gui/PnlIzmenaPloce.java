/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import domen.DiskografskaKuca;
import domen.Format;
import domen.Ploca;
import domen.Zanr;
import gui.ploca.kki.UnosPloceKKI;
import java.awt.Font;
import java.awt.Window;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.JTableHeader;
import model.TableModelZanr;

/**
 *
 * @author katarina
 */
public class PnlIzmenaPloce extends javax.swing.JPanel {

    List<Zanr> listaZanrova;
    PnlPretragaPloca panel;

    /**
     * Creates new form PnlUnosPloce
     */
    public PnlIzmenaPloce() {
        initComponents();
        srediFormu();
    }

    PnlIzmenaPloce(PnlPretragaPloca panel) {
        this.panel = panel;
        initComponents();
        srediFormu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPlocaID = new javax.swing.JTextField();
        txtNazivPloce = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOpisPloce = new javax.swing.JTextArea();
        txtCena = new javax.swing.JTextField();
        cbFormat = new javax.swing.JComboBox<>();
        cbDiskografskaKuca = new javax.swing.JComboBox<>();
        btnSacuvajPlocu = new javax.swing.JButton();
        btnOdustani = new javax.swing.JButton();
        cbZanr = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblZanr = new javax.swing.JTable();
        btnDodajZanrPloce = new javax.swing.JButton();
        btnObrisiZanrPloce = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel1.setText("Plo??a ID:");

        jLabel2.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel2.setText("Naziv plo??e:");

        jLabel3.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel3.setText("Opis:");

        jLabel4.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel4.setText("Cena:");

        jLabel5.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel5.setText("??anr:");

        jLabel6.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel6.setText("Format:");

        jLabel7.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel7.setText("Diskografska ku??a:");

        txtPlocaID.setEditable(false);
        txtPlocaID.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txtPlocaID.setEnabled(false);

        txtNazivPloce.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        txtOpisPloce.setColumns(20);
        txtOpisPloce.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txtOpisPloce.setRows(5);
        jScrollPane1.setViewportView(txtOpisPloce);

        txtCena.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        cbFormat.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        cbFormat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbDiskografskaKuca.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        cbDiskografskaKuca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSacuvajPlocu.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btnSacuvajPlocu.setText("Sa??uvaj izmene");
        btnSacuvajPlocu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajPlocuActionPerformed(evt);
            }
        });

        btnOdustani.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btnOdustani.setText("Odustani");
        btnOdustani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdustaniActionPerformed(evt);
            }
        });

        cbZanr.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        cbZanr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tblZanr.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        tblZanr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblZanr);

        btnDodajZanrPloce.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btnDodajZanrPloce.setText("Dodaj ??anr");
        btnDodajZanrPloce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajZanrPloceActionPerformed(evt);
            }
        });

        btnObrisiZanrPloce.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btnObrisiZanrPloce.setText("Obri??i ??anr");
        btnObrisiZanrPloce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiZanrPloceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbFormat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPlocaID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNazivPloce, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCena, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(cbDiskografskaKuca, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnDodajZanrPloce, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnObrisiZanrPloce, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(cbZanr, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btnSacuvajPlocu, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnOdustani, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPlocaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNazivPloce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(cbZanr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnDodajZanrPloce)
                        .addGap(18, 18, 18)
                        .addComponent(btnObrisiZanrPloce))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cbFormat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbDiskografskaKuca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSacuvajPlocu)
                    .addComponent(btnOdustani))
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSacuvajPlocuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajPlocuActionPerformed
        if (txtNazivPloce.getText().isEmpty()) {
            JLabel label = new JLabel("Morate uneti naziv plo??e!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(null, label, "Gre??ka!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtOpisPloce.getText().isEmpty()) {
            JLabel label = new JLabel("Morate uneti opis plo??e!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(null, label, "Gre??ka!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtCena.getText().isEmpty()) {
            JLabel label = new JLabel("Morate uneti cenu plo??e!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(null, label, "Gre??ka!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double cena = 0;
        try {
            cena = Double.parseDouble(txtCena.getText());
        } catch (Exception e) {
            JLabel label = new JLabel("Cena nije u odgovaraju??em formatu!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(null, label, "Gre??ka!", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

        TableModelZanr tmz = (TableModelZanr) tblZanr.getModel();
        listaZanrova = tmz.vratiListu();

        boolean uspesno = UnosPloceKKI.izmeniPlocu(txtPlocaID, txtNazivPloce, txtOpisPloce, txtCena, listaZanrova, cbFormat, cbDiskografskaKuca);

        if (uspesno) {
            JLabel label = new JLabel("Sistem je uspe??no sa??uvao izmene plo??e!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(this, label);
            JComponent comp = (JComponent) evt.getSource();
            Window win = SwingUtilities.getWindowAncestor(comp);
            win.dispose();
        } else {
            JLabel label = new JLabel("Sistem ne mo??e da sa??uva izmene plo??e!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(null, label, "Gre??ka!", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnSacuvajPlocuActionPerformed

    private void btnOdustaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdustaniActionPerformed
        JComponent comp = (JComponent) evt.getSource();
        Window win = SwingUtilities.getWindowAncestor(comp);
        win.dispose();
    }//GEN-LAST:event_btnOdustaniActionPerformed

    private void btnDodajZanrPloceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajZanrPloceActionPerformed
        Zanr zanr = (Zanr) cbZanr.getSelectedItem();
        TableModelZanr tmz = (TableModelZanr) tblZanr.getModel();
        listaZanrova = tmz.vratiListu();
        if (!listaZanrova.contains(zanr)) {
            tmz.dodaj(zanr);
        } else {
            JLabel label = new JLabel("Izabrani ??anr je ve?? dodat!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(null, label, "Gre??ka!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDodajZanrPloceActionPerformed

    private void btnObrisiZanrPloceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiZanrPloceActionPerformed
        int selektovanRed = tblZanr.getSelectedRow();
        if (selektovanRed < 0) {
            JLabel label = new JLabel("Potrebno je selektovati ??anr koji ??elite da obri??ete!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(null, label, "Gre??ka!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        TableModelZanr tmz = (TableModelZanr) tblZanr.getModel();
        tmz.obrisi(selektovanRed);
    }//GEN-LAST:event_btnObrisiZanrPloceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajZanrPloce;
    private javax.swing.JButton btnObrisiZanrPloce;
    private javax.swing.JButton btnOdustani;
    private javax.swing.JButton btnSacuvajPlocu;
    private javax.swing.JComboBox<Object> cbDiskografskaKuca;
    private javax.swing.JComboBox<Object> cbFormat;
    private javax.swing.JComboBox<Object> cbZanr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblZanr;
    private javax.swing.JTextField txtCena;
    private javax.swing.JTextField txtNazivPloce;
    private javax.swing.JTextArea txtOpisPloce;
    private javax.swing.JTextField txtPlocaID;
    // End of variables declaration//GEN-END:variables

    private void srediFormu() {
        JLabel label = new JLabel("Sistem je prona??ao plo??u po zadatoj vrednosti!");
        label.setFont(new Font("Calibri light", Font.PLAIN, 16));
        JOptionPane.showMessageDialog(this, label);

        UnosPloceKKI.vratiZanrove(cbZanr);
        UnosPloceKKI.vratiFormate(cbFormat);
        UnosPloceKKI.vratiDiskografskeKuce(cbDiskografskaKuca);

        srediZanr();
        srediFormat();
        srediDiskografskuKucu();

        Ploca ploca = PnlPretragaPloca.ploca;

        txtPlocaID.setText(String.valueOf(ploca.getPlocaID()));
        txtNazivPloce.setText(ploca.getNazivPloce());
        txtOpisPloce.setText(ploca.getOpisPloce());
        txtCena.setText(String.valueOf(ploca.getCena()));
        
        listaZanrova = ploca.getListaZanrova();
        TableModelZanr tmz = new TableModelZanr(listaZanrova);
        tblZanr.setModel(tmz);
        
        JTableHeader tblHeader = tblZanr.getTableHeader();
        tblHeader.setFont(new Font("Calibri light", Font.PLAIN, 18));
    }


    private void srediZanr() {
        Ploca ploca = PnlPretragaPloca.ploca;
        int index = 1;
        listaZanrova = ploca.getListaZanrova();
        TableModelZanr tmz = new TableModelZanr(listaZanrova);
        tblZanr.setModel(tmz);
    }

    private void srediFormat() {
        Ploca ploca = PnlPretragaPloca.ploca;
        int index = 1;

        Format format = ploca.getFormat();
        int formatID = format.getFormatID();

        for (int i = 0; i < cbFormat.getItemCount(); i++) {
            Format f = (Format) cbFormat.getItemAt(i);
            int fID = f.getFormatID();
            if (fID == formatID) {
                index = i;
            }
        }

        cbFormat.setSelectedIndex(index);
    }

    private void srediDiskografskuKucu() {
        Ploca ploca = PnlPretragaPloca.ploca;
        int index = 1;

        DiskografskaKuca diskografskaKuca = ploca.getDiskografskaKuca();
        int diskografskaKucaID = diskografskaKuca.getDiskografskaKucaID();

        for (int i = 0; i < cbDiskografskaKuca.getItemCount(); i++) {
            DiskografskaKuca dk = (DiskografskaKuca) cbDiskografskaKuca.getItemAt(i);
            int dkID = dk.getDiskografskaKucaID();
            if (dkID == diskografskaKucaID) {
                index = i;
            }
        }

        cbDiskografskaKuca.setSelectedIndex(index);
    }
}
