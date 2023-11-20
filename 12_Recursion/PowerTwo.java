public class PowerTwo {
    

    public static int powerTwo(int n){

        if(n/2 ==1){
            return 1;
        }
       
        if (n>2 &&  n%2== 0){
            n = n/2;
            return powerTwo(n);
        }else{
            return 0;
        }

    }
    public static void main (String args[]){
        int n = 32;
        System.out.println(powerTwo(n));
    }
}
