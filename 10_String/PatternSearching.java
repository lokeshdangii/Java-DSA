public class PatternSearching {

    // Function for searching pattern in a text

    // Naive Solution --> TC => O((n-m+1)*m)
    public static void naiveSolution(String txt, String pattern){
        
        int m = pattern.length();
        int n = txt.length();


        for(int i=0;i<=n-m;i++){
            int j;

            for(j=0;j<m;j++){

                if(pattern.charAt(j) != txt.charAt(i+j)){
                    break;
                }
            }

             if(j==m){
                System.out.println(i + " ");
                }
            
        }
    }


    // Improved Naive Solution
    public static void naiveSolution(String txt, String pattern){
        
        int m = pattern.length();
        int n = txt.length();


        for(int i=0;i<=n-m;i++){
            int j;

            for(j=0;j<m;j++){

                if(pattern.charAt(j) != txt.charAt(i+j)){
                    break;
                }
            }

             if(j==m){
                System.out.println(i + " ");
                }
            
        }
    }


    
    // Main Function
    public static void main(String args[]){
        String txt = "lokeshdangi";
        String pattern = "dangi";

        naiveSolution(txt, pattern);

    }
}
