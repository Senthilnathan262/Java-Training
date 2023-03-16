import java.util.*;
class HashMapDemo{
    public static void main(String []args){
        Map m = new HashMap();
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
        Map m1 = new HashMap();
        m1.putAll(m);
        System.out.println(m1);
        System.out.println(m.keySet());
        System.out.println(m.values());
        try{
            System.out.println("enter the key to be removed");
            String r = s.next();
            m.remove(r);
            
        }
        catch(Exception e){
            System.out.println("not a valid key");
        }
        finally{
            System.out.println(m);
        }
        
        Set s1 = m.entrySet();
        Iterator itr = s1.iterator();
        System.out.println("enter the value to be replaced to null");
        int sc = s.nextInt();
        while(itr.hasNext()){
            Map.Entry m2 = (Map.Entry)itr.next();
            int tempValue = (int)m2.getValue();
            
            String tempKey = (String)m2.getKey();
            
            
            if(tempValue==sc){
                m2.setValue(null);
            }
        }
        System.out.println(m);
    }   
}
