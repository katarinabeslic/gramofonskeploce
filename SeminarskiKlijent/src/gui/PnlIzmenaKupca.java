/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import domen.Kupac;
import gui.kupac.kki.PretragaKupacaKKI;
import gui.kupac.kki.UnosKupcaKKI;
import java.awt.Font;
import java.awt.Window;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author katarina
 */
public class PnlIzmenaKupca extends javax.swing.JPanel {

    PnlPretragaKupaca panel;

    /**
     * Creates new form PnlUnosKupca
     */
    public PnlIzmenaKupca() {
        initComponents();
    }

    PnlIzmenaKupca(PnlPretragaKupaca panel) {
        initComponents();
        this.panel = panel;
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
        txtKupacID = new javax.swing.JTextField();
        txtImePrezime = new javax.swing.JTextField();
        txtAdresa = new javax.swing.JTextField();
        txtBrojTelefona = new javax.swing.JTextField();
        btnSacuvajIzmene = new javax.swing.JButton();
        btnOdustani = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel1.setText("Kupac ID:");

        jLabel2.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel2.setText("Ime i prezime:");

        jLabel3.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel3.setText("Adresa:");

        jLabel4.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel4.setText("Broj telefona:");

        txtKupacID.setEditable(false);
        txtKupacID.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txtKupacID.setToolTipText("");
        txtKupacID.setEnabled(false);

        txtImePrezime.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        txtAdresa.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        txtBrojTelefona.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        btnSacuvajIzmene.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btnSacuvajIzmene.setText("Sačuvaj izmene");
        btnSacuvajIzmene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajIzmeneActionPerformed(evt);
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
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtKupacID, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAdresa, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                            .addComponent(txtImePrezime)
                            .addComponent(txtBrojTelefona)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(btnSacuvajIzmene)
                        .addGap(18, 18, 18)
                        .addComponent(btnOdustani, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKupacID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtImePrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAdresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBrojTelefona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSacuvajIzmene)
                    .addComponent(btnOdustani))
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSacuvajIzmeneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajIzmeneActionPerformed
        if (txtKupacID.getText().isEmpty()) {
            JLabel label = new JLabel("Sistem ne može da pronađe zaposlenog na osnovu unetih vrednosti!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(null, label, "Greška!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtImePrezime.getText().isEmpty()) {
            JLabel label = new JLabel("Morate uneti ime i prezime kupca!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(null, label, "Greška!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtAdresa.getText().isEmpty()) {
            JLabel label = new JLabel("Morate uneti adresu kupca!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(null, label, "Greška!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtBrojTelefona.getText().isEmpty()) {
            JLabel label = new JLabel("Morate uneti broj telefona kupca!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(null, label, "Greška!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        boolean uspesno = PretragaKupacaKKI.izmeniKupca(txtKupacID, txtImePrezime, txtAdresa, txtBrojTelefona);

        if (uspesno) {
            JLabel label = new JLabel("Sistem je zapamtio izmene kupca!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(null, label);
            resetuj();
        } else {
            JLabel label = new JLabel("Sistem ne može da zapamti izmene kupca!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(null, label, "Greška!", JOptionPane.ERROR_MESSAGE);
        }

        Window w = SwingUtilities.getWindowAncestor(this);
        w.setVisible(false);

    }//GEN-LAST:event_btnSacuvajIzmeneActionPerformed

    private void btnOdustaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdustaniActionPerformed
        JComponent comp = (JComponent) evt.getSource();
        Window win = SwingUtilities.getWindowAncestor(comp);
        win.dispose();
    }//GEN-LAST:event_btnOdustaniActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOdustani;
    private javax.swing.JButton btnSacuvajIzmene;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtAdresa;
    private javax.swing.JTextField txtBrojTelefona;
    private javax.swing.JTextField txtImePrezime;
    private javax.swing.JTextField txtKupacID;
    // End of variables declaration//GEN-END:variables

    private void resetuj() {
        txtKupacID.setText("");

        txtImePrezime.setText("");
        txtAdresa.setText("");
        txtBrojTelefona.setText("");
    }

    private void srediFormu() {
        Kupac kupac = PnlPretragaKupaca.kupac;
        JLabel label = new JLabel("Sistem je pronašao kupca po zadatim vrednostima!");
        label.setFont(new Font("Calibri light", Font.PLAIN, 16));
        JOptionPane.showMessageDialog(this, label);
        txtKupacID.setText(kupac.getKupacID() + "");
        txtImePrezime.setText(kupac.getImePrezime());
        txtAdresa.setText(kupac.getAdresa());
        txtBrojTelefona.setText(kupac.getBrojTelefona());
    }
}
