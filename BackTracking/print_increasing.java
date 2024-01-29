public class print_increasing {
    //You have to print numbers in increasing order from 1 to 10 but you can't pass i+1 as a argument in the reccursive function.
    public static void print_increasing(int i,int n){
        if(i<1){
            return;
        }
        print_increasing(i-1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        int n=10;
        print_increasing(n, n);
    }
}
