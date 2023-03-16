import java.util.*;
class LinList{
    public static void main(String[] args){
        LinkedList l = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            l.add(sc.nextInt());
        }
        System.out.println(l);
        l.addFirst("First");
        l.removeLast();
        System.out.println(l);
        System.out.println(l.removeFirst());
        System.out.println(l.removeLast());
        System.out.println(l);
    }
}
