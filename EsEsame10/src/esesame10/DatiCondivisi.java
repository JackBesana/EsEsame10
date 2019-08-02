/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esesame10;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author besan
 */
public class DatiCondivisi {

    ArrayList<Integer> v = new ArrayList<Integer>();
    int somma = 0;
    int conta = 0;
    int numero = 0;
    private Semaphore sem1;
    private Semaphore sem2;
    private Semaphore sem3;

    public DatiCondivisi() {
        sem1 = new Semaphore(1);
        sem2 = new Semaphore(0);
        sem3 = new Semaphore(0);
    }

    public void cercaDivisori(int numero) {
        this.numero = numero;
//        System.out.println("Analizzo il numero " + numero);
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                v.add(i);
            }
        }
    }

    public void somma() {
//        System.out.println("Analizzo il numero " + numero);
        for (int i = 0; i < v.size(); i++) {
            somma += v.get(i);
//                    System.out.println("Analizzo il divisore " + v.get(i));
        }
        v.clear();
    }

    public void visualizza() {
//        System.out.println("Analizzo il numero " + numero);
        if (somma == numero) {
            System.out.println(numero + " è un numero perfetto");
            conta++;
        }
        somma=0;
    }

    public boolean contaNumeriPerfetti() {
        if (conta >= 3) {
            return false;
        }
        return true;
    }

    public void daiPermesso1() {
        sem1.release();
    }

    public void chiediPermesso1() {
        try {
            sem1.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void daiPermesso2() {
        sem2.release();
    }

    public void chiediPermesso2() {
        try {
            sem2.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void daiPermesso3() {
        sem3.release();
    }

    public void chiediPermesso3() {
        try {
            sem3.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
