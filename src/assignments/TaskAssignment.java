package assignments;

import java.util.Scanner;

public class TaskAssignment {
    //Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int input;
        do {
            System.out.println("enter input");
            input = sc.nextInt();
            count = input + count;
        } while (input != 0);
        System.out.println(count);
    }
}
