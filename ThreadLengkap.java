/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadwithextends;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Feri Winarta
 */
public class ThreadLengkap extends Thread{
    private Thread thread;
    private String namaThread;
    private boolean suspend;
    
    public ThreadLengkap(String namaThread) {
        this.namaThread = namaThread;
        System.out.println(namaThread + " dibuat");
    }

    @Override
    public void run() {
        System.out.println(namaThread + " is Running");
        for(int i = 1; i <= 10; i++) {
            System.out.println(namaThread + " ke : " + i);
            try {
                Thread.sleep(100);
                synchronized(this){
                    while(suspend){
                        wait();
                    }
                }    
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("end thread " + namaThread);
    }
    
    public void entryPoint(){
        if(thread == null){
            thread = new Thread(this, namaThread);
            start();
        }
    }
    
    public void isSuspend(){
        suspend = true;
    }
    
    synchronized void isResume(){
        suspend = false;
        notify();
    }
    
    public static void main(String[] args) {
        ThreadLengkap th1 = new ThreadLengkap("Thread 1");
        ThreadLengkap th2 = new ThreadLengkap("Thread 2"); 
        
        th1.entryPoint();
        th2.entryPoint();
        
        try {
            Thread.sleep(10000);
            th1.isSuspend();
            System.out.println("thread 1 di suspend");
            th1.isResume();
            System.out.println("thread 1 dilanjutkan");
            Thread.sleep(10000);
            th2.isSuspend();
            System.out.println("thread 2 di suspend");
            th2.isResume();
            System.out.println("thread 2 dilanjutkan");
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
            
        
                
                
    }
}
