public class Longest_Common_Prefix_in_an_Array {
    public static String LongestCommonPrefix(String arr[],int n){
        String prefix=arr[0];
        for(int i=1;i<n;i++){
            while(!arr[i].startsWith(prefix)){
                prefix=prefix.substring(0, prefix.length()-1);
            }
        }
        if(prefix.isEmpty()){
            return "-1";
        }
        return prefix;
    }
    public static void main(String[] args) {
        // String arr[]={"geeksforgeeks","geek","geeks","geezer"};
        String arr[]={"hello","world"};
        System.out.println(LongestCommonPrefix(arr, 2));
    }
}
