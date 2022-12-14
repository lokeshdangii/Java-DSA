public class Solution {

    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};

    public static void printDigits(int number){
        if(number==0){
            return;
        }
        int lastDigit = number%10;
        printDigits(number/10);
        System.out.print(digits[lastDigit]+" ");
    }

    public static void allOccurences(int arr[],int key, int i) 
    {if(i==arr.length) {
           return;
        }
        if(arr[i] ==key) 
        {System.out.print(i+" ");
    }
      allOccurences(arr,key,i+1);
    }

    public static int length(String str){
        if(str.length() ==0){
            return 0;
        }
        return length(str.substring(1)) +1;
    }
    public static void main(String args[]){
        // int arr[]= {3, 2, 4, 5, 6, 2, 7, 2, 2};
        // allOccurences(arr, 2, 0);
    //    printDigits(2019);
      String str = "abcde";
      System.out.print(length(str));
    }
}
