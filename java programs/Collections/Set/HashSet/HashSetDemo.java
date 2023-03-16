import java.util.*;

class HashSetDemo{
    public static void main(String []args){
        HashSet h = new HashSet();
        h.add(1);
        h.add("hi");
        h.add('z');
        h.add(null);
        h.add(1);
        System.out.println(h);
        HashSet h2 = new HashSet();
        h2.addAll(h);
        System.out.println(h2);
        h.remove('z');
        h.add(2);
        h.add(5);
        System.out.println(h);
        h.removeAll(h2);
        System.out.println(h);
    }
}
