/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxes;

/**
 *
 * @author admin
 */
public class roadtaxsmc implements smc{
    String rtype;
    
    public roadtaxsmc(){
        rtype="road tax applied for smc";
    }
    @Override
    public void implementtaxes() {
       System.out.println(rtype);

    }
    
}
