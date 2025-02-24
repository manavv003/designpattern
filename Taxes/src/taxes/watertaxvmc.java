/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxes;

/**
 *
 * @author admin
 */
public class watertaxvmc implements vmc{
    String rtype;
    
    public watertaxvmc(){
        rtype="water tax applied for vmc";
    }

    @Override
    public void implementtaxes() {
       System.out.println(rtype);

    }
    
}
