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

    // fun3
    public static int fun3(int n){

        if(n==1){
            return 0;
        }
        else{
            return 1 + fun3(n/2);
        }
    }

    /*
     * fun(1) = 0
     * fun(2) = 1 + fun(1) => 1
     * fun(4) = 1 + fun(2) => 2
     * fun(8) = 1 + fun(4) => 3
     * fun(16) = 1 + fun(8) => 4
     * 
     * Always OP will be log base 2 n
    */

    // fun4 
    public static void fun4(int n){
        if(n==0){
            return;
        }
       
        fun4(n/2);
        System.out.print(n%2 + " ");   // this function gives binary of a n
    }



// --------------------------------------------------------- Main --------------------------------------------------------------
    // main function
    public static void main (String args[]){
        // int n = 3;
        // fun1(n);
        // fun2(n);

        int res = fun3(24);
        System.out.println(res);

        fun4(17);
    
    }
}
