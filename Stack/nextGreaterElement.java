import java.util.Stack;
public class nextGreaterElement {
    public static int[] nextGreater(int arr[],int n){
        int[] ans = new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i=n-1;i>-1;i++){
            int currVal = arr[i];
            while(!s.isEmpty() && s.peek()<=currVal){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=s.peek();
            }
            s.push(currVal);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {6,8,0,1,3};
        int[] ans = new int[arr.length];
        
    }
}
