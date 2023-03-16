import java.util.*;
class Bill{
    private int billNumber;
    private String name;
    Bill(int id,String name){
        billNumber=id;
        this.name=name;
    }
    
    void generateBill(){
        System.out.println("Bill Number = "+billNumber);
        System.out.println("Name = "+name);
    }
    
} 
class TelephoneBill extends Bill{
    private int numberOfCallsMade;
    private double costPerCall;
    TelephoneBill(int tid,String tname,int numberOfCallsMade,double costPerCall){
        super(tid,tname);
        this.numberOfCallsMade=numberOfCallsMade;
        this.costPerCall=costPerCall;
        
    }
    void generateBill(){
        super.generateBill();
        System.out.println("Telephone Bill = "+(numberOfCallsMade*costPerCall));
        
    }
}
class CurrentBill extends Bill{
    private int numberOfUnitsConsumed;
    private double costPerUnit;
    public CurrentBill(int cid,String cname,int numberOfUnitsConsumed,double costPerUnit){
        super(cid,cname);
        this.numberOfUnitsConsumed=numberOfUnitsConsumed;
        this.costPerUnit=costPerUnit;
        
    }
    void generateBill(){
        super.generateBill();
        System.out.println("Current Bill = "+(numberOfUnitsConsumed*costPerUnit));
        
    }
}
class Oops1{
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Telephone Bill Number :");
        int tbillNumber=s.nextInt();
        System.out.println("Enter the Customer Name :");
        String tname=s.next();
        System.out.println("Enter the Number of Calls made :");
        int numberOfCallsMade=s.nextInt();
        System.out.println("Enter the Cost per Call :");
        double costPerCall=s.nextDouble();
        System.out.println("Enter the Current Bill Number :");
        int cbillNumber=s.nextInt();
        System.out.println("Enter the Customer Name :");
        String cname=s.next();
        System.out.println("Enter the Number of Units Consumed :");
        int numberOfUnitsConsumed=s.nextInt();
        System.out.println("Enter the Cost per Unit :");
        double costPerUnit=s.nextDouble();
        Bill b ;
        b= new TelephoneBill(tbillNumber,tname,numberOfCallsMade,costPerCall);
        
        b.generateBill();
        
      
        b = new CurrentBill(cbillNumber,cname,numberOfUnitsConsumed,costPerUnit);
        
        b.generateBill();
       
        
    }
}
