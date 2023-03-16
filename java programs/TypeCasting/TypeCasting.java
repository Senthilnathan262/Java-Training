 class TypeCasting {
    public static void main(String[] args) {
        byte a=20;
        double b=49.0;
        double res=a+b;
        int c=(int)res;//explicit conversion
        System.out.println(c);
        int d=a;//implicit conversion
        System.out.println(d);
        
        
    }
}