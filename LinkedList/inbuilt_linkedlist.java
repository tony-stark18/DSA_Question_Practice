import java.util.LinkedList;
public class inbuilt_linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addFirst(0);
        System.out.println(ll);
    }
}
