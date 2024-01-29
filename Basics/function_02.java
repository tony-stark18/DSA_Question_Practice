import java.util.*;
public class function_02 {
    public static int Addition(int x,int y)
    {
        return x+y;
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a=in.nextInt();
        System.out.print("Enter the value of b:");
        int b=in.nextInt();
        System.out.println("The addition of "+a+" and "+b+" is "+Addition(a,b));
    }
}
