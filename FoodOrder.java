package food;

/**
 * FoodOrderClass
 * @author Zach Amados
 * @version 12.30.2019
 *
 */
public class FoodOrder {
    private int number;
    private ArrayBag<FoodItem> bag;
    
    public FoodOrder(int number, ArrayBag<FoodItem> bag) {
        this.number = number;
        this.bag = bag;
    }
    
    public int getNumber() {
        return number;
    }
    
    public ArrayBag<FoodItem> getBag() {
        return bag;
    }
    
    public String toString() {
        return "Order Number: " + number + " Bag: " + bag.toString();
    }
}
