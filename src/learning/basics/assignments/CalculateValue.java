package learning.basics.assignments;

import java.util.Objects;
import java.util.Scanner;

public class CalculateValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num1");
        int num1 = sc.nextInt();
        System.out.print("enter num2");
        int num2 = sc.nextInt();
        System.out.print("enter symbol");
        char ch = sc.next().trim().charAt(0);
        if(ch == '+'){
            System.out.println(num1 + num2);
        }
        if(ch == '-'){
            System.out.println(num1 - num2);
        }
        if(ch == '*'){
            System.out.println(num1 * num2);
        }
        if(ch == '/'){
            System.out.println(num1/num2);
        }

    }
}
