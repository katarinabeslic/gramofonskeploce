/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niti;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author katarina
 */
public class SatNit extends Thread {
    
    private JLabel lblVreme;

    public SatNit(JLabel lblVreme) {
        this.lblVreme = lblVreme;
    }

    @Override
    public void run() {
        try {
            while (true) {                
                Date date = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String datum = sdf.format(date);
                lblVreme.setText(datum);
            }
        } catch (Exception e) {
        }
    }
    
    
    
}
