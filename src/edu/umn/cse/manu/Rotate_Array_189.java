package edu.umn.cse.manu;

import java.util.Arrays;

/**
 * Created by maste on 12/25/2016.
 */
public class Rotate_Array_189 {
    public static int[] rotate(int[] nums, int k) {


        //Solution with using a separate array
        int[] newArr = new int[nums.length];
        int counter = 0;
        for (int j = nums.length - 1; j > nums.length - 1 - k; j--) {
            newArr[counter++] = nums[j];
        }
        for (int i = 0; i < nums.length - k; i++) {
            newArr[counter++] = nums[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int rotateBy = 3;

        System.out.println(Arrays.toString(rotate(input, rotateBy)));
    }
}
