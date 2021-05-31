/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BroillerSystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Feri Winarta
 */
public class Broiler {
    private String nameAdmin;
    private String passAdmin;
    private int totalAyam;
    private Scanner input;
    private FileReader readFile;
    private FileWriter writeFile;
    private BufferedReader buffRead;
    private BufferedWriter buffWrite;
    
    public Broiler() throws IOException{
        this.input = new Scanner(System.in);
    }
    
    
            
    public void menu() throws Exception {  
        while(true) {
            System.out.println("=================================\n"
                    +"===========ILMY BROILER========== \n"
                    + "=================================\n"
                    + "MENU SYSTEM :\t\t\t|\n"
                    + "1. Stok Ayam\t\t\t|\n"
                    + "2. Pesan Ayam\t\t\t|\n"
                    + "3. NOTA PESANAN\t\t\t|\n"
                    + "4. Exit\t\t\t|\n"
                    + "================================="
                    + "");
            System.out.println("Pilihan [ 1 -  4] = ");
            int myInput = this.input.nextInt();
            switchOption(myInput);
            if(myInput == 4) {
                break;
            }
            if(myInput > 4) {
                System.out.println("\nData Input Lagi\n");
                continue;
            }
        }
        
    }
    
    private void switchOption(int input)throws Exception {
        switch(input) {
            case 1 : 
                case1();
                break;
            case 2 :
                case2();
                break;
            case 3 :
                case3();
                break;
            default :
                break;
        }
        
    }
    
    private void case1() throws FileNotFoundException, IOException {
        readFile = new FileReader("db_broiler.txt");
        buffRead = new BufferedReader(readFile);
        String data = buffRead.readLine();
        StringTokenizer st;
        System.out.println("\n\n\n===================================================");
            while(data != null) {
                st = new StringTokenizer(data, ",");
                System.out.print(st.nextToken() + "\t|\t");
                System.out.print(st.nextToken() + "\t|\t");
                System.out.print(st.nextToken() + "\t|\t");
                System.out.print("\n");
                data = buffRead.readLine();
            }
            buffRead.close();
        System.out.println("===================================================\n\n\n");     
    }
    
    private void case2() throws IOException {
        FileWriter outFile = new FileWriter("nota pesanan.txt",true);
        buffWrite = new BufferedWriter(outFile);
        System.out.println("Mao beli ayam apa = ");
        String ayam = this.input.next();
        buffWrite.write(ayam + "\t\t");
        
        System.out.println("Mao ukuran berapa = ");
        var sizeAyam = this.input.nextInt();
        buffWrite.write(+sizeAyam + "\t\t\t");
        
        System.out.println("Jumlahnya Berapa = ");
        var totalAyam = this.input.nextInt();
        buffWrite.write(totalAyam + "\t");
        buffWrite.write("\n========================================================");
        buffWrite.newLine();
        buffWrite.flush();
        buffWrite.close();
        System.out.print("\n\n\n");
    }
    
//    public void headerNota() throws IOException {
//        writeFile = new FileWriter("nota pesanan.txt");
//        buffWrite = new BufferedWriter(writeFile);    
//        buffWrite.write("========================================================\n");
//        buffWrite.write("Ayam\t\tSizeAyam\t\tJumlahAyam\n");
//        buffWrite.write("========================================================\n");
//        buffWrite.flush();
//        buffWrite.close();
//    }
    
    public void case3() throws FileNotFoundException, IOException {
        try {
            readFile = new FileReader("nota pesanan.txt");
            buffRead = new BufferedReader(readFile);
            System.out.print("\n\n\n");
            String data = buffRead.readLine();
            while(data != null) {
                System.out.println(data);
                data = buffRead.readLine();
            }
            buffRead.close();
            System.out.print("\n\n\n");
        } catch(IOException er) {
            System.err.println("Data tidak Ditemukan, silahkan buat pesanan");
        }
    }

}


