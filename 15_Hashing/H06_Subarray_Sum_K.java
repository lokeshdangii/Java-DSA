import java.util.HashMap;

public class H06_Subarray_Sum_K {

    // subarray product < k
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);

        int sum = 1;
        int count = 0;

        for(int i=0;i<nums.length;i++){
            sum *= nums[i];
            if(hm.containsKey(sum<k)){
                count += hm.get(sum);
            }

            hm.put(sum, hm.getOrDefault(sum,0)+1);
        }

        return count;
    }

    // Subarray Sum equals K
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);

        int sum = 0;
        int count = 0;

        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(hm.containsKey(sum-k)){
                count += hm.get(sum-k);
            }

            hm.put(sum, hm.getOrDefault(sum,0)+1);
        }

        return count;
    }

    public static int lenOfLongSubarr(int A[], int N, int k) {
        // Complete the function
        HashMap<Integer, Integer> hm = new HashMap<>();

        int pre_sum = 0, res = 0;

        for (int i = 0; i < A.length; i++) {
            pre_sum += A[i];

            if (pre_sum == k) {
                // Update the result with the length of the subarray
                res = Math.max(res,i+1);
            }

            if (hm.containsKey(pre_sum - k) == false) {
                hm.put(pre_sum, i);
            }

            if (hm.containsKey(pre_sum - k)) {
                // Update the result with the length of the subarray
                res = Math.max(res,Math.abs(i-hm.get(pre_sum-k)));
            }
        }

        return res;
    }



    public static void main(String args[]){
        // int nums[] = {10,5,2,6};
        // int k =100;
        // System.out.println(numSubarrayProductLessThanK(nums,k));
        // System.out.println(subarraySum(nums,k));

        int[] arr = {-13, 0, 6, 15, 16, 2, 15, -12, 17, -16, 0, -3, 19, -3, 2, -9, -6};
        int k = 15;
        System.out.println(lenOfLongSubarr(arr, arr.length, k));  // Output: 5

    }
    }

