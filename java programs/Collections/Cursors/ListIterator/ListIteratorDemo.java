import java.util.*;
class ListIteratorDemo{
    public static void main(String[] args){
        LinkedList l = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            l.add(sc.next());
        }
        System.out.println(l);
        ListIterator li = l.listIterator();
        System.out.println("enter the name to be changed");
        String ch = sc.next();
        while(li.hasNext()){
            String s = (String)li.next();
            
            if(s.equals(ch)){
                System.out.println("enter the new name:");
                String neww = sc.next();
                li.set(neww);
            }
            else if(li.hasNext())
                continue;
            else
                System.out.println("name not found");
        }   
        System.out.println(l);
       
    }
}
