public class Permutation {
    public static void findPermutation(String str,String ans){
        if(ans.length()==3){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            findPermutation(str.substring(0, i)+str.substring(i+1), ans+str.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str="abc";
        findPermutation(str, "");
    }
}
