import java.util.Scanner;

public class Test {
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

     if(num<0){
         System.out.println("number is negative " + num);
     }
     else{
        System.out.println("number is positive " + num);
     }

    }
    
}
