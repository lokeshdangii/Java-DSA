import java.nio.file.spi.FileSystemProvider;

public class NumberPyramid {
    
     public static void numberPyramid(int n){
        // outer
        for(int i=0;i<=n;i++){

            // spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            // numbers
            for(int j=1;j<=i;j++){
                System.out.print(i +" ");
            }
            System.out.println();
        }
     }
    public static void main(String args[]){
      numberPyramid(5);

    }
    
}
