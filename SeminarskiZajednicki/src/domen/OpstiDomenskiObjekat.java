/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author katarina
 */
public interface OpstiDomenskiObjekat {
    
    public String vratiNazivTabele();

    public String vratiInsert();

    public int vratiID();

    public String vratiZaPretragu();

    public List<OpstiDomenskiObjekat> vratiListu(ResultSet rs) throws Exception;

    public String vratiWhereUslovID();
    
    public String vratiJoinTabele();

    public String vratiZaIzmenu();
    
}
