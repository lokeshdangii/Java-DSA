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

    // variables
    public static Node head;
    public static Node tail;
    public static int size;   // size variable store the length of LL

    //function to insert at beginning of the LinkedList
    public void addFirst(int data){
    
        // step1 --> create new node
        Node newNode = new Node(data);
        size++;

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
        size++;

        //check if ll is empty
        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;  // step2 tail next = newNode

        tail = newNode;     // step 3 tail = newNode
    }

    // function to add node in the middle --> at specific position
    public void add_at(int index,int data){
        
        if(index == 0){
            addFirst(data);
            size++;
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node tmp = head;
        int i = 0;

        while(i<index-1){
            tmp = tmp.next;
            i++;
        }

        newNode.next = tmp.next;
        tmp.next = newNode;
        
    }

    // function to remove first element
    public void removeFirst(int len){
        if(len == 0){
            System.out.println("LL is empty");
        }else if(len == 1){
            head = tail = null;
            size = 0;
        }

        head = head.next;
        size--;
    }

    // function to remove last element from LL
    public void removeLast(int len){
        if(len == 0){
            System.out.println("LL is empty");
        }else if(len ==1){
            head = tail = null;
            size = 0;
        }

        Node tmp = head;
        for(int i=1;i<size-1;i++){
            tmp = tmp.next;
        }

        size--;
        tmp.next = null;
        tail = tmp;
    }

    // function to get size of LinkedList
    public int get_Length(){

        if(head == null){
            System.out.println("LL is Empty");
            return 0;
        }

        int count = 0;
        Node tmp = head;
        while(tmp != null){
            count++;
            tmp = tmp.next;
        }

        // System.out.println(count);
        return count;
    }

    // function to print LinkedList
    public void print(){
        
        if (head == null){
            System.out.println("LL is empty");
            return;
        }
        
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + "-->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addLast(30);
        ll.addLast(40);

        ll.add_at(2,1000);

        ll.print();
        System.out.println(ll.get_Length());
        // ll.removeFirst(ll.get_Length());
        ll.removeLast(size);
        ll.print();
        System.out.println(size);
    }
}
