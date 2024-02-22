package assignments;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("emter width");
        double width = sc.nextDouble();
        System.out.println("enter length");
        double length = sc.nextDouble();
        double areaOfRectangle = width*length;
        System.out.println(areaOfRectangle);
    }
}
