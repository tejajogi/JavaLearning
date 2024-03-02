package arraysandarraylist;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       // int[][] arr2D = new int[3][];

        String[][] arr2D = new String[2][2];
        //input
        for(int row =0; row<arr2D.length;row++){
            //for every row we need to iterate col
            for(int col=0; col<arr2D[row].length; col++){
                arr2D[row][col] = sc.next();
            }
        }

        //output
        /*for(int row =0; row<arr2D.length;row++){
            for(int col=0; col<arr2D[row].length; col++){
                System.out.print(arr2D[row][col]+",");
            }
            System.out.println();
        }*/

        for(int row =0; row<arr2D.length;row++) {
            System.out.println(Arrays.toString(arr2D[row])); // arr2D[row] row itself is an array
         }

        //enhanced for loop
        /*for (int[] ints : arr2D) {
            System.out.println(Arrays.toString(ints));
        }*/
        }
    }

