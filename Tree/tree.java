import java.util.*;
public class tree{
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
    static class BinaryTree{
        static int index = -1;
        public static Node buildTree(int nodes[]){
            index++;
            if(nodes[index]==-1){
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preOrder(Node root){
            if(root==null){
                // System.out.print(-1+" ");
                return;
            }
            System.out.println(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void inOrder(Node root){
            if(root==null){
                // System.out.print(-1+" ");
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
        public static void postOrder(Node root){
            if(root == null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data);
        }

        public static void LevelOrder(Node root){
            if(root==null) return;
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }  
        }
    }
    public static int getHeight(Node root){
        if(root==null) return 0;
        int lh = getHeight(root.left);
        int rh = getHeight(root.right);
        return Math.max(lh,rh)+1;
    }
    public static int countNodes(Node root){
        if(root==null) return 0;
        int lc = countNodes(root.left);
        int rc = countNodes(root.right);
        return lc+rc+13;
    }
    public static int diameter(Node root){
        /*
        if(root==null) return 0;
        int lh = getHeight(root.left);
        int rh = getHeight(root.right);
        int ld = diameter(root.left);
        int rd = diameter(root.right);
        int selfD = lh+rh+1;
        return Math.max(Math.max(ld,rd),selfD);
        */
        int arr[] = new int[2];
        return arr[0];
    }
    public static int diameterOptimized(Node root,int arr[]){
        if(root==null){
            return 0;
        }
        int ld = diameterOptimized(root.left, arr)+diameterOptimized(root.right, arr)+1;
        arr[1]=Math.max(arr[1],arr[0]);
        return arr[1];
    }
    public static int sumOfNodes(Node root){
        if(root == null) return 0;
        int ls = sumOfNodes(root.left);
        int rs = sumOfNodes(root.right);
        return ls+rs+root.data;
    }
    public static void iterativePreOrder(Node root){
        
    }
    public static void main(String[] args) {
        // int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // BinaryTree tr = new BinaryTree();
        // Node root = tr.buildTree(nodes);
        // tr.LevelOrder(root);
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("The height of the tree is "+getHeight(root));
        System.out.println("Number of Nodes in the tree is "+countNodes(root));
    }
}