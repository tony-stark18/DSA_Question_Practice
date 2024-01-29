import java.util.HashMap;
import java.util.Map;
public class Majority_Element {
    public static int majorityElement(int[] nums) {
        //This is the most optimal solution for this problem. Moore's vooting algorithm
        int el=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(cnt==0){
                el=nums[i];
                cnt=1;
            }
            else if(el==nums[i]){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        return el;
    }
    public static int usingHashing(int []v) {
        //using hashing
        //size of the given array:
        int n = v.length;

        //declaring a map:
        HashMap<Integer, Integer> mpp = new HashMap<>();

        //storing the elements with its occurnce:
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(v[i], 0);
            mpp.put(v[i], value + 1);
        }

        //searching for the majority element:
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);
    }
}
