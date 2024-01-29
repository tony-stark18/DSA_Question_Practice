import java.util.HashMap;
public class sub_array_sum {
    public static int findAllSubarraysWithGivenSum(int[] arr, int k) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        int sum = 0;
        int count=0;
        hs.put(sum,1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            int rem = sum-k;
            count+=hs.getOrDefault(rem,0);
            hs.put(sum,hs.getOrDefault(sum,0)+1);
        }
        // System.out.println(hs);
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int k = 6;
        int cnt = findAllSubarraysWithGivenSum(arr, k);
        System.out.println("The number of subarrays is: " + cnt);
    }
}
