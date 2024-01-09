// Linked list java implementation
public class LinkedList {
    
    public static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = next;
        }
    }

    public static Node head;
    public static Node tail;

    //function to insert at beginning of the LinkedList
    public void addFirst(int data){
    
        // step1 --> create new node
        Node newNode = new Node(data);

        //check if ll is empty
        if(head == null){
            head = tail = newNode;
            return;
        }

        // step2 --> newNode next = head  (Linking Step)
        newNode.next = head;
        // step3  -->  head = newNode
        head = newNode;
    }

    // function to insert at end of the LinkedList
    public void addLast(int data){
        
        Node newNode = new Node(data);  // step1 create a new node

        //check if ll is empty
        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;  // step2 tail next = newNode

        tail = newNode;     // step 3 tail = newNode
    }

    public void print(){
        
        if (head == null)
        System.out.println("LL is empty");

        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addLast(30);
        ll.addLast(40);

        ll.print();
    }
}
