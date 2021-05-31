/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import java.util.List;

/**
 *
 * @author Feri Winarta
 */
public class DosenView {
    public void displayData(List<DosenModel> dosen){
        System.out.println("==========================");
        System.out.println("        Data Dosen        ");
        for(DosenModel model : dosen){
            System.out.println("==========================");
            System.out.println("Nama  : " + model.getNamaDosen());
            System.out.println("Nip   : " + model.getNip());
        }
    }
}
