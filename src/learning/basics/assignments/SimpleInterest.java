package learning.basics.assignments;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principal = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();
        double simpleInterest = (principal * rate * time)/100;
        System.out.println(simpleInterest);

    }
}
