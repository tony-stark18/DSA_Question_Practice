package sorting;

public class selection_sort {
    public static void selection_sort(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int smallest=i;
            for (int j=i+1;j<n;j++){
                if (arr[j]<=arr[smallest]){
                    smallest=j; // finding smallest number 
                }
            }
            int t=arr[i];
            arr[i]=arr[smallest];//Swapping
            arr[smallest]=t;
        }
    }
    public static void printArray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,8,2,1};
        selection_sort(arr);
        printArray(arr);
    }
}
