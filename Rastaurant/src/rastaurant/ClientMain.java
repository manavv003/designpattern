/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rastaurant;
import java.util.*;

/**
 *
 * @author admin
 */
public class ClientMain {
    
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        String cn;
        String cr;
        
        System.out.println("Enter the cuisin Name: ");
        cn=sc.nextLine();
        
        System.out.println("Enter the Category Name: ");
        cr=sc.nextLine();
        
        RestaurantAbstractFactory cnqzn = RestaurantAbstractFactory.getCuisinName(cn);
        
        String res = null;
        String r=null;
        
        switch(cr)
        {
            case "main":
                IMainCourse mc=cnqzn.MAINCOURSE();
                res=mc.GetOrder();
                r=mc.ServeOrder();
                break;
                
            case "appetizer":
                IAppetizers ap=cnqzn.APPETIZERS();
                r=ap.GetOrder();
                res=ap.ServeOrder();
                break;
                
            case "dessert":
                IDesserts dz=cnqzn.DESSERTS();
                res=dz.GetOrder();
                r=dz.ServeOrder();
                break;
        }
        System.out.println(res);
        System.out.println(r);
                
    }
}
