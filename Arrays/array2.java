public class array2 {
    public static void update(int arr[],int var)
    {
        var=100;
        // Here value of var will not change because a integer is pass by call but an array is passed by rference. 
        for (int i=0;i<arr.length;i++)
        {
            arr[i]+=1;
        }
    }
    public static void main(String[] args) {
        int marks[]={96,52,99};
        int var=15;
        update(marks,var);

        for (int i=0;i<marks.length;i++)
        {
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        System.out.println(var);
    }
}
