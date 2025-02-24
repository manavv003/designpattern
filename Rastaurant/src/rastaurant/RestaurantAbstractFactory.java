/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rastaurant;

/**
 *
 * @author admin
 */
public abstract class RestaurantAbstractFactory {
    
    public abstract IMainCourse MAINCOURSE();
    
    public abstract IAppetizers APPETIZERS();
    
    public abstract IDesserts DESSERTS();
    
    public static RestaurantAbstractFactory getCuisinName(String qzn){
    
        switch(qzn){
            case "indiancuisin":
                return new IndianCuisinFactory();
                
            case "chinesecuisin":
                return new ChineseCuisinFactory();
                    
            default:
                throw new IllegalArgumentException("invalid"+qzn);
        }
    }
}
