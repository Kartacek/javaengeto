package com.engeto.philosophers2;
import java.util.Random;
import java.util.concurrent.locks.Lock;






public class Philosopher implements Runnable {
    public static final int BOUND = 10;
    Random nahodneCislo = new Random();
    private int filId;
    private Lock pVidlicka;
    private Lock lVidlicka;








    public Philosopher(int filId, Lock pVidlicka, Lock lVidlicka) {
        this.filId = filId;
        this.pVidlicka = pVidlicka;
        this.lVidlicka = lVidlicka;
    }



    @Override





    public void run() {
        try {

            for (int i = 1; i <= 10000; i++) {
                premysli();
                zvedneLvidlicku();
                zvednePvidlicku();
                ji();
                poloziVidlicku();

            }
        } catch (InterruptedException e) {
            System.out.println("Vlákno f " + filId + " přerušeno.");
        }
    }




    public void premysli() throws InterruptedException {
        System.out.println("Fil jménem: " + filId + " přemýšlí.");
        System.out.flush();//vyprázdnění obsahu vyrovnávací paměti do výstupního proudu
        Thread.sleep(nahodneCislo.nextInt(BOUND));
    }


    public void zvednePvidlicku() {
        pVidlicka.lock();
        System.out.println("Fil jménem: " + filId + " zvedne pvidličku.");
        System.out.flush();
    }


    public void ji() throws InterruptedException {
        System.out.println("Fil jménem: " + filId + " jí.");
        System.out.flush();
        Thread.sleep(nahodneCislo.nextInt(BOUND));
    }


    public void zvedneLvidlicku() {
        lVidlicka.lock();
        System.out.println("Fil jménem: " + filId + " zvedne lvidličku.");
        System.out.flush();
    }





    public void poloziVidlicku() {
        System.out.println("Fil jménem: " + filId + " položí vidličku");
        System.out.flush();
        lVidlicka.unlock();
        pVidlicka.unlock();
    }
}
