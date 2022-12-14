



public class Basic {

    public static void printDec(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
       System.out.print(n+" ");
       printDec(n-1);
    }

    public static void printInc(int n){
        if(n==1){
            System.out.println();
            System.out.print(1);
            return;
        }

        printInc(n-1);
        System.out.print(n+" ");
    }

    public static int fact(int n){
        if(n==1){
           return 1;
        }
      int fnm1 = fact(n-1);
      int fn = n* fnm1;
      return fn;
    }

    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int Snm1 = sum(n-1);
        int Sn = n + Snm1;
        return Sn;
    }

    public static int fib(int n){
     if(n == 0 || n == 1){
        return n;
     }

        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]> arr[i+1]){
            return false;
        }

         return isSorted(arr, i+1);
    }

    public static int firstOccurence(int arr[], int key, int i){
        if(i== arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }

         return firstOccurence(arr, key, i+1);
    }

    public static int lastOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
      int isFound = lastOccurence(arr, key, i+1);
      if(isFound == -1 && arr[i] == key){
        return i;
      }
        
         return isFound;

    }

        public static int power(int x, int n){
            if(n==0){
                return 1;
            }

            // int xnm1 = power(x, n-1);
            // int xn = x * xnm1;
            // return xn;

            return x * power(x, n-1);
        }
         
          public static int optimizedPower(int a, int n){
            if(n==0){
                return 1;
            }
            int halfpower = optimizedPower(a, n/2);
            int halfpowerSQ = halfpower * halfpower;

            if(n%2 != 0){
                  halfpowerSQ = a * halfpowerSQ;
            }
            return halfpowerSQ;
          }

          public static int tilingProblem(int n){  // 2*n floor size
            // base case
            if(n==0 || n==1){
                return 1;
            }
            // // kaam
            // // vetical choice 
            //  int fnm1 = tilingProblem(n-1);
             
            //  // horizantal choice
            //  int fnm2 = tilingProblem(n-2);

            //  int totways = fnm1 + fnm2;
            //  return totways;

             return tilingProblem(n-1) + tilingProblem(n-2);
          }

          public static void removeDupicates(String str, int idx, StringBuilder newStr, boolean map[]){
            if(idx == str.length()){
                System.out.print(newStr);
                return;
            }

            // kaam
            char currChar = str.charAt(idx);
            if(map[currChar -'a'] == true){
                // duplicate
                removeDupicates(str, idx+1 , newStr, map);
            }
            else{
                map[currChar-'a'] = true;
                removeDupicates(str, idx+1, newStr.append(currChar), map);

            }
          }

          public static int freindsPairing(int n){
            if(n==1 || n==2){
                return n;
            }

            // // choice --> single
            // int fnm1 = freindsPairing(n-1);

            // // pairs
            // int fnm2 = freindsPairing(n-2);
            // int pairways = (n-1)* fnm2;

            // // toralways
            //  int totalways = fnm1 + pairways;
            //  return totalways;

            return freindsPairing(n-1) + (n-1) * freindsPairing(n-2);
          }

          public static void printBinString(int n, int lastplace, String str){
            // base case
            if(n==0){
                System.out.println(str +" ");
                return;
            }
            // kaam
            printBinString(n-1, 0, str + 0);
            if(lastplace == 0){
                printBinString(n-1, 1, str + 1);
            }
          }
      public static void main(String args[]) {
        //int arr[] = {1, 2, 3, 5, 4, 8, 7, 2, 5, 2};
        // printDec(n);
        // printInc(n);  
        // System.out.println(fact(5));
        // int index = lastOccurence(arr, 5, 0);
        // System.out.print(index);
       // System.out.println(optimizedPower(5, 10));

        // String str = "appnnacollege";
        // removeDupicates(str, 0, new StringBuilder(""), new boolean[26]);
        // System.out.println(tilingProblem(4 ));
        printBinString(3, 0, "");
    }   
}
 