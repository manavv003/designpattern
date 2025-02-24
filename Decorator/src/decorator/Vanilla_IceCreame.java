/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author admin
 */
public class Vanilla_IceCreame implements Ice_Creame{

    double cost=20;
    String desc="Vanilla Ice-Creame";
    
    @Override
    public String getDescription() {
        return "Vanilla Ice-Creame";
    }

    @Override
    public double getCost() {
        return cost;
    }
}
