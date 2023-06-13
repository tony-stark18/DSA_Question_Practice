public class binary_string_problem {
    public static void printBinary(int n,int last_index,StringBuilder str){
        if(n==0){
            System.out.println(str);
            return;
        }
        str.append("0");
        printBinary(n-1, 0, str);
        str.deleteCharAt(str.length()-1);
        if(last_index==0){
            str.append("1");
            printBinary(n-1, 1, str);
            str.deleteCharAt(str.length()-1);
        }
    }
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("");
        printBinary(4, 0, sb);
    }
}
