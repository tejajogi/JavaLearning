package assignments;

import java.util.Scanner;

public class SubtractProductAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
        int n = sc.nextInt();
        int sum=0, product =1;
        while(n>0){
            int rem = n%10;
            sum = sum + rem;
            product = product * rem;
            n= n/10;
        }
        System.out.println(product-sum);
    }
}
