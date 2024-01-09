public class Test{
  public static void main(String[]args){
    int x = 10, y = 5;

    int expl = (y * ( x / y + x / y));
    int exp2 = (y * x / y + y * x / y);
             
             
    System.out.println(expl);
    System.out.println(exp2);

}
}