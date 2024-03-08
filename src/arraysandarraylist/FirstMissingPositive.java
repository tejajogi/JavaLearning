package arraysandarraylist;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        Arrays.sort(arr);
        System.out.println(firstMissingPositive(arr));
    }
    static int firstMissingPositive(int[] nums) {
        int num = 1;
        for(int i =0 ; i<nums.length; i++){
            if(nums[i] >0){
                if(nums[i]==num){
                    num++;
                }
                else if(nums[i]>num){
                    break;
                }
            }

        }
        return num;
    }
}
