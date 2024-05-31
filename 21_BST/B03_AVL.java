/* AVL Tree
 * 1) It is a BST (For every node left sub tree is smaller and right is greater)
 * 2) It is Balanced (For every node, difference between left and right heights does not exceed one)
 * 
 *   Balance Factor = |lh - rh| --> BF is absolute difference b/w left and right height
 *   Balance Factor <= 1
 * 
 * In AVL trees insert and delter operations are complex and seach is same as the BST.
 * In insert and delete operations we do some restructuring if insertion or deletion causes unbalancing.
 * 
 * Why AVL Trees?
 Ans:- Most of the BST operations (e.g., search, max, min, insert, delete.. etc) take O(h) time where h is the height of the BST. The cost of these operations may become O(n) for a skewed Binary tree. If we make sure that the height of the tree remains O(Logn) after every insertion and deletion, then we can guarantee an upper bound of O(Logn) for all these operations. The height of an AVL tree is always O(Logn) where n is the number of nodes in the tree.

 Insertion :- To make sure that the given tree remains AVL after every insertion, we must augment the standard BST insert operation to perform some re-balancing. Following are two basic operations that can be performed to re-balance a BST without violating the BST property (keys(left) < key(root) < keys(right)).
        (1) Left Rotation
        (2) Right Rotation
 
 * TC of insert and delete is Theta(logn)
 * AVL Trees are more strictly balances as compare to other Self Balancing Trees like Red Black Tree or splay tree
 */

public class B03_AVL {
    
}
