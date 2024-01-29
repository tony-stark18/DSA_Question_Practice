public class array3_linear_search {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={10,12,15,13,45,86,42,1,20};
        int key=18;
        System.out.println((linearSearch(arr, key)==-1)?"Not found":"index = "+linearSearch(arr, key));

    }
}
