/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package absfactorypattern;

/**
 *
 * @author admin
 */
public abstract class AbstractFactoryPattern {
    
    public abstract Button CreteButton();
    
    public abstract radiobutton Createradiobutton();
    
    public abstract Checkbox CreateChechbox();
    
    public static AbstractFactoryPattern getcommponentName(String comm){
        
        switch(comm){
        
            case "windows":
                return new WindowsFactory();

            case "linux":
                return new LinuxFactory();

            case "mac":
                return new MacFactory();

            default:
                throw new IllegalArgumentException("Unsupported" + comm);
        }
    }
}
