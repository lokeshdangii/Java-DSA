

public class PrintSubArray {

    public static void printSubArray(int numbers[]){
        int totalSum = 0;
        int ts = 0;
       // int sum_Of_SA = 0;
        for(int i=0;i<numbers.length;i++){
            int start = i;

            for(int j=i;j<numbers.length;j++){
                int end = j;
                    int sum = 0;
                    
                  for(int k = start; k<=end; k++){  // print
                    System.out.print(numbers[k] + " "); // Subarrays
                    sum += numbers[k];
              
                  }
                    totalSum += sum;
                  System.out.println();
                   System.out.println("Sum of Subarrays =" + sum);
                  ts++;

                  System.out.println();
            }
               System.out.println();
        }

        System.out.println("Total Subarrays =" + ts);
        System.out.println("Total Sum of Subarrays =" + totalSum);
       
  


    }
    public static void main(String args[]){
    
        int numbers[] = {2, 4, 6, 8, 10};

        printSubArray(numbers);

    }
    
}
