package arraysandarraylist;

import java.util.Arrays;

public class FlippingImage {

    //Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
    //
    //To flip an image horizontally means that each row of the image is reversed.
    //
    //For example, flipping [1,1,0] horizontally results in [0,1,1].
    //To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
    //
    //For example, inverting [0,1,1] results in [1,0,0].
    //
    public static void main(String[] args) {
    int[][] image = {{1,1,0}, {1,0,1}, {0,0,0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(image))); //to print 2d array deeptostring
    }
    static int[][] flipAndInvertImage(int[][] image) {
        int[][] invert = new int[image.length][image.length];
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length ; j++) {
                invert[i][j] = image[i][image.length-1-j]; //flipping the array
                if(invert[i][j] == 0){
                    invert[i][j] = 1; //inverting the array 0 to 1
                }else {
                    invert[i][j] = 0;
                }
            }
        }
        return invert;
    }
    //[[1,1,0],
    // [1,0,1],
    // [0,0,0]]
}
