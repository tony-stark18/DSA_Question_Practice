import java.util.*;
public class Three_Sum {
    public static List<List<Integer>> usingHashing(int arr[]){
        Set<List<Integer>> st = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            Set<Integer> hashset = new HashSet<>();//Don't use a List data structure here because it is way too slower than set data structure
            for(int j=i+1;j<arr.length;j++){
                int rem=-(arr[i]+arr[j]);
                if(hashset.contains(rem)){
                    List<Integer> temp = Arrays.asList(arr[i],arr[j],rem);
                    temp.sort(null);
                    st.add(temp);
                }
                hashset.add(arr[j]);
            }
        }
        List<List<Integer>> ls =new ArrayList<>(st);
        return ls;
    }
    //the optimal solution uses two-pointer approach
    public static List<List<Integer>> optimal_solution(int arr[],int n){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(i!=0 && arr[i]==arr[i-1]) continue;
            int j=i+1;  
            int k=n-1;
            while(j<k){
                int sum=arr[i];
                sum+=arr[j];
                sum+=arr[k];
                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j<k && arr[j]==arr[j-1]){
                        j++;
                    }
                    while(j<k && arr[k]==arr[k+1]){
                        k--;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4};
        int n = arr.length;
        List<List<Integer>> ans = optimal_solution(arr,n);
        System.out.println(ans);
    }
}
