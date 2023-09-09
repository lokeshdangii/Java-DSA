public class StringCompression{

    public static int compress(char[] chars) {
        String s = "";

        // making compressed string
        for (int i=0;i<chars.length;i++){
            Integer count =1;

            while(i<chars.length-1 && chars[i] == chars[i+1]){
                count ++;
                i++;
            }

            s += chars[i];
            if(count>1){
                s += count.toString();
            }

        }

        // char strArr[] = s.toCharArray(); 
    
        // // Print the final character array
        // System.out.print("[");
        // for (int i = 0; i < strArr.length; i++) {
        //     System.out.print("\"" + strArr[i] + "\"");
        //     if (i < strArr.length - 1) {
        //         System.out.print(",");
        //     }
        // }
        System.out.print("]");
        return s.length();
    }

    public static void main(String args[]){
        char chars [] = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(compress(chars));
    }
}