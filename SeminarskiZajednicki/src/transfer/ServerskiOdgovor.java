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
public class ServerskiOdgovor implements Serializable {
    
    private Object odgovor;
    private Object izuzetak;

    public ServerskiOdgovor() {
    }

    public ServerskiOdgovor(Object odgovor, Object izuzetak) {
        this.odgovor = odgovor;
        this.izuzetak = izuzetak;
    }

    /**
     * @return the odgovor
     */
    public Object getOdgovor() {
        return odgovor;
    }

    /**
     * @param odgovor the odgovor to set
     */
    public void setOdgovor(Object odgovor) {
        this.odgovor = odgovor;
    }

    /**
     * @return the izuzetak
     */
    public Object getIzuzetak() {
        return izuzetak;
    }

    /**
     * @param izuzetak the izuzetak to set
     */
    public void setIzuzetak(Object izuzetak) {
        this.izuzetak = izuzetak;
    }
    
    
}
