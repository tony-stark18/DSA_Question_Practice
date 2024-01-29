import java.util.Scanner;
public class reverse_number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number to reverse it: ");
        int num=sc.nextInt();
        int rev_num=0;
        while (num>=1)
        {
            rev_num=rev_num*10+num%10;
            num=num/10;
        }
        System.out.println("The reversed number is "+rev_num);
    }
}