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
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        FileInputStream inputFile = new FileInputStream("input.txt");
        BufferedInputStream bufferedFile = new BufferedInputStream(inputFile);
//        Membaca ke console
        byte[] dataArray = bufferedFile.readAllBytes();
        String data = new String(dataArray);
        System.out.println(data);
        
        inputFile.close();
        bufferedFile.close();
        
//        Menulis ke output File
//        Menulis file menggunakan buffered byte harus menyertakan .flush()
        FileOutputStream out = new FileOutputStream("outpu22.txt");
        BufferedOutputStream bufferedOut = new BufferedOutputStream(out);
        bufferedOut.write(dataArray,0,dataArray.length);
        bufferedOut.flush();
        
        
        

    }
}