public class reverse_words_in_a_given_string {
    public static String reverseWords(String S)
    {
        String words[]=S.split("\\.");
        StringBuilder sb=new StringBuilder("");
        for(int i=words.length-1;i>-1;i--){
            sb.append(words[i]);
            if(i>0){
                sb.append(".");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverseWords("pqr.mno"));
    }
}
