package edu.umn.cse.manu;

import java.util.Arrays;

/**
 * Created by maste on 12/24/2016.
 */
public class Third_Maximum_Number_414 {
    public static int thirdMax(int[] nums) {

        int len = nums.length;
        long max = Long.MIN_VALUE;
        long secMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        //Finding the max value
        for (int i = 0; i < len; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }

        for (int i = 0; i < len; i++) {
            if (secMax < nums[i] && nums[i] < max) {
                secMax = nums[i];
            }
        }

        for (int i = 0; i < len; i++) {
            if (thirdMax < nums[i] && nums[i] < secMax) {
                thirdMax = nums[i];
            }
        }

        if (thirdMax == Long.MIN_VALUE) { //there is no third max
            return (int) max;
        } else {
            return (int) thirdMax; 
        }


    }

    public static void main(String[] args) {
        int[] input = {3, 2, 1};
        System.out.println(thirdMax(input));
    }
}
