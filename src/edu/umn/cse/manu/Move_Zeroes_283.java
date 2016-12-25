package edu.umn.cse.manu;

import java.util.Arrays;

/**
 * Created by maste on 12/25/2016.
 */
public class Move_Zeroes_283 {

    public static void moveZeroes(int[] nums) {
        int i = 0, j = 1;
        int temp;

        while (j < nums.length) {
            if (nums[i] == 0 && nums[j] != 0) {
                nums[i] = nums[j];
                nums[j] = 0;
                i++;
                j++;
            } else if (nums[i] != 0 && nums[j] == 0) {
                i++;
                j++;
            } else if (nums[i] != 0 && nums[j] != 0) {
                i++;
                j++;
            } else {
                j++; //Both are zero
            }
        }
    }

    public static void main(String[] args) {
        int[] input = {0, 1, 1, 0};
        moveZeroes(input);
        System.out.println(Arrays.toString(input));
    }
}
