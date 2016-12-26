package edu.umn.cse.manu;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by maste on 12/26/2016.
 */
public class Majority_Element_169 {

    public static int majorityElement(int[] nums) {
        int numElement = (int) Math.floor(nums.length / 2) + 1;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int key : nums) {
            if (map.containsKey(key)) {
                int currVal = map.get(key);
                map.put(key, currVal + 1);
            } else {
                map.put(key, 1);
            }
        }

        //More elegant way of iterating
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= numElement) {
                return entry.getKey();
            }
        }

        /*for (Integer key : map.keySet()) {
            if (map.get(key) >= numElement) {
                return key;
            }
        }*/
        return -1;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 2, 2, 2, 2};
        System.out.println(majorityElement(input));
    }
}
