package arraysandarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("teja");
        list.add(2,"king");
        list.add("jogi");
        list.add("krishna");
        list.add("sai");

        //Scanner sc = new Scanner(System.in);

        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.indexOf("sai"));
        }

        System.out.println(list.get(2)); //prints the value at that index
        System.out.println(list.size());
        System.out.println(list.contains("jogi"));
        System.out.println(list.remove("krishna"));
        System.out.println(list);
    }

}
