/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadwithextends;

// tanpa interfeca / cara ke 2

import java.util.logging.Level;
import java.util.logging.Logger;

public class CobaThread extends Thread{
    private Thread thread;
    private String namaThread;
    
    
    public CobaThread(String namaThread){
        this.namaThread = namaThread;
    }

    @Override
    public void run() {
        System.out.println("Thread " + namaThread + " running");
        try {
            for(int i = 1; i <= 10; i++){
                System.out.println(namaThread + " ke : " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Akhir dari thread " + namaThread);
    }
    
    public void entryPoint(){
        System.out.println(namaThread + " dimulai");
        if(thread == null){
            thread = new Thread(this,namaThread);
            thread.start();
        }
    }
    
    public void entryPoint(int priority){
        System.out.println(namaThread + " dimulai");
        if(thread == null){
            thread = new Thread(this, namaThread);
            thread.setPriority(priority);
            thread.start();
        }
    }
    
    
    
    
    
}
