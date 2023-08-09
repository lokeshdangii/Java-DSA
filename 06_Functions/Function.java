import java.util.*;

// ------------------ Functions in Java --------------------------

public class Function {
  
  // function declaration
  // function to count Average
  public static int Average(int a, int b, int c) {
    int avg = (a + b + c) / 3;

    return avg;
  }

  
  // function to check number is even or not
  public static boolean isEven(int n) {
    boolean isEven = false;

    if (n % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }

  // function to check is number a Palindrome number or not
  public static boolean isPalindrome(int number) {

    int reverse = 0;
    int remainder;

    while (number != 0) {

      remainder = number % 10;
      reverse = reverse * 10 + remainder;
      number = number / 10;
    }

    if (number == reverse) {
      return false;
    }
    return true;

  }

  //  function to compute sum of digits of a number
  public static int Compute(int num) {
    int sum = 0;
    while (num != 0) {
      int last_digit = num % 10;
      sum = sum + last_digit;
      num = num / 10;
    }

    return sum;
  }

  // function to calculate factorial of a given number
  public static int fact(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact = fact * i;
    }
    return fact;
  }

  // function for Binary Coefficient
  public static int binCoeff(int n, int r) {
    int n_fact = fact(n);
    int r_fact = fact(r);
    int nmr_fact = fact(n - r);

    int bincoeff = n_fact / (r_fact * nmr_fact);
    return bincoeff;
  }

  // function to check no. is prime or not
  public static boolean isPrime(int n){
     
    if(n==2){
      return true;
    }

    for(int i=2; i<=Math.sqrt(n);i++){
      if(n%i == 0){
        return false;
      }
    }
    return true;
  }

  // function to find prime numbers in a given range
   public static void primeinRange(int n){
    for(int i=2;i<=n;i++){
      if(isPrime(i)) // true
      {
        System.out.print(" "+ i);
      }
      }
      
   }

   // function to conver Binary to Decimal
    public static void binToDec(int binNum){
       int number = binNum;
      int pow= 0;
      int dec = 0;
      
      while(number>0){
        int lastDigit = number%10;
        dec =  dec + (lastDigit * (int)Math.pow(2, pow));
        pow ++;
         number = number/10;
      }
  
      System.out.println("Decimal of " + binNum + " is " +  dec);

    }

    // function to conver Decimal to Binary
      public static void decToBin(int n){
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while(n>0){
            int rem = n%2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));

            pow ++;
            n = n/2;
        }
    
         System.out.println("Binary form of " + myNum + " is " + binNum);

      }

      // main function
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    // function calling
   decToBin(12);
  }

}
