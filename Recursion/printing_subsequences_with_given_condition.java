import java.util.*;

public class printing_subsequences_with_given_condition {
    public static void printSubsequences(int ind, ArrayList<Integer> arr1, int arr[],int key) {
        if (ind == arr.length) {
            int sum = 0;

            for (int number : arr1) {
                sum += number;
            }
            if(sum==key){
                System.out.println(arr1);
                System.exit(0);
            }
            return;
        }
        arr1.add(arr[ind]);
        printSubsequences(ind + 1, arr1, arr,key);
        arr1.remove(arr1.size() - 1);
        printSubsequences(ind + 1, arr1, arr,key);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        int arr[] = { 1,2,1 };
        printSubsequences(0, arr1, arr,2);
    }
}
