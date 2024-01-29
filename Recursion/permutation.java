import java.util.*;
public class permutation {
    public static void findPermutation(int arr[],List<List<Integer>> ans,List<Integer> ds,boolean bool[]){
        if(ds.size() == arr.length){
            ans.add(new ArrayList<Integer>(ds));
        }
        for(int i=0;i<arr.length;i++){
            if(!bool[i]){
                ds.add(arr[i]);
                bool[i]=true;
                findPermutation(arr, ans, ds, bool);
                ds.remove(ds.size()-1);
                bool[i]=false;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        boolean bool[]=new boolean[arr.length];
        int arr2[]=arr.clone();
        Arrays.sort(arr2);
        findPermutation(arr2, ans,new ArrayList<>(), bool);
        System.out.println(ans);
        // for(int i=0;i<ans.size();i++){
        //     if(ans.get(i).equals(Arrays.asList(arr))){
        //         System.out.println(ans);
        //         break;
        //     }
        // }
        
        List<Integer> ans2 = new ArrayList<Integer>();
        ans2.add(1);
        ans2.add(2);
        ans2.add(3);
        if(ans.get(0).equals(Arrays.asList(arr))){
            System.out.println("ok");
        }
        else{
            System.out.println("bsdk");
        }
    }
}
