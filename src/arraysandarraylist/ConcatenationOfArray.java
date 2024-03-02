package arraysandarraylist;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }

    static int[] getConcatenation(int[] nums) {
        int n= nums.length;
        int[] ans = new int[2*n]; // created an array of size 2times of nums array
        for(int i =0; i<nums.length;i++){
            ans[i] = nums[i]; //storing num[0] = 1 in arr[0]
            ans[i+ n] = nums[i];
        }
        return ans;
    }
}

