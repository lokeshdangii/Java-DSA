public class SecondLargestElement {

    public static int getSecondLargest(int arr[]){
        int n = arr.length;
        int second_largest = -1;
        int largest = 0;

        for (int i=1;i<=n-1;i++){
            if (arr[i]>arr[largest]){
                second_largest = largest;
                largest = i;
            }else if(arr[i] != arr[largest]){
                if(second_largest==-1 || arr[i]> arr[second_largest]){
                    second_largest = i;
                }
            }
        }

        return second_largest;
    }

    public static void main(String args[]){
        int arr[] = {5,20,12,20,8};
        System.out.println("The index of the second largest element is : " + getSecondLargest(arr));
    }
}
