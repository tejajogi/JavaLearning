package arraysandarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayForm {

    //The array-form of an integer num is an array representing its digits in left to right order.
    //
    //For example, for num = 1321, the array form is [1,3,2,1].
    //Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.
    public static void main(String[] args) {
        int[] num = {2,1,5};
        int k = 806;
        System.out.println(addToArrayForm(num, k));
    }
    static List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int carry =0;
        for(int i = num.length-1;i>=0; i--){ //starting from right as we need to add from last
            num[i]= num[i]+(k%10)+carry; // nums[2] = 5 + 6 + 0=11
            list.add(num[i]%10); // adding last digit from nums[2] = 1 from 11 above
            carry = num[i]/10; // reamining digit will be carried to va carry = 1
            k = k/10; //eliminates the last digit from k which is 6
        }
        k += carry; //adding the last carried digit to k
        while((k!=0)){
            list.add(k%10);  //adding that cariied digit to list of array
            k /=10;
        }
        Collections.reverse(list); // reversing an array using inbuilt collection library
        return list;


    }
}
