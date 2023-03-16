import java.io.*;
class Dog implements Serializable{
    transient int i = 10;
    int j = 20;
}
class SerializableDemo{
    public static void main(String ar[])throws Exception{
        System.out.println("Serialization started");
        FileOutputStream fos = new FileOutputStream("abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Dog d1 = new Dog();
        System.out.println("Serialization ended");
        oos.writeObject(d1);
        System.out.println("Deserialization started");
        FileInputStream fis = new FileInputStream("abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog d2 = (Dog)ois.readObject();
        System.out.println("Deserialization ended");
        System.out.println(d2.i+"---------"+d2.j);
    }
}
 
//class Dog implements Serializable
//{
//Cat c=new Cat();
//}
//class Cat implements Serializable
//{
//Rat r=new Rat();
//}
//class Rat implements Serializable
//{
//int j=20;
//}
//class SerializableDemo
//{
//public static void main(String args[])throws
//Exception{ Dog d1=new Dog();
//FileOutputStream fos=new FileOutputStream("abc.ser");
//ObjectOutputStream oos=new ObjectOutputStream(fos);
//oos.writeObject(d1);
//FileInputStream fis=new FileInputStream("abc.ser");
//ObjectInputStream ois=new ObjectInputStream(fis); Dog
//d2=(Dog)ois.readObject();
//System.out.println(d2.c.r.j);
//}
//}

