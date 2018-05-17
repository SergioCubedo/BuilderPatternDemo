/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpatterndemo;

import java.util.ArrayList;

/**
 *
 * @author alu20490610w
 */
public class Meal {

    private ArrayList<Item> items;

    public Meal() {
        items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(" Packing : " + item.packing().pack());
            System.out.print(" Price : " + item.price());
        }
    }
}
