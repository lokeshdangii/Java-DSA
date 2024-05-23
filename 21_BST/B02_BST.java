public class B02_BST {
    static class Node{
        int data;
        Node left;
        Node right;
    
        Node(int data){
            this.data = data;
            // this.left = null;
            // this.right = null;
        }
    }
    
    // Inorder Traversal --> TC = O(n)  & SC = O(h) h --> height of tree
    public static void inorder(Node root){ //left root right
        if(root != null){
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Floor in BST :- Floor means we have to return the largest value from BST which is smaller than the given value.
    // if there is no smaller value than we have to return null.
    public static Node floor(Node root, int key){
        Node result = null;
        while(root != null){
            if(root.data == key){
                return root;
            }else if(root.data > key){
                root = root.left;
            }else{
                result = root;
                root = root.right;
            }
        }
        return result;
    }

    //Ceil in BST :- return the smallest value from BST which is greater or equal to the given value.
    public static Node Ciel(Node root, int key){
        Node result = null;
        while(root != null){
            if(root.data == key){
                return root;
            }else if(root.data > key){
                result = root;
                root = root.left;
            }else{
                root = root.right;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(20);
        root.right = new Node(70);
        root.left.left = new Node(10);
        root.left.right = new Node(30);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        // function callings
        inorder(root);
        System.out.println();
        inorder(root);
        Node result = floor(root, 38);
        System.out.println(result.data);

    }
}
