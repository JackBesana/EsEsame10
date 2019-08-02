/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esesame10;

/**
 *
 * @author besan
 */
public class ThVisualizza extends Thread {
    DatiCondivisi datiC = new DatiCondivisi();
    
    public ThVisualizza(DatiCondivisi ptrDati) {
        datiC = ptrDati;
}
    
    @Override
    public void run(){
        while(datiC.contaNumeriPerfetti()){
            datiC.chiediPermesso3();
            datiC.visualizza();
            datiC.daiPermesso1();
        }
    }
}
