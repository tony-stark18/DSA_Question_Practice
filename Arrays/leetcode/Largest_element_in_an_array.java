import java.util.Arrays;
public class Largest_element_in_an_array {
    public static void brute_force_method(int arr[]){
        Arrays.sort(arr);
        System.out.println("Largest Element in the above array is "+arr[arr.length-1]);

        // Time Complexity: O(N*log(N))
        // Space Complexity: O(n)
    }
    public static void recursive_approach(int arr[],int index,int max){
        if(index==arr.length){
            System.out.println("Largest Element in the above array is "+max);
            return;
        }
        if(arr[index]>max){
            max=arr[index];
        }
        recursive_approach(arr, index+1, max);

        // Time Complexity: O(N)
        // Space Complexity: O(1)
        // this is the optimal solution. You can use for/while loops to traverse through the array instead
    }
    public static void main(String[] args) {
        // int arr[]={5,2,1,3,10,4};
        // recursive_approach(arr, 0, arr[0]);
        StringBuilder sb = new StringBuilder("");
    }
}
