import java.util.*;
public class CollectionArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(6);
        l1.add(7);
        l1.add(6);
        l1.add(2,5);
        System.out.println(l1);
        ArrayList<String> l2=new ArrayList<>();
        l2.add(0,"Ram");
        l2.add(1,"hari");
        l2.add("shyam");
        System.out.println(l2);


        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.set(2, "Blackberry");
        System.out.println(list);

    }
}
