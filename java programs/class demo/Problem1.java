import java.util.*;

class Item{
    private String name;
    private double cost;
    private static int count;

    Item(String name,double cost){
        this.name=name;
        this.cost=cost;
        count++;
    }
    public String getName(){
        return name;    
    }
    public double getCost(){
        return cost;
    }
    public int getCount(){
        return count;
    }
    void displayDetails(){
        System.out.println(getName());
        System.out.println(getCost());
    }
    public String toString(){
        return ("Name = "+name+"   Cost ="+cost);
    }
}

class Fruit extends Item{
    
    private static int count;

    Fruit(String name,double cost){
        super(name,cost);
        count++;
    }
    public int getCount(){
        return count;
    }
    
}

class Vegetable extends Item{
    
    private static int count;

    Vegetable(String name,double cost){
        super(name,cost);
        count++;
    }
    public int getCount(){
        return count;
    }
   
}

class ItemBO{
    void searchByCost(ArrayList arrayList,double cost){
        int index1 = arrayList.indexOf(cost);
        System.out.println("Details of the item:");
        System.out.println("Name ="+arrayList.get(index1-1));
        System.out.println("cost ="+arrayList.get(index1));    
    }
    void searchByName(ArrayList arrayList,String name){
        int index2 = arrayList.indexOf(name);
        System.out.println("Details of the item:");
        System.out.println("Name ="+arrayList.get(index2));
        System.out.println("cost ="+arrayList.get(index2+1)); 
    }
}

class Problem1{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        ArrayList arrayList = new ArrayList();
        do{
            System.out.println("chosose an option");
            System.out.println("1.Add a fruit");
            System.out.println("2.Add a vegitable");
            System.out.println("3.Search");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            
            int choice;
            choice = s.nextInt();
        
            switch(choice){
                case 1:
                    System.out.println("enter name :");
                    String nameF =s.next();
                    System.out.println("enter cost:");
                    double costF=s.nextDouble();
                    Item item = new Fruit(nameF,costF);
                    arrayList.add(item.getName());
                    arrayList.add(item.getCost());
                    break;
            
                case 2:
                    System.out.println("enter name :");
                    String nameV =s.next();
                    System.out.println("enter cost:");
                    double costV=s.nextDouble();
                    Item item1 = new Fruit(nameV,costV);
                    arrayList.add(item1.getName());
                    arrayList.add(item1.getCost());
                    break;
             
                case 3:
                    ItemBO itemBO = new ItemBO();
                    System.out.println("1.Search by cost");
                    System.out.println("2.Search by name");
                    System.out.println("Enter the choice");
                    int ch = s.nextInt();
                    if(ch==1){
                        System.out.println("Enter the cost =");
                        double costInput = s.nextDouble();
                        itemBO.searchByCost(arrayList,costInput);
                    }
                    else{
                        System.out.println("Enter the name =");
                        String nameInput = s.next();
                        itemBO.searchByName(arrayList,nameInput);
                    }
                    break;
                case 4:
                    System.out.println(arrayList);
                    break;
                case 5:
                    System.exit(0);
                }
        }while(true);                
        
        
    }
}
