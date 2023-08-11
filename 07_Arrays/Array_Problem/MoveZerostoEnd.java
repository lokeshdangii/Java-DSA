// Problem Statement:- Given an array arr[] of N positive integers. Push all the zeros of the given array to the right end of the array while maintaining the order of non-zero elements.

public class MoveZerostoEnd{

    public static void moveZeros(int arr[]){
        int count = 0;
        // the count variable is used to store the non zero numbers in sequence
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                count++;
                // incrementin count 
            }
        }
    }

    public static void main(String args[]){
        int arr[] = {8,5,0,10,0,20};

        // Printing array
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }
        } 
    }
