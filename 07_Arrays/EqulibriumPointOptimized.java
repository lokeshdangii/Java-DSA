public class EqulibriumPointOptimized {
    
    public static int equilibriumPoint(int arr[]){
        int n = arr.length;
        // totalsum variable to store total sum of whole array
        int totalsum = 0; 
        int leftsum = 0;
 
        //  Loop to find totalsum of the whole array 
        for (int i = 0; i < n; i++)
            totalsum += arr[i];
        
        // loop to calculate left and righ sum
        for(int i = 0; i < arr.length; i++){

            long rightsum = totalsum - leftsum - arr[i];

            if(leftsum == rightsum){

                return i+1;
            }
            else{

                leftsum = leftsum +arr[i];
            }
        }

        return -1;
    }
    public static void main (String args[]){
        int arr[] = {1,4,5,17,5,5};
    }
}
