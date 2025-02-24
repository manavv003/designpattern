/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rastaurant;

/**
 *
 * @author admin
 */
public class ChineseCuisinFactory extends RestaurantAbstractFactory{

    @Override
    public IMainCourse MAINCOURSE() {
        System.out.println("Chinese Main Course");
        return new ChineseCuisinMainCourse();
    }

    @Override
    public IAppetizers APPETIZERS() {
        System.out.println("Chinese Appetizers");
        return new ChineseCuisinAppetizers();
    }

    @Override
    public IDesserts DESSERTS() {
        System.out.println("Chinese Desserts");
        return new ChineseCuisinDesserts();
    }
    
}
