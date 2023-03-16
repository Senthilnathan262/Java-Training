import java.util.*;

class Ticket{
    private int passengerCount;
    private double price;
    private double totalAmount;
    public void setPassengerCount(int passengerCount){
        this.passengerCount=passengerCount;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public int getPassengerCount(){
        return passengerCount;
    }
    public double getPrice(){
        return price;
    }
    public void setTotalAmount(double pri){
        totalAmount=totalAmount+pri;
    }
    public double getTotalAmount(){
        
        return totalAmount;
    }
    public void calcAmount(double p,int ag,char ge){
         while(ag>0){
                if(ag<16){
                    p=p/2;
                    break;
                }
                else if(ag>64){
                    p=p-(p*0.25);
                    break;
                }
                else
                    break;
            }
                 
            
            if(ge=='F'){
                p=p-(p*0.1);
            }
            setTotalAmount(p);
    }
    
        
    
    
}

class Person extends Ticket{
    String name;
    char gender;
    int age;
    Person(String name,char gender,int age){
        this.name=name;
        this.gender=gender;
        this.age=age;
       
    }
    public String getName(){
        return name;
    }
    public char getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }
}



class TicketBooking{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of a ticket:");
        double p=sc.nextDouble();
        double pdummy=p;
        System.out.println("Enter Number of Persons :");
        int n = sc.nextInt();
        Ticket t1=new Ticket();

        for(int i=1;i<n+1;i++){
            p=pdummy;
            System.out.println("Enter Details for Person "+ i +":");
            System.out.println("name");
            String na = sc.next();
            System.out.println("gender");
            char ge = sc.next().charAt(0);
            System.out.println("age");
            int ag = sc.nextInt();
            
            t1.calcAmount(p,ag,ge);
            Ticket t = new Person(na,ge,ag);
        }
        
        System.out.println("Ticket details are:");
        System.out.println("Number of Passengers : "+n);
        System.out.println("Price of a ticket : "+pdummy);
        System.out.println("Total Amount : "+t1.getTotalAmount());
    }
}




