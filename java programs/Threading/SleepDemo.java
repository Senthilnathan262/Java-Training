class One extends Thread{
    public void run() {
        for(int i =1;i<=10;i++){
            System.out.println("One ="+i);
            try{
                Thread.sleep(5000);
            }
            catch(Exception e){
                System.out.println("Exception handled");
            }
        }
    }
}
class Two extends Thread{
    public void run(){
        for(int i =1;i<=10;i++){
            System.out.println("Two ="+i);
        }
    }
}
class Three extends Thread{
    public void run(){
        for(int i =1;i<=10;i++){
            System.out.println("Three ="+i);
        }
    }
}

class SleepDemo{
    public static void main(String []args){
        One one = new One();
        Two two = new Two();
        Three three = new Three();
        one.start();
        two.start();
        three.start();
    }
}
