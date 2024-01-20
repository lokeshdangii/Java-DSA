import java.util.Scanner;
import java.util.Stack;

public class S05_Stack_Sorting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();   //helper stack

        for(int i=0;i<5;i++){
            System.out.print("Enter number : ");
            int num = sc.nextInt();

            // if(s1.isEmpty()){
            //     s1.push(num);
            // }

            if(s1.isEmpty() || s1.peek() < num){
                s1.push(num);
            }else{
                while(!s1.isEmpty() && s1.peek()>num ){
                    s2.push(s1.pop());
                }
                s1.push(num);
            }

            // again copying s2 in s1
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        // Decreasing Order
        System.out.print("Descending : ");
        while(!s1.isEmpty()){
            System.out.print(s1.peek() + " ");
            s2.push(s1.pop());
        }
        System.out.println();


        // Increasing Order
        System.out.print("Ascending : ");
        while(!s2.isEmpty()){
            System.out.print(s2.pop() + " ");
        }
        System.out.println();


    }
}
