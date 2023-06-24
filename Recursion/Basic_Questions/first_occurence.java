public class first_occurence {
    public static int first_occurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return first_occurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr []={15,3,9,6,4,2,5};
        System.out.println(first_occurence(arr, 5, 0));
    }
}
