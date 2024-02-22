package assignments;

import java.util.Scanner;

public class AvgOfNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter count");
        int count= sc.nextInt();
        int sum = 0;
       for(int i = 0; i<count; i++){
           System.out.println("enter the number");
           int num = sc.nextInt();
           sum = sum + num;
       }
       float avg = sum/count;
        System.out.println(avg);
    }
}
