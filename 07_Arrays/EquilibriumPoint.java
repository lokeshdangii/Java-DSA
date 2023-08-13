public class EquilibriumPoint{

    public static int equilibriumPoint(int arr[]){

        int n = arr.length;

        int leftSum =0;
        int rightSum =0;
        int equili =-1;

        if(n==1){
            return 1;
        }

        for(int point=1;point<n;point++){
            leftSum = 0;
            rightSum = 0;

            int left = point-1;
            int right = point+1;

            // left part
            while(left >=0){
                leftSum+= arr[left];
                left--;
            }

            // right part
            while(right<n){
                rightSum+= arr[right];
                right++;
            }

            // System.out.println("the point is " + arr[point] + " at index " + point);
            // System.out.println("The sum of left part for the point " + arr[point] + "is " + leftSum );
            // System.out.println("The sum of right part for the point " + arr[point] + "is " + rightSum );
            // System.out.println();
            
            // Comparison
            if(leftSum != rightSum){
               equili = -1;
            }else{
                equili = point+1;
                return equili;
            }
            
        }

        return equili;
    }

    public static void main(String args[]){
        // int arr[] = {1,3,5,2,2};
        int arr[] = {1,4,5,17,5,5};
        int eqPoint = equilibriumPoint(arr);
        System.out.println("The equilibrium point is : " + eqPoint);

        // equilibriumPoint(arr);
    }
}
