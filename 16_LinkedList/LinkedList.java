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

    // function to search for a key in LinkedList
    public int searchKey(int key){
        if(size == 0){
            System.out.println("LL is empty");
        }
        Node tmp = head;
        for(int i=0;i<size;i++){
            if(tmp.data == key){
                return i;
            }
            tmp = tmp.next;
        }

        return -1; // if key not found
    }

    // function to remove nth node from end of Linked List
    public void remove_NthNode_FromEnd(int n){
        int len = size;

        if(len == 0){
            System.out.println("LL is empty");
        }else if(len ==1){
            head = tail = null;
        }

        Node tmp = head;
        for(int i=1;i<len-n;i++){
            tmp = tmp.next;
        }

        tmp.next = tmp.next.next;
    }

    // function to reverse a LinkedList
    public void reverse(){
        // initializing three variable prev, next and current
        Node prev = null;
        Node curr = head;      // Node curr = tail =  head;
        Node next;

        while(curr != null){
            next = curr.next;   // step1
            curr.next = prev;   // step2
            prev = curr;        // step3
            curr = next;        // step4
        }

        head = prev;    
    }

    // function to get mid of the LL --> Slow-Fast Approach
    public Node findMid(Node head){ 
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        System.out.println("Mid node data : " + slow.data);
        return slow;
    }

    // function to check LL is palindrome or not
    public boolean checkPalindrome(){
        // corner case --> null LL or single node LL will always be palindrome
        if(head == null || head.next == null){
            return true;
        }

        // Step1 --> findMid
        Node midNode = findMid(head);

        // Step2 --> reverse LL from midNode
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;  // right half head
        Node left = head;

        // Step3 --> cheking left and right part
        while(right!=null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    // function to detect cycle in LL
    public boolean hasCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }

    // function to remove cycle in LL
    public void removeCycle(){
        // Step1 --> Detect Cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                cycle = true;
                break;
            }
        }

        if(cycle == false){
            return;
        }
        // Step2 --> find meeting point
        slow = head;
        Node prev = null;

        while(slow!=fast){
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }

        // Step3 --> remove cycle --> last.next = null
        prev.next = null; // prev is the last node of LL 
        
    }

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //mid node
    }

    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public Node mergeSort(Node head) {
        if(head == null || head.next == null) {
            return head;
        }

        //find mid
        Node mid = getMid(head);
        //left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft, newRight);
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
        ll.addLast(80);
        ll.addLast(4);

        ll.add_at(2,1000);

        ll.print();
        // System.out.println(ll.get_Length());
        // ll.removeFirst(ll.get_Length());
        // ll.removeLast(size);
        // ll.print();
        // System.out.println(size);
        // System.out.println(ll.searchKey(100));
        // ll.reverse();
        // ll.remove_NthNode_FromEnd(2);
        ll.print();
        // System.out.println("Mid Node : "+ll.findMid(head));
        // System.out.println(ll.checkPalindrome());
        ll.head = ll.mergeSort(head);
        ll.print();
    }
}
