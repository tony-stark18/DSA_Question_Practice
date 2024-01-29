import java.util.HashMap;
public class Number_of_subarray_with_xor_k {
    public static int getSubarray(int nums[],int target){
        HashMap<Integer,Integer> hs = new HashMap<>();
        int n=nums.length;
        int xr=0;
        int count=0;
        hs.put(xr,1);
        for(int i=0;i<n;i++){
            xr^=nums[i];
            int rem = xr^target;
            count+=hs.getOrDefault(rem, 0);
            hs.put(xr,hs.getOrDefault(xr,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        
    }
}
