package assignments;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        //Take integer inputs till the user enters 0 and print the largest number from all.
        Scanner sc = new Scanner(System.in);
        int input;
        int largest = 0;
        do {
            System.out.println("enter input");
            input = sc.nextInt();
            largest = Math.max(input, largest);
        }
        while (input != 0);
        System.out.println(largest);
    }
}
