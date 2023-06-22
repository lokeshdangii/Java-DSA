import java.util.*;

public class GaussJarden {
  public static void main(String args[]){
         Scanner Sc = new Scanner(System.in);
        int n = 3;
        int Matrix [][] = new int[n][n+1];
        int U;
        int x[]= new int[1];

        System.out.println("Enter Coefficient & Constants");
            // input
          for(int i=0;i<n;i++){
            for(int j=0;j<n+1;j++){
              Matrix[i][j] = Sc.nextInt();
          }
    }
            System.out.println();
        // print
        for(int i=0;i<n;i++){
          for(int j=0; j<n+1; j++){
            System.out.print(Matrix[i][j] + " ");
      }
      System.out.println();
  }
      
    for(int k=1;k<n;k++){
      for(int i=1;i<n;i++){
        if(i != k){
          U = Matrix[i][k]/Matrix[k][k];

           for(int j=1;j<n+1;j++){
             Matrix[i][j] = (Matrix[i][j]) - (Matrix[k][j] * U);
           }
     }  
      else{
        U = 1;
      } 
    }
    }
       System.out.println();

         // Printing again
     
           for(int i=0;i<n;i++){
            for(int j=0; j<n+1; j++){
              System.out.print(Matrix[i][j] + " ");
      }
          System.out.println();
}
        for(int i=1;i<=n;i++){
          //int x[];
            x[i] = Matrix[i][n+1]/Matrix[i][i];
          System.out.println(x[i]);
             
        }
    }
       
    
    
}

