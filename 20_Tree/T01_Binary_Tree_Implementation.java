import java.util.*;

public class T01_Binary_Tree_Implementation {
    static class Node{
        int data;
        Node left;
        Node right;
    
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        } 
    }    

    static int count = 0;
    static int sum = 0;
    // Inorder Traversal --> TC = O(n)  & SC = O(h) h --> height of tree
    public static void inorder(Node root){ //left root right
        if(root != null){
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Preorder Traversal --> TC and Auxillary Space = same as Inorder
    public static void preorder(Node root){ // root left right
        if(root!=null){
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // Postorder Traversal --> TC = Theta(n) and Auxillary Space = O(n)
    public static void postorder(Node root){  // left right root
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    //Height of Tree --> Auxillary Space = O(h) 
    public static int height(Node root){
        if(root == null){
            return 0;
        }else{
            return Math.max(height(root.left), height(root.right)) + 1;
        }
    }

    // TC = Worst = theta(n), General = O(n), Best O(1) 
    // Auxillary Spcae = theta(h), General = O(h)
    public static void printKDistanceNode(Node root, int k){
        if(root == null){
            return;
        }

        if(k == 0){
            System.out.print(root.data + "  ");
            return;
        }else{
            printKDistanceNode(root.left, k-1);
            printKDistanceNode(root.right, k-1);
        }
    }

    // Level order traversal (BFS)  TC = O(n) SC --> width of a Binary Tree
    // Level order uses queue and is a iterative approach whereas other traversal follows recusive approach
    public static void levelOrder(Node root){  // line by line
        if(root == null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);


        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data + " ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }

                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }

    // Number of nodes in a Binary Tree 
    public static int countofNode(Node root){ //left root right
        if(root == null){
            return 0;
        }

        int leftCount = countofNode(root.left);
        int rightCount = countofNode(root.right);

        return leftCount + rightCount + 1;
    }

    // sum of nodes in BT
    public static int sumofNode(Node root){ //left root right
        if(root == null){
            return 0;
        }

        int leftSum = sumofNode(root.left);
        int rightSum = sumofNode(root.right);
        return leftSum + rightSum + root.data;
    }

    // Maximum in Binary Tree
    public static int getMax(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }else{
            return Math.max(root.data,Math.max(getMax(root.left), getMax(root.right)));
        }
    }

    // Minimum in Binary Tree
    public static int getMin(Node root){
        if(root == null){
            return Integer.MAX_VALUE;
        }else{
            return Math.min(root.data,Math.min(getMin(root.left), getMin(root.right)));
        }
    }

    // Diameter of Binary Tree  --> Not fully correct
    static int res = 0;
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int lh = diameter(root.left);
        int rh = diameter(root.right);
        res = Math.max(res, 1+lh+rh);
        return Math.max(lh,rh) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(70);
        root.right.right.right = new Node(80);

        // inorder(root);
        // System.out.println();
        // preorder(root);
        // System.out.println();
        // postorder(root);

        // System.out.println("Height of tree is : " + height(root));
        // printKDistanceNode(root, 2);
        // levelOrder(root);

        // System.out.println(countofNode(root));
        // System.out.println("sum of nodes : "+ sumofNode(root));

        // System.out.println(getMax(root));
        // System.out.println(getMin(root));

        System.out.println(diameter(root));

    }

}
