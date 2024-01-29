public class pairs_in_an_array {
    public static void print_pair(int[] arr){
        int no_of_pair=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j=i+1; j < arr.length; j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                no_of_pair++;
            }
            System.out.println();
        }
        System.out.println("Total number of pairs found: " + no_of_pair);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        print_pair(arr);
    }
}
