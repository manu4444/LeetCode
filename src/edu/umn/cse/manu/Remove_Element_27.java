package edu.umn.cse.manu;

import java.util.Arrays;

/**
 * Created by maste on 12/26/2016.
 *
 * This could have been solved by traversing in the front direction
 *       int i = 0;
 for (int j = 0; j < nums.length; j++) {
 if (nums[j] != val) {
 nums[i] = nums[j];
 i++;
 }
 }
 return i;

 But the number of elements moved are less in my solution
 */
public class Remove_Element_27 {

    public static int removeElement(int[] nums, int val) {

        int i = nums.length - 1;
        int j = i - 1;

        while (j >= 0) {
            if (nums[i] == val) {
                i--;
                j--;
            } else if (nums[j] == val) {
                nums[j] = nums[i];
                nums[i] = val;
                i--;
                j--;
            } else {
                j--;
            }
        }

        if (i >= 0 && nums[i] == val) { // case when input is line [3] or [3,3] and value to be removed is 3
            return 0;
        } else {
            return i + 1;
        }
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 3, 7, 3, 9};
        int value = 3;
        System.out.println(removeElement(input, value));
        System.out.println(Arrays.toString(input));
    }
}
