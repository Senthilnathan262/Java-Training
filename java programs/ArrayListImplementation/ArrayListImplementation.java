import java.util.*;

class MyArrayList{
    private ArrayList myStore;
    private int actSize;
    public MyArrayList(){
        actSize=10;
        myStore = new ArrayList();
    }
    void show(){
        System.out.println(myStore);
    }
    void add(Object obj1){
        myStore.add(obj1);
        if(size()>5){
            increaseListSize();
        }
    }
    void get(int obj2){
        try{
            myStore.get(obj2);
            System.out.println(myStore.get(obj2));        
        }
        catch(Exception e){
            System.out.println("Array Index Out Of Bounds Exception is thrown. The element cannot be retrieved");
            
        }
        
    }
    void remove(int obj3){
        try{
            System.out.println(myStore.remove(obj3));
                    
        }
        catch(Exception e){
            System.out.println("Array Index Out Of Bounds Exception is thrown. The element cannot be removed");
            
        }
    }
    int size(){
        return myStore.size();
    }
    private void increaseListSize(){
        myStore.ensureCapacity(size()*2);
    }
}

class ArrayListImplementation{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        MyArrayList mal = new MyArrayList();
        while(true){
            System.out.println("Enter the data to be inserted");
            int n = sc.nextInt();
            mal.add(n);
            System.out.println("Do you want to add another element?Type yes/no");
            String c = sc.next();
            if(c.equals("no"))
                break;
        }
        System.out.println("The elements in the list are:");
        mal.show();
        System.out.println("Enter the index of the element you want to examine");
        int in = sc.nextInt();
        mal.get(in);
        System.out.println("List size:"+mal.size());
        System.out.println("Enter the index of the element you want to remove");
        int ind = sc.nextInt();
        mal.remove(ind);
        System.out.println("The elements in the list are:");
        mal.show();
    }
}
