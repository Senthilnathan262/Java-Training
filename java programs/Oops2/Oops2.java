import java.util.*;
interface MaintanenceCharge{
    void computeMaintanenceCharge();
}
class Account {
    String name;
    double number;
    double balance;
    String startDate;
    int year;
    Account(String name,double number,double balance,String startDate,int year){
        this.name=name;
        this.number=number;
        this.balance=balance;
        this.startDate=startDate;
        this.year=year;
    }
    
}
class CurrentAccount extends Account implements MaintanenceCharge{
    CurrentAccount(String name,double number,double balance,String startDate,int year){
        super(name,number,balance,startDate,year);
    }
    public void computeMaintanenceCharge(){
        
        System.out.println("Name = "+super.name);
        System.out.println("number = "+super.number);
        System.out.println("balance = "+super.balance);
        System.out.println("startDate = "+super.startDate);
        System.out.println("year = "+super.year);
        System.out.println("Maintanence charge for Current Account = "+((100*year)+200));
    }
}
class SavingsAccount extends Account implements MaintanenceCharge{
    SavingsAccount(String name,double number,double balance,String startDate,int year){
        super(name,number,balance,startDate,year);
    }
    public void computeMaintanenceCharge(){
        
        System.out.println("Name = "+super.name);
        System.out.println("number = "+super.number);
        System.out.println("balance = "+super.balance);
        System.out.println("startDate = "+super.startDate);
        System.out.println("year = "+super.year);
        System.out.println("Maintanence charge for Savings Accountt = "+((2*50*year)+50));
    }
}
class Oops2{
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.println("1.Current Account");
        System.out.println("2.Savings Account");
        int ch = s.nextInt();
        if(ch==1){
            System.out.println("Name");
            String name = s.next();
            System.out.println("account number");
            double number = s.nextDouble();
            System.out.println("Balance ");
            double balance = s.nextDouble();
            System.out.println("start date");
            String startDate = s.next();
            System.out.println("no of years");
            int year = s.nextInt();
            CurrentAccount ca = new CurrentAccount(name,number,balance,startDate,year);
            ca.computeMaintanenceCharge();
        }
        else{
            System.out.println("Name");
            String name = s.next();
            System.out.println("account number");
            double number = s.nextDouble();
            System.out.println("Balance ");
            double balance = s.nextDouble();
            System.out.println("start date");
            String startDate = s.next();
            System.out.println("no of years");
            int year = s.nextInt();
            SavingsAccount sa = new SavingsAccount(name,number,balance,startDate,year);
            sa.computeMaintanenceCharge();
           
        }
        
    }
}
