public class typecasting {
    public static void main(String[] args) {
        // long a=25;
        // int b=a;
        // can't be possible because long size is greater than int size
        // Type conversion is only possible when destination type is greater than source type and type is compatible 
        int a=25;
        long b=a;
        // This is possible as long which is the destination varible is greater than source variable which is int 
        System.out.println(b);
        int x=25;
        float y=(float) x;
        System.out.println();
        float m=3.141f;
        double n=(double) m;
        System.out.println(n);
        
    }
}
