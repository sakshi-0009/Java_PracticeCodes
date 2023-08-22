package Collection;
import java.util.*;

class Result1 {
    String name = null;
    float pointer = 0.0f;

    Result1(String name, float pointer) {
        this.name = name;
        this.pointer = pointer;
    }

    public String toString() {
        return name + ":" + pointer;
    }
}

class SortByPointer implements Comparator<Result1> {
    public int compare(Result1 result1, Result1 result2) {
        return Float.compare(result1.pointer, result2.pointer);
    }
}

class SortByName implements Comparator<Result1> {
    public int compare(Result1 result1, Result1 result2) {
        return result1.name.compareTo(result2.name);
    }
}

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<Result1> al = new ArrayList<>();

        System.out.println("TE 2019 Pattern Result:");
        al.add(new Result1("Prerana", 8.57f));
        al.add(new Result1("Rutuja", 9.71f));
        al.add(new Result1("Monali", 9.24f));
        al.add(new Result1("Sakshi", 8.95f));
        al.add(new Result1("Sanskruti", 8.64f));
        System.out.println(al);

        Collections.sort(al, new SortByPointer());
        System.out.println(al);

        Collections.sort(al, new SortByName());
        System.out.println(al);
    }
}
