import javax.naming.spi.StateFactory;

public class FloydsTriangle {
    
    public static void floydsTriangle(int n){
      int num = 1;
        // outer 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        floydsTriangle(5);

    }
    
}
