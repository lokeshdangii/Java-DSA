// KnapSack Problem

public class D02_KnapSack {
    
    public static int solveByRecursion(int capacity, int weight[], int profit[], int index, int n){

        // Base Case
        // if(index == n-1){
        //     if(weight[index] <= capacity){
        //         return profit[index];
        //     }else{
        //         return 0;
        //     }
        // }
        if(index >= n){
            return 0;
        }

        // Recursive Relation
        // inc/exc
        int include = 0;
        if(weight[index] <= capacity){
            include = profit[index] + solveByRecursion(capacity - weight[index], weight, profit, index+1, n);
        }
        int exclude = 0 + solveByRecursion(capacity, weight, profit, index+1, n);

        int ans = Math.max(include,exclude);
        return ans;
    }

    public static int solveByMemoisation(int capacity, int weight[], int profit[], int index, int n,int dp[][]){
        // Base Case
        if(index >= n){
            return 0;
        }

        // Step3 --> checking if ans already exist
        if(dp[capacity][index] != -1){
            return dp[capacity][index];
        }

        // Recursive Relation
        // inc/exc
        int include = 0;
        if(weight[index] <= capacity){
            include = profit[index] + solveByMemoisation(capacity - weight[index], weight, profit, index+1, n, dp);
        }
        int exclude = 0 + solveByMemoisation(capacity, weight, profit, index+1, n, dp);

        // step2 --> Storing in DP
        dp[capacity][index] = Math.max(include,exclude);
        return dp[capacity][index];
    }
    

    public static int solveByTabulation(int capacity, int weight[], int profit[], int n){
        // Step1 --> Creating a 2D DP Array bcoz two parameters are changing i.e capacity and index in recursive calls 
        int dp[][] = new int[capacity+1][n+1];
        // filling dp array with -1
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }

        for(int row=0;row <=capacity;row++){
            dp[row][n] = 0;
        }

        for(int i=0;i<=capacity;i++){
            for(int j=n-1;j>=0;j--){
                // inc/exc
                int include = 0;
                if(weight[j] <= i){
                    include = profit[j] + dp[i-weight[j]][j+1];
                }
                int exclude = 0 + dp[i][j+1];
                dp[i][j] = Math.max(include,exclude);
            }
        }

        return dp[capacity][0];
    }

    public static void main(String args[]){
        int capacity = 50;
        int weight[] = {10,20,30};
        int profit[] = {60,100,120};
        // int index = 0;
        int n = 3;

        // Step1 --> Creating a 2D DP Array bcoz two parameters are changing i.e capacity and index in recursive calls 
        int dp[][] = new int[capacity+1][n+1];
        // filling dp array with -1
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }

        // int ans = solveByRecursion(capacity,weight,profit,index,n);
        // System.out.println("Maximum Profit : " + ans);

        // int ans = solveByMemoisation(capacity,weight,profit,index,n,dp);
        // System.out.println("Maximum Profit : " + ans);

        int ans = solveByTabulation(capacity, weight, profit, n);
        System.out.println("Maximum Profit : " + ans);
    }
}
