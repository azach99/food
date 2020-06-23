package food;

/**
 * Receipt Class
 * @author Zach Amados
 * @version 12.30.2019
 *
 */
public class Receipt {
    private ArrayBag<FoodItem> menu;
    private ArrayBag<FoodItem> customerBag;
    private double total;
    
    public Receipt() {
        FoodItem banhMi = new FoodItem("Banh Mi", 6.99);
        FoodItem adobo = new FoodItem("Adobo", 10.99);
        FoodItem gyoza = new FoodItem("Gyoza", 4.59);
        FoodItem shumai = new FoodItem("Shumai", 13.54);
        FoodItem siopao = new FoodItem("Siopao", 3.91);
        FoodItem spaghetti = new FoodItem("Spaghetti", 7.99);
        FoodItem fries = new FoodItem("French Fries", 1.59);
        FoodItem corn = new FoodItem("Corn", 0.99);
        FoodItem radish = new FoodItem("Pickled Radish", 1.14);
        FoodItem water = new FoodItem("Water", 0.00);
        FoodItem soda = new FoodItem("Soda", 0.75);
        FoodItem icedTea = new FoodItem("Mango Fiesta Iced Tea", 1.89);
        
        FoodItem chicken = new FoodItem("Chicken", 9.95);
        FoodItem beef = new FoodItem("Beef", 10.95);
        FoodItem shrimp = new FoodItem("Shrimp", 10.95);
        FoodItem salmonPoke = new FoodItem("Salmon Poke", 6.95);
        FoodItem hokieRoll = new FoodItem("Hokie Roll", 7.95);
        FoodItem pangPang = new FoodItem("Pang Pang", 7.00);
        menu = new ArrayBag();
        menu.add(banhMi);
        menu.add(adobo);
        menu.add(gyoza);
        menu.add(shumai);
        menu.add(siopao);
        menu.add(spaghetti);
        menu.add(fries);
        menu.add(corn);
        menu.add(radish);
        menu.add(water);
        menu.add(soda);
        menu.add(icedTea);
        menu.add(chicken);
        menu.add(beef);
        menu.add(shrimp);
        menu.add(salmonPoke);
        menu.add(hokieRoll);
        menu.add(pangPang);
        customerBag = new ArrayBag(); 
        total = 0.00;
    }
    public double getTotal() {
        return total;
    }
    public void order(int orderNumber) throws Exception {
        customerBag.add(menu.get(orderNumber));
        total = total + menu.get(orderNumber).getPrice();
    }
    
    public void delete(FoodItem item) {
        customerBag.remove(item);
        total = total - item.getPrice();
    }
    
    public String getReceipt() throws Exception {
        if (customerBag.isEmpty()) { 
            return "Nothing in Bag";
        }
        else {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < customerBag.getCurrentSize(); i++) {
                builder.append(customerBag.get(i).toString());
                builder.append(" ");
            }
            return builder.toString();
        }
    }
    
    public ArrayBag<FoodItem> getCustomerBag() {
        return customerBag;
    }
    
    public void initTotal() {
        total = 0.00;
    }
    
    
}
