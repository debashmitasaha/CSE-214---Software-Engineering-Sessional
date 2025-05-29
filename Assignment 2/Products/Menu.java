package Products;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Product> items = new ArrayList<>();
    private List<Product> new_items = new ArrayList<>();

    FoodItem burger = new FoodItem("Burger", 300);
    FoodItem fries = new FoodItem("Fries", 100);
    FoodItem wedges = new FoodItem("Wedges", 150);
    FoodItem shawarma = new FoodItem("Shawarma", 200);
    FoodItem drink = new FoodItem("Drink", 25);
    
    public void createBasicMenu()
    {
        
            items.add(burger);
            items.add(fries);
            items.add(wedges);
            items.add(shawarma);
            items.add(drink);
            items.add(getCombo1());
            items.add(getCombo2());
        
    }


    public Container_Combo getCombo1() {
        Container_Combo combo1 = new Container_Combo("Combo1", 400);
        combo1.addFood(burger);
        combo1.addFood(fries);
        combo1.addFood(drink);
        return combo1;
    }

    public Container_Combo getCombo2() {
        Container_Combo combo2 = new Container_Combo("Combo2", 215);
        combo2.addFood(shawarma);
        combo2.addFood(drink);
        return combo2;
    } 

    public void addFoodtoMenu(Product food)
    {
        new_items.add(food);
    }

    public Product getProduct(String name)
    {
        for(Product item:items)
        {
            if(item.getName().equalsIgnoreCase(name))
            {
                return item;
                
            }
            
        }
        for(Product item:new_items)
        {
            if(item.getName().equalsIgnoreCase(name))
            {
                return item;
                
            }
            
        }
        return null;
        
    }

    public void showMenu() {
        System.out.println("Menu:");
        for (Product item : items) {
            if(item instanceof FoodItem){
            item.showDetails();
            }
            
        }
        System.out.println("Combo1(Burger+Fries+Drink)-400tk\r\n" +
                                " Combo2(Shawarma+Drink)-215tk");
    }

    public void showMenu2()
    {
        for (Product item : new_items)
        {
            item.showDetails();

        }

    }
}
