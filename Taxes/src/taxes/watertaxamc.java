/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxes;

/**
 *
 * @author admin
 */
public class watertaxamc implements amc{
    String rtype;
    
    public watertaxamc(){
        rtype="water tax applied for amc";
    }

    @Override
    public void implementtaxes() {
       System.out.println(rtype);
       
    }
    
    
    
}
