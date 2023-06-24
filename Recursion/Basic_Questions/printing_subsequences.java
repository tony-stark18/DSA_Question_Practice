import java.util.*;
public class printing_subsequences {
    public static void printSubsequences(int ind,ArrayList<Integer> arr1,int arr[]){
        if(ind==arr.length){
            System.out.println(arr1);
            return;
        }
        arr1.add(arr[ind]);
        printSubsequences(ind+1, arr1, arr);
        arr1.remove(arr1.size()-1);
        printSubsequences(ind+1, arr1, arr);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        int arr[]={3,1,2};
        printSubsequences(0, arr1, arr);
    }
}
