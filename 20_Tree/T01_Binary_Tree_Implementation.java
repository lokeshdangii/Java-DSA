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

    // Inorder Traversal --> TC = O(n)  & SC = O(h) h --> height of tree
    public static void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Preorder Traversal
    public static void preorder(Node root){
        if(root!=null){
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }


    public static void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);

        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
    }

}
