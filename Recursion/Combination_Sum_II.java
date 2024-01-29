import java.util.*;

public class Combination_Sum_II {
    public static void printCombinationSum(int arr[], int index, int target, List<Integer> ds,
            List<List<Integer>> ans) {
                if(target == 0) {
                    ans.add(new ArrayList<Integer>(ds));
                    // return;
                }
                for(int i=index;i<arr.length;i++){
                    if(i>index && arr[i]==arr[i-1]){
                        continue;
                    }
                    if(arr[i]>target){
                        break;
                    }
                    ds.add(arr[i]);
                    printCombinationSum(arr, i+1, target-arr[i], ds, ans);
                    ds.remove(ds.size()-1);
                }
    }

    public static void main(String[] args) {
        List<List<Integer>> arr2 = new ArrayList<>();
        int arr[] = { 10, 1, 2, 7, 6, 1, 5 };
        Arrays.sort(arr);
        printCombinationSum(arr, 0, 8, new ArrayList<>(), arr2);
        System.out.println(arr2);
    }
}
