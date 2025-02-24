/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethodpattern;

/**
 *
 * @author admin
 */
public class OneplusPhone implements Mobile{
    String oneplus;
    
    public OneplusPhone(){
        oneplus="Creating Oneplus Phone";
    }
    @Override
    public void createmobile(){
        System.out.println(oneplus);
        }
}
