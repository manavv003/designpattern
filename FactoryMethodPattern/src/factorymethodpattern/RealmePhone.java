/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethodpattern;

/**
 *
 * @author admin
 */
public class RealmePhone implements Mobile{
    String realme;
    
    public RealmePhone(){
        realme="creating Realme Phone ";
    }
    @Override
    public void createmobile() {
        System.out.println(realme);
    }
    
}
