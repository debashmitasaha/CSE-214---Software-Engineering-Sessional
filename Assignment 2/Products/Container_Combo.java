package Products;

import java.util.List;
import java.util.ArrayList;

public class Container_Combo implements Product {

    private String name;
    private int discount = 0;
    private int total_price = 0;
    private int Price; // Use Integer to allow null for custom combos
    private List<Product> menuItems = new ArrayList<>();
    private List<Product> freeItems = new ArrayList<>();

    public Container_Combo(String name) {
        this.name = name;
    }

    public Container_Combo(String name, int price) {
        this.name = name;
        this.Price = price;
        //System.out.println("constructor"+Price);
    }

    public int getPrice() {
        int price = 0;
        for (Product item : menuItems) {
            price += item.getPrice();
        }
        return price;
    }

    public String getName() {
        return this.name;
    }

    public void setDiscount(int val) {
        this.discount = val;
    }

    public void setFree() {
        for (Product item : freeItems) {
            item.setFree();
        }
    }

    public void addFood(Product food) {
        menuItems.add(food);
    }

    public void addFreeFood(Product food) {
        freeItems.add(food);
        if (!menuItems.contains(food)) {
            menuItems.add(food);
        }
    }

    public void removeFood(Product food) {
        menuItems.remove(food);
        freeItems.remove(food);
    }

    public void getDetails()
    {
        System.out.print(name+"(");//")");
        for(int i=0;i<menuItems.size();i++)
        {
            System.out.println(((FoodItem)menuItems.get(i)).getName());
            if (i < menuItems.size() - 1) {
                System.out.print(" + ");
            }
        }
    }
    public void showDetails() {
        System.out.println("Your Combo: ");
        for (int i = 0; i < menuItems.size(); i++) {
            Product food = menuItems.get(i);

            if (food instanceof FoodItem) {
                if (freeItems.contains(food)) {
                    System.out.println(food.getName() + " (Free!!!)");
                } else {
                    System.out.println(food.getName());
                    total_price += food.getPrice();
                    System.out.println(total_price);
                }
            }
            else{
                ((Container_Combo)food).getDetails();
                // int x = Price != null ? Price : food.getPrice();
                int x=0;
                System.out.println(Price);
                if(Price !=0)
                {
                    x=Price;
                }
                else{
                    x=food.getPrice();
                }
                total_price += x;
            }
            // System.out.println(food.getName() + ' ');
            // for (int p = 0; p < ((Container_Combo) food).menuItems.size(); p++) {
            //     System.out.println(food.getName());
            //     total_price += food.getPrice();
            //     if (p < ((Container_Combo) food).menuItems.size() - 1) {
            //         System.out.print("+");
            //     }
            // }
        }

        //total_price = Price != null ? Price : total_price;

        // Calculate discounted total
        System.out.println("Total - " + total_price + "tk");
        System.out.println("Discount - " + discount + "%");
        double discountedTotal = Math.ceil(total_price * (1 - discount / 100.0));
        System.out.println("Discounted total - " + (int) discountedTotal + "tk");
    }
}
// System.out.println(
// name + " (" + itemNames + ") - " + (predefinedPrice != null ? predefinedPrice
// : getPrice()) + "tk");
