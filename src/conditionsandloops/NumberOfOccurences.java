package conditionsandloops;

public class NumberOfOccurences {
    public static void main(String[] args) {
        int n = 54785;
        int count = 0;
        while(n>0){
            int rem = n%10; // when you do modulus no%10 it gives the remainder as last digit
            if(rem == 5){ //checking if last digit has our target value
                count++; //if rem equals target value increment count value
            }
            n = n/10; // when dividing wit 10 n/10 it will remove the last digit
            // and continue loop till we complete full digits
        }
        System.out.println(count);
    }
}
