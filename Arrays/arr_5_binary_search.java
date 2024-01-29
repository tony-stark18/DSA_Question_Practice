public class arr_5_binary_search {
    public static int Binarysearch(int[] arr, int key) {
        int start=0;
        int end=arr.length-1;
        while (start<=end)
        {
            int mid =(start+end)/2;
            if (arr[mid]==key)
            {
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
        int arr[]={11,2,30,4,15,6,7,8,9};
        Array.sort(arr);
        System.out.println(Binarysearch(arr, 11));
    }
}
