/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import baza.DatabaseBroker;

/**
 *
 * @author Bogdan
 */
public abstract class OpstaSO {
    
    public final synchronized void izvrsiOperaciju(Object obj) throws RuntimeException, ClassNotFoundException {
        try {
            DatabaseBroker.vratiInstancu().otvoriKonekciju();
            proveriPreduslov(obj);
            izvrsiKonkretnuOperaciju(obj);
            DatabaseBroker.vratiInstancu().commit();
        } catch (RuntimeException ex) {
            DatabaseBroker.vratiInstancu().rollback();
            throw ex;
        } finally {
            DatabaseBroker.vratiInstancu().zatvoriKonekciju();
        }
    }
    
    protected abstract void proveriPreduslov(Object obj) throws RuntimeException;

    protected abstract void izvrsiKonkretnuOperaciju(Object obj) throws RuntimeException;
    
}
