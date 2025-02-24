/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package absfactorypattern;
import java.util.*;
/**
 *
 * @author admin
 */
public class ClientMain {
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        String os;
        
        System.out.println("Enter the OS name: ");
        os=sc.nextLine();
        
        AbstractFactoryPattern oscom = AbstractFactoryPattern.getcommponentName(os);
        
        oscom.CreteButton();
        oscom.Createradiobutton();
        oscom.CreateChechbox();
        
    }
}
