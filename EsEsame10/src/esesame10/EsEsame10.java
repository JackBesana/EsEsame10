/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esesame10;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author besan
 */
public class EsEsame10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            
            DatiCondivisi datiC=new DatiCondivisi();
            
            ThDivisori th1=new ThDivisori(datiC);
            ThSomma th2=new ThSomma(datiC);
            ThVisualizza th3=new ThVisualizza(datiC);
            
            th1.start();
            th2.start();
            th3.start();
            
            th1.join();
            th2.join();
            th3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(EsEsame10.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
