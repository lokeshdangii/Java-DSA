public class TrappingRainwater {

    public static int trappingRainwater(int height[]){

      //calculat left max boundary -> array (auxillary array)

      int leftmax[] = new int[height.length];
         leftmax[0] = height[0];
         for(int i =1;i<height.length;i++){
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
         }
      //calculat right max boundary -> array (auxillary array)

      int rightmax[] = new int[height.length];
         rightmax[height.length-1] = height[height.length-1];
         for(int i=height.length-2;i>=0;i--){
              rightmax[i] = Math.max(height[i], rightmax[i+1]);
         }

         int trappedWater = 0;
        // loop
        for(int i =0;i<height.length;i++){
            // waterlevel = min(left max Bound, right max Bound)
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
   
            // trapped water= waterlevel - height[i]
            trappedWater += waterlevel-height[i];
        }
        return trappedWater;
      
      
    }
    public static void main(String args[]){
   
        int height[] = {4, 2, 0, 6, 3, 2, 5};
 
        System.out.println(trappingRainwater(height));
    }
    
}
