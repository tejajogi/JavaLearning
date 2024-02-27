package assignments;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string: ");
        String str = sc.next();
        String rstr = "";

        /*for(int i =0; i<str.length();i++){
            char ch = str.charAt(i);
            rstr = ch + rstr;
        }
        System.out.println("reverse string:" + rstr);*/


        //another way of coding
        for(int i=str.length()-1; i>=0; i--){
            rstr = rstr +str.charAt(i);
        }
        System.out.println(rstr);
    }



}
