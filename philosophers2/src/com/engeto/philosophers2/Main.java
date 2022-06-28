package com.engeto.philosophers2;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;






        public class Main {

            public static void main(String[] args) throws  Exception{
                Philosopher philosopher[] = new Philosopher[10];
                Object fork[] = new Object[10];

                for(int i=0;i<philosopher.length;i++){
                    fork[i] = new Object();
                }

                for(int i=0;i<philosopher.length;i++){
                    Object leftFork = fork[i];
                    Object rightFork = fork[(i+1)%5];


                    if(i == philosopher.length-1){
                        philosopher[i] = new Philosopher(leftFork,rightFork);

                    }else{
                        philosopher[i] = new Philosopher(rightFork,leftFork);

                    }
                    Thread t = new Thread(philosopher[i] ," Philosopher "+(i+1));
                    t.start();

                }
                System.out.println("ukol probehl");
            }

        }



