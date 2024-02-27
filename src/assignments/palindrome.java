package assignments;

public class palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
    }

    static boolean isPalindrome(int num){
        int original = num;
        int result= 0;
        while(num>0){
            int rem = num%10;
            num = num/10;
            result = result*10 + rem;
        }
        return result == original;
    }
}
