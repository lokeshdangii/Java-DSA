public class R02_Recursion {
    

    public static int powerTwo(int n){

        if(n/2 ==1){
            return 1;
        }
       
        if (n>2 &&  n%2== 0){
            n = n/2;
            return powerTwo(n);
        }else{
            return 0;
        }

    }

    public static void findMini(int arr[], int size, int index, int mini[]){
        if(index >= size){
            return;
        }

        mini[0] = Math.min(mini[0], arr[index]);

        findMini(arr, size, index+1, mini);
    }


    public static void main (String args[]){
        // int n = 32;
        // System.out.println(powerTwo(n));

        int arr[] = {10,20,30,4,50};
        int size = 5;
        int index = 0;
        int mini[] = {Integer.MAX_VALUE};

        findMini(arr, size, index, mini);
        System.out.println("Minimum from arr is : " + mini[0]);


    }
}
