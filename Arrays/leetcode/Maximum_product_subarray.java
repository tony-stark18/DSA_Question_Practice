public class Maximum_product_subarray {
    public static int maxProduct(int arr[]){
        int max = Integer.MIN_VALUE;
        int pre=1;
        int suf=1;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0) pre=1;
            if(arr[n-i-1]==0) suf=1;
            pre*=arr[i];
            suf*=arr[n-i-1];
            max=Math.max(Math.max(pre,suf),max);
        }

        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,-3,0,-4,-5};
        System.out.println("Maximum product subarray is: "+maxProduct(arr));
    }
}
