class Solution {
    private void findPermutation(int arr[],List<List<Integer>> ans,List<Integer> ds,boolean bool[]){
        if(ds.size()==arr.length){
            ans.add(new ArrayList<Integer>(ds));
        }
        for(int i=0;i<arr.length;i++){
            if(!bool[i]){
                ds.add(arr[i]);
                bool[i]=true;
                findPermutation(arr,ans,ds,bool);
                ds.remove(ds.size()-1);
                bool[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean bool[]=new boolean[nums.length];
        findPermutation(nums, ans,new ArrayList<>(), bool);
        return ans;
    }
}
