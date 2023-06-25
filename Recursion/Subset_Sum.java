class Solution {
    public void solution(List<List<Integer>> ans,List<Integer> ds,int arr[],int index){
        if(index==arr.length){
            ans.add(new ArrayList<Integer>(ds));
            return;
        }
        ds.add(arr[index]);
        solution(ans,ds,arr,index+1);
        ds.remove(ds.size()-1);
        solution(ans,ds,arr,index+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> ds=new ArrayList<Integer>();
        List<List<Integer>> list = new ArrayList<>();
        solution(list,ds,nums,0);
        return list;    
    }
}
