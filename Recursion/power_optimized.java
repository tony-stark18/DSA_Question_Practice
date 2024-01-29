public class power_optimized {
    public static int power(int x, int y){
        if(y==0){
            return 1;
        }
        int halfpower= power(x, y/2);
        int halfpowersq=halfpower*halfpower;
        if(y%2!=0){
            halfpowersq= x*halfpowersq;
        }
        return halfpowersq;
    }
    public static void main(String[] args) {
        System.out.println(power(5, 3));
    }
}
