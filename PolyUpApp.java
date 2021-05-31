/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolyLebihDalam;

class Super {
    
    void SuperMan() {
        System.out.println("Ini Adalah SuperMan di super");
    }
    
    void SuperStar() {
        System.out.println("Ini Adalah super star di super");
    }

    
}

class Child extends Super{
    
    @Override
    void SuperMan() {
        System.out.println("Ini Adalah SuperMan di child");
    }
    
    @Override
    void SuperStar() {
        System.out.println("Ini Adalah super star di child");
    }
    
    void showSuperMan() {
        super.SuperMan();
    }
    
    void showSuperStar() {
        super.SuperStar();
    }
    
    
    
}

public class PolyUpApp {
    public static void main(String[] args) {
        Super sp1 = new Super();
        sp1.SuperMan();
        sp1.SuperStar();
        
        Child ch1 = new Child();
        ch1.SuperMan();
        ch1.SuperStar();
        ch1.showSuperMan();
        ch1.showSuperStar();
        
        
        Super sp2 = new Child();
        
        
        
    }
}
