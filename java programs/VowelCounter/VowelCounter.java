import java.util.*;
class VowelCounter{
    public static void main(String args[]){
       
        HashMap m = new HashMap();
        m.put('a',0);
        m.put('e',0);
        m.put('i',0);
        m.put('o',0);
        m.put('u',0);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of counters :");
        int n = s.nextInt();
        s.nextLine();
        Thread t[] = new Thread[n];
        for(int i =1;i<=n;i++){
            System.out.println("Enter text for counter "+i+":");
            String str = s.nextLine().toLowerCase();
            t[i] = new Thread(new Counter(m,str));
            
        }
        for(int i=0;i<n;i++)
            t[i].start();
    
        System.out.println("Vowels count in given texts are..");
        for(Set e:m.entrySet()){
            System.out.println(e);
        }
    }
}
class Counter implements Runnable{
    private HashMap m1;
    String s1;
    Counter(HashMap m1,String s1){
        this.m1=m1;
        this.s1=s1;
    }
    public void run(){
        synchronized(m1){
            for(Character c:s1.toCharArray()){
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                    m1.put(c,m1.get(c)+1);            
            }
        }
    }
}
