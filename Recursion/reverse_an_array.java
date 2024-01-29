public class reverse_an_array {
    public static void reverse_an_array(int i,int arr[]){
        if(i==arr.length/2){
            return;
        }
        int t=arr[i];
        arr[i]=arr[arr.length-1-i];
        arr[arr.length-1-i]=t;
        reverse_an_array(i+1, arr);
    }
    public static void main(String[] args) {
        int arr []={1,3,2,6,4,5,2};
        reverse_an_array(0, arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
