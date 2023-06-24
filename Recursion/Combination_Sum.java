class Solution {
    public static void printCombinationSum(int arr[],int index,int target,List<List<Integer>> arr2,List<Integer> arr1){
        if(index==arr.length){
            if(target==0){
                arr2.add(new ArrayList<>(arr1));
            }
            return;
        }
        if(arr[index]<=target){
            arr1.add(arr[index]);
            printCombinationSum(arr,index,target-arr[index],arr2,arr1);
            arr1.remove(arr1.size()-1);
        }
        printCombinationSum(arr,index+1,target,arr2,arr1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans =new ArrayList<>();
        List<Integer> ds =new ArrayList<>();
        printCombinationSum(candidates,0,target,ans,ds);
        return ans;
    }
}
