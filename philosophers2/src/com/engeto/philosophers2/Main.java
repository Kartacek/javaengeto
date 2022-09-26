package com.engeto.philosophers2;



import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Main {

    public static final int POCET_FILOZOFU = 10;

    public static void main(String[] args) {
        Lock[] vidlicky = new ReentrantLock[POCET_FILOZOFU];


        for (int e = 0; e < POCET_FILOZOFU; e++) {
            vidlicky[e] = new ReentrantLock();

        }


        Philosopher[] filozofove = new Philosopher[POCET_FILOZOFU];

        for (int e = 0; e < filozofove.length; e++) {
            int filozofId = e + 1;
            Lock pravaVidlicka = vidlicky[(e + 1) % vidlicky.length];
            Lock levaVidlicka = vidlicky[e];




            if (e == filozofove.length - 1) {
                filozofove[e] = new Philosopher(filozofId, pravaVidlicka, levaVidlicka);
            } else {
                filozofove[e] = new Philosopher(filozofId, levaVidlicka, pravaVidlicka);
            }

            Thread vlakno = new Thread(filozofove[e], "Filozof : " + filozofId);
            vlakno.start();
        }
    }
}


