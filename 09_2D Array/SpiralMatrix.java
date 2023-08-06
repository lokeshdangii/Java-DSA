import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class SpiralMatrix {

    public static void spiralMatrix(int matrix[][]){
    
        int startRow = 0;
        int endRow = matrix.length-1; // 3
        int startCol = 0;
        int endCol = matrix.length-1; // 3

        while(startRow<=endRow && startCol<= endCol){
            // top   // -> j for colum and i for row
            for(int j=0; j<=endCol; j++){
                System.out.print(matrix[startRow][j] + " ");
            }

            // right
             for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol] + " ");
             }

             // Bottom 
             for(int j=endCol-1;j>=startCol;j--){
                if(startRow== endRow){
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
             }

             //left
             for(int i=endRow-1;i>startRow;i--){
                if(startCol == endCol){
                    break;  
                }
                System.out.print(matrix[i][startCol] + " ");
             }

             startRow++;
             startCol++;
             endRow--;
             endCol--;
            }

        }
 
        public static int diagonalSum(int matrix[][]){ // O(n^2)
             int sum =0;

            //  for(int i=0;i<matrix.length;i++){
            //     for(int j=0; j<matrix.length;j++){
            //          if(i==j){         
            //             sum += matrix[i][j];
            //          }
            //          else if(i+j == matrix.length-1){  // i+j ==3
            //             sum += matrix[i][j];
            //          }

            //     }
            //  }

               for(int i=0;i<matrix.length;i++){
                     // primary diagonal --> i==j
                     sum += matrix[i][i];
                     
                     // secondary diagonal --> i+j = n-1;
                      if(i != matrix.length -i-1){ // for odd matrix --> reject overlappig 
                        sum += matrix[i][matrix.length-i-1]; // j = n-i-1;
                      }
               }

             return sum;


             
        
    }

    public static void main(String args[]){
        int matrix[][]= {{1, 2, 3, 4},
                              {5, 6, 7, 8},
                              {9, 10, 11, 12},
                              {13, 14, 15, 16}};

            //spiralMatrix(matrix); 
            System.out.println(diagonalSum(matrix));                 
    }
    
}
