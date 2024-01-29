public class MergeSort {
    public static void MergeSort(int arr[],int low,int high){
        if(low==high){
            return;
        }
        int mid=(low+high)/2;
        MergeSort(arr, low, mid);
        MergeSort(arr, mid+1, high);
        Merge(arr, low, high, mid);
    }
    public static void Merge(int arr[],int low,int high,int mid){
        int temp[]=new int[high-low+1];
        int left=low;
        int right=mid+1;
        int k=0;
        while(left<=mid && right<=high){
            if(arr[left]<arr[right]){
                temp[k]=arr[left];
                left++;
            }
            else{
                temp[k]=arr[right];
                right++;
            }
            k++;
        }
        while(left<=mid){
            temp[k]=arr[left];
            left++;
            k++;
        }
        while(right<=high){
            temp[k]=arr[right];
            right++;
            k++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=temp[i-low];
        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={3,1,2,4,1,5,6,2,4};
        MergeSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
