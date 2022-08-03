import java.util.ArrayList;

public class _10_ArraylistBasics {
    public static void main(String[] args) {
        // ArrayList
        // how to create arraylist
        ArrayList<Integer> arr = new ArrayList<>();

        // add elements into it
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        // print complete arraylist
        System.out.println(arr);

        // print the size of arraylist
        System.out.println(arr.size());

        // remove element at some index
        arr.remove(4);
        System.out.println(arr);

        // change element at some index
        arr.set(4, 5);
        System.out.println(arr);

        // inserting in arraylist
        arr.add(3, -1);
        System.out.println(arr);
    }    
}