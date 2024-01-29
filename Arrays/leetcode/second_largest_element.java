import java.util.Arrays;
public class second_largest_element {

    public static void brute_force_method(int arr[]){
        if(arr.length ==0 || arr.length ==1){
            System.out.println(-1);
            return;
        }
        Arrays.sort(arr);
        System.out.println("Second largest Element in the above array is "+arr[arr.length-2]);

        // Time Complexity: O(N*log(N))
        // Space Complexity: O(n)
        //Note:- This method will work only if there is no duplicate element in the array.
    }
    public static void better_approach(int arr[]){
        if(arr.length<2){
            System.out.println(-1);
            return;
        }
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            smallest=Math.min(smallest,arr[i]);
            largest=Math.max(largest,arr[i]);
        }
        int second_largest=smallest;
        int second_smallest=largest;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>second_largest && arr[i]!=largest){
                second_largest=arr[i];
            }
            if(arr[i]<second_smallest && arr[i]!=smallest){
                second_smallest=arr[i];
            }
        }
        System.out.println("Second largest Element: " + second_largest);
        System.out.println("Second smallest Element: " + second_smallest);

        // Time Complexity: O(N), We do two linear traversals in our array
        // Space Complexity: O(1)
    }
    public static void optimal_solution(int arr[]){
        if(arr.length<2){
            System.out.println(-1);
            return;
        }
        int second_largest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                second_largest=largest;
                largest=arr[i];
            }
            else if(arr[i]>second_largest && arr[i]<largest){
                second_largest=arr[i];
            }
        }
        if (second_largest == Integer.MIN_VALUE) { //This case is to handle the case where all elements are same.
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("Second Largest Element is " + second_largest);
        }
    }
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 7, 5, 6 };
        optimal_solution(arr);
    }
}
