import java.util.Stack;
public class ValidParanthesis{
    public static boolean checkValid(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='{' || c=='[' || c=='('){
                st.push(c);
            }
            else{
                if(st.isEmpty()) return false;
                if((st.peek()=='{' && c=='}') || (st.peek()=='[' && c==']') || (st.peek()=='(' && c==')')){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            // System.out.println(i);
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String str = "{(})}";
        System.out.println(checkValid(str));
    }
}