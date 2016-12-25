package edu.umn.cse.manu;

import java.util.Arrays;

/**
 * Created by maste on 12/24/2016.
 */
public class Reverse_Integer_7 {
     public static int reverse(int x) {
            long reverse = 0;
            while( x != 0 ) {
                reverse = reverse * 10 + x % 10;
                x = x/10;
            }

            if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
                return 0;
            } else {
                return (int) reverse;
            }

        }

    public static void main(String[] args){
        int input = 1234;
        System.out.println(reverse(input));
    }
}
