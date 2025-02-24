/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package absfactorypattern;

/**
 *
 * @author admin
 */
public class MacFactory extends AbstractFactoryPattern{
    
    @Override
    public Button CreteButton(){
        System.out.println("Mac Button");
        return new Macbtn();
    }
    @Override
    public radiobutton Createradiobutton(){
        System.out.println("Mac RadioButton");
        return new Macradiobtn();
    }
    @Override
    public Checkbox CreateChechbox(){
        System.out.println("Mac Checkbox");
        return new Maccheckbox();
    }
}
