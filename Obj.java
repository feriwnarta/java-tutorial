/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Refference;


class Person {
    String name = "Sumanda";           // instance variabel
    
    void ubahName() {
        this.name = "sumandir";
        System.out.println(name);
    }
    
    void ubahName2(String name) {
        name = "begengong";
        System.out.println(name);
    }
    
    void showName() {
        System.out.println(name);
    }
    void setName(String name) {
        this.name = name;
    }
    
}
public class Obj {
    String name = "Udin"; // instance variabel
    
    void ubahubah(String name) {
        this.name = name;
        System.out.println(name);
    }
    
    public static void main(String[] args) {
        Obj o = new Obj();
        System.out.println(o.name);
        o.ubahubah("udang");
        System.out.println(o.name);
        
        
        
//        System.out.println(Obj.name);
//        ubahubah(Obj.name);
//        System.out.println(Obj.name);
//        
        
        
        Person p = new Person();
        System.out.println(p.name);
        p.ubahName();
        p.showName();
        System.out.println("");
        p.ubahName2(p.name);
        p.showName();
        System.out.println(p.name);
        
        ubah(p);
        System.out.println(p.name);
        p.showName();
        
        p.setName("udang");
        p.showName();
        System.out.println(p.name);
        
        String name = "tasya";
        System.out.println(name);
        ubahNama(name);
        System.out.println(name);
    }
    static void ubahNama(String name) {
        name = "febi";
        System.out.println(name);
    }
    
    static void ubah(Person person) {
        person.name = "adalah";
    }
}
