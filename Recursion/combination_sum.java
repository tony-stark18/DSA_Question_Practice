import java.util.ArrayList;

public class combination_sum {
    public static void printCombinationSum(int arr[],int index,int target,ArrayList<Integer> arr1){
        if(index==arr.length){
            if(target==0){
                System.out.println(arr1);
            }
            return;
        }
        if(arr[index]<=target){
            arr1.add(arr[index]);
            printCombinationSum(arr, index, target-arr[index], arr1);
            arr1.remove(arr1.size()-1);
        }
        printCombinationSum(arr, index+1, target, arr1);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        int arr[]={2};
        printCombinationSum(arr,0,1,arr1);
    }
}
