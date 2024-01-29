public class Maximum_sub_array {
    public static int findMaximumSubArray(int[] arr){
        //Here I am going to use Kadane's algorithm which is the optimal solution for this problem. 
        int maxSum=arr[0];
        int currentSum=arr[0];
        for(int i=1;i<arr.length;i++){
            currentSum=Math.max(currentSum+arr[i],arr[i]);
            maxSum=Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[]={1,4,2,9,6};
        System.out.println(findMaximumSubArray(arr));
    }
}
