import java.util.*;

class Author{
    private String name;
    private String email;
    private String gender;
    Author(){}
    Author(String name,String email,String gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public String getEmail(){
        return email;
    }
    public String toString(){
        return getName() +"("+getGender()+")"+ "contact at "+ getEmail();
    }
    public int compareTo(Object obj1,Object obj2){
        String s1 = obj1.toString();
        String s2 = obj2.toString();
        return s1.compareTo(s2);
    }
}

class AuthorBO extends Author{
    public void displayAllAuthorDetails(List<Author> l){
        System.out.println("Name Email Gender:");
        for(Author str:l){
            System.out.format("%-20s %-20s %-20s\n", str.getName(),str.getEmail(),str.getGender());
        }
    }

    public void listAuthorNamesInSortedOrder(List<Author> l){
        ArrayList arr = new ArrayList();
        for(Author str : l){
            
            arr.add(str.getName());
            
        }
        Collections.sort(arr);
        System.out.println(arr);
    }
    public int findAuthorByName(List<Author> l,String na){
        ListIterator str = l.listIterator();
        while(str.hasNext()){
            Author a = (Author)str.next();
            String str1 = a.getName();
            if(na.equals(str1)){
                System.out.println(a);
                return 0;
            }
        }
        System.out.println("Author name not found");
        return 0; 
        
    }
}
class AuthorA{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        List<Author> l = new ArrayList<Author>();
        while(true){
            
            System.out.println("Enter the author name");
            String n = sc.next();
            System.out.println("Enter the author email id");
            String e = sc.next();
            System.out.println("Enter the author's gender");
            String g = sc.next();
            Author au1 = new Author(n,e,g);
            l.add(au1);
            
            System.out.println("Do you want to add the details of another author? Type Yes/No ");
            String ch = sc.next();
            if(ch.equals("No")){
                
                break;
            }
            
        }
        AuthorBO ab = new AuthorBO();
        ab.displayAllAuthorDetails(l);        
        System.out.println("Enter the name of the author to be searched");
        String na = sc.next();
        ab.findAuthorByName(l,na);
        System.out.println("Alphabetically sorted author names");
        ab.listAuthorNamesInSortedOrder(l);
        
        
        
    }
}













