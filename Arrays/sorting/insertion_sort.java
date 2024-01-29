package sorting;
import java.util.Arrays;
import java.util.Collections;
public class insertion_sort {

    // public static void insertion_sort(int arr[]){
    //     int n=arr.length;
    //     for(int i=0;i<n-1;i++){
    //         for(int j=i;j>=0;j--){
    //             if (arr[j+1]<arr[j]){
    //                 int t=arr[j+1];
    //                 arr[j+1]=arr[j];
    //                 arr[j]=t;
    //             }
    //         }
    //     }
    // }
        public static void insertion_sort(Integer arr[]){
            int n = arr.length;
            for (int i=1;i<n;i++){
                int cur=arr[i];
                int prev=i-1;
                while(prev>=0 && cur<arr[prev]){
                    arr[prev+1]=arr[prev];
                    prev--;
                }
                arr[prev+1]=cur;
            }
        }

        
    public static void printArray(Integer arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[]={7,1,3,6,9,2,4,3,5,8};
        // insertion_sort(arr);
        // Arrays.sort(arr); //It will automatically sort the array
        // Arrays.sort(arr,0,5); //It will automatically sort the array from specific index to another ending index
        // here 0 is the starting index and 5 is the ending index. Here ending index is not included
        Arrays.sort(arr,Collections.reverseOrder());
        printArray(arr);
        // reverseOrder() function will only work if the array is an object of Intger class. Means it is only operated upon the object type variable
}
}
