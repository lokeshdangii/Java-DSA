// Given an array arr[] of length N, The task is to count all distinct elements in arr[].

import java.util.Arrays;
import java.util.HashSet;

public class H04_CountDistinct {

    // Effcient Solution
    public static int countDistinct(int arr[]){
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }

        return hs.size();
    }

    // More Efficient Implementation
    public static int countDistinct2(Integer arr[]){
        HashSet<Integer> hs = new HashSet<>(Arrays.asList(arr));
        return hs.size();
    }

    public static void main(String args[]){
        int arr[] = {10,20,20,10,30,15,40};    // int array
        Integer arr2[] = new Integer[]{10,20,60,90,60,20,10,30,15,40};  // Integer object array

        // Convert int[] to Integer[]
        Integer arr3[] = Arrays.stream(arr).boxed().toArray(Integer[]::new); 

        System.out.println("No. of Distinct Elements in array are : " + countDistinct(arr));
        System.out.println("No. of Distinct Elements in array are : " + countDistinct2(arr2));
    }

}
