/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ScannerTokenizer;

/**
 *
 * @author Feri Winarta
 */
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
public class tes {
    public static void main(String[] args)throws IOException {
        FileReader readFile = new FileReader("tes.txt");
        BufferedReader buff = new BufferedReader(readFile);
        
//        Scanner read = new Scanner(buff);
//        read.useDelimiter(",");
//        while(read.hasNext()) {
//            System.out.println(read.next());
//        }
        String data = buff.readLine();
        StringTokenizer st = new StringTokenizer(data);
        FileWriter writeFile = new FileWriter("ott.txt");
        BufferedWriter write = new BufferedWriter(writeFile);
        
        write.write("data"+",");
    }
    
}
