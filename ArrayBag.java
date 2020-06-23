package food;

/**
 * ArrayBag Class
 * @author Zach Amados
 * @version 12.30.2019
 *
 */
public class ArrayBag<T> {
    private T[] bag;
    private static final int MAX = 25;
    private int numberOfEntries;
    
    public ArrayBag() {
        T[] tempBag = (T[]) new Object[MAX];
        bag = tempBag;
        numberOfEntries = 0;
    }
    
    public T get(int index) throws Exception {
        if (index >= 0 && index < numberOfEntries) {
            return bag[index];
        }
        else {
            throw new Exception();
        }
    }
    
    public int getCurrentSize() {
        return numberOfEntries;
    }
    
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }
    
    public boolean add(T anEntry) {
        if (numberOfEntries < 25) {
            bag[numberOfEntries] = anEntry;
            numberOfEntries++;
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean remove(T anEntry) {
        int index = getIndexOf(anEntry);
        if (index != -1) {
            bag[index] = bag[numberOfEntries - 1];
            bag[numberOfEntries - 1] = null;
            numberOfEntries--;
            return true;
        }
        else {
            return false;
        }
    }
    
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        else {
            StringBuilder builder = new StringBuilder();
            builder.append("[");
            for (int i = 0 ; i < getCurrentSize(); i++) {
                builder.append(bag[i].toString());
                builder.append(" ");
            }
            builder.append("]");
            return builder.toString();
        }
    }
    
    public void clear() {
        T[] tempBag = (T[]) new Object[MAX];
        bag = tempBag;
        numberOfEntries = 0;
    }
    private int getIndexOf(T anEntry) {
        for (int i = 0 ; i < numberOfEntries; i++) {
            if (bag[i].equals(anEntry)) {
                return i;
            }
        }
        return -1;
    }

}
