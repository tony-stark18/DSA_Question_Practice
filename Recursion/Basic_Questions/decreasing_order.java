import java.util.*;
public class decreasing_order {
    public static void print_decreasing(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        print_decreasing(n-1);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        n=sc.nextInt();
        print_decreasing(n);
    }
}
