/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package absfactorypattern;

/**
 *
 * @author admin
 */
public class LinuxFactory extends AbstractFactoryPattern{
   
    @Override
    public Button CreteButton(){
        System.out.println("Linux Button");
        return new Linuxbtn();
    }
    @Override
    public radiobutton Createradiobutton(){
        System.out.println("Linux RadioButton");
        return new Linuxradiobtn();
    }
    @Override
    public Checkbox CreateChechbox(){
        System.out.println("Linux Checkbox");
        return new Linuxcheckbox();
    }
}