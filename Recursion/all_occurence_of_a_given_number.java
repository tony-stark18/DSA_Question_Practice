public class all_occurence_of_a_given_number {
    public static void printOccurence(int arr[],int key,int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]==key){
            System.out.print(index+" ");
        }
        printOccurence(arr, key, index+1);
    }
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        printOccurence(arr, 2, 0);
    }
}
