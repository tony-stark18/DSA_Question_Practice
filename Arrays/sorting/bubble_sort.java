package sorting;

public class bubble_sort {
    public static void bubble_sort(int[] arr) {
        int n=arr.length;
        int s=0;
        int s1=1;
            for(int i=0;i<n-1;i++){
                if (s!=s1){
                    for (int j=0;j<n-i-1;j++){
                        s=s1;
                        if (arr[j]>=arr[j+1]){
                        //Swap
                            int t=arr[j];
                            arr[j]=arr[j+1];
                            arr[j+1]=t;
                            s++;
                        }
                    }
                }
            }
    }

    public static void printArray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[]={1,1,2};
        bubble_sort(nums);
        printArray(nums);

    }
}
