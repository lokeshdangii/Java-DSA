/*
 * DP is not a data structure it is a programming way(Technique)  of solving a problem.
 * Solves two types of problem :- (A) Overlapping subproblem  (B) Optimal Substructure 
 * 
 * (Overlapping Subproblem):- calculating same problem again and again. ex:- Fibonacci by Recursion.
 * (Optimal Substructure):- Jab ek badi problem ka optimal solution depend krega same type ki choti problem k optimal solution pr. f(4) --> f(3) + f(2)
 *  
 * DP ka Principle :- Ek baar jo problem mene solve krdi uske baad me dobara solve hi ni krta kyonki mene answer kahin pe store kr rakha h.
 * Those who do not remember the past are condemed to repeat it again 
 * 
 * Recursion kehta h ek case tera baaki sb mera or DP kehti h Ek baar jo problem mene solve krdi use me dobara solve hi ni krta
 * 
 * Types of DP :-
 * 
 * (1) Top-Down  --> Recursion + Memoisation  (Recursinve) :-  (n to 0)
 * (2) Bottom Up --> Tabluation Method (Iterative) :- (0  to n)
 * (3) Patterns  --> is done for space optimization
 * 
 * Which type is best ??. Top-Down or Bottom-Up ??
 * Mene kahan complexity dono ki same h pr bottom up iterative approach h or iterative approach me jyada fayda hota h, kyonki iterative approach me function call ka overhead nhi hota. Jabki recursive me function call ka overhead bhi hoga or space bhi lagegi.
 * 
 * Raaz ki baat :- Possibility h ki top down wala solution na chale pr bottom up wala chal jaye, kyon? kyonki bottom up function call overhead ko remove kr deta h. 
 * 
 * DP kon h ? DP kuch ni h recursion ka chacha h.
 * 
 * 
 * Memoization (Top-Down) steps:
 * (1) Create a DP Array
 * (2) Store ans in DP Array
 * (3) If ans already exist in DP array return.
 * 
 * Tabulation approach steps:- 
 * (1) Create a DP Array
 * (2) Analyse Base Case and fill DP arr accordingly. i.e. manually fill the initial data based on the base case
 * (3) fill the remaining DP arr using recursive relation (formula/logic)
 * 
 * 1D-DP will be handled by 1D array
 * 2D-DP will be handled by 2D array and same for 3.
 * 
 * pr pata kese lagega konsi DP h? 
 * ye pata krne k liye recursive call wale function me observe krna kitne parameters pass huwe h or kitne change ho rhe h utni DP hogi . For ex:- Fibonacci me n pass kra h or hr step me sirf n me change ho rha h to 1D DP. 
 * recursive call me jitne parameter change hoge utni  D - DP hogi 
 */

import java.util.Arrays;

public class D01_DynamicProgramming{

    // By plane (normal) recursion 
    public static int solveByRecursion(int n){
        
        // Base Case
        if(n==0 || n == 1){
            return n;
        }
        // Recursive Relation
        int ans = solveByRecursion(n-1) + solveByRecursion(n-2);
        return ans;
    }

    // By Top Down approach -- > recusrion + memoisation approach
    public static int solveByMemoisation(int n , int dp[]){
        // Base Case
        if(n==0 || n == 1){
            return dp[n] = n;
        }

        // Step3 --> if ans already exist then return ans
        if(dp[n] != -1){
            return dp[n];
        }

        // Recursive Relation
        // step2 --> Store and return using DP array 
         dp[n] = solveByMemoisation(n-1, dp) + solveByMemoisation(n-2, dp);

         return dp[n];

    }

    public static int solveByTabulation(int n){
        // Step1 : Create a DP Array
        int dp[] = new int[n+1];

        // Step2: Analyze Base Case abd fill DP arr acordingly
        dp[0] = 0;
        if(n==0){  // when n is 0;
            return dp[0];
        }
        dp[1] = 1;

        // Step3 : fill the remaining arr
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    // space optimization pattern pr depend krta h agar koi pattern dikh rha h to space k bare me socha ja skta h
    public static int solveByTabulationSpaceOptimized(int n){
        
        int prev = 0;
        if(n==0){  // when n is 0;
            return prev;
        }
        int curr = 1;

        if(n==1){
            return 1;
        }

        int ans = -1;
        for(int i=2;i<=n;i++){
            ans = prev + curr;
            prev = curr;
            curr = ans;
        }

        return ans;

    }

    public static void main(String[] args) {
        int n = 8;

        // Step1 --> Create DP array
        int dp[] = new int[n+1];

        Arrays.fill(dp, -1);
        
        // int ans = solveByRecursion(n);
        // System.out.println(ans);

        // int ans = solveByMemoisation(n, dp);
        // System.out.println(ans);

        // for(int ele : dp){
        //     System.out.print(ele + " ");
        // }


        // int ans = solveByTabulation(n);
        // System.out.println(ans);

        int ans = solveByTabulationSpaceOptimized(n);
        System.out.println(ans);
    }
}