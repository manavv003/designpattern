/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethodpattern;
import java.util.*;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String mob;
        
        System.out.println("Enter the Company Name: ");
        mob=sc.nextLine();
        
        Mobile mobl = MobileFactory.getMobile(mob);
        
        try{
            mobl.createmobile();
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
        
    }
}

