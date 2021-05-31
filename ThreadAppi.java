/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadwithextends;

/**
 *
 * @author Feri Winarta
 */
public class ThreadAppi {
    public static void main(String[] args) {
        CobaThread cb1 = new CobaThread("Thread 1");
        CobaThread cb2 = new CobaThread("Thread 2");
        cb1.entryPoint();
        cb2.entryPoint();
        cb1.entryPoint(Thread.MAX_PRIORITY);
        cb2.entryPoint(Thread.MIN_PRIORITY);
        
        
        
        
    }
}
