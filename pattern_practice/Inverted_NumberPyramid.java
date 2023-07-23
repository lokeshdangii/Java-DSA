public class Inverted_NumberPyramid {

    public static void numberPyramid(int n){
        for(int i=1; i<=n;i++){
            for (int j=1;j<=(n-i+1);j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        numberPyramid(5);
    }
}
