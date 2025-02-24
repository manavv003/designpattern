/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package absfactorypattern;

/**
 *
 * @author admin
 */
public class WindowsFactory extends AbstractFactoryPattern{
    @Override
    public Button CreteButton(){
        System.out.println("Windows Button");
        return new Windowsbtn();
    }
    @Override
    public radiobutton Createradiobutton(){
        System.out.println("Windows RadioButton");
        return new Windowrsradiobtn();
    }
    @Override
    public Checkbox CreateChechbox(){
        System.out.println("Windows Checkbox");
        return new Windowscheckbox();
    }
}
