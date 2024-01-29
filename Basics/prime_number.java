import java.util.*;
public class prime_number {
    public static boolean isPrime(int n) {
        for (int i=2;i<=n;i++) {
            if (n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check whether a number is prime or not");
        int n=sc.nextInt();
        System.out.println("The number is "+(isPrime(n)?"prime":"not prime"));
    }
}