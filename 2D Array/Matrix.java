import java.util.*;

public class Matrix {

    public static boolean search(int Matrix[][], int key){
             int n=3, m =3;
        for(int i=0;i<n;i++){
            for(int j=0; j<m; j++){
                if(Matrix[i][j] == key){
          System.out.print("key found at index" + "(" + i + "," + j +  ")"  );
          return true;
                }
            }
        }
    
        System.out.println("element not found");
        return false;
    }
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
  
   int Matrix [][] = new int[3][3];
    int n = Matrix.length, m = Matrix[0].length;
    
    // input
    for(int i=0;i<n;i++){
        for(int j=0; j<m; j++){
            Matrix[i][j] = sc.nextInt();
        }
    }

    // print
    for(int i=0;i<n;i++){
        for(int j=0; j<m; j++){
        System.out.print(Matrix[i][j] + " ");

        }
        System.out.println();
    }
     search(Matrix, 4);

}    
}
