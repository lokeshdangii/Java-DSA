public class PatternSearching {

    // Function for searching pattern in a text
    public static void patternSearch(String txt, String pattern){
        
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

        patternSearch(txt, pattern);

    }
}
