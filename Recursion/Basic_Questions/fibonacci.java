public class fibonacci {
    public static int fibonacci(int n){
        if(n==1 || n==2){
            return n-1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            System.out.print(fibonacci(i)+" ");
        }
        //It will give nth number from the fibonacci series.
    }
}
