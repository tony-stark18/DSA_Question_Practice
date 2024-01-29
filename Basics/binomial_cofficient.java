import java.util.*;
public class binomial_cofficient {
    public static int factorial(int a)
    {
        if (a==0 || a==1)
        {
            return 1;
        }
        else
        {
            return a*factorial(a-1);
        }
    }
    public static void main(String[] args) {
        // formula nCr= n!/((n-r)! * r!)
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        System.out.print("Enter the value of r: ");
        int r=sc.nextInt();
        System.out.println("The value of nCr is: "+factorial(n)/(factorial(n-r)*factorial(r)));
    }
}
