package learning.basics;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Allows us to give input from user/keyboard
        System.out.println("enter num1");
        int num1 = sc.nextInt();
        System.out.println("enter num2");
        float num2 = sc.nextFloat();
        System.out.println("sum : " + (num1 + num2));
    }
}
