public class DeleteEle{
    
    public static int deleteEle(int arr[], int element, int n){
        int i;
        for (i=0;i<=n;i++){
            if (arr[i] == element){
                break;
            }  
        }

        if(i == n)
            return n;

        for (int j=i; j<n-1; j++){
            arr[i] = arr[j+1];
        }
        return n-1;
    }

    public static void main(String args[]){
        int arr[]= {3,8,12,5,16};
        int element = 12;
        int n = arr.length;

        System.out.println(deleteEle(arr, element, n));
        for(int i=0;i<n-1;i++){
            System.out.print(arr[i] + " ");
        }
    }
}