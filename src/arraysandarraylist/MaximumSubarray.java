package arraysandarraylist;

public class MaximumSubarray {
    public static void main(String[] args) {
        //Given an integer array nums, find the
        //subarray
        // with the largest sum, and return its sum.
        int[] nums = {5,4,-1,7,8};
        System.out.println(maxSubArray(nums));
    }
    static int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = nums[0];
        for(int i = 0; i<nums.length; i++){
            currentSum = currentSum + nums[i];
            if(currentSum>maxSum){
                maxSum = currentSum;
            }
            if(currentSum<0){
                currentSum= 0;
            }
        }
        return maxSum;
    }
}
