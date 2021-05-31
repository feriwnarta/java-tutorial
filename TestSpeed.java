/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bufferedByte;

/**
 *
 * @author Feri Winarta
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
public class TestSpeed {
    public static void main(String[] args)throws IOException {
//        Mencoba mengetest kecepatan baca file byteStream dengan 
//        Buffered Stream
        FileInputStream inputFile = new FileInputStream("input.txt");
        long start,end;
        int data = inputFile.read();
        start = System.nanoTime();
        while(data != -1) {
            System.out.println(data);
            data = inputFile.read();
        }
        end = System.nanoTime();
        System.out.println("Kecepatan memory = " + (end - start));
       
        
//        mentest kecepatan dengan buffered memory
       inputFile = new FileInputStream("input.txt");
       BufferedInputStream bufferInput = new BufferedInputStream(inputFile);
       
       start = System.nanoTime();
       byte[] dataArray = bufferInput.readAllBytes();
       String print = new String(dataArray);
       System.out.println(print);
       end = System.nanoTime();
       System.out.println("Kecepatan memory buffer = " + (end - start));
        
        
        
        
    }
}
