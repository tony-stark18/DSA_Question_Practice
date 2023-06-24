public class check_palindrom {
    public static boolean check_palindrom(int i,String str){
        if(i>=str.length()/2){
            return true;
        }
        if(str.charAt(i)!=str.charAt(str.length()-i-1)){
            return false;
        }
        return check_palindrom(i+1, str);
    }
    public static void main(String[] args) {
        System.out.println(check_palindrom(0, "aba"));
    }
}
