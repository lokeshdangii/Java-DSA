// Problem --> Remove duplicates from sorted array return the no. of distinct element in an array

public class RemoveDuplicates {

    public static int removeDuplicate(int arr[]){
        int n = arr.length;
        int res = 1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[res-1]){
                arr[res] = arr[i];
                res++;
            }
        }

        return res;
    }

    public static void main(String args[]){
        int arr[] = {10,20,20,30,30,30};
        removeDuplicate(arr);


        System.out.println("Reverse of array :");
        for(int index=0;index<arr.length;index++){
            System.out.print(arr[index] + " ");
        }
    }
}
