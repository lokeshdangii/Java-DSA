import java.util.*;


public class Trapping {

    public static int trappedWater(int height[]){

        int n = height.length;
        int water = 0;

        int left[] = new int[n];
        int right[] = new int[n];

        int left_max = height[0];
        int right_max = height[n-1];


        // to make left max Boundaries
        for(int i=0;i<n;i++){
            if(height[i]>left_max){
                left[i] = height[i];
                left_max = height[i];
            }else{
                left[i] = left_max;
            }
        }

        // to set right side boundaries
        for(int i=n-1;i>=0;i--){
            if(height[i]>right_max){
                right[i] = height[i];
                right_max = height[i];
            }else{
                right[i] = right_max;
            }
        }

        for(int i=0;i<n-1;i++){
            water = water + Math.abs(height[i] - Math.min(left[i],right[i]));
        }
        return water;
    }

    public static void main(String args[]){
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        // trappedWater(height);
        System.out.print(trappedWater(height));
    }
}
