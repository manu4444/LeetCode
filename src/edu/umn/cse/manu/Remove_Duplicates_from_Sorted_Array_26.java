package edu.umn.cse.manu;

import java.util.Arrays;

/**
 * Created by maste on 12/24/2016.
 */
public class Remove_Duplicates_from_Sorted_Array_26 {

    public static int removeDuplicates(int[] nums) {

        int len = nums.length;
        int counter = 0;
        int element = 0;
        int begin = 0;

        if (len == 0) {
            return len;
        }
        while (counter < len - 1) {
            if (nums[counter] != nums[counter + 1]) {
                element++;
                nums[begin] = nums[counter];
                begin += 1;
            }
            counter++;
        }
        nums[begin] = nums[counter];
        return element + 1;

    }

    public static void main(String[] args) {
        int[] input = {1, 1, 2};
        System.out.println(removeDuplicates(input));
    }
}
