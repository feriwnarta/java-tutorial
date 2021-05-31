/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.readFile;

/**
 *
 * @author Feri Winarta
 */
import java.util.Scanner;
import java.io.*;
public class ReadFile {
    public static void main(String[] args)throws IOException {
        try {
            File myObj = new File("buatinput.txt");
            Scanner myReader = new Scanner(myObj);

                while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
    
              }
          myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
