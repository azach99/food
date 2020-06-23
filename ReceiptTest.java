package food;
import student.TestCase;

/**
 * ReceiptTest Class
 * @author Zach Amados
 * @version 12.30.2019
 *
 */
public class ReceiptTest extends TestCase {
    private Receipt receipt;
    
    
    public void setUp() {
        receipt = new Receipt();
    }
    
    public void testOrder() throws Exception {
        receipt.order(0);
        assertEquals(6.99, receipt.getTotal(), 0.01);
    }
    
    public void testGetTotal() throws Exception {
        receipt.order(2);
        assertEquals(4.59, receipt.getTotal(), 0.01);
    }
    
    public void testDelete() throws Exception {
        FoodItem banhMi = new FoodItem("Banh Mi", 6.99);
        receipt.order(4);
        receipt.order(3);
        receipt.order(0);
        receipt.delete(banhMi);
        assertEquals(17.44, receipt.getTotal(), 0.01);
    }
    
    public void testEmptyReceipt() throws Exception {
        assertEquals("Nothing in Bag", receipt.getReceipt());
    }
    
    public void testNotEmptyReceipt() throws Exception {
        receipt.order(0);
        receipt.order(4);
        assertEquals("Banh Mi: $6.99 Siopao: $3.91 ", receipt.getReceipt());
    }
    
    public void testAddSpaghetti() throws Exception {
        receipt.order(5);
        assertEquals(7.99, receipt.getTotal(), 0.01);
    }

}
