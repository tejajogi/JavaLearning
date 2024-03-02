package arraysandarraylist;

public class MaxNo {
    public static void main(String[] args) {
        int[] arr = {3,5,2,92,30,4};
        System.out.println(maxInRange(arr));
    }
    /*static int max(int[] arr){
        int max = 0;
        for(int i=0; i< arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }*/

    //method to find max value in range
    static int maxInRange(int[] arr){
        int max = 0;
        for(int i=0; i< 3;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
