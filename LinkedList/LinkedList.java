public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int val){
            this.data=val;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;

    }
    public void insert(int index,int data){
        if(index==0){
            addFirst(data);
            return;
        }
        Node temp = head;
        int i=0;
        while(i<index-1 && temp!=null){
            temp=temp.next;
            i++;
        }
        if(temp==null){
            System.out.println("Error. Index out of range.");
            return;
        }
        Node newNode = new Node(data);
        newNode.next=temp.next;
        temp.next=newNode;

    }
    public int getsize(){
        Node temp = head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
    public void print(){
        Node temp = head;
        System.out.print("[");
        while(temp!=null){
            System.out.print(temp.data+", ");
            temp=temp.next;
        }
        System.out.println("null ]"+"\n");
    }

    public void removeFirst(){
        if(head==null) {
            System.out.println("Linkedlist is already empty. Aur kya hatayega Laude!");
            return;
        }
        if(head.next==null){
            head=tail=null;
            return;
        }
        head=head.next;
    }
    public void removeLast(){
        if(head==null){
            System.out.println("Linkedlist is already empty.");
            return;
        }
        if(head.next==null){
            System.out.println("Last node "+head.data+" removed successfully.");
            head=tail=null;
            return;
        }
        Node temp = head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        System.out.println("Last Node "+temp.next.data+" removed successfully.");
        temp.next=null;
        tail=temp;
    }

    public int search(int target){
        Node temp = head;
        int index=0;
        while(temp!=null){
            if(temp.data==target){
                return index;
            }
            index++;
            temp=temp.next;
        }
        return -1;
    }

    public int itrSearch(int target,int index,Node temp){
        if(temp==null){
            return -1;
        }
        if(temp.data==target){
            return index;
        }
        return itrSearch(target, index+1, temp.next);
    }
    public void reverseList(){
        Node prev=null;
        Node curr= head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public void  deleteNthFromEnd(int n){
        int size=this.getsize();
        // System.out.println(size);
        if(size==n){
            head=head.next;
            return;
        }
        int index=1;
        Node temp = head; 
        while(index<size-n){
            temp=temp.next;
            index++;
        }
        temp.next=temp.next.next;
    }
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean checkPalindrom(){
        if(head==null || head.next==null) return true;
        Node mid = this.findMid(head);//find the mid node;
        //reverse the second half of the list
        Node prev=null;
        Node cur=mid;
        Node next;
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        Node right=prev;//head node of the right half;
        Node left = head;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;

        // return false;
    }
    public void delete_N_Node_After_M_Node(int m,int n){
        int i=1;
        Node temp = this.head;
        while(i<m && temp.next!=null){
            temp=temp.next;
            i++;
        }
        if(temp.next==null) return;
        Node temp2=temp.next;
        i=1;
        while(i<n && temp2.next!=null){
            temp2=temp2.next;
            i++;
        }
        temp.next=temp2.next;
    }

    public static boolean detectLoop(){
        Node slow = head;
        Node fast = head;

        while(fast!=null  && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void deleteCycle(){
        Node slow = head;
        Node fast = head;
        boolean flag=false;
        while(fast!=null  && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                flag=true;
            }
        }
        if(flag){
            return;
        }
        slow=head;
        Node prev=null;
        while(slow==fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=null;
    }
    private static Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node MergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node midNode = getMid(head);
        Node rightHead = midNode.next;
        midNode.next=null;
        Node newLeft = MergeSort(head);
        Node newRight = MergeSort(rightHead);
        return Merge(newLeft,newRight);
    }

    private static Node Merge(Node head1,Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while(head1!=null && head2!=null){
            if(head1.data>=head2.data){
                temp.next=head2;
                head2=head2.next;
            }
            else{
                temp.next=head1;
                head1 = head1.next;
            }
            temp=temp.next;
        }
        while(head1!=null){
            temp.next=head1;
            head1 = head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergedLL.next;
    }

    public void ZigZag(){
        if(head==null || head.next==null) return ;
        Node mid = this.getMid(head);//find the mid node;
        //reverse the second half of the list
        Node cur=mid.next;
        mid.next=null; 
        Node prev=null;
        Node next;
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        Node rh=prev;
        Node lh=head;
        Node nextL,nextR;
        while(rh!=null && lh!=null){
            nextL=lh.next;
            lh.next=rh;
            nextR=rh.next;
            rh.next=nextL;

            rh=nextR;
            lh=nextL;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(1);
        ll.addFirst(2);
        // ll.removeFirst();
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);
        // ll.print();
        // ll.insert(5, 10);
        // ll.print();
        // System.out.println("size of the linkedlist: "+ll.getsize());
        // ll.removeFirst();
        ll.print();
        ll.reverseList();
        // ll.print();
        // System.out.println("2 is present at index "+ll.itrSearch(2,0,ll.head));
        // System.out.println("size of the linkedlist: "+ll.getsize());
        // ll.deleteNthFromEnd(1);
        // System.out.println(ll.head.equals(ll.head));
        // ll.print();
        // ll.delete_N_Node_After_M_Node(5, 1);
        ll.print();
        // ll.head=ll.MergeSort(ll.head);
        ll.ZigZag();
        ll.print();
        // ll.
        // System.out.println(ll.detectLoop());
    }
}
