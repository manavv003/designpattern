/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxes;

/**
 *
 * @author admin
 */
public class propertytaxamc implements amc{
    String rtype;
    
    public propertytaxamc(){
        rtype="property tax applied for amc";
    }
    
    @Override
    public void implementtaxes() {
       System.out.println(rtype);
    }
}
