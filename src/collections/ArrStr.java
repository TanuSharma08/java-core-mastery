package collections;
import java.util.ArrayList;

public class ArrStr {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Apple");
        names.add("Banana");
        names.add("Custard");
        names.add("Apple");

        System.out.println(names);

        names.remove("Custard");

        System.out.println(names); // print list
        System.out.println(names.get(1)); // print element at index 1
        names.set(1, "Mango"); // replace element using index
        System.out.println(names); // print list
        System.out.println(names.size()); // print size
        System.out.println(names.indexOf("Mango"));
        System.out.println(names.contains("Apple")); // check if element exists
        names.remove(0); // remove element at index 0
        System.out.println(names); // print list

        for (int i = 0; i < names.size(); i++) {  // regular for loop
            System.out.println(names.get(i));
        }

        for (String name : names){  // enhanced for loop
            System.out.println(name);
        }
    }
}
