import java.util.Stack;
public class inBuiltStack {
    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int t = s.pop();
        pushAtBottom(s, data);
        s.push(t);
    }
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int t = s.pop();
        reverseStack(s);
        pushAtBottom(s, t);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        reverseStack(s);
        System.out.println(s);
    }
}
