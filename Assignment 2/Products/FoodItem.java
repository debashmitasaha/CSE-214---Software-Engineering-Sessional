package Products;

public class FoodItem implements Product {
    String name;
    int price;
    boolean isFree = false;

    public FoodItem(String name, int price)
    {
        this.name = name;
        this.price = price;
    }
    @Override
    public int getPrice()
    {
        return this.price;
    }
    public String getName()
    {
        return this.name;
    }

    public void setFree()
    {
        isFree = true;
    }

    public void showDetails()
    {
        System.out.println(name+" - "+ price+" tk");
    }
    
}
