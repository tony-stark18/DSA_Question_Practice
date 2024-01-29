import java.util.*;
public class palindrom_number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number to reverse it: ");
        int num=sc.nextInt();
        int org_num=num;
        int rev_num=0;
        while (num>=1)
        {
            rev_num=rev_num*10+num%10;
            num=num/10;
        }
        if (rev_num==org_num)
        {
            System.out.println("It is a palindrome");

        }
        else
        {
            System.out.println("It is not a palindrome");

        }
    }
}
