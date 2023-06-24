public class increasing_order {
    public static void print_numbers(int n){
        if(n==1){
            System.out.println(1);
        }
        else{
            print_numbers(n-1);
            System.out.println(n);
        }   
    }
    public static void main(String[] args) {
        print_numbers(5);
    }
}
