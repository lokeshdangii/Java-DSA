public class S00_Stack_Array {

    public static class MyStack{
        int arr[];
        int cap;
        int top;
        
        MyStack(int c){
            top = -1;
            cap = c;
            arr = new int[c];
        }


        public void push(int x){
            top++;
            arr[top] = x;
        }

        public int pop(){
            int res = arr[top];
            top--;
            return res;
        }

        public int peek(){
            return arr[top];
        }

        public boolean isEmpty(){
            return (top == -1);
        }

        public int size(){
            return top +1;
        }

        public void printStack(){
            int len = size();
            if(len == 0){
                System.out.println("Stack is empty");
                return;
            }
            while(len != 0){
                // System.out.println(arr[len-1]);
                System.out.println(pop());
                len--;
            }
        }
    }

    public static void main(String[] args) {
        MyStack s = new MyStack(10);
        s.push(20);
        s.push(4);
        s.push(63);
        s.push(3);
        // System.out.println(s.peek());
        // System.out.println("Size of stack is : "+ s.size());
        // System.out.println(s.pop());
        // System.out.println(s.peek());
        // System.out.println("Size of stack is : "+ s.size());
        s.printStack();
    
    }
}
