package switchstatementsandnestedcase;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter movie name");
        String movie = sc.next();
        System.out.println("enter cast");
        String cast = sc.next();

        switch(movie){
            case "RRR":
                System.out.println("blockbuster movie");
                break;
            case "pushpa":
                System.out.println("pan india movie");
                switch (cast){
                    case "hero":
                        System.out.println("allu arjun");
                        break;
                    case "heroine":
                        System.out.println("rashmika");
                        break;
                    default:
                        System.out.println("other cast");

                }
                break;
            case "baby":
                System.out.println("cult movie");
                break;
            default:
                System.out.println("enter movie name");
        }


        //enhanced better way of writing code
        switch (movie) {
            case "RRR" -> System.out.println("blockbuster movie");
            case "pushpa" -> {
                System.out.println("pan india movie");
                switch (cast) {
                    case "hero" -> System.out.println("allu arjun");
                    case "heroine" -> System.out.println("rashmika");
                    default -> System.out.println("other cast");
                }
            }
            case "baby" -> System.out.println("cult movie");
            default -> System.out.println("enter movie name");
        }
    }
}
