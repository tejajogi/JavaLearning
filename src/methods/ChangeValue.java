package methods;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        changeValue(arr); // reference is passed to the parameter,
        // actually the ref itself is passed with call by value, bcauz the value refers to object.
        System.out.println(Arrays.toString(arr));
    }

    private static void changeValue(int[] nums) { //nums will refer to value of arr obj
        nums[0]= 0; //if we make change to the object via this ref variable, the obj will change
    }
}
