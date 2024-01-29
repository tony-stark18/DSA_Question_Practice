import java.util.HashMap;
public class Longest_subarray_with_sum_k {
    public static int optimal_solution(int arr[],long k){
        HashMap<Long,Integer> hs = new HashMap<>();
        long sum = 0;
        int max_len=0;
        hs.put(sum,0);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                max_len=Math.max(max_len,i+1);
            }
            long rem = sum-k;
            if(hs.containsKey(rem)){
                max_len=Math.max(max_len,i-hs.get(rem));
            }
            if(!hs.containsKey(sum)){
                hs.put(sum,i);
            }
        }
        System.out.println(hs);
        return max_len;
    }
    public static int brute_force(int arr[],int k){
        int max_len=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==k){
                    max_len=Math.max(max_len,j-i+1);
                }
            }
        }
        return max_len;
    }
    public static void main(String[] args) {
        int arr[]={0,0,3};
        int k=3;
        System.out.println(optimal_solution(arr, k));
    }
}
