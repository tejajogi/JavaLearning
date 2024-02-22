package conditionsandloops;

import java.util.Scanner;

public class LetterCaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter letter");
        // charAt(index) gives the value at that particular index
        char ch = sc.next().trim().charAt(0); // character can be extracted from string only
                                              //trim() cuts off any unnecessary spaces from start and end positions

        if(ch >= 'a' && ch<='z'){
            System.out.println("lowercase");
        }
        else{
            System.out.println("UPPERCASE");
        }
    }
}
