import java.util.*;
class TreeMapDemo{
    public static void main(String []args){
        Map m = new TreeMap();
        Scanner s = new Scanner(System.in);
        System.out.println("enter size :");
        int n = s.nextInt();
        for(int i =0;i<n;i++){
            System.out.println("enter key(String) :");
            String st = s.next();
            System.out.println("enter value(Int):");
            int k = s.nextInt();
            m.put(st,k);
        }
        System.out.println(m);
        Map m2 = new TreeMap(new MyComparator());
        m2.putAll(m);
        System.out.println(m2);        
    }
    
}
class MyComparator implements Comparator{
    public int compare(Object obj1,Object obj2){
        String i1 = (String)obj1;
        String i2 = (String)obj2;
        return -(i1.compareTo(i2));
    }
}
