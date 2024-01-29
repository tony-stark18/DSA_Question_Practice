import java.util.*;
public class arr4_largest_in_array {
    public static int getLargest(int[] arr)
    {
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]>largest)
            {
                largest=arr[i];
            }
            if (arr[i]<smallest)
            {
                smallest=arr[i];
            }
        }
        System.out.println("Smallest is "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,16,7,8,9};
        System.out.println(getLargest(arr));
    }
}
