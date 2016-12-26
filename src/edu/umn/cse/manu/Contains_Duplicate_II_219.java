package edu.umn.cse.manu;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by maste on 12/25/2016.
 * <p>
 * Do it in O(n) in one traversal using Hashmap
 */
public class Contains_Duplicate_II_219 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int i = 0, j = 0;
        boolean containsNearDuplicate = false;

        //Time complexity O(n^2)
        /*
        outerloop:
        for( i=0; i<nums.length-1; i++){
            for (j=i+1; j<nums.length; j++){
                if( nums[i] == nums[j] && j-i <= k){
                    containsNearDuplicate = true;
                    break outerloop;
                }
                if( j-i > k){ // This is the optimization
                    break;
                }
            }
        }
        */

        //Time O(n)
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int val = map.get(nums[i]);
                if (i - val <= k) {
                    containsNearDuplicate = true;
                    break;
                }
            }
            map.put(nums[i], i); //The existing key gets replaced with the new one
        }

        return containsNearDuplicate;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9};
        int maxDistance = 3;
        System.out.println(containsNearbyDuplicate(input, maxDistance));
    }
}
