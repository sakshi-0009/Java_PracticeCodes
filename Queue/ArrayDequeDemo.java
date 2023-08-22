package Queue;
import java.util.*;

public class ArrayDequeDemo {

    public static final int inc(int a, int b) {
        return a + b;
    }

    public static final int dec(int a, int b) {
        return a - b;
    }

    public static final int inc(int a, int b, int c) {
        return a + b + c;
    }

    public static final int sub(int a, int b, int c) {
        return a - b - c;
    }

    public static final <E> E elementAt(Object[] array, int index) {
        if (index >= 0 && index < array.length) {
            return (E) array[index];
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public static final <E> E nonNullElementAt(Object[] array, int index) {
        if (index >= 0 && index < array.length) {
            E element = (E) array[index];
            if (element != null) {
                return element;
            } else {
                throw new IllegalArgumentException("Element at index " + index + " is null");
            }
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public static void main(String[] args) {
        int result1 = inc(5, 3);
        int result2 = dec(10, 2);
        int result3 = inc(1, 2, 3);
        int result4 = sub(10, 2, 3);

        Object[] objectArray = { "Hello", "World", null, "Java" };

        String element1 = elementAt(objectArray, 3);
        String element2 = nonNullElementAt(objectArray, 0);

        System.out.println("Output1: " + result1);		// Add two integers
        System.out.println("Output2: " + result2);		// Add three integers
        System.out.println("Output3: " + result3);		// Subtract two integers
        System.out.println("Output4: " + result4);		// Subtract three integers
        System.out.println("Output5: " + element1);
        System.out.println("Output6: " + element2);
    }
}
