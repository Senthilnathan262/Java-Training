import java.util.*;

class User{
    private String name;
    private String mobileNumber;
    private String email;
    private String address;
    private String creditCardNumber;
    private String district;
    
    User(){}

    User(String name,String mobileNumber,String email,String address,String creditCardNumber){
        this.name=name;
        this.mobileNumber=mobileNumber;
        this.email=email;
        this.address=address;
        this.creditCardNumber=creditCardNumber;
    }
    public void setEmail(String emai){
        email=emai;
    }
    public void setDistrict(String distric){
        district=distric;
    }
    public String getDistrict(){
        return district;
    }
    public String combineAddress(String dno,String sna,String city,String dis,String state,String pin){
        return dno+","+sna+","+city+","+dis+","+state+"\nPin - "+pin;
    }
        
    public String getName(){
        return name;
    }
    public String getMobileNumber(){
        return mobileNumber;
    }
    public String getEmail(){
        return email;
    }
    public String getAddress(){
        return address;
    }
    public String getCreditCardNumber(){
        return creditCardNumber;
    }
    public int findRecord(ArrayList<User> arr,String mno){
        ListIterator str = arr.listIterator();
        while(str.hasNext()){
            User tempu = (User)str.next();
            String str1 = tempu.getMobileNumber();
            if(str1.equals(mno)){
                System.out.println(tempu);
                return 0;
            }
        }
        System.out.println("Record not found");
        return 0;
    }
    public int updateRecord(ArrayList<User> arr,String mno,String ni){
        ListIterator str = arr.listIterator();
        while(str.hasNext()){
            User tempu = (User)str.next();
            String str1 = tempu.getMobileNumber();
            if(str1.equals(mno)){
                tempu.setEmail(ni);
                return 0;
            }
        }
        System.out.println("Record not found");
        return 0;
        
        
    } 
    public int findSubstring(ArrayList<User> arr,String sub){
        ArrayList ar = new ArrayList();
        ListIterator str = arr.listIterator();
        while(str.hasNext()){
            User tempu = (User)str.next();
            String str1 = tempu.getName();
            if(str1.contains(sub)){
                ar.add(str1);
                
            }
        }
        if(ar.isEmpty()){
            System.out.println("No name found.");
            return 0;
        }
        else{
            System.out.println("List of user names that contain the substring "+sub);
                    
            Collections.sort(ar);
            System.out.println(ar);
            return 0;
        }
    }
    public int findDistrict(ArrayList<User> arr,String di){
        ArrayList ar = new ArrayList();
        ListIterator str = arr.listIterator();
        while(str.hasNext()){
            User tempu = (User)str.next();
            String str1 = tempu.getDistrict();
            if(str1.equals(di)){
                ar.add(tempu.getName());
                
            }
        }
        if(ar.isEmpty()){
            System.out.println("No name found.");
            return 0;
        }
        else{
            System.out.println("List of user names from "+di);
                    
            Collections.sort(ar);
            System.out.println(ar);
            return 0;
        }  
    }
    public String toString(){
        String z = "User Details:\nName : "+getName()+"\nEmail : "+getEmail()+"\nCredit Card Number : "+getCreditCardNumber();
        return z;
    }
}

class UserEntity{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of user details to be inserted:");
        int n = sc.nextInt();
        ArrayList<User> arr = new ArrayList<User>();
        for(int i=1;i<=n;i++){
            System.out.println("Enter details of user "+i);
            System.out.println("Enter name:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Enter mobile number:");
            String mobileNumber = sc.next();
            System.out.println("Enter email address:");
            String email = sc.next();
            System.out.println("Enter address details:");
            System.out.println("Enter door number:");
            String dno = sc.next();
            System.out.println("Enter street name:");
            sc.nextLine();
            String sna = sc.nextLine();
            System.out.println("Enter city name:");
            String city = sc.nextLine();
            System.out.println("Enter district name:");
            String dis = sc.nextLine();
            System.out.println("Enter state name:");
            String state = sc.nextLine();
            System.out.println("Enter pin code:");
            String pin = sc.next();
            System.out.println("Enter credit card number:");
            String creditCardNumber = sc.next();
            User use1 = new User();
            String address = use1.combineAddress(dno,sna,city,dis,state,pin);
            User user = new User(name,mobileNumber,email,address,creditCardNumber);
            user.setDistrict(dis);
            arr.add(user);
         }
         System.out.println("Menu\n1) Search for user details using mobile number.\n2) Search for user details using mobile number and then change the email id of the above user to new idprovided.\n3) List the names of users in which the given string is a substring.\n4) List the names of users from a particular district.\nAny other choice : Exit\n");
         while(true){
            System.out.println("Enter the choice:");
            User use = new User();
            int choice = sc.nextInt();
            if(choice>4){
                System.out.println("Application terminated");
                break;
            }
            switch(choice){
                case 1:
                    System.out.println("Enter the mobile number:");
                    String mno = sc.next();
                    use.findRecord(arr,mno);
                    break;
                case 2:
                    System.out.println("Enter the mobile number:");
                    String mno1 = sc.next();
                    System.out.println("Enter the new email id:");
                    String newE = sc.next();
                
                    use.updateRecord(arr,mno1,newE);
                    break;
                case 3:
                    System.out.println("Enter the substring:");
                    String sub = sc.next();
                    use.findSubstring(arr,sub);
                    break;
                case 4:
                    System.out.println("Enter the district name:");
                    String di = sc.next();
                    use.findDistrict(arr,di);
                    break;
            }
         }
    }
}
