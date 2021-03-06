/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import domen.Format;
import gui.format.kki.UnosFormataKKI;
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
public class PnlUnosFormata extends javax.swing.JPanel {
    
    PnlUnosPloce unosPloce;

    /**
     * Creates new form PnlUnosZanra
     */
    public PnlUnosFormata() {
        initComponents();
    }

    PnlUnosFormata(PnlUnosPloce unosPloce) {
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
        txtFormatID = new javax.swing.JTextField();
        txtNazivFormata = new javax.swing.JTextField();
        btnKreirajNoviFormat = new javax.swing.JButton();
        btnSacuvajFormat = new javax.swing.JButton();
        btnOdustani = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel1.setText("Format ID:");

        jLabel2.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel2.setText("Naziv formata:");

        txtFormatID.setEditable(false);
        txtFormatID.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txtFormatID.setEnabled(false);

        txtNazivFormata.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        btnKreirajNoviFormat.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btnKreirajNoviFormat.setText("Kreiraj novi format");
        btnKreirajNoviFormat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKreirajNoviFormatActionPerformed(evt);
            }
        });

        btnSacuvajFormat.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btnSacuvajFormat.setText("Sa??uvaj format");
        btnSacuvajFormat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajFormatActionPerformed(evt);
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
                                .addComponent(txtFormatID, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnKreirajNoviFormat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtNazivFormata)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(btnSacuvajFormat, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOdustani, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFormatID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKreirajNoviFormat))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNazivFormata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOdustani)
                    .addComponent(btnSacuvajFormat))
                .addGap(56, 56, 56))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnKreirajNoviFormatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKreirajNoviFormatActionPerformed
        int formatID = UnosFormataKKI.vratiID(txtFormatID);
        
        if (formatID <= 0) {
            JLabel label = new JLabel("Sistem ne mo??e da kreira novi format!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(null, label, "Gre??ka!", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            JLabel label = new JLabel("Sistem je kreirao novi format!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(this, label);
        }
        
        btnKreirajNoviFormat.setEnabled(false);
    }//GEN-LAST:event_btnKreirajNoviFormatActionPerformed

    private void btnOdustaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdustaniActionPerformed
        JComponent comp = (JComponent) evt.getSource();
        Window win = SwingUtilities.getWindowAncestor(comp);
        win.dispose();
    }//GEN-LAST:event_btnOdustaniActionPerformed

    private void btnSacuvajFormatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajFormatActionPerformed
        if (txtFormatID.getText().isEmpty()) {
            JLabel label = new JLabel("Morate kreirati novi format!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(null, label, "Gre??ka!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtNazivFormata.getText().isEmpty()) {
            JLabel label = new JLabel("Morate uneti naziv formata!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(null, label, "Gre??ka!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        boolean uspesno = UnosFormataKKI.sacuvajFormat(txtFormatID, txtNazivFormata);
        
        if (uspesno) {
            JLabel label = new JLabel("Sistem je uspe??no sa??uvao format!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(this, label);
            dodajUComboBox();
            JComponent comp = (JComponent) evt.getSource();
            Window win = SwingUtilities.getWindowAncestor(comp);
            win.dispose();
        } else {
            JLabel label = new JLabel("Sistem ne mo??e da sa??uva format!");
            label.setFont(new Font("Calibri light", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(null, label, "Gre??ka!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSacuvajFormatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKreirajNoviFormat;
    private javax.swing.JButton btnOdustani;
    private javax.swing.JButton btnSacuvajFormat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtFormatID;
    private javax.swing.JTextField txtNazivFormata;
    // End of variables declaration//GEN-END:variables

    private void dodajUComboBox() {
        JComboBox cbFormat = unosPloce.getCbFormat();
        cbFormat.addItem(new Format(Integer.parseInt(txtFormatID.getText()), txtNazivFormata.getText()));
    }
}
