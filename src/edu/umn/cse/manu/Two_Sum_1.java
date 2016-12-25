package edu.umn.cse.manu;

import java.util.Arrays;

/**
 * Created by maste on 12/24/2016.
 */
public class Two_Sum_1 {
    public static int[] twoSum(int[] nums, int target) {

        int[] temp = {0,0};
        int val = 0;
        int arrLen = nums.length;
        for(int i=0; i< arrLen; i++){
            for(int j=i+1; j<arrLen; j++){
                if(nums[i]+nums[j] == target){
                    temp[0] = i; temp[1] = j;
                    return temp;
                }
            }
        }

        return temp;
    }

    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
