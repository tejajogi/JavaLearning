package assignments;

import java.util.Scanner;

public class MethodsMaxMinTask {
    public static void main(String[] args) {
        //Define two methods to print the maximum and the
        // minimum number respectively among three numbers entered by the user.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();
        System.out.println("enter c");
        int c = sc.nextInt();
        System.out.println("max: "+max(a,b,c));
        System.out.println("min: " +min(a,b,c));
    }

    static int max(int a,int b, int c){
        int value = Math.max(c,Math.max(a,b));
        return value;
    }

    static int min(int a,int b, int c){
        int ans = Math.min(c,Math.min(a,b));
        return ans;
    }
}
