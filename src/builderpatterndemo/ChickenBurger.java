/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpatterndemo;

/**
 *
 * @author alu20490610w
 */
public class ChickenBurger extends Hamburger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chiken Burger";
    }
    
}
