package edu.umn.cse.manu;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by maste on 12/25/2016.
 *
 * Use hashset instead of hashmap
 */
public class Contains_Duplicate_217 {

    public static boolean containsDuplicate(int[] nums) {

        // Instead you can use hashset as well
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }

        return false;

        /*HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i], i);
        }

        return false;*/
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int maxDistance = 3;
        System.out.println(containsDuplicate(input));
    }
}
