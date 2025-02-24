/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxes;

/**
 *
 * @author admin
 */
public class propertytaxvmc implements vmc{
    String rtype;
    
    public propertytaxvmc(){
        rtype="propert tax applied for vmc";
    }
    @Override
    public void implementtaxes() {
       System.out.println(rtype);

    }
    
}
