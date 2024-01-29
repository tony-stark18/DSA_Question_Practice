public class DoublyLL {
    public class Node{
        int data;
        Node prev;
        Node next;

        public Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode ;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode; 
    }
    public void printNode(){
        Node temp = head;
        // System.out.print("[");
        while(temp!=null){
            System.out.print(temp.data+"<-->");
            temp=temp.next;
        }
        System.out.print("null\n");
    }

    public static void main(String[] args) {
        DoublyLL ll = new DoublyLL();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printNode();
    }
}
