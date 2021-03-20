/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import domen.DiskografskaKuca;
import gui.diskografskakuca.kki.UnosDiskografskeKuceKKI;
import java.awt.Font;
import java.awt.Window;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author katarina
 */
public class PnlUnosDiskografskeKuce extends javax.swing.JPanel {

    PnlUnosPloce unosPloce;

    /**
     * Creates new form PnlUnosZanra
     */
    public PnlUnosDiskografskeKuce() {
        initComponents();
    }

    PnlUnosDiskografskeKuce(PnlUnosPloce unosPloce) {
        this.unosPloce = unosPloce;
        initComponents();
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
        txtDiskografskaKucaID = new javax.swing.JTextField();
        txtNazivDiskografskeKuce = new javax.swing.JTextField();
        btnKreirajNovuDiskografskuKucu = new javax.swing.JButton();
        btnSacuvajDiskografskuKucu = new javax.swing.JButton();
        btnOdustani = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel1.setText("Diskografska kuća ID:");

        jLabel2.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel2.setText("Naziv diskografske kuće:");

        txtDiskografskaKucaID.setEditable(false);
        txtDiskografskaKucaID.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txtDiskografskaKucaID.setEnabled(false);

        txtNazivDiskografskeKuce.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        btnKreirajNovuDiskografskuKucu.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btnKreirajNovuDiskografskuKucu.setText("Kreiraj novu diskografsku kuću");
        btnKreirajNovuDiskografskuKucu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKreirajNovuDiskografskuKucuActionPerformed(evt);
            }
        });

        btnSacuvajDiskografskuKucu.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btnSacuvajDiskografskuKucu.setText("Sačuvaj diskografsku kuću");
        btnSacuvajDiskografskuKucu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajDiskografskuKucuActionPerformed(evt);
            }
        });

        btnOdustani.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btnOdustani.setText("Odustani");
        btnOdustani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdustaniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDiskografskaKucaID, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnKreirajNovuDiskografskuKucu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtNazivDiskografskeKuce)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(btnSacuvajDiskografskuKucu, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnOdustani, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDiskografskaKucaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKreirajNovuDiskografskuKucu))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNazivDiskografskeKuce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOdustani)
                    .addComponent(btnSacuvajDiskografskuKucu))
                .addGap(56, 56, 56))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnKreirajNovuDiskografskuKucuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKreirajNovuDiskografskuKucuActionPerformed
        int diskografskaKucaID = UnosDiskografskeKuceKKI.vratiID(txtDiskografskaKucaID);

        if (diskografskaKucaID <= 0) {
            JLabel label = new JLabel("Sistem ne može da kreira novu diskografsku kuću!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(null, label, "Greška!", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            JLabel label = new JLabel("Sistem je kreirao novu diskografsku kuću!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(this, label);
        }

        btnKreirajNovuDiskografskuKucu.setEnabled(false);
    }//GEN-LAST:event_btnKreirajNovuDiskografskuKucuActionPerformed

    private void btnOdustaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdustaniActionPerformed
        JComponent comp = (JComponent) evt.getSource();
        Window win = SwingUtilities.getWindowAncestor(comp);
        win.dispose();
    }//GEN-LAST:event_btnOdustaniActionPerformed

    private void btnSacuvajDiskografskuKucuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajDiskografskuKucuActionPerformed
        if (txtDiskografskaKucaID.getText().isEmpty()) {
            JLabel label = new JLabel("Morate kreirati novu diskografsku kuću!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(null, label, "Greška!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtNazivDiskografskeKuce.getText().isEmpty()) {
            JLabel label = new JLabel("Morate uneti naziv diskografske kuće!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(null, label, "Greška!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        boolean uspesno = UnosDiskografskeKuceKKI.sacuvajDiskografskuKucu(txtDiskografskaKucaID, txtNazivDiskografskeKuce);

        if (uspesno) {
            JLabel label = new JLabel("Sistem je uspešno sačuvao diskografsku kuću!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(this, label);
            dodajUComboBox();
            JComponent comp = (JComponent) evt.getSource();
            Window win = SwingUtilities.getWindowAncestor(comp);
            win.dispose();
        } else {
            JLabel label = new JLabel("Sistem ne može da sačuva diskografsku kuću!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(null, label, "Greška!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSacuvajDiskografskuKucuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKreirajNovuDiskografskuKucu;
    private javax.swing.JButton btnOdustani;
    private javax.swing.JButton btnSacuvajDiskografskuKucu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtDiskografskaKucaID;
    private javax.swing.JTextField txtNazivDiskografskeKuce;
    // End of variables declaration//GEN-END:variables

    private void dodajUComboBox() {
        JComboBox cbDiskografskaKuca = unosPloce.getCbDiskografskaKuca();
        cbDiskografskaKuca.addItem(new DiskografskaKuca(Integer.parseInt(txtDiskografskaKucaID.getText()), txtNazivDiskografskeKuce.getText()));
    }
}