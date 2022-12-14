
public class BitManipulation{

    public static void oddEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
           System.out.println("Even Number");
        }
        else{
            System.out.println("odd Number");
        }
    }

    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n&bitMask) == 0){
            return 0;
        }
        else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit){
        // if(newBit ==0){
        //     return clearIthBit(n, i);
        // }
        // else{
        //     return setIthBit(n, i);
        // }

        n = clearIthBit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }

    public static int clearIbits(int n, int i){
        int bitMask = (~0)<<i;                  // (~0) & (~1) --> 1111
        return n & bitMask;
    }

    public static int clearIrangeBits(int n, int i, int j){
        int a = ((~0)<<(j+1)) ;
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean isPowerofTwo(int n){
        return (n & (n-1)) == 0;
    }

      public static int countSetBits(int n){
        int count = 0;
        while(n>0){
            if((n & 1) != 0){ // check LSB
                count++;
            }
            n = n>>1;
        }
        return count;
      }
    public static void main(String args[]){
      //  oddEven(3);
        // System.out.println(getIthBit(15, 3));  
        //System.out.println(clearIthBit(10, 1)); 
       // System.out.println(updateIthBit(10, 2, 1)); 

       //    System.out.println(clearIbits(15, 2 )); 
      //System.out.println(clearIrangeBits(10 , 2, 4 )); 
        //  System.out.println(isPowerofTwo(12));
        System.out.println(countSetBits(15));

    }    
}
