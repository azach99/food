package food;

/**
 * FoodItemTest
 * @author Zach Amados
 * @version 12.30.2019
 *
 */
public class FoodItem {
    private double price;
    private String name;
    
    public FoodItem(String name, double price) {
        this.price = price;
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "" + name + ": $" + price;
    }

}
