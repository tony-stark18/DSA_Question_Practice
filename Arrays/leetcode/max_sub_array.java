public class max_sub_array {
    public static int max_sub_array(int nums[],int n,int k){
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int max_sum=sum;
        for(int i=k;i<n;i++){
            sum=sum-nums[i-k]+nums[i];
            max_sum=Math.max(max_sum,sum);
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int arr[]={1,2,7,6,1,5,9,2,6,7,5,12,6,-5,7};
        int k =4;
        // int max_sum=Integer.MIN_VALUE;
        // for(int i=0;i<=arr.length-k;i++){
        //     int sum=0;
        //     int j=i;
        //     while(j<i+k){
        //         sum+=arr[j];
        //         j++;
        //     }
        //     max_sum=Math.max(max_sum,sum);
        // }
        System.out.println(max_sub_array(arr, arr.length, k));
    }
}
