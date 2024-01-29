public class sum_of_n_numbers {
    public static void sum_of_n_numbers(int i,int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        sum_of_n_numbers(i-1, sum+i);
    }
    public static void main(String[] args) {
        sum_of_n_numbers(5,0);
        // System.out.println(x);
    }
}
