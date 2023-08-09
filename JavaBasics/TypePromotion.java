public class TypePromotion {
    public static void main(String args[]){
        // byte b = 5;
        // byte c = (byte)(b*25.2);

        // System.out.println(c);


        int $ = 24;
        System.out.println($);

        byte b = 4; 
        char c = 'a'; 
        short s = 512;
        int i = 1000;
        float f = 3.14f; 
        double d = 99.9954;
        double result = (f * b) + (i % c) - (d * s);
        System.out.println(result);
         
    }
}
