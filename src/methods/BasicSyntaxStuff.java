package methods;

import java.util.Scanner;

public class BasicSyntaxStuff {
   /* syntax for a method
   accessmodifier return_type name(arguments){
        body;
        return type;
    }*/
    public static void main(String[] args) {
        //sum();
       // int sum = sum1();
        //System.out.println(sum);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first");
        String first = sc.next();
        System.out.println("enter last");
        String last = sc.next();
        String name = display(first,last);  //calling method with arguments passed
        System.out.println(name);
    }

    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1");
        int num1 = sc.nextInt();
        System.out.println("enter num2");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
    }

    static int sum1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1");
        int num1 = sc.nextInt();
        System.out.println("enter num2");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    //method with parameters
    static String display(String name1, String name2){
        Scanner sc = new Scanner(System.in);
        return name1+name2;


    }

}
