public class Search_Insert_Position {
    public static int searchInsert(int[] nums, int target) {
        //Try to use binary search instead of linear search
        int n= nums.length;
        int left = 0;
        int right =n-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int nums[]={1,3,5,7,8,9};
        int target = 0;
        System.out.println(searchInsert(nums, target));
    }
}
