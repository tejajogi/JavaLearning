package learning.basics.assignments;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n elements: ");
        int n = sc.nextInt();
        int first = 0;
        int second =1;
        for(int i=1;i<=n;i++){
            System.out.print(first+ ",");
            int temp = first+second;
            first=second;
            second=temp;

        }

    }
}
