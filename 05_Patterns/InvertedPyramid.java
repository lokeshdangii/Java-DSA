public class InvertedPyramid {
    
    public static void inverted_halfPyramid(int n){

        // outer -> line
        for(int i=1;i<=n;i++){
            
            // spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            // stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
                // next line
               System.out.println();
        }  

    }
    public static void main(String args[]){

       inverted_halfPyramid(4);
 }    
    
}
