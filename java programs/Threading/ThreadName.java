class ThreadName{
    public static void main(String args[]){
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
        t.setName("senthil");
        System.out.println(t.getName());
    }
}
