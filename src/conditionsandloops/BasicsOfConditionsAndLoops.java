package conditionsandloops;

import java.util.Scanner;

public class BasicsOfConditionsAndLoops {
    public static void main(String[] args) {
        //if else condition
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your price");
        int price = sc.nextInt();
        if(price <20000 ){
            System.out.println("I can afford");
        }
        else if(price> 30000){
            System.out.println("can't afford");
        }
        else{
            System.out.println("not interested");
        }
    }
}


