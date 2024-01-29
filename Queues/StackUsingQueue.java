import java.util.*;
public class StackUsingQueue {
    static class Stack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty(){
            return q1.isEmpty();
        }

        public static void push(int data){
            while(!q1.isEmpty()){
                q2.add(q1.remove());
            }
            q1.add(data);
            while(!q2.isEmpty()){
                q1.add(q2.remove());
            }
        }

        public static int pop(){
            if(q1.isEmpty()){
                System.out.println("Queue is already empty.");
                return -1;
            }
            return q1.remove();
        }


    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(5);
        s.push(4);
        s.push(1);
        s.pop();
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
