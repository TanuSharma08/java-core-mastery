package collections;
import java.util.LinkedList;
import java.util.List;

public class LinkLst {

    public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<>();
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(40);
        ls.add(50);
        System.out.println(ls);
//        ls.remove(3);
        System.out.println(ls.remove(Integer.valueOf(40)));
        System.out.println(ls);
    }
}

