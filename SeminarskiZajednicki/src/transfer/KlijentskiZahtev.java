/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transfer;

import java.io.Serializable;

/**
 *
 * @author katarina
 */
public class KlijentskiZahtev implements Serializable {
    
    private Object parametar;
    private int operacija;

    public KlijentskiZahtev() {
    }

    public KlijentskiZahtev(Object parametar, int operacija) {
        this.parametar = parametar;
        this.operacija = operacija;
    }

    /**
     * @return the parametar
     */
    public Object getParametar() {
        return parametar;
    }

    /**
     * @param parametar the parametar to set
     */
    public void setParametar(Object parametar) {
        this.parametar = parametar;
    }

    /**
     * @return the operacija
     */
    public int getOperacija() {
        return operacija;
    }

    /**
     * @param operacija the operacija to set
     */
    public void setOperacija(int operacija) {
        this.operacija = operacija;
    }
    
    
}
