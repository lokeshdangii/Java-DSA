public class CharStr{

    public static void main(String args[]){
        String str1 = "geeksforgeeks";

        int Arr[] = new int[256];

        for(int i=0;i<str1.length();i++){
            Arr[str1.charAt(i)]++;
        }

        // for(int i=0;i<Arr.length;i++){
        //     System.out.print(Arr[i] + "");
        // }
        System.out.println();

        for(int i=0;i<str1.length();i++){
            System.out.println( str1.charAt(i) + " --> " + (int)str1.charAt(i) + " : " + Arr[(int)str1.charAt(i)] + " ");
        }
        System.out.println();
    }
}