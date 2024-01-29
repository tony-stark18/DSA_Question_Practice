public class print_decreasing {
    public static void print_decreasing(int i,int n){
        if(i>n){
            return;
        }
        print_decreasing(i+1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        int n=10;
        print_decreasing(1, n);
    }
}
