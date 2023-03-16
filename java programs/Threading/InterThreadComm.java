class ThreadA {
    public static void main(String args[])throws Exception{
        ThreadB obj = new ThreadB();
        obj.start();
        synchronized(obj){
            System.out.println("Thread A starts....");
            System.out.println("Main thread calls wait() methd ");
            obj.wait();
            System.out.println("Total :"+obj.total);
        }
    }
}
class ThreadB extends Thread{
    int total = 0;
    public void run(){
        ThreadC obj1 = new ThreadC();
        obj1.start();
        synchronized(obj1){
            System.out.println("Thread B starts....");
            for(int i=1;i<=10;i++){
                total+=1;
            }
            try{
                obj1.wait();
            }
            catch(Exception e){
                e.printStackTrace();
            }
            System.out.println("t ="+obj1.t);
            System.out.println("Thread B giving notification");
            obj1.notify();
        }
    } 
}
class ThreadC extends Thread{
    int t=0;
    public void run() {
        synchronized(this){
            System.out.println("Thread C starts....");
            for(int i=1;i<=10;i++){
                t+=1;
            }
            System.out.println("Thread C giving notification");
            this.notify();
        }
    } 
}
