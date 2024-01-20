import java.util.Stack;

public class S06_Stack_Sorting2 {
    
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();   
        Stack<Integer> s2 = new Stack<>();   //helper stack

        s1.push(387);s1.push(3);s1.push(35);s1.push(3330);s1.push(430);

        s2.push(s1.pop());

        while(!s1.isEmpty()){
            int tmp = s1.pop();
            
            while(!s2.isEmpty()  && s2.peek()>tmp){
                s1.push(s2.pop());
            }
            s2.push(tmp);
        }
        
        while(!s2.isEmpty()){
            System.out.print(s2.pop() + " ");
        }
        System.out.println();
    }
}



/*
 * while(!s1.isEmpty()){
            System.out.println(s1.pop());
        }
 * 
 */