package arraysandarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CreateTargetArrayInOrder {
    public static void main(String[] args) {

        //Given two arrays of integers nums and index. Your task is to create target array under the following rules:
        //
        //Initially target array is empty.
        //From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
        //Repeat the previous step until there are no elements to read in nums and index.
        //Return the target array.
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
    static int[] createTargetArray(int[] nums, int[] index){
        ArrayList<Integer> target = new ArrayList<>();
        for(int i=0;i< nums.length;i++){
            target.add(index[i],nums[i]); //inserting values of nums array into target array at index of index
        }
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i]= target.get(i); //adding index array values by getting index to ans array
        }
        return ans;
    }
    }

