public class square_sum {
    public static int func(int target,int sum,int n){
        if(sum==target) return 1;
        if(sum>target) return 0;
        if (n * n > target - sum) return 0;
        return func(target,sum+n*n,n+1)+func(target,sum,n+1);
    }       
   public static void main(String[] args) {
        int result = func(100, 1, 1);
        System.out.println(result);
   } 
}
