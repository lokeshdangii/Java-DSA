public class Char_Pattern{
    public static void main(String args[]){
        char c = 'A';
        for(int i=0; i<=3;i++){
            for(int j=0; j<=i;j++){
                System.out.print(c);
                c++;
                // c = (char)(c+1);
            }
            
            System.out.println();
        }
    }
}