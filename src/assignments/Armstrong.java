package assignments;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        int number= num;
        while(num!=0){
            int rem = num%10;
            result += Math.pow(rem, 3);
            num = num/10;
        }
        if(result == number){
            System.out.println("num is Armstrong");
        }else {
            System.out.println("not Armstrong");
        }
    }
}
