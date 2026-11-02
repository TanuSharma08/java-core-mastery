package collections;
import java.util.ArrayList;
import java.util.List;

public class ArrInt {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(10);
        num.addAll(List.of(10,20,20,30));
        num.remove(Integer.valueOf(20));
        num.add(1, 99);
        System.out.println(num);
        num.set(2,200);
        System.out.println(num);
//        num.add(10);
//        num.add(20);
//        num.add(30);
//        System.out.println(num);
//        for (Integer i : num)
//            System.out.println(i);
//
//        num.add(50);
//        System.out.println(num);
//        num.remove(1);
//        System.out.println(num.indexOf(50));
//        System.out.println(num.size());
//        System.out.println(num);
//        System.out.println(num.contains(30));
//        num.remove(Integer.valueOf(30));
//        System.out.println(num);
    }
}
