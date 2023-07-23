public class ButterFly {

    public static void butterFlyPattern(int n){
        
        // Upper Pattern
        for(int line=1;line<=n;line++){
            
            // Left Side
            for(int i=1; i<=n;i++){
                if(i<=line){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            // Right Side
            for(int j=n; j>=1;j--){
                if(j>line){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // System.out.println();

        // Lower Pattern
        for(int row =1;row<=n;row++){
            // Left Side
            for (int x=n;x>=1;x--){
                if(x>=row){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            // Right Side
           for(int j=1; j<=n;j++){
            if(j<row){
                System.out.print(" ");
            }else{
                System.out.print("*");
            }
        }
            System.out.println();
    }
}


    public static void main(String args[]){
        butterFlyPattern(4);
        // lowerButterfly(4);
    }

}
