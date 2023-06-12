import java.util.Arrays;

public class check_anagram_optimized {
    public static boolean check_anagram(String str1,String str2){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()==str2.length()){
            char arr1[]=str1.toCharArray();
            char arr2[]=str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(Arrays.equals(arr1, arr2)){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str1=new String("abc");
        String str2=new String("cba");
        System.out.println((check_anagram(str1, str2))?"Anagram":"Not Anagram");
    }
}
