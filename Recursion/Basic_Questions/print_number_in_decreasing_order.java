
public class print_number_in_decreasing_order {
    public static void print_numbers(int n){
        if(n==1){
            System.out.println(1);
        }
        else{
            System.out.println(n);
            print_numbers(n-1);
        }   
    }
    public static void main(String[] args) {
        print_numbers(10);
    }
}
