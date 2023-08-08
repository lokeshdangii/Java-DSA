// Problem --> To return the index of the second smallest element of the array

import java.util.*;

public class SecondSmallestEle {

    public static int secondSmallest(int arr[]){
        
        int n = arr.length;

        if(n==1){
            return -1;
        }

        if(n==2){
            return Math.min(arr[0],arr[0+1]);
        }

        // loop to traverse array to find the smallest element of an array
        int res = 0;
        for(int i=1;i<=n-1; i++ ){
            if(arr[i]<arr[res]){
                res = i;
            }
        }
        int smallest = arr[res];
        int second_smallest;

        //  we can take any random element other that the smallest as our second_smallest element to compare with other element
        // but if the index of the smallest element will be zero than we to took the forward index so there is a IF condition mentioned  
        if (res == 0){
             second_smallest = arr[res+1];
        }else{
            second_smallest = arr[res-1];
        }
       
        
        System.out.println("The smallest no is : " + arr[res] );
        System.out.println("The second smallest no is : " + arr[res-1] );
        int i;
        int index = 0;
        for (i=0;i<=n-1;i++){
            
            if( (arr[i] > smallest) && (arr[i] < second_smallest)){
                second_smallest = arr[i];
                index = i;   
            }
        }
        System.out.println("The smallest no is : " + smallest );
        System.out.println("The second smallest no is : " + second_smallest );
        return index;
    }
    
    public static void main(String args[]){
        // int arr[] = {10,5,8,20,2,6,18,20};
        int arr[] = {10,9,22};
        System.out.println(secondSmallest(arr));

        
    }
}
