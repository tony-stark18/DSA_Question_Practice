public class last_occurence {
    public static int last_occurence(int arr[],int key,int i){
        if(i==-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return last_occurence(arr, key, i-1);

    }
    public static void main(String[] args) {
        int arr []={15,3,9,10,6,4,2};
        System.out.println(last_occurence(arr, 5, arr.length-1));
    }
}
