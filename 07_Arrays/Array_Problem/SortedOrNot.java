public class SortedOrNot{

    public static boolean sortedrorNot(int arr[]){
        
        int n = arr.length;

        for( int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }

        return true;

    }

    public static void main(String args[]){
        
        int arr[] = {12,14,16,2,18,20};
        System.out.println(sortedrorNot(arr));
        
    }
}