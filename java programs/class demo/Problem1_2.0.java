import java.util.*;
class Item
{
    private String name;
    private double cost;
    static private int count;
    Item(String name, double cost){
        this.name = name;
        this.cost = cost;
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
        System.out.println("Name : "+getName());
        System.out.println("Cost : "+getCost());
    }
    public String toString(){
        return "Name = "+name+" Price = "+cost;
    }
}

class Fruit extends Item{
    static private int count;
    Fruit(String name, double cost){
        super(name, cost);
        count++;
    }
    public int getCount(){
        return count;
    }
}

class Vegetables extends Item{
    static private int count;
    Vegetables(String name, double cost){
        super(name, cost);
        count++;
    }
    public int getCount(){
        return count;
    }
}

class ItemBO{
    
    void searchByCost(ArrayList<Item> itemList,double cost){
        for(Item it1 : itemList){
            if(it1.getCost() == cost){
                System.out.println("Details of the Item :");
                it1.displayDetails();
            }
            
        }
        
    }
    void searchByName(ArrayList<Item> itemList,String name){
        
        for(Item it : itemList){
            if(it.getName().equals(name)){
                System.out.println("Details of the Item :");
                it.displayDetails();
            }
            
        }
        
    }
}
class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Item> arrayList = new ArrayList<Item>();
		do{
		System.out.println("1. Add a Fruit");
		System.out.println("2. Add a Vegetable");
		System.out.println("3. Search");
		System.out.println("4. Display");
		System.out.println("5. Exit");
		System.out.println("Enter your choice");
		int choice = scanner.nextInt();
		switch(choice){
		    case 1:
		        System.out.println("Item Name :");
		        String namef = scanner.next();
		        System.out.println("Item Cost :");
		        double costf = scanner.nextDouble();
		        Fruit fruit = new Fruit(namef, costf);
		        arrayList.add(fruit);
		        break;
		    case 2:
		        System.out.println("Item Name :");
		        String namev = scanner.next();
		        System.out.println("Item Cost :");
		        double costv = scanner.nextDouble();
		        Vegetables vegetables = new Vegetables(namev, costv);
		        arrayList.add(vegetables);
		        break;
		    case 3:
                do{
		        System.out.println("1. Search by Cost");
		        System.out.println("2. Search by Name");
		        int ch = scanner.nextInt();
		        ItemBO itemBO = new ItemBO();
		        if(ch==1){
		            System.out.println("Enter the Cost : ");
		            double costInput = scanner.nextDouble();
		            itemBO.searchByCost(arrayList,costInput);
                    break;
		        }
		        else if(ch==2){
		            System.out.println("Enter the Name : ");
		            String nameInput = scanner.next();
		            itemBO.searchByName(arrayList,nameInput);
                    break;
		        }
		        else {
		            System.out.println("Invalid Choice : ");
                    continue;
		        }
                }while(true);
                System.out.println("do you want to exit(y/n)?");
               
		        break;
		    case 4:
		        System.out.println(arrayList);
		        break;
		    case 5:
		        System.exit(0);
		    default :
		        System.out.println("Invalid Choice : ");
		}
		}
		while(true);
	}
}
