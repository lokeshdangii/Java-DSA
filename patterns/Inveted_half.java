public class Inveted_half {
    public static void inverted_halfPyramid_withNumbers(int n){
        //outer
        for(int i=1;i<=n;i++){
           for(int j=1;j<= n-i+1;j++){
            System.out.print(j + " ");
           }
           System.out.println();
        }
    }
    public static void main(String args[]){
        inverted_halfPyramid_withNumbers(5);


    }
    
}
