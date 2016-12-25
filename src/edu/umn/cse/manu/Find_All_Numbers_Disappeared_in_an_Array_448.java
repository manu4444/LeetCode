/**
 * Points:
 * 1.   initialise with nums.length + 1 as elements will be from 1 to n
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
    }

    public static void main(String[] args) {
        int[] input = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(input));
    }
}
