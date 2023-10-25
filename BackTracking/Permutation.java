public class Permutation {
    public static void findPermutation(String str, String ans){
        // base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        // recursion
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            String Newstr = str.substring(0,i) + str.substring(i+1); 
            findPermutation(Newstr, ans+curr);
        }
    }

    public static void intPermutation(int n){
        String str = Integer.toString(n);
        String ans = "";
        findPermutation(str, ans);
    
    }


    public static void main(String args[]){
    //    String str = "abc";
    //    findPermutation(str, "");
        intPermutation(123);
    }
}




// System.out.println("Char at " + i + " index is = " + curr);
// System.out.println("New String = " + Newstr);
// System.out.println("----------------------------------------------------------------");