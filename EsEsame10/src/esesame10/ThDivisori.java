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
public class ThDivisori extends Thread {

    DatiCondivisi datiC = new DatiCondivisi();
    int i=2;
    public ThDivisori(DatiCondivisi ptrDati){
        datiC=ptrDati;
    }
    
    @Override 
    public void run(){
        while(datiC.contaNumeriPerfetti()){
            datiC.chiediPermesso1();
            datiC.cercaDivisori(i);
            i++;
            datiC.daiPermesso2();
        }
    }
}
