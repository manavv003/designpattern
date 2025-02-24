/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rastaurant;

/**
 *
 * @author admin
 */
public class IndianCuisinFactory extends RestaurantAbstractFactory{

    @Override
    public IMainCourse MAINCOURSE() {
        System.out.println("Indian Main Course");
        return new IndianCuisinMainCourse();
    }

    @Override
    public IAppetizers APPETIZERS() {
        System.out.println("Indian Appetizers");
        return new IndianCuisinAppetizers();
    }

    @Override
    public IDesserts DESSERTS() {
        System.out.println("Indian Desserts");
        return new IndianCuisinDesserts();
    }
    
}
