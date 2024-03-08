package arraysandarraylist;

import java.util.Arrays;

public class FirstAndLastPositionOfArray {
    //Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
    //
    //You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,9,9};
        System.out.println(Arrays.toString(searchRange(nums, 7)));
    }
    static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        for(int i=0; i<nums.length;i++){
            if(nums[i] == target){
                ans[0] = i;
                while(i<nums.length && nums[i+1] == target){
                    i++;
                    ans[1] = i;
                    break;
                }
            }
        }
        return ans;
    }
}
