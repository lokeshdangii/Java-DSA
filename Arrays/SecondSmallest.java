public class SecondSmallest {
    public static void main(String args[]){
        int arr [] = {12,4,8,15,13,9,3};
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if (arr[i]<first){
                second = first;
                first = arr[i];
            }
            else if(arr[i]<second){
                second = arr[i];
            }
            }
        
        System.out.println("The Second Smallest element is : " +second);
        System.out.println("The smallest element of array is :" + first);
        }
    }

