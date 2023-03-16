import java.util.*;
class Vctor{
    public static void main(String[] args){
        Vector v = new Vector();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            v.addElement(sc.nextInt());
        }
        System.out.println(v);
        
        v.removeElement(5);
        System.out.println(v);
        System.out.println(v.elementAt(3));
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        System.out.println(v.capacity());
        System.out.println(v.size());
    }
}
