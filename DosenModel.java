/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author Feri Winarta
 */
// Model merepresentasikan data
public class DosenModel {
    private String namaDosen;
    private String nip;
    
    public DosenModel(String namaDosen, String nip){
        this.namaDosen = namaDosen;
        this.nip = nip;
    }
    
    public void setNamaDosen(String namaDosen){
        this.namaDosen = namaDosen;
    }
    
    public void setNip(String nip){
        this.nip = nip;
    }
    
    public String getNamaDosen(){
        return namaDosen;
    }
    
    public String getNip(){
        return nip;
    }
}
