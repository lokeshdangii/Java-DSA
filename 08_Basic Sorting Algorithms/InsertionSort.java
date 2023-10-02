public class InsertionSort {
 
    public static void insertionSort(int arr[]){
        // array length
        int n = arr.length;
        
        for(int i=1;i<n;i++){
            int ele = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>ele){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = ele;
        }

        // loop to print array
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String args[]){
        int arr[] = {2,7,3,9,6,4,1,5,20,8};
        insertionSort(arr);
        

    }
}
