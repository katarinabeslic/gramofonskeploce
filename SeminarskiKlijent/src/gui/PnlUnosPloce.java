/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import domen.Zanr;
import gui.ploca.kki.UnosPloceKKI;
import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Window;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.JTableHeader;
import model.TableModelZanr;

/**
 *
 * @author katarina
 */
public class PnlUnosPloce extends javax.swing.JPanel {

    private List<Zanr> listaZanrova;
    /**
     * Creates new form PnlUnosPloce
     */
    public PnlUnosPloce() {
        initComponents();
        listaZanrova = new ArrayList<>();
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
        btnKreirajNovuPlocu = new javax.swing.JButton();
        txtNazivPloce = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOpisPloce = new javax.swing.JTextArea();
        txtCena = new javax.swing.JTextField();
        cbFormat = new javax.swing.JComboBox<>();
        cbDiskografskaKuca = new javax.swing.JComboBox<>();
        btnDodajZanr = new javax.swing.JButton();
        btnDodajFormat = new javax.swing.JButton();
        btnDodajDiskografskuKucu = new javax.swing.JButton();
        btnSacuvajPlocu = new javax.swing.JButton();
        btnResetuj = new javax.swing.JButton();
        btnOdustani = new javax.swing.JButton();
        cbZanr = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblZanr = new javax.swing.JTable();
        btnDodajZanrPloce = new javax.swing.JButton();
        btnObrisiZanrPloce = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel1.setText("Ploča ID:");

        jLabel2.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel2.setText("Naziv ploče:");

        jLabel3.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel3.setText("Opis:");

        jLabel4.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel4.setText("Cena:");

        jLabel5.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel5.setText("Žanr:");

        jLabel6.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel6.setText("Format:");

        jLabel7.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel7.setText("Diskografska kuća:");

        txtPlocaID.setEditable(false);
        txtPlocaID.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txtPlocaID.setEnabled(false);

        btnKreirajNovuPlocu.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btnKreirajNovuPlocu.setText("Kreiraj novu ploču");
        btnKreirajNovuPlocu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKreirajNovuPlocuActionPerformed(evt);
            }
        });

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

        btnDodajZanr.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btnDodajZanr.setText("+");
        btnDodajZanr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajZanrActionPerformed(evt);
            }
        });

        btnDodajFormat.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btnDodajFormat.setText("+");
        btnDodajFormat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajFormatActionPerformed(evt);
            }
        });

        btnDodajDiskografskuKucu.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btnDodajDiskografskuKucu.setText("+");
        btnDodajDiskografskuKucu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajDiskografskuKucuActionPerformed(evt);
            }
        });

        btnSacuvajPlocu.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btnSacuvajPlocu.setText("Sačuvaj ploču");
        btnSacuvajPlocu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajPlocuActionPerformed(evt);
            }
        });

        btnResetuj.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btnResetuj.setText("Resetuj");
        btnResetuj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetujActionPerformed(evt);
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
        btnDodajZanrPloce.setText("Dodaj žanr");
        btnDodajZanrPloce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajZanrPloceActionPerformed(evt);
            }
        });

        btnObrisiZanrPloce.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btnObrisiZanrPloce.setText("Obriši žanr");
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(61, 61, 61))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbDiskografskaKuca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbFormat, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDodajFormat)
                                    .addComponent(btnDodajDiskografskuKucu)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCena, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cbZanr, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnDodajZanr))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnDodajZanrPloce, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnObrisiZanrPloce, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtPlocaID, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnKreirajNovuPlocu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(txtNazivPloce, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnSacuvajPlocu, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnResetuj, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnOdustani, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPlocaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKreirajNovuPlocu))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNazivPloce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbZanr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDodajZanr))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnDodajZanrPloce)
                        .addGap(18, 18, 18)
                        .addComponent(btnObrisiZanrPloce)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbFormat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDodajFormat)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDiskografskaKuca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDodajDiskografskuKucu)
                    .addComponent(jLabel7))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSacuvajPlocu)
                    .addComponent(btnResetuj)
                    .addComponent(btnOdustani))
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnKreirajNovuPlocuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKreirajNovuPlocuActionPerformed
        int plocaID = UnosPloceKKI.vratiID(txtPlocaID);

        if (plocaID <= 0) {
            JLabel label = new JLabel("Sistem ne može da kreira novu ploču!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(null, label, "Greška!", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            JLabel label = new JLabel("Sistem je kreirao novu ploču!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(this, label);
        }
        btnKreirajNovuPlocu.setEnabled(false);
    }//GEN-LAST:event_btnKreirajNovuPlocuActionPerformed

    private void btnSacuvajPlocuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajPlocuActionPerformed
        if (txtPlocaID.getText().isEmpty()) {
            JLabel label = new JLabel("Morate kreirati novu ploču!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(null, label, "Greška!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtNazivPloce.getText().isEmpty()) {
            JLabel label = new JLabel("Morate uneti naziv ploče!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(null, label, "Greška!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtOpisPloce.getText().isEmpty()) {
            JLabel label = new JLabel("Morate uneti opis ploče!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(null, label, "Greška!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtCena.getText().isEmpty()) {
            JLabel label = new JLabel("Morate uneti cenu ploče!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(null, label, "Greška!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (listaZanrova.isEmpty()) {
            JLabel label = new JLabel("Ploča mora imati bar jedan žanr!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(null, label, "Greška!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double cena = 0;
        try{
            cena = Double.parseDouble(txtCena.getText());
        } catch(Exception e){
            JLabel label = new JLabel("Cena nije u odgovarajućem formatu!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(null, label, "Greška!", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        
        TableModelZanr tmz = (TableModelZanr) tblZanr.getModel();
        listaZanrova = tmz.vratiListu();
        
        boolean uspesno = UnosPloceKKI.sacuvajPlocu(txtPlocaID, txtNazivPloce, txtOpisPloce, txtCena, listaZanrova, cbFormat, cbDiskografskaKuca);
   
        if (uspesno) {
            JLabel label = new JLabel("Sistem je uspešno sačuvao ploču!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(this, label);
            resetuj();
        } else {
            JLabel label = new JLabel("Sistem ne može da sačuva ploču!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(null, label, "Greška!", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnSacuvajPlocuActionPerformed

    private void btnResetujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetujActionPerformed
        resetuj();
    }//GEN-LAST:event_btnResetujActionPerformed

    private void btnOdustaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdustaniActionPerformed
        JComponent comp = (JComponent) evt.getSource();
        Window win = SwingUtilities.getWindowAncestor(comp);
        win.dispose();
    }//GEN-LAST:event_btnOdustaniActionPerformed

    private void btnDodajZanrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajZanrActionPerformed
        PnlUnosZanra unosZanra = new PnlUnosZanra(this);
        JDialog dialog = new JDialog((Dialog) SwingUtilities.getWindowAncestor(this), "Prodavnica gramofonskih ploča - unos žanra", true);
        dialog.setLayout(new BorderLayout());
        dialog.add(unosZanra);
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }//GEN-LAST:event_btnDodajZanrActionPerformed

    private void btnDodajFormatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajFormatActionPerformed
        PnlUnosFormata unosFormata = new PnlUnosFormata(this);
        JDialog dialog = new JDialog((Dialog) SwingUtilities.getWindowAncestor(this), "Prodavnica gramofonskih ploča - unos formata", true);
        dialog.setLayout(new BorderLayout());
        dialog.add(unosFormata);
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }//GEN-LAST:event_btnDodajFormatActionPerformed

    private void btnDodajDiskografskuKucuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajDiskografskuKucuActionPerformed
        PnlUnosDiskografskeKuce unosDiskografskeKuce = new PnlUnosDiskografskeKuce(this);
        JDialog dialog = new JDialog((Dialog) SwingUtilities.getWindowAncestor(this), "Prodavnica gramofonskih ploča - unos diskografske kuće", true);
        dialog.setLayout(new BorderLayout());
        dialog.add(unosDiskografskeKuce);
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }//GEN-LAST:event_btnDodajDiskografskuKucuActionPerformed

    private void btnDodajZanrPloceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajZanrPloceActionPerformed
        Zanr zanr = (Zanr) cbZanr.getSelectedItem();
        TableModelZanr tmz = (TableModelZanr) tblZanr.getModel();
        listaZanrova = tmz.vratiListu();
        if (!listaZanrova.contains(zanr)) {
            tmz.dodaj(zanr);
        } else {
            JLabel label = new JLabel("Izabrani žanr je već dodat!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(null, label, "Greška!", JOptionPane.ERROR_MESSAGE);
        }        
    }//GEN-LAST:event_btnDodajZanrPloceActionPerformed

    private void btnObrisiZanrPloceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiZanrPloceActionPerformed
        int selektovanRed = tblZanr.getSelectedRow();
        if (selektovanRed < 0) {
            JLabel label = new JLabel("Potrebno je selektovati žanr koji želite da obrišete!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(null, label, "Greška!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        TableModelZanr tmz = (TableModelZanr) tblZanr.getModel();
        tmz.obrisi(selektovanRed);
    }//GEN-LAST:event_btnObrisiZanrPloceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajDiskografskuKucu;
    private javax.swing.JButton btnDodajFormat;
    private javax.swing.JButton btnDodajZanr;
    private javax.swing.JButton btnDodajZanrPloce;
    private javax.swing.JButton btnKreirajNovuPlocu;
    private javax.swing.JButton btnObrisiZanrPloce;
    private javax.swing.JButton btnOdustani;
    private javax.swing.JButton btnResetuj;
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
        TableModelZanr tmz = new TableModelZanr(listaZanrova);
        tblZanr.setModel(tmz);
        UnosPloceKKI.vratiZanrove(cbZanr);
        UnosPloceKKI.vratiFormate(cbFormat);
        UnosPloceKKI.vratiDiskografskeKuce(cbDiskografskaKuca);
        JTableHeader tblHeader = tblZanr.getTableHeader();
        tblHeader.setFont(new Font("Calibri light", Font.PLAIN, 18));
    }

    private void resetuj() {
        txtPlocaID.setText("");
        txtNazivPloce.setText("");
        txtOpisPloce.setText("");
        txtCena.setText("");
        btnKreirajNovuPlocu.setEnabled(true);
        listaZanrova = new ArrayList<>();
        TableModelZanr tmz = new TableModelZanr(listaZanrova);
        tblZanr.setModel(tmz);
        UnosPloceKKI.vratiZanrove(cbZanr);
        UnosPloceKKI.vratiFormate(cbFormat);
        UnosPloceKKI.vratiDiskografskeKuce(cbDiskografskaKuca);
    }

    JComboBox getCbZanr() {
        return cbZanr;
    }

    JComboBox getCbFormat() {
        return cbFormat;
    }

    JComboBox getCbDiskografskaKuca() {
        return cbDiskografskaKuca;
    }
}
