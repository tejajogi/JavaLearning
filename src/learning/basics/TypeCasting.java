package learning.basics;

import java.util.Scanner;

public class TypeCasting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Allows us to give input from user/keyboard

        // typecasting : converting the float value into integer value (compressing larger no to smaller)
       // int num = (int)(54.67f);

        // automatic type promotion in expression
       // int a = 260;  //byte size is 256. eventhough we try to typcast if it exceeds its capacity it can't execute
       // byte b = (byte)(a); //whats happening (260%256 = 4)

        // full clear example of typecasting
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s); // (f * b)-byte is promoted to float,
        // (i / c)-char to integer
        // (d * s)-short to double
        // final o/p float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);



    }
}