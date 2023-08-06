public class MaxSubarraySum {

    public static void maxSubarraySum(int numbers[]){
          int currSum = 0;
          int maxSum = Integer.MIN_VALUE;
          int prefix[] = new int[numbers.length];

          // brutforce solution -> optimized approach -> O(n^2)
          prefix[0] = numbers[0];
           for(int i =1; i<numbers.length;i++){
              
            prefix[i] = prefix[i-1] + numbers[i];
           }

   
        for(int i=0;i<numbers.length;i++){
            int start = i;

            for(int j=i;j<numbers.length;j++){
                int end = j;

                    currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start];
                   // maxSub array by loop  
                  // for(int k = start; k<=end; k++){  // print
                  //   // Subarrays Sum
                  //   currSum =+ numbers[k];
                  // }
                 
                  if(maxSum<currSum){
                    maxSum = currSum;
                  }                  
            }
             }

        System.out.println("MaxSum =" + maxSum );
       }
    
        public static void kadens(int numbers[]){
                 int cs = 0;
                 int ms = Integer.MIN_VALUE; // -ve infinity
                  int num = 0;
                  int sum = 0;
                  int smallestSum = 0;
                  int smallestNUm = 0;

                 for(int i=0; i<numbers.length;i++){
                  cs = cs + numbers[i];
                  if(cs<0){
                    cs = 0;
                  }
                    ms = Math.max(ms, cs);
                  }
                  System.out.println("Maximum Sub array sum is " + ms);
                  for(int i=0; i<numbers.length;i++){
                    if(numbers[i] <= 0){
                   num = numbers[i];  
                  }
                  smallestSum = numbers[0];
                  sum = sum + num;
                }

                 for(int i=1; i<numbers.length;i++){
                 
                    smallestNUm = Math.max(numbers[i], numbers[i-1]);
                    System.out.println("Smallest num is" + smallestNUm);
                   
                 }
                  
                   
                   System.out.println("Smallest num is" + smallestNUm);
                   System.out.println("sum of negative no. is" + sum);
                   System.out.println("Smallest sum is" + smallestSum);
              }

              public static void main(String[] args) {
            
                int numbers[] = {-2, -3 ,-2, -1, -1, -4, -2 ,-1};
               kadens(numbers);
              }  
    
}