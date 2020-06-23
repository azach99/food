package food;
import student.TestCase;
public class ArrayQueueTest extends TestCase {
    private ArrayQueue q;
    public void setUp() {
        q = new ArrayQueue();
    }
    
    public void testToString() {
        q.enqueue("funny");
        assertEquals(1, q.getSize());
        String out = "[funny]";
        assertEquals(out, q.toString());
        q.enqueue("angry");
        assertEquals("[funny, angry]", q.toString());
    }

}
