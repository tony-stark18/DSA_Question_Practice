import java.util.*;
public class function_overloading {
    public static int sum(int a, int b)
    {
        return a+b;
    }
    /*public static float sum(int a, int b)
    {
        return a+b;
    }*/
    // methode or function overloading is only possible if two or more functions having same name and different number of parameters or different types of parameters. 
    public static float sum(float a, float b)
    {
        return a+b;
    }
    // This function is possible 
    public static int sum(int a, int b, int c)
    {
        return a+b+c;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // System.out.println("Enter the value of a: ");
        // int a=in.nextInt();
        // System.out.println("Enter the value of b: ");
        // int b=in.nextInt();
        float x=in.nextFloat();
        float y=in.nextFloat();
        // System.out.println("Sum is "+sum(a,b));    
        System.out.println("Sum is "+sum(x,y));    
    }
}
