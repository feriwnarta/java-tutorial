/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadingwithrunnable;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Feri Winarta
 */
public class ThreadFromRunnable implements Runnable{
    private String namaThread;
    private Thread thread;
    
    public ThreadFromRunnable(String namaThread){
        this.namaThread = namaThread;
        System.out.println(this.namaThread + " dibuat");
    }
    
    @Override
    public void run() {
        try {
            System.out.println(namaThread + " running");
            for(int i = 10; i >= 1; i--) {
                System.out.println(namaThread + " ke : " + i);
                thread.sleep(100);
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("end thread : " + namaThread);
    }
    
    public void check(){
        if(thread == null){
            thread = new Thread(this, namaThread);
        }
    }
    
    public void entryPoint(){ //tanpa priority / prioritas
        if(thread != null){
            thread.start();
        }
    }
    
    public void entryPoint(int priority){
        if(thread != null){
            thread.setPriority(priority);
            thread.start();
        }
    }
    
    public static void main(String[] args) {
        ThreadFromRunnable th1 = new ThreadFromRunnable("Thread 1");
        ThreadFromRunnable th2 = new ThreadFromRunnable("Thread 2");
        
        //konsep multi threading belum jalan
        //th1.run();
        //th2.run();
        
        //multi threading sudah berjalan, karena method start() dari thread
        //sudah dijalankan
        th1.check();
        th2.check();
        
        //th1.entryPoint(); // - > Tanpa priority
        //th2.entryPoint(); // -> Tanpa Priority
        
        th1.entryPoint(Thread.MAX_PRIORITY);
        th2.entryPoint(Thread.MIN_PRIORITY);
        
        
        
        
        
    }
}
