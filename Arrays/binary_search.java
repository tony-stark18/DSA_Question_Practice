public class binary_search {
    public static int binary_search(int [] arr,int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if (arr[mid]==key){
                return mid;
            }
            if (arr[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={1,2,3,4,5,6,7,8,9};
        System.out.println(binary_search(number, 8));
    }
}
