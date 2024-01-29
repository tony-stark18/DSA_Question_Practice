package sorting;
// import java.util.*;
public class counting_sort {
    public static void collection_sort(int arr[]){
        //finding the max value of the arr to create a new array count of that length
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max, arr[i]);
        }
        //Finding the frequency of numbers in the array
        int count[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        //replacing values of the array in those places where frequency >0(means the number which exitsts in the original arrayll) starting from zero to max value of th array
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                count[i]--;
                j++;
            }
        }
        // System.out.println(max);
    }
    public static void printArray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,4,1,3,2,4,3,7,5};
        collection_sort(arr);
        printArray(arr);
    }
}
