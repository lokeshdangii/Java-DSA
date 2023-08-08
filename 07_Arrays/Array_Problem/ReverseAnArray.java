public class ReverseAnArray {

    public static void reverse(int arr[]){
        int n = arr.length;

        int left=0;
        int right=n-1;

        while(left<right){
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            
            left++;
            right--;
        }

        
    }
 
    public static void main(String args[]){
        int arr[] = {10,5,7,30};
        reverse(arr);

        System.out.println("Reverse of array :");
        for(int index=0;index<arr.length;index++){
            System.out.print(arr[index] + " ");
        }
    }
}
