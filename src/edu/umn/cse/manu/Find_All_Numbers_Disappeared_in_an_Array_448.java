/**
 * Points:
 * 1.   initialise with nums.length + 1 as elements will be from 1 to n
 *
 * 2.   Initially thought os making element at that index as 0. But in the process, we were losing the the actual element present in that
 *      index. Hence, an efficient way is to make them negative. Hence keeping two information (One: the absoute vaue gives the actual
 *      value present and second: value less than zero implies that the index have been visited before)
 */

package edu.umn.cse.manu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by master on 12/25/2016.
 */
public class Find_All_Numbers_Disappeared_in_an_Array_448 {

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        // With O(n) space complexity
        /*
            int[] temp = new int[nums.length + 1];
            List<Integer> output = new ArrayList<Integer>();

            for (int num : nums) {
                temp[num]++;
            }
            for (int i = 1; i <= nums.length; i++) {
                if (temp[i] == 0) {
                    output.add(i);
                }
            }
            return output;
        */

        //with O(1) space complexity
        List<Integer> output = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]);
            if (nums[val - 1] > 0) {
                nums[val - 1] = -nums[val - 1];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                output.add(i + 1);
            }
        }

        return output;
    }

    public static void main(String[] args) {
        int[] input = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(input));
    }
}
