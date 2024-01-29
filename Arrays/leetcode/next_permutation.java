import java.util.Arrays;

public class next_permutation {
    public static void findNextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;
        for (int i = n - 2; i > -1; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;// breaking point
            }
        }
        // if there is no breaking point then the permutation is the last permutation.
        // In this case, we will reverse that array and return it

        if (index == -1) {
            Arrays.sort(nums);
            return;
        }

        // If there exists a break point, then find the just greater element and swap
        // that number with the break point number

        for (int i = n - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                // swap

                int t = nums[i];
                nums[i] = nums[index];
                nums[index] = t;
                break;
            }
        }

        // Now just reverse the rest part of the array

        int left = index + 1;
        int right = n - 1;
        while (left < right) {
            int t = nums[left];
            nums[left] = nums[right];
            nums[right] = t;
            left++;
            right--;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = { 2, 1, 5, 4, 3, 0, 0 };
        findNextPermutation(nums);
        printArray(nums);
    }
}
