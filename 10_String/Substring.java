
public class Substring {

    public static String subString(String str, int si, int ei){
        String subString = "";
        for(int i=si;i<ei;i++){
            subString += str.charAt(i);
        }
        return subString;
    }
   public static void main(String args[]){
      String str = "HelloWorld";

      System.out.println(str.substring(0,5));
    //  System.out.print(subString(str, 2, 7));
   }    
}
