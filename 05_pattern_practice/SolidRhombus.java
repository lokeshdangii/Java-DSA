public class SolidRhombus {
    
    public static void solidRhombus(int n){
        for(int i=1;i<=n;i++){
            
            // spaces
            for(int j=0;j<(n-i);j++){
                System.out.print(" ");
            }

            // star
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

     public static void main(String[] args) {
        solidRhombus(5);
     }

}
