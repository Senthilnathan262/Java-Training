class MainThreadDemo{
    public static void main(String []args){
        Thread t = Thread.currentThread();
        System.out.println("Thread name = "+t.getName());
        System.out.println("Thread priority = "+t.getPriority());
        ThreadGroup tg = t.getThreadGroup();
        System.out.println("Thread Group name = "+tg.getName());
        System.out.println("isAlive() = "+t.isAlive());
        System.out.println("toString() = "+t.toString());
    }
}
