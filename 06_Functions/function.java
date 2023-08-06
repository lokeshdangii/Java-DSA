import java.util.*;

public class function {

  public static int Average(int a, int b, int c) {
    int avg = (a + b + c) / 3;

    return avg;

  

  }

  public static boolean isEven(int n) {
    boolean isEven = false;

    if (n % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }

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

  public static int Compute(int num) {

    int sum = 0;
    while (num != 0) {
      int last_digit = num % 10;
      sum = sum + last_digit;
      num = num / 10;
    }

    return sum;
  }

  public static int fact(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact = fact * i;
    }
    return fact;
  }

  public static int binCoeff(int n, int r) {
    int n_fact = fact(n);
    int r_fact = fact(r);
    int nmr_fact = fact(n - r);

    int bincoeff = n_fact / (r_fact * nmr_fact);
    return bincoeff;
  }

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

   public static void primeinRange(int n){
    for(int i=2;i<=n;i++){
      if(isPrime(i)) // true
      {
        System.out.print(" "+ i);
      }
      }
      
   }

  
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
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

   decToBin(12);
  }

}
