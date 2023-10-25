public class SelectionSort {
    
    // printArray
    public static void printArray(int arr[])
    {           
           
        for(int i=0; i<arr.length;i++){
        System.out.print(arr[i]+ " ");
    }
    }


    // Selection Sort
    public static void selectionSort(int arr[]){
    for(int i =0; i<arr.length-1;i++){
        int minPos = i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]< arr[minPos]){
                minPos = j;
            }
        }
        //swap
          int temp = arr[minPos];
          arr[minPos] = arr[i];
          arr[i] = temp;
    }
    }

    public static void main(String args[]){
        // int arr[] = {10,5,8,20,2,12};
        int arr[] = {3,6,2,1,8,7,4,5,3,1};

        selectionSort(arr);
        printArray(arr);
    }

    }

    






