public class Quick_Sort {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void swap(int arr[],int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int arr[],int low,int high){
        int i=low;
        int j=high;
        int pivot=arr[low];
        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j) swap(arr, i, j);
        }
        swap(arr, low, j);
        return j;
    }
    public static void QuickSort(int arr[],int low,int high){
        if(low<high){
            int pindex=partition(arr,low,high);
            QuickSort(arr, low,pindex-1);
            QuickSort(arr, pindex+1, high);
        }
    }
    public static void main(String[] args) {
        int arr[]={3,1,2,4,1,5,6,2,4};
        QuickSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
