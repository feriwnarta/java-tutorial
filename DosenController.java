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
public class DosenController {
    private List<DosenModel> model = new ArrayList<>();
    private DosenView view;
    
    public DosenController(List<DosenModel> model){
        this.model = model;
        view = new DosenView();
    }
    
    public void setModel(List<DosenModel> model){
        this.model = model;
    }
    
    public void setView(DosenView view){
        this.view = view;
    }
    
    public List<DosenModel> getModel(){
        return model;
    }
    
    public DosenView getView(){
        return view;
    }
    
    public void updateView(){
        view.displayData(model);
    }
    
//    public void tambahDosen(DosenModel model){
//        this.model = model;
//    }
    
//    public void setNamaDosen(String namaDosen){
//        model.setNamaDosen(namaDosen);
//    }
//    
//    public void setNip(String nip){
//        model.setNip(nip);
//    }
}
