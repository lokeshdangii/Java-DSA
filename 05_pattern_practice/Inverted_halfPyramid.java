public class Inverted_halfPyramid {

    public static void invertedHalfPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=(n-i)){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        
    }
    

    public static void main(String args[]){
        
        invertedHalfPyramid(9);
    }
}
