// recursion Output practice

public class OP_Practice {

    // fun1
    public static void fun1(int n){
        if(n == 0){
            return;
        }

        System.out.println(n);  // before call
        fun1(n-1);
        System.out.println(n); // after call
    }

    // fun2
    public static void fun2(int n){
        if(n==0){
            return;
        }

        fun2(n-1);
        System.out.print(n + " ");
        fun2(n-1);
    }


    
// --------------------------------------------------------- Main --------------------------------------------------------------
    // main function
    public static void main (String args[]){
        int n = 3;
        fun1(n);
        fun2(n);
    }
}
