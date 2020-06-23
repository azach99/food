package food;

import queue.EmptyQueueException;

/**
 * ArrayQueueClass
 * @author Zach Amados
 * @version 12.30.2019
 *
 */
public class ArrayQueue<T> {
    private T[] queue;
    private int enqueueIndex;
    private int dequeueIndex;
    private int size;
    public static final int DEFAULT_CAPACITY = 10;
    public static final int MAX_CAPACITY = 100;
    
    public ArrayQueue() {
        this(DEFAULT_CAPACITY);
    }
    
    public ArrayQueue(int initialCapacity) {
        T[] tempQueue = (T[]) new Object[initialCapacity + 1];
        queue = tempQueue;
        enqueueIndex = initialCapacity;
        dequeueIndex = 0;
        size = 0;
    }
    
    public void clear() {
        T[] newQueue = (T[]) new Object[DEFAULT_CAPACITY + 1];
        queue = newQueue;
        enqueueIndex = DEFAULT_CAPACITY;
        dequeueIndex = 0;
        size = 0;
    }
    
    public int getLength() {
        return queue.length;
    }
    
    public int getSize() {
        return size;
    }
    
    public boolean isFull() {
        return size == queue.length - 1;
    }
    
    public void enqueue(T newEntry) {
        if (size >= MAX_CAPACITY) {
            throw new IllegalStateException();
        }
        else {
            ensureCapacity();
            enqueueIndex = (enqueueIndex + 1) % queue.length;
            queue[enqueueIndex] = newEntry;
            size++;
        }
    }
    
    public T dequeue() {
        if (isEmpty()) {
            throw new EmptyQueueException();
        }
        else {
            T front = queue[dequeueIndex];
            queue[dequeueIndex] = null;
            dequeueIndex = (dequeueIndex + 1) % queue.length;
            size--;
            return front;
        }
    }
    
    public T getFront() {
        if (isEmpty()) {
            throw new EmptyQueueException();
        }
        else {
            return queue[dequeueIndex];
        }
    }
    
    public boolean isEmpty() {
        return dequeueIndex == ((enqueueIndex + 1) % queue.length);
    }
    
    public Object[] toArray() {
        if (!isEmpty()) {
            T[] copy = (T[]) new Object[this.getSize()];
            int i = dequeueIndex;
            int j = 0;
            while (queue[i] != null) {
                copy[j] = queue[i];
                j++;
                i = (i + 1) % queue.length;
            }
            return copy;
        }
        else {
            throw new EmptyQueueException();
        }
    }
    public String toString() {
         if (isEmpty()) {
             return "[]";
         }
         else {
             StringBuilder builder = new StringBuilder();
             builder.append("[");
             for (int i = dequeueIndex, j = 0; j < size - 1; j++, i = (i + 1) % queue.length) {
                 builder.append(queue[i]);
                 builder.append(", ");
             }
             builder.append(queue[(dequeueIndex + size - 1) % queue.length]);
             builder.append("]");
             return builder.toString();
         }
    }
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() == obj.getClass()) {
            ArrayQueue<T> pivot = (ArrayQueue<T>) obj;
            if (this.getSize() != pivot.getSize()) {
                return false;
            }
            else {
                boolean out = true;
                for (int i = 0; i < getSize(); i++) {
                    T myEleemnt = (T) this.toArray()[i];
                    T otherElement = (T) pivot.toArray()[i];
                    if (!myEleemnt.equals(otherElement)) {
                        out = false;
                    }
                }
                return out;
            }
        }
        else {
            return false;
        }
    }
    private void ensureCapacity() {
        if (isFull()) {
            T[] copy = queue;
            int old = queue.length;
            int readyOld = old * 2 - 1;
            if ((readyOld <= MAX_CAPACITY)) {
                T[] tempQ = (T[]) new Object[readyOld];
                queue = tempQ;
                for (int i = 0 ; i < copy.length; i++) {
                    queue[i] = copy[dequeueIndex];
                    dequeueIndex = (dequeueIndex + 1) % old;
                }
                dequeueIndex = 0;
                enqueueIndex = getSize() - 1;
            }
            else {
                T[] tempQueue = (T[]) new Object[MAX_CAPACITY + 1];
                queue = tempQueue;
                for (int j = 0; j < copy.length - 1; j++) {
                    queue[j] = copy[dequeueIndex];
                    dequeueIndex = (dequeueIndex + 1) % old;
                }
                dequeueIndex = 0;
                enqueueIndex = getSize() - 1;
            }
        }
    }

}
