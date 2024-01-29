public class tilling_problem {
    public static int tilling_problem(int n){

        if(n==0 || n==1){
            return 1;
        }
        //vertical ways
        int nm1=tilling_problem(n-1);

        //horizontal ways
        int nm2=tilling_problem(n-2);

        return nm1+nm2;
    }
    public static void main(String[] args) {
        System.out.println(tilling_problem(7));
    }
}
