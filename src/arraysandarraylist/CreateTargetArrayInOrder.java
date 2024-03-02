package arraysandarraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArrayInOrder {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
    static int[] createTargetArray(int[] nums, int[] index){
        ArrayList<Integer> target = new ArrayList<>();
        for(int i=0;i< nums.length;i++){
            target.add(index[i],nums[i]); //inserting values of nums array into index at index array
        }
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i]= target.get(i); //adding index array values by getting index to ans array
        }
        return ans;
    }
    }

