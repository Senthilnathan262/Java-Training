import java.util.*;
class StackDemo{
    public static void main(String args[]){
        Stack s = new Stack();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            s.push(sc.nextInt());
        }
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.empty());
        System.out.println("enter the element to be searched:");
        int search= sc.nextInt();
        System.out.println(s.search(search));
    }
}
