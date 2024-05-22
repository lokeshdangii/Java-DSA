/* Binary Search Tree
 * 1) For every node, Keys in left side are smaller and in right are greater.
 * 2) All keys are typically considered as distinct
 * 3) Like linked list, it is a linked data structure
 * 4) Implemented in C++ as Map, set, multimap and multiset. And in Java as TreeSet and TreeMap.
 * 5) BST is BT but there is a specific opertation for insert and delete as BST maintain order.
 *  
 *                 50
                   / \
                  30  70
                 / \   \
                10  40  80
 */
import java.util.*;
public class B01_BST {

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

    // Searching in BST --> recursive approach TC:- O(h) and Aux Space : O(h) 
    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }else if (root.data == key) {
            return true;
        }else if(root.data < key){
            return search(root.right, key);
        }else{
            return search(root.left, key);
        }
    }

    // Searching in BST --> Iterative approach TC:- O(h) and Aux Space : O(1) also no extra fun call overhead
    public static boolean Search(Node root, int key){
        while (root != null) {
            if(root.data == key){
                return true;
            }else if(root.data < key){
                root = root.right;
            }else{
                root = root.left;
            }
        }
        return false;
    }

    // Insert in BST --> Recursive
    public static Node insert(Node root, int ele){
        if(root == null){
            return new Node(ele);
        }
        if(root.data > ele){
            root.left = insert(root.left, ele);
        }else{
            root.right = insert(root.right, ele); 
        }
        return root;
    }
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(20);
        root.right = new Node(70);
        root.left.left = new Node(10);
        root.left.right = new Node(30);

        root.right.left = new Node(60);
        root.right.right = new Node(80);

        inorder(root);
        insert(root, 12);
        System.out.println();
        inorder(root);
        // System.out.println(search(root, 70));
        // System.out.println(Search(root, 70));

    }
}
