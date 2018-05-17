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
public class BuilderPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MealBuilder mealBuilder = new MealBuilder();
       
       Meal vegMeal = mealBuilder.prepVegMeal();
       vegMeal.showItems();
       System.out.println("Total cost: " + vegMeal.getCost());
       
        Meal nonMeal = mealBuilder.prepVegMeal();
      nonMeal.showItems();
       System.out.println("Total cost: " + nonMeal.getCost());
    }
    
}
