public class fibonacci {
    public static int fibonacci( int n){
        return n != 1 && n != 0 ? fibonacci(n - 1) + fibonacci(n - 2) : n; 
    }
    public static void main(String[] args) {
        System.out.print(fibonacci(20)+" ");
        //It will give nth number from the fibonacci series.
    }
}
