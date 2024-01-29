public class first_and_last_occurrences {
    public static int binarySearch(int nums[], int target, boolean key) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int el = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                el = mid;
                if (key) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return el;
    }

    public static int[] optimizedSoln(int nums[], int target) {
        int el1 = binarySearch(nums, target, true);
        int el2 = binarySearch(nums, target, false);
        int arr[] = { el1, el2 };
        return arr;
    }

    public static int[] searchRanges(int nums[], int target) {
        int arr[] = new int[2];
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int el1 = -1;
        int el2 = -1;
        // search for el1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                el1 = mid;
                high = mid - 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        low = 0;
        high = n - 1;
        // search for el2
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                el2 = mid;
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        arr[0] = el1;
        arr[1] = el2;
        return arr;
    }

    public static void main(String[] args) {
        int key = 13;
        int[] v = { 3, 4, 13, 13, 13, 20, 40 };
        int[] ans = optimizedSoln(v, key);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
