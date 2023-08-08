
// Problem --> To return the index of the second smallest element of the array


public class SecondSmallestEle{
    public static int secondSmallest(int arr[]){
        
        int n = arr.length;

        if(n==1){
            return -1;
        }

        if(n==2){
            // return Math.min(arr[0],arr[0+1]);
            if (arr[0]>arr[1]){
                return 0;
            }else{
                return 1;
            }
        }

        // loop to traverse array to find the smallest element of an array
        int res = 0;
        int smallest = arr[res];
        int second_smallest = smallest;
        int index = 0;

        for(int i=1;i<=n-1; i++ ){

            if(arr[i]<arr[res]){
                second_smallest = smallest;
                res = i;
                smallest = arr[res];
            }

            if( (arr[i] > smallest) && (arr[i] < second_smallest)){
                index = i; 
                second_smallest = arr[i];   
            }
        }

        System.out.println("The smallest no is : " + smallest );
        System.out.println("The second smallest no is : " + second_smallest );
        return index;
    }

        
    public static void main(String args[]){
        int arr[] = {10,8,20,2,6,5,18,3,20};
        // int arr[] = {10,9,22};
        System.out.println(secondSmallest(arr));

        
    }
}