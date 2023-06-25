class Solution {
    public void solution(List<List<Integer>> ans,List<Integer> ds,int arr[],int index){
        ans.add(new ArrayList<>(ds));
        for(int i=index;i<arr.length;i++){
            if(i>index && arr[i]==arr[i-1]) continue;
            ds.add(arr[i]);
            solution(ans,ds,arr,i+1);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> ds=new ArrayList<Integer>();
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        solution(list,ds,nums,0);
        return list;    
    }
}
