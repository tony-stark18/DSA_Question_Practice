public class bst{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node insert(Node root,int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
        if(root.data>val){
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static boolean search(Node root,int key){
        if(root==null) return false;
        if(key==root.data) return true;
        if(key<root.data){
            return search(root.left, key);
        }
        return search(root.right, key);
    }
    public static Node createBST(int arr[],int start,int end){
        if(start>end) return null;
        int mid = (start+end)/2;
        Node root = new Node(arr[mid]);
        root.left = createBST(arr, start, mid-1);
        root.right = createBST(arr, mid+1, end);
        return root;
    }
    public static Node delete(Node root, int key){
        if(!search(root, key)) return root;
        if(key<root.data){
            root.left =  delete(root.left, key);
        }
        else if(key>root.data){
            root.right = delete(root.right, key);
        }
        else{
            if(root.left==null && root.right==null){
                return null;
            }
            if(root.left==null) return root.right;
            if(root.right==null) return root.left;

            Node inOrderSuccessor = findInOrderSuccessor(root.right);
            root.data = inOrderSuccessor.data;
            root.right = delete(root.right, inOrderSuccessor.data);
        }
        return root;
    }
    public static Node findInOrderSuccessor(Node root){
        while(root.left!=null){
            root = root.left;
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    
    public static void main(String[] args) {
        // int values[] = {5,1,3,4,2,7};
        // Node root = null;

        // for(int i:values){
        //     root = insert(root, i);
        // }
        // inorder(root);
        // System.out.println();
        // inorder(delete(root, 0));
        int arr[] = {3,5,6,8,10,11,12};
        Node root = createBST(arr, 0, arr.length-1);
        inorder(root);
    }
}