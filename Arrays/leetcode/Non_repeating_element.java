public class Non_repeating_element {
    // Given a non-empty array of integers nums, every element appears twice except
    // for one. Find that single one.
    // You must implement a solution with a linear runtime complexity and use only
    // constant extra space.
    // ----------------------------------------------------------------
    // Answer
    // This can be done using Xor operator.
    // XOR of two same numbers is zero
    // XOR of 0 with a number is the number itself
    // So by doing the following,the xor of all the repeated element will be zero
    // and the xor of zero with that single number will return that number which is
    // we are suppose to return.
    public static int nonRepeating(int arr[]){
        int result=0;
        for(int i:arr){
            result^=i;
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = { 4, 1, 2, 1, 2 };
        System.out.println("the non repeating element is "+nonRepeating(nums));
    }
}
