public class reverse_an_array {
    public static void reverse_an_array(int []arr)
    {
        for (int i=0;i<arr.length/2;i++){
            int t=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=t;
        }
    }
    public static void main(String[] args) {
        int arr[]={10,52,865,252,32,12,10};
        reverse_an_array(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
