/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Feri Winarta
 */
public class Main {
    public static void main(String[] args) {
        // list dosen
        List<DosenModel> dataDosen = new ArrayList<>();
        dataDosen.add(new DosenModel("Hermawan", "2020100041"));
        dataDosen.add(new DosenModel("Joko", "2020100042"));
        dataDosen.add(new DosenModel("Anwar", "2020100043"));
        dataDosen.add(new DosenModel("Harisa", "2020100044"));
        dataDosen.add(new DosenModel("Axin", "2020100045"));
        
        // controller
        DosenController controller = new DosenController(dataDosen);
        
        // view
        controller.updateView();
        
        
//        controller.tambahDosen(joko);
//        controller.updateView();
//        controller.setNamaDosen("Joko");
//        controller.setNip("20201000042");
//        controller.updateView();
        
        
        
        
        
    }
}
