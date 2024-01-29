import java.util.*;

public class Subset_sum {
    public static void findSubsetSum(int arr[], int index,ArrayList<Integer> list,int sum){
        if(index == arr.length){
            list.add(sum);
            return;
        }        
        findSubsetSum(arr, index+1, list, sum+arr[index]);
        findSubsetSum(arr, index+1, list, sum);
    }
    public static void main(String[] args) {
        int arr[]={5,2,1};
        ArrayList<Integer> list = new ArrayList<Integer>();
        findSubsetSum(arr, 0, list, 0);
        Collections.sort(list);
        System.out.println(list);
    }
}
