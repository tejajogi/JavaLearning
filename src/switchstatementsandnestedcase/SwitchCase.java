package switchstatementsandnestedcase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        int n = sc.nextInt();

        switch (n){
            case 1:
                System.out.println("jump once");
                break;
            case 2:
                System.out.println("jump twice");
                break;
            case 3:
                System.out.println("jump thrice");
                break;
            default:
                System.out.println("don't jump");
        }
        //enhanced way(alt+enter)
        /*switch (n) {
            case 1 -> System.out.println("jump once");
            case 2 -> System.out.println("jump twice");
            case 3 -> System.out.println("jump thrice");
            default -> System.out.println("don't jump");
        }*/
    }
}
