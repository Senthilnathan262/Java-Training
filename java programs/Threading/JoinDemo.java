class One extends Thread{
    public void run(){
        
            System.out.println("Our method");
        
    }
}

class JoinDemo{
    public static void main(String []args){
        One one = new One();
        one.start();
        try{
            one.join();
        }
        catch(Exception e){
            
        }
        System.out.println("End of main method");
    }
}
