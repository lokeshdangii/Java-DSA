public class PalindroemNumber {
    
    public static void palindromicpatterns_withNums(int n){
        for(int i=1;i<=n;i++){
  
             // spaces
             for(int j=1; j<=n-i;j++){
                 System.out.print(" ");
             }

             //ascending numbers
             for(int j=i;j>=1;j--){
                System.out.print(j);
             }

             // descending numbers
             for(int j=2;j<=i;j++){
                System.out.print(j);
             }

             System.out.println();
        }
       
    
    }
    /**
     * @param args
     */
    public static void main(String args[]){
        palindromicpatterns_withNums(5);

    }
    
}
