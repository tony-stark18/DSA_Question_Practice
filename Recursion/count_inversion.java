import java.util.ArrayList;
public class count_inversion {
    private static int merge(int[] arr, int low, int mid, int high) {
        int count=0;
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                count=count+(mid-left+1);
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        return count;
    }

    public static int mergeSort(int[] arr, int low, int high) {
        int count=0;
        if (low >= high) return count;
        int mid = (low + high) / 2 ;
        count+=mergeSort(arr, low, mid);  // left half
        count+=mergeSort(arr, mid + 1, high); // right half
        count+=merge(arr, low, mid, high);
          // merging sorted halves
        return count;
    }
    public static int numberOfInversions(int []a, int n) {
        int count=mergeSort(a, 0, n-1);
        return count;
    }
    public static void main(String[] args) {
        
    }
}
