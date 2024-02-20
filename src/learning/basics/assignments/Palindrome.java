package learning.basics.assignments;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string: ");
        String str = sc.next();
        int i = 0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                System.out.println("string is not a palindrome");
            }else{
                i++;
                j--;
            }
        }
        System.out.println("is palindrome");
    }
}
