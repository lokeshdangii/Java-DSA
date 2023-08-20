public class BuyStock {
    
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int profitArr[] = new int[n-1];
        int index = 0;
        int profit = 0;

        // Starting
        //If Array contains only single element
        if(n==1){
            return 0;
        }

        //If Array contains only two element
        if(n==2){
            if(prices[1]>prices[0]){
                return (prices[1]-prices[0]);
            }else
            {
                return 0;
            }
        }


        //Copying differences of prices in profitArr

        for(int i=1;i<n;i++){
            if(prices[i]>prices[i-1]){
                profitArr[index] = (prices[i] - prices[i-1]);
                index ++;        
            }
        }

        for(int ele:profitArr){
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.println("Value of index is:- " + index);


        // to chek if all the differences/elements are same in profitArr
        boolean isdiff_equal = false;

        for(int i=1;i<index;i++){
            if(profitArr[i-1] == profitArr[i]){
                isdiff_equal = true;
            }else{
                isdiff_equal = false;
                break;
            }
        }

        // If difference is equal then we will sum every element of profitArr

        if(isdiff_equal){  
            for(int i=0;i<index;i++){
                profit += profitArr[i];
            }
             System.out.println("returning from the difference is equal for loop.......");
            return profit;
        }else
        {
            if(index==2){
                return profitArr[0] + profitArr[1];
            }


            int largest = profitArr[0];
            int second_largest = profitArr[1];
            int third_largest = 0;    // third_larges => other

            // for deciding largest, second largest and third largest
            for(int i=1;i<index;i++){

                if(profitArr[i-1] == profitArr[i]){
                    third_largest = profitArr[i-1];
                }
                
                if(profitArr[i] >= largest ){
                    second_largest = largest;
                    largest = profitArr[i];
                }
            }

            // to check if first second third all are unique
            for(int i=0;i<index;i++){
                if(profitArr[i] != largest && profitArr[i] != second_largest){
                    third_largest = profitArr[i];
                }
            }

            System.out.println("first largest is:- " + largest);
            System.out.println("Second largest is:- " + second_largest);
            System.out.println("Third largest is:- " + third_largest);

            // Cases

            // for {14,9,10,12,4,8,1,16};
            if(largest > (3 * second_largest)){
                return largest + second_largest;
            }

            if(largest != second_largest && largest != third_largest && second_largest != third_largest){
                return (largest + second_largest + third_largest);
            }else if(largest > second_largest && second_largest == third_largest)
            {
                return (largest + second_largest + third_largest);
            }else if (largest > third_largest && second_largest > third_largest){
                return largest + second_largest;
            }else{
                return largest + second_largest;
            } 

            
            // System.out.println("returning from the end.......");
            // return largest+second_largest + third_largest;
        }
        
    }
    
    public static void main(String args[]){

        int prices[] = {1,2,4,2,5,7,2,4,9,0};
        // int prices[] = {2,1,4,5,2,9,7};

        // maxProfit(prices);
        System.out.println(maxProfit(prices));

    }

}
