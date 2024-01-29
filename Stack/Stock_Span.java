import java.util.Stack;
public class Stock_Span {
    public static void StockSpan(int stock[],int span[]){
        Stack<Integer> st = new Stack<>();
        st.push(0);
        span[0]=1;
        for(int i=1;i<stock.length;i++){
            int curPrice = stock[i];
            while(!st.isEmpty() && curPrice>=stock[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                span[i]=i+1;
            }
            else{
                span[i]=i-st.peek();
            }
            st.push(i);
        }

    }
    public static void main(String[] args) {
        int[] stock = {100,80,60,70,60,75,85};
        int[] span = new int[stock.length];
        StockSpan(stock, span);
        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }
    }
}
