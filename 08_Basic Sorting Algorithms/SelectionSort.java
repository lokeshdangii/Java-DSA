public class SelectionSort {
    
    public static void selectionSort(int arr[]){

        for(int i=0;i<arr.length;i++){
            int min_ele = arr[i];

            for(int j=i+1;j<arr.length;j++){
                
                if(arr[j]<min_ele){
                    min_ele = arr[j];

                    // Swapping
                    int temp = arr[i];
                    arr[i] = min_ele;
                    arr[j] = temp;
                }
            }
        }


        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        // int arr[] = {10,5,8,20,2,12};
        int arr[] = {3,6,2,1,8,7,4,5,3,1};

        selectionSort(arr);
    }
}


/*
 *public static void selectionSort(int arr[]){
            for(int i =0; i<arr.length-1;i++){
                int minPos = i;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[minPos]< arr[j]){
                        minPos = j;
                    }
                }
                //swap
                  int temp = arr[minPos];
                  arr[minPos] = arr[i];
                  arr[i] = temp;
            }

 */