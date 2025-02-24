/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethodpattern;

/**
 *
 * @author admin
 */
public class Iphone implements Mobile{
    String iphone;
    
    public Iphone(){
        iphone="Creating Iphone";
    }
    @Override
    public void createmobile() {
        System.out.println(iphone);
    }
    
}
