class Parantheses{
    synchronized public void disp(String s){
        System.out.print("["+s);
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.print("]");
    }
}
class Eight implements Runnable{
    Parantheses p;
    String s;
    Eight(Parantheses p,String s){
        this.p=p;
        this.s=s;
    }
    public void run(){
        p.disp(s);
    }
}
class Nine implements Runnable{
    Parantheses p;
    String s;
    Nine(Parantheses p,String s){
        this.p=p;
        this.s=s;
    }
    public void run(){
        p.disp(s);
    }
}
class SynchronizedDemo{
    public static void main(String args[]){
        Parantheses p = new Parantheses();
        new Thread(new Eight(p,"one")).start();
        new Thread(new Nine(p,"two")).start();
    }
}










