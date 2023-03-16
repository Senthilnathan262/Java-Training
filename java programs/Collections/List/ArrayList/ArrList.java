
import java.util.*;
class ArrList{
    public static void main(String []args){
        
        ArrayList arr = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            arr.add(i);
        }
        System.out.println(arr);
        arr.add(n,"last");
        System.out.println(arr);
        arr.remove(4);
        System.out.println(arr);
        System.out.println(arr.get(2));
        List b = new ArrayList();
        b.add("hi");
        b.add(45);
        arr.addAll(4,b);
        System.out.println(arr);
        arr.set(0,null);
        System.out.println(arr);
        System.out.println(arr.indexOf(7));
    }
}
