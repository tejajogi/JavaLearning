package learning.basics.assignments;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n elements: ");
        int n = sc.nextInt();
        // 1st and 2nd will always start with 0 and 1
        int first = 0; //so we are initializing 1st and 2nd values with 0 & 1
        int second =1;

        /*for(int i=1;i<=n;i++){
            System.out.print(first+ ",");
            int temp = first+second;
            first=second;
            second=temp;

        }*/

        // another way of doing using while loop
        int i=2;
        while(i<=n){
            System.out.println(first);
            int temp = first+second;
            first = second;
            second=temp;
            i++;
        }
        System.out.println(second);
    }
}
