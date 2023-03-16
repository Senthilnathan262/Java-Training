import java.util.*;

class Student{
    private String name;
    private String department;
    private int year;
    private float percentage;
    Student(){}

    Student(String name,String department,int year,float percentage){
        this.name=name;
        this.department=department;
        this.year=year;
        this.percentage=percentage;
    }
    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }
    public int getYear(){
        return year;
    }
    public float getPercentage(){
        return percentage;
    }
    public void getDetails(ArrayList<Student> arr){
        System.out.println("Details of the students are....");
        System.out.println();
        for(Student st:arr){
            System.out.println("Name : "+st.getName());
            System.out.println("Department : "+st.getDepartment());
            System.out.println("Year : "+st.getYear());
            System.out.println("Percentage : "+st.getPercentage());
            System.out.println();
            System.out.println();
        }
    }
}

class StudentDetails{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> arr = new ArrayList<Student>();
        
        System.out.println("Enter the no.of students:");
        int n = sc.nextInt();
        for(int i=1;i<n+1;i++){
            System.out.println("Enter the details of student "+i);
            System.out.println("Enter the Name :");
            String na = sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Enter the Department :");
            String department = sc.next();
            System.out.println("Enter the Year :");
            int year = sc.nextInt();
            System.out.println("Enter the Percentage :");
            float percentage = sc.nextFloat();
            Student student = new Student(name,department,year,percentage);
            arr.add(student);
        }
        
        Student student1 = new Student();
        student1.getDetails(arr);
        
    }
}
