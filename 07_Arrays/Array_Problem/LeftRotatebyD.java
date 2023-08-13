/*
 Given an array of integers arr[] of size N and an integer, the task is to rotate the array elements to the left by d positions.

Examples:  

Input: 
arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2
Output: 3 4 5 6 7 1 2

Input: arr[] = {3, 4, 5, 6, 7, 1, 2
 */

public class LeftRotatebyD{
    
    //function to rotate array 
    public static int[] rotate(int arr[], int D){
        int n = arr.length;
        // temp array of size similar to arr
        int temp[] = new int[n];
        
        // D to n-1
        for(int i=D;i<n;i++){
            temp[i-D] = arr[i];
        }

        // 0 to D
        for(int i=0;i<D;i++){
            temp[(n-D)+i] = arr[i];
        }

        // copy temp to arr
        for(int i=0;i<n;i++){
            arr[i] = temp[i];
        }
        return arr;
    }
    
    // main function
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int D = 2;
        rotate(arr, D);
        for(int x:arr){
            System.out.print(x + " ");
        }

    }    
}