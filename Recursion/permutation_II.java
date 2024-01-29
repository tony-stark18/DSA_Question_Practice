import java.util.*;
public class permutation_II {
    public static void swap(int arr[],int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void findPermutation(int index,int arr[],List<List<Integer>> ans){
        if(index==arr.length){
            List<Integer> ds = new ArrayList<Integer>();
            for(int i=0;i<arr.length;i++){
                ds.add(arr[i]);
            }
            ans.add(new ArrayList<Integer>(ds));
            return;
        }
        for(int i=index;i<arr.length;i++){
            swap(arr, i, index);
            findPermutation(index+1, arr, ans);
            swap(arr, i, index);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int arr2[]=new int[arr.length];
        // Arrays.
        // Arrays.co
        for(int i:arr2){
            System.out.println(i);
        }
        
        // List<List<Integer>> ans = new ArrayList<>();
        // findPermutation(0, arr, ans);
        // System.out.println(ans);
        // System.out.println(6^2);
    }
}
